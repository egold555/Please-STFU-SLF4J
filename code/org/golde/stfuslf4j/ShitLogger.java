package org.golde.stfuslf4j;

import org.slf4j.helpers.MarkerIgnoringBase;

/**
 * This is where you use your logger class
 */
public class ShitLogger extends MarkerIgnoringBase {

	private static final long serialVersionUID = 8581376173899074295L;

	//Replace me with your logger
	private final YourLogger logger;
	
	ShitLogger(final String name) {
		this.name = name;

		//Having a custom name helps
		this.logger = new Logger("ShitLogger - " + name);
	}

	//------- Implement the function below -------------
	//This is what I did for my logger, you do what you need to do for your
	@Override
	public void debug(String msg) {
		logger.debug(msg);
	}

	@Override
	public void debug(String msg, Object arg1) {
		logger.debug(msg);
	}

	@Override
	public void debug(String msg, Object... arg1) {
		logger.debug(msg);
	}

	@Override
	public void debug(String msg, Throwable arg1) {
		logger.debug(msg);
	}

	@Override
	public void debug(String msg, Object arg1, Object arg2) {
		logger.debug(msg);
	}

	@Override
	public void error(String msg) {
		logger.error(msg);
	}

	@Override
	public void error(String msg, Object arg1) {
		logger.error(msg);
	}

	@Override
	public void error(String msg, Object... arg1) {
		logger.error(msg);
	}

	@Override
	public void error(String msg, Throwable t) {
		logger.error(msg, t);
	}

	@Override
	public void error(String msg, Object arg1, Object arg2) {
		logger.error(msg);
	}

	@Override
	public void info(String msg) {
		logger.info(msg);
	}

	@Override
	public void info(String msg, Object arg1) {
		logger.info(msg);
	}

	@Override
	public void info(String msg, Object... arg1) {
		logger.info(msg);
	}

	@Override
	public void info(String msg, Throwable arg1) {
		logger.info(msg);
	}

	@Override
	public void info(String msg, Object arg1, Object arg2) {
		logger.info(msg);
	}

	/*I just left these true, and let my logger filter shit out*/
	@Override
	public boolean isDebugEnabled() {
		return true;
	}

	@Override
	public boolean isErrorEnabled() {
		return true;
	}

	@Override
	public boolean isInfoEnabled() {
		return true;
	}

	//See comment below about not enabling trace logs
	@Override
	public boolean isTraceEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isWarnEnabled() {
		return true;
	}

	@Override
	public void warn(String msg) {
		logger.warning(msg);
	}

	@Override
	public void warn(String msg, Object arg1) {
		logger.warning(msg);
	}

	@Override
	public void warn(String msg, Object... arg1) {
		logger.warning(msg);
	}

	@Override
	public void warn(String msg, Throwable t) {
		logger.warning(msg);
	}

	@Override
	public void warn(String msg, Object arg1, Object arg2) {
		logger.warning(msg);
	}

	//I didn't impement trace for my logger, but you can ig
	@Override
	public void trace(String msg) {
		// TODO Auto-generated method stub

	}

	@Override
	public void trace(String msg, Object arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void trace(String msg, Object... arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void trace(String msg, Throwable arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void trace(String msg, Object arg1, Object arg2) {
		// TODO Auto-generated method stub

	}

}
