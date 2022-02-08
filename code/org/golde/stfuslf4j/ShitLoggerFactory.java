package org.golde.stfuslf4j;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;

/**
 * Tells SLF4J to use the SitLogger for logging
 */
public class ShitLoggerFactory implements ILoggerFactory {

	ConcurrentMap<String, Logger> loggerMap;

	public ShitLoggerFactory() {
		this.loggerMap = new ConcurrentHashMap<String, Logger>();
	}

	@Override
	public Logger getLogger(final String name) {
		final Logger simpleLogger = this.loggerMap.get(name);
		if (simpleLogger != null) {
			return simpleLogger;
		}
		final Logger newInstance = (Logger)new ShitLogger(name);
		final Logger oldInstance = this.loggerMap.putIfAbsent(name, newInstance);
		return (oldInstance == null) ? newInstance : oldInstance;
	}

	void reset() {
		this.loggerMap.clear();
	}

}
