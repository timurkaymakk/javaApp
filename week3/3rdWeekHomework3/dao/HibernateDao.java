package EnginDemirogJavaOdev.Bolum3.dao;

public interface HibernateDao extends Dao {
	@Override
	default <T> void add(T t) {
		// TODO Auto-generated method stub
		System.out.println(t + " veritabanýna hibernate ile eklendi");
	}
}
