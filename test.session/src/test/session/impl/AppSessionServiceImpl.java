package test.session.impl;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ReferencePolicyOption;

import test.session.AppSessionService;
import test.session.CoreSessionService;
import test.session.SessionService;

@SuppressWarnings("nls")
@Component(immediate=true, property = "service.ranking:Integer=10", service= {AppSessionService.class, SessionService.class, CoreSessionService.class})
public class AppSessionServiceImpl implements AppSessionService {
	@Reference(policyOption=ReferencePolicyOption.GREEDY)
	private volatile SessionService sessionService;

	@Activate
	private void init() {
		System.out.println("Activating " + getClass());
	}
	
	@Override
	public String getCurrentClientId() {
		return "app_" + sessionService.getCurrentClientId();
	}

	@Override
	public void setCurrentClientId(String clientId) {
		sessionService.setCurrentClientId(clientId);
	}

	@Override
	public String getCurrentSessionId() {
		return "app_" + sessionService.getCurrentSessionId();
	}

	@Override
	public String getCurrentUserId() {
		return "app_" + sessionService.getCurrentUserId();
	}

	@Override
	public void setCurrentUserId(String userId) {
		sessionService.setCurrentUserId(userId);
	}

	@Override
	public String getIpAddress() {
		return "app_" + sessionService.getIpAddress();
	}

	@Override
	public void setIpAddressId(String ipAddress) {
		sessionService.setIpAddressId(ipAddress);
	}

	@Override
	public String getCurrentRealmName() {
		return "my realm";
	}
}