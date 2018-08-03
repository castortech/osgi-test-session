package test.session;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(service=TestCoreSessionService.class, immediate=true)
public class TestCoreSessionService {
	@Reference 
	CoreSessionService css;

	@Activate
	private void activate() {
		System.out.println("Activating " + getClass());
		System.out.println("\t" + css.toString());
		System.out.println("\t" + css.getCurrentUserId());
	}
}
