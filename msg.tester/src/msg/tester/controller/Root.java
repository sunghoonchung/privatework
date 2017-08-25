package msg.tester.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import msg.tester.domain.SessionInfo;

@Controller
@RequestMapping(value = "/", method = { RequestMethod.GET, RequestMethod.POST })
public class Root {

	final Logger logger = LoggerFactory.getLogger(getClass());

	/**
	 * 인덱스 페이지(로그인) 가져오기
	 */
	@RequestMapping(value = "/main", method = RequestMethod.POST)
	public ModelAndView main(HttpSession session, @RequestParam("userId") String userId,
			@RequestParam("userPw") String userPw) {

		logger.debug("userId:{}, userPw:{}", userId, userPw);

		ModelAndView mav = null;
		{
			Map<String, Object> modelMap;
			if (userId.equals("sysadmin")) {
				mav = new ModelAndView("main");
				modelMap = new HashMap<String, Object>();
				SessionInfo sessionInfo = new SessionInfo();
				sessionInfo.setUserId(userId);
				modelMap.put("sessionInfo", sessionInfo);
				mav.addAllObjects(modelMap);
			}
		}
		if (mav == null) {
			mav = new ModelAndView("redirect:/");
		}
		return mav;
	}

	/**
	 * 인덱스 페이지(로그인) 가져오기
	 */
	@RequestMapping(value = "/")
	public ModelAndView root() {
		return new ModelAndView("login");
	}

	/**
	 * 인덱스 페이지(로그인) 가져오기
	 */
	@RequestMapping(value = "/login")
	public ModelAndView login() {
		return new ModelAndView("login");
	}

	/**
	 * 인덱스 페이지(로그인) 가져오기
	 */
	@RequestMapping(value = "/logout")
	public ModelAndView logout(HttpServletRequest req) {
		ModelAndView out = new ModelAndView("redirect:/");
		HttpSession session = req.getSession(false);
		if (session != null) {
			session.invalidate();
		}
		return out;
	}

	@RequestMapping(value = { "/*" })
	public ModelAndView unknown() {
		return new ModelAndView("redirect:/");
	}
}
