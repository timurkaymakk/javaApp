package abstractDemo;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager();
		customerManager.databaseManager =new MySqlDatabaseManager(); //customerManager.databaseManager = new SqlServerDatabaseManager();
	//customerManager.databaseManager = new OracleDatabaseManager();	
		customerManager.getCustomers();
		
	}

}
