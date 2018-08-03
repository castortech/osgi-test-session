package test.session;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(service=TestSessionService.class, immediate=true)
public class TestSessionService {
	@Reference 
	SessionService ss;

	@Activate
	private void activate() {
		System.out.println("Activating " + getClass());
		System.out.println("\t" + ss.toString());
		System.out.println("\t" + ss.getCurrentUserId());
	}
}
