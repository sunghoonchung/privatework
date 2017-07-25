package msg.tester.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import msg.tester.domain.SimulatorDto;

@Controller
@RequestMapping(value = "/", method = { RequestMethod.GET, RequestMethod.POST })
public class ActionController {

	final Logger logger = LoggerFactory.getLogger(getClass());

	@RequestMapping(value = "/login.do")
	public @ResponseBody ModelAndView start(@RequestParam("userId") String userId,
			@RequestParam("passwd") String passwd) {
		return new ModelAndView("main");
	}

	@RequestMapping(value = "/writeList.do")
	public @ResponseBody String start(SimulatorDto dto) {
		return "List:" + dto.getSim();
	}
}
