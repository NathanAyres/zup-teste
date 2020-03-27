package web.steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import web.core.DriverFactory;
import web.core.IBrowser;
import web.core.ThreadDriver;

public class Hooks {

	@Before
	public void beforeScenario() throws Exception {

		IBrowser browser = DriverFactory.getInstance().getBrowser();
		browser.setupBrowser();

	}

	@After(order = 0, value = { "@COMPRAS" })
	public void fecharBrowser() {
		ThreadDriver.getTDriver().quit();
		System.out.println("terminando");
	}

}
