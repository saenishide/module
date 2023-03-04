package com.document.cdoc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReadListController {
	
	@RequestMapping(value="/readList")
	private String index(Model model){
		model.addAttribute("setumei", "一覧画面です");
	    return "readList";
	}

}
