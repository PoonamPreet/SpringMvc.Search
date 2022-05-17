package springmvcsearch;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

//exception handling 
//centralised page for exception handling
@ControllerAdvice
public class MyExceptionHandler {


	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(NullPointerException.class)
	public String exceptionHandlerNull(Model m)
	{
		m.addAttribute("msg","Null pointer exception has occured");
		return "exception";
	}
	
	@ResponseStatus(value=HttpStatus.BAD_REQUEST)
	@ExceptionHandler(Exception.class)
	public String exceptionHandlerGeneric(Model m)
	{
		m.addAttribute("msg","Exception has occured");
		return "exception";
	}




}
