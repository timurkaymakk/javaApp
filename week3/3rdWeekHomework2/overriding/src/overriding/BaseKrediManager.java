package overriding;

public class BaseKrediManager {//final keywordu kullanılırsa override edilmesi engellenmiş olur
	public double Hesapla(double tutar)
	{
		return tutar * 1.18;
	}
}
//overridable