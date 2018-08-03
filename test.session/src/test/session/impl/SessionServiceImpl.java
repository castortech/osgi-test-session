package test.session.impl;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;

import test.session.CoreSessionService;
import test.session.SessionService;

@Component(service= {SessionService.class, CoreSessionService.class})
public class SessionServiceImpl implements SessionService {

	@Activate
	private void init() {
		System.out.println("Activating " + getClass());
	}
	
	@Override
	public String getCurrentUserId() {
		return "current user id";
	}

	@Override
	public void setCurrentUserId(String userId) {
		//do nothing
	}

	@Override
	public void setCurrentClientId(String clientId) {
		// TODO Auto-generated method stub
	}
	
	@Override
	public String getCurrentClientId() {
		return "best client";
	}

	@Override
	public String getCurrentSessionId() {
		return "session id";
	}

	@Override
	public String getIpAddress() {
		return "127.0.0.1";
	}

	@Override
	public void setIpAddressId(String ipAddress) {
		//do nothing
	}
}