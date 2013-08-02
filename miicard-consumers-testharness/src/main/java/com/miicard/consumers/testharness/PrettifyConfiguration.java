package com.miicard.consumers.testharness;

import java.math.BigDecimal;

public class PrettifyConfiguration {
	protected BigDecimal modestyLimit;
	
	public BigDecimal getModestyLimit() {
		return this.modestyLimit;
	}
	
	public void setModestyLimit(final BigDecimal value) {
		this.modestyLimit = value;
	}
}
