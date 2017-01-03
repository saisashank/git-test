package mvcdemo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/student")
public class testing {
	
	@RequestMapping("/")
	public String data(){
		return "new";
	}
	
	@RequestMapping("/formdata")
	public String formdata(Model themodel){
		Student thestudent = new Student();
		themodel.addAttribute("student",thestudent);
		return "studentform";
	}
	@RequestMapping("/processform")
	public String returndata(@ModelAttribute("student") Student thestudent){
		return "processform";
	}
}
