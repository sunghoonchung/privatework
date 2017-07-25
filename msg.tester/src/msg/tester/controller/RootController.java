package msg.tester.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import msg.tester.domain.SimulatorInfoDto;

@Controller
@RequestMapping(value = "/", method = { RequestMethod.GET, RequestMethod.POST })
public class RootController {

	final Logger logger = LoggerFactory.getLogger(getClass());

	private static boolean isLogin;

	@RequestMapping(value = "/start")
	public @ResponseBody String start() {
		return "Start-Root";
	}

	@RequestMapping(value = "/end")
	public @ResponseBody SimulatorInfoDto end(@RequestParam("key") String key) {
		SimulatorInfoDto dto = new SimulatorInfoDto();
		dto.setSimId("End-Root key:" + key);
		return dto;
	}

	/**
	 * 인덱스 페이지(로그인) 가져오기
	 */
	@RequestMapping(value = "/")
	public ModelAndView login() {
		try {
			if (isLogin) {
				isLogin = false;
			} else {
				isLogin = true;
			}
			return new ModelAndView("index");
		} catch (Throwable e) {
			throw e;
		}
	}

	@RequestMapping(value = { "/main" })
	public ModelAndView main() {
		try {
			if (isLogin) {
				return new ModelAndView("main");
			} else {
				return new ModelAndView("redirect:/");
			}
		} catch (Throwable e) {
			throw e;
		}
	}
}
