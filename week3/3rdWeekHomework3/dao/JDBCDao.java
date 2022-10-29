package EnginDemirogJavaOdev.Bolum3.dao;

public interface JDBCDao extends Dao {
	@Override
	default <T> void add(T t) {
		// TODO Auto-generated method stub
		System.out.println(t + " veritabanýna jdbc ile eklendi");
	}
}
