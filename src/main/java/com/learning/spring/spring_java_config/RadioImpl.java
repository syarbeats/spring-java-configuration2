package com.learning.spring.spring_java_config;

public class RadioImpl implements IRadio {

	@Override
	public String getChannelName() {
		
		return "Radio Prambors";
	}

	@Override
	public String getChannelFrequency() {
		
		return "100.10Mhz";
	}

}
