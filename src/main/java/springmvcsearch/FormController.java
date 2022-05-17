package springmvcsearch;

import org.hibernate.query.spi.QueryParameterBindingValidator;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class FormController {

	@RequestMapping("/complex")
	public String showForm()
	{
		return "complex-form";
	}
	
	
	@RequestMapping(path="/complexform",method=RequestMethod.POST)
	public String formHandler(@ModelAttribute("student") Student student,BindingResult result)
	{
		
	//if there are errors in file entry then this will help
		if(result.hasErrors())
		{
			return "complex-form";
		}
		System.out.println(student);
		return "success";
	}
}

