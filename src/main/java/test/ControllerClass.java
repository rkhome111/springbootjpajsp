package test;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.User;
import com.example.UserRepository;


@Controller
public class ControllerClass {

	
	@Autowired
	UserRepository userRepo;
	
	@RequestMapping(value="/test")
	public String test(@RequestParam(value="name",required=false)String name,Model map)
	{
		map.addAttribute("name", name);
		System.out.println("test controller called "+name);
		return "index";
	}
	
	@RequestMapping(value="/get")
	@ResponseBody
	public User get()
	{
		User user = new User("roushan singh","developer",15000l);
//		userRepo.save(user);
		
		System.out.println(user.getId());
		return user;
	}
	
	@RequestMapping(value="/getuserlist")
//	@ResponseBody
	public String getUsers(Model m,@RequestParam("name") String name)
	{
		m.addAttribute("command",new User());
		User u = new User();
		u.setId(16);
		m.addAttribute("users", (List)userRepo.findByUser(u));
		return "User";
	}
	
	@GetMapping(value="userform")
	public String getUserForm(Model m)
	{
		m.addAttribute("command", new User());
		return "User";
	}
	
	@RequestMapping(value="getuser/{id}/{name}")
	public String getUser(Model m,@PathVariable(name="id") String id,@PathVariable("name") String name)
	{
		System.out.println("Name found "+name);
		m.addAttribute("command", userRepo.findOne(new Long(id)));
		return "User";
	}
	
	@RequestMapping(value="/save")
	@ResponseBody
	public String userForm(User user)
	{
		
		System.out.println("user find in post "+user);
		userRepo.save(user);
//		userRepo.
		return "User saved sucessfully ";
	}
}
