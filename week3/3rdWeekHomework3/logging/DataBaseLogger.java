package EnginDemirogJavaOdev.Bolum3.logging;

public class DataBaseLogger implements Loger {

	@Override
	public void log(String data) {
		System.out.println("databaseLogger loglandý " + data);

	}

}
