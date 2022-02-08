package org.slf4j.impl;

import org.golde.stfuslf4j.ShitLoggerFactory;
import org.slf4j.ILoggerFactory;
import org.slf4j.spi.LoggerFactoryBinder;

/**
 * Tells SLF4J to use the SitLoggerFactory for logging
 */
public class StaticLoggerBinder implements LoggerFactoryBinder {

    private static StaticLoggerBinder SINGLETON = new StaticLoggerBinder();
	
	@Override
	public ILoggerFactory getLoggerFactory() {
		return new ShitLoggerFactory();
	}

	@Override
	public String getLoggerFactoryClassStr() {
		return ShitLoggerFactory.class.getName();
	}
    
    public static StaticLoggerBinder getSingleton() {
        return StaticLoggerBinder.SINGLETON;
    }


}
