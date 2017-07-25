package msg.tester.http;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class TestHttpInterceptor implements HandlerInterceptor {

	final Logger logger = LoggerFactory.getLogger(getClass());

	@Override
	public void afterCompletion(HttpServletRequest req, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		logger.debug("------------------------------------------------------------------");
		logger.debug(" Complete : Request = {}, {}", req.getRequestURI(), req.getMethod());
		logger.debug("------------------------------------------------------------------");
	}

	@Override
	public void postHandle(HttpServletRequest req, HttpServletResponse response, Object arg2, ModelAndView arg3)
			throws Exception {
		logger.debug("------------------------------------------------------------------");
		logger.debug(" END : Request = {}, {}", req.getRequestURI(), req.getMethod());
		logger.debug("------------------------------------------------------------------");
	}

	@Override
	public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object handler) throws Exception {

		logger.debug("------------------------------------------------------------------");
		logger.debug(" START : Request = {}, {}", req.getRequestURI(), req.getMethod());
		logger.debug("------------------------------------------------------------------");
		return true;
	}
}
