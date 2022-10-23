public class Main {
	public static void main(String[] args) {
	KrediUI krediUI = new KrediUI();
	krediUI.KrediHesapla(new OgretmenKrediManager());//KrediUI da basekredimanager 
	//verdiğimiz için bundan inherite edilen diğer class değerleride verilebilir
	krediUI.KrediHesapla(new AskerKrediManager());
	krediUI.KrediHesapla(new TarimKrediManager());
	}
}
