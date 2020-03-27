package web.core;

public class DriverFactory {
	private static DriverFactory _instance;

	private DriverFactory(){}

	public static synchronized DriverFactory getInstance() {
		if (_instance == null)
			_instance = new DriverFactory();

		return _instance;
	}

	public IBrowser getBrowser() {
		return new Browser();
	}
}
