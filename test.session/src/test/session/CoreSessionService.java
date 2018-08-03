package test.session;

public interface CoreSessionService {
	String getCurrentSessionId();
	
	String getCurrentUserId();
	void setCurrentUserId(String userId);

	String getIpAddress();
	void setIpAddressId(String ipAddress);
}