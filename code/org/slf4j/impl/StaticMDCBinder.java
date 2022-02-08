package org.slf4j.impl;

import org.slf4j.helpers.BasicMDCAdapter;
import org.slf4j.spi.MDCAdapter;

/**
 * Tells SLF4J to use the BasicMDCAdapter.
 * 
 * I am not even going to pretend to know what that is, but it silences SLF4J's mouth
 */
public class StaticMDCBinder {

    public static final StaticMDCBinder SINGLETON;
    
    private StaticMDCBinder() {
    }
    
    public MDCAdapter getMDCA() {
        return new BasicMDCAdapter();
    }
    
    public String getMDCAdapterClassStr() {
        return BasicMDCAdapter.class.getName();
    }
    
    static {
        SINGLETON = new StaticMDCBinder();
    }
	
}
