package methodOverloading;

public class DortIslem
{
	
	public int topla(int sayi1,int sayi2) 
	{
		return sayi1+sayi2;
	}
	public int topla(int sayi1,int sayi2,int sayi3)//overloading
	{
		return sayi1+sayi2;
	}
	// 2 defa method olmasına rağmen hata vermemesinin sebebi method overloading olması
	//aynı isimde fakat 2 farklı metod var duruma göre istediği metodu çalıştırıyor
	//ikisinin metod parametre imzalarının farklı olmasından dolayı hata almayız.
	public int cikar(int sayi1,int sayi2)
	{
		int sonuc = sayi1-sayi2;
		return sonuc;
	}
	public int cikar(int sayi1,int sayi2,int sayi3)
	{
		int sonuc = sayi1-sayi2;
		sonuc = sonuc - sayi3;
		return sonuc;
	}
	public int carp(int sayi1,int sayi2) {
		int sonuc = sayi1 * sayi2;
		return sonuc;
	}
	public double carp(int sayi1,int sayi2,int sayi3,int sayi4) {
		double sonuc = sayi1 * sayi2 * sayi3 * sayi4;
		return sonuc;
	}
	public double bol(int sayi1,int sayi2) {
		double sonuc = sayi1 / sayi2;
		return sonuc;
	}
	public double bol(int sayi1,int sayi2,int sayi3) {
		double sonuc = sayi1 / sayi2;
		sonuc = sonuc / sayi3;
		return sonuc;
	}
	
	
}
