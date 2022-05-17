package springmvcsearch;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {


	//Path Variable usage
	@RequestMapping("/user/{userId}/{userName}")
	public String getUserDetail(@PathVariable("userId") int userId,@PathVariable("userName") String userName)
	{
		System.out.println(userId);
		System.out.println(userName);
		return "home";
	}


	@RequestMapping("/home")
	public String Home()
	{
		String str=null;
		Integer.parseInt(str);//this is for generic exception trial 
		System.out.println(str.length());//As long as String is null we will have this error as Null pointer exception
		System.out.println("Home page");
		return "home";
	}

	@RequestMapping("/search")
	public RedirectView search(@RequestParam("querybox") String query)
	{

		String url="https://www.google.com/search?q="+query;
		RedirectView redirect=new RedirectView();
		redirect.setUrl(url);
		return redirect;
	}

	/*
	 * @ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	 * 
	 * @ExceptionHandler(NullPointerException.class) public String
	 * exceptionHandlerNull(Model m) {
	 * m.addAttribute("msg","Null pointer exception has occured"); return
	 * "exception"; }
	 * 
	 * @ResponseStatus(value=HttpStatus.BAD_REQUEST)
	 * 
	 * @ExceptionHandler(Exception.class) public String
	 * exceptionHandlerGeneric(Model m) {
	 * m.addAttribute("msg","Exception has occured"); return "exception"; }
	 * 
	 * 
	 */}
