package methodOverloading;

public class Main {

	public static void main(String[] args) {
		DortIslem dortislem = new DortIslem();
		System.out.println("Toplama İşlemi 2 sayıyla = " + dortislem.topla(2,3));
		System.out.println("Toplama İşlemi 3 sayıyla = " + dortislem.topla(2,3,4));
		System.out.println("Çıkarma İşlemi 2 sayıyla = " + dortislem.cikar(26,5));
		System.out.println("Çıkarma İşlemi 3 sayıyla = " + dortislem.cikar(26,5,8));
		System.out.println("Çarpma İşlemi 2 sayıyla = " + dortislem.carp(7,6));
		System.out.println("Çarpma İşlemi 4 sayıyla = " + dortislem.carp(7,6,9,2));
		System.out.println("Bölme İşlemi 2 sayıyla = " + dortislem.bol(18,3));
		System.out.println("Bölme İşlemi 3 sayıyla = " + dortislem.bol(18,3,2));
	}

}
