package springmvcsearch;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
}
