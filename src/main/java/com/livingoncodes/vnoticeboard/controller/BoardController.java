package com.livingoncodes.vnoticeboard.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BoardController {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(BoardController.class);
	
	@RequestMapping(value ="/{schoolName}", method = RequestMethod.GET)
	public String showBoard(@PathVariable("schoolName") String schoolName, Model model) {
		LOGGER.debug("Rendering school page: " + schoolName);
		
		model.addAttribute("schoolName", schoolName);
		return "board";
	}


}
