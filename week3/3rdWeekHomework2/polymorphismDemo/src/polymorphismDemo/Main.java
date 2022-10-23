package polymorphismDemo;

public class Main {

	public static void main(String[] args) {
		/*
		EmailLogger logger = new EmailLogger();
		logger.Log("Log mesajı");
		
		DatabaseLogger logger2 = new DatabaseLogger();
		logger2.Log("Override edilerek loglandı");
		
		//overriding
		*/
		/*
		BaseLogger[] loggers = new BaseLogger[] {new FileLogger(),new EmailLogger(),new DatabaseLogger(),
				new ConsoleLogger()};//bu sistem sayesinde hiçbir bağımlılık olmadan 
									 //ekleme çıkarma değişiklik yapabiliyoruz
		for(BaseLogger logger : loggers)//bu yöntemi kullanarak sisteminize 
			//istediğiniz kadar log ortamı ekleyebilirsiniz
		{
			logger.Log("Log Mesajı");
		}
		*/
		CustomerManager customerManager = new CustomerManager(new FileLogger());//new DatabaseLogger
		customerManager.add();
		
		
		
		
		
	}

}
