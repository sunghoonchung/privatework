package msg.tester.http;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import msg.tester.constants.ICommonCode;
import msg.tester.module.CommonVariable;
import msg.tester.utils.UidUtils;

public class HttpInterceptor implements HandlerInterceptor {

	final Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	private CommonVariable commonVariable;

	@Override
	public void afterCompletion(HttpServletRequest req, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		logger.debug("------------------------------------------------------------------");
		logger.debug(" Complete : Request = {}, {}", req.getRequestURI(), req.getMethod());
		logger.debug("------------------------------------------------------------------");
		commonVariable.clear();
	}

	@Override
	public void postHandle(HttpServletRequest req, HttpServletResponse response, Object arg2, ModelAndView arg3)
			throws Exception {
		response.setHeader("Cache-Control", "no-store");
		response.setHeader("Pragma", "no-cache");
		response.setDateHeader("Expires", 0);
		if (req.getProtocol().equals("HTTP/1.1")) {
			response.setHeader("Cache-Control", "no-cache");
		}
		logger.debug("------------------------------------------------------------------");
		logger.info(" END : Request = {}, {}", req.getRequestURI(), req.getMethod());
		logger.debug("------------------------------------------------------------------");
	}

	@Override
	public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object handler) throws Exception {

		logger.debug("------------------------------------------------------------------");
		logger.info(" START : Request = {}, {}", req.getRequestURI(), req.getMethod());
		logger.debug("------------------------------------------------------------------");

		HttpSession session = req.getSession();
		String userId = null;
		if (session != null && (userId = (String) session.getAttribute(ICommonCode.SESSION.USER_ID)) != null) {
			String uid = UidUtils.getInstance().genUid();
			commonVariable.setUserId(userId);
			commonVariable.setUid(uid);
		}

		return true;
	}
}
