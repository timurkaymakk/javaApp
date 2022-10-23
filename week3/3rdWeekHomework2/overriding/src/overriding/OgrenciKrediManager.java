package overriding;

public class OgrenciKrediManager extends BaseKrediManager {
	public double Hesapla(double tutar)
	//BaseKrediManager ın hesapla operasyonunu OgrenciKrediManager için ezmiş olduk
	{
		return tutar * 1.10;
	}
}
