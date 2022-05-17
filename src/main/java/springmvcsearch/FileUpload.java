package springmvcsearch;

import java.io.FileOutputStream;
import java.io.IOException;

import javax.management.AttributeValueExp;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class FileUpload {

	@RequestMapping("/fileForm")
	public String uploadForm()
	{
		return "fileForm";
	}
	
	@RequestMapping(value="/uploadimage",method=RequestMethod.POST)
	public String fileupload(@RequestParam("image") CommonsMultipartFile file,HttpSession session,Model model)
	{
		System.out.println("File upload handler");
		System.out.println(file.getName());
		byte[] data=file.getBytes();
		String path=session.getServletContext().getRealPath("/")+file.getOriginalFilename();
		System.out.println(path);
		try {
		FileOutputStream fs=new FileOutputStream(path);
		fs.write(data);
		fs.close();
		System.out.println("file uploaded");
		model.addAttribute("msg","Uploaded successfully");
		model.addAttribute("Filename",file.getOriginalFilename());
		
		}
		catch(IOException e)

		{
			e.printStackTrace();
			System.out.println("File uploading error");
			model.addAttribute("msg","Upload was unsucessful");
		}return "filesuccess";
	}
}
