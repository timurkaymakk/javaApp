package EnginDemirogJavaOdev.Bolum3.logging;

public class FileLogger implements Loger {

	@Override
	public void log(String data) {
		System.out.println("fileLogger loglandý " + data);

	}

}
