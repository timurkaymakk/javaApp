package staticDemo;

public class ProductValidator {//ürünün kurallara uygun olup olmadığı
	static {
		System.out.println("Static Yapıcı blok çalıştı");
	}
	public ProductValidator() {
		System.out.println("Yapıcı blok çalıştı");
	}
	public static boolean isValid(Product product){//Product managerda gelmesi için operasyonu static yaptık
		if (product.price>0 && !product.name.isEmpty()){
			return true;
		}else {
			return false;
		}
	}
	public void bisey()//bunu çağırabilmek için product validator new lenmesi gerek
	{
		
	}
}
