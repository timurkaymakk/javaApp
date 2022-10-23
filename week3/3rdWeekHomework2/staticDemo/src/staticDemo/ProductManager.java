package staticDemo;

public class ProductManager {
	public void add(Product product) {
		//ProductValidator validator = new ProductValidator();
		if (ProductValidator.isValid(product)){
			System.out.println("Eklendi");
		}else {
			System.out.println("Ürün bilgileri geçersizdir");
		}
		
		/*
		ProductValidator productValidator = new ProductValidator();
		productValidator.bisey();//static değil bu yüzden newlemek gerek
		*/
	}
}
//static ifadesi bir kere örneğini oluşturuyor
//static tanımladığınızda bellekten atılmaz uygulama sıfırlanana kadar.
//çağıran kullanıcı nesneyi oluşturur diğerlerinin hepsi bu nesneyi kullanır
//manager sınıfları static yapılmaz
//yardımcı araçlar geçici kullan bırak at araçları static olarak kullanılabilir.
//static olduğu zaman constructor yani yapıcı blok çalışmaz
//yeni bir nesne oluşturulduğunda yani 'new ' lendiğinde yapıcı blok çalışır
//static de çalıştırmak için static yapıcı bloklar oluşturulur
//birden fazla static yapıcı blok oluşturup çalıştırılabilir