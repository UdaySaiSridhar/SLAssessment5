package springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProController {
	@RequestMapping("/")
	  public String index() {
	    return "index.html";
	  }
}
