package com.miicard.consumers.service.v1.claims.api;

import com.miicard.consumers.service.v1.claims.impl.QualificationType;

public interface Qualification {
	public QualificationType getType();
	public String getTitle();
	public String getDataProvider();
	public String getDataProviderUrl();
}