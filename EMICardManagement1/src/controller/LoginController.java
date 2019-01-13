//package controller;
//
//import java.util.Map;
//
//import javax.validation.Valid;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//import model.Users;
//
//@Controller
//
//public class LoginController {
//	@RequestMapping(value="/login",method = RequestMethod.GET)
//	public String showForm(ModelAttribute("Users") Users lf) {
//	
//		service.get
//		return "Users";
//	}
//	
//	@RequestMapping(method = RequestMethod.POST)
//	public String processForm(@Valid Users Users, BindingResult result,
//			Map model) {
//		String userName = "UserName";
//		String password = "password";
//		if (result.hasErrors()) {
//			return "Users";
//		}
//		Users = (Users) model.get("Users");
//		if (!Users.getUserName().equals(userName)
//				|| !Users.getPassword().equals(password)) {
//			return "Users";
//		}
//		model.put("Users", Users);
//		return "loginsuccess";
//	}
//
//}
