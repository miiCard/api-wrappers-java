package com.miicard.consumers.service.v1.claims.api;

public interface IdentitySnapshot {
	IdentitySnapshotDetails getDetails();
	MiiUserProfile getSnapshot();
}
