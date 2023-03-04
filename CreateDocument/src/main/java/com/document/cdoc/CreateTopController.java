package com.document.cdoc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CreateTopController {
	
	@RequestMapping(value="/createTop")
	private String index(Model model){
		model.addAttribute("setumei", "作成画面トップです");
	    return "createTop";
	}

}
