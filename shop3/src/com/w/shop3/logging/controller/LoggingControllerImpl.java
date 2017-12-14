package com.w.shop3.logging.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.w.shop3.logging.service.LoggingServiceImpl;

@Controller
@RequestMapping("l")
public class LoggingControllerImpl {

	@Resource
	private LoggingServiceImpl lsi;

}
