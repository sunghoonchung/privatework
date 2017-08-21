package msg.tester.http;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.h2.server.ShutdownHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BxtServletContextListener implements ServletContextListener, ShutdownHandler {

	final Logger logger = LoggerFactory.getLogger(getClass());

	@Override
	public void contextDestroyed(ServletContextEvent event) {
		logger.debug("ServletContextListener Destroyed.");
	}

	@Override
	public void contextInitialized(ServletContextEvent event) {
		logger.debug("ServletContextListener Initialized.");
	}

	@Override
	public void shutdown() {
		logger.debug("Going to be shutdown.");
	}

}
