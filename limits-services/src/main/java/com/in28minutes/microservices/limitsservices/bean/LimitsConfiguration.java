package com.in28minutes.microservices.limitsservices.bean;

public class LimitsConfiguration {
int maximum;
int minimum;

protected LimitsConfiguration() {
}

public LimitsConfiguration(int maximum, int minimum) {
	super();
	this.maximum = maximum;
	this.minimum = minimum;
}
public int getMaximum() {
	return maximum;
}
public int getMinimum() {
	return minimum;
}


}
