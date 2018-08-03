package test.session;

public interface SessionService extends CoreSessionService {
	String getCurrentClientId();
	void setCurrentClientId(String clientId);
}
