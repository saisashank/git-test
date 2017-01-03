package mvcdemo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class controlling {
	
	
	@RequestMapping("/")
	public String data(){
		return "new";
	}
	
	@RequestMapping("/formdata")
	public String formdata(){
		return "data";
	}
	
	@RequestMapping("/returndata")
	public String returndata(@RequestParam("first name") String my,Model model){
		
		 my = my.toUpperCase();
		 String result = "the changed text: " +my;
		 model.addAttribute("mymessage", result);
		return "getdata";
	}
}
