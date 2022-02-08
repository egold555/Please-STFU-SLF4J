package org.slf4j.impl;

import org.slf4j.IMarkerFactory;
import org.slf4j.helpers.BasicMarkerFactory;
import org.slf4j.spi.MarkerFactoryBinder;

/**
 * Tells SLF4J to use the BasicMarkerFactory.
 * 
 * I am not even going to pretend to know what that is, but it silences SLF4J's mouth
 */
public class StaticMarkerBinder implements MarkerFactoryBinder {

	@Override
	public IMarkerFactory getMarkerFactory() {
		return new BasicMarkerFactory();
	}

	@Override
	public String getMarkerFactoryClassStr() {
		return BasicMarkerFactory.class.getName();
	}

}
