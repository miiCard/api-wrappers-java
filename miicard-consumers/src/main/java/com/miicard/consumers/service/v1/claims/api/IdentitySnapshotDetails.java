package com.miicard.consumers.service.v1.claims.api;

import java.util.Date;

public interface IdentitySnapshotDetails {
	String getSnapshotId();
	String getUsername();
	Date getTimestampUtc();
	Boolean getWasTestUser();
}
