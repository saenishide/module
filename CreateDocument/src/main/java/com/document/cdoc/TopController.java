package com.document.cdoc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TopController {

	@RequestMapping(value="/")
	private String index(Model model){
		model.addAttribute("hitokoto", "よろしくお願いします！");
	    return "index";
	}
}
