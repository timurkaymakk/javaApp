
public class Main3 {

	public static void main(String[] args) {
		Product2 product= new Product2();
		product.id=1;
		product.name="Laptop";
		product.description="Apple Laptop";
		product.price=5000;
		product.stockAmount=7;
		
		
		ProductManager2 productManager = new ProductManager2();
		productManager.Add(product);
		//System.out.println(product.name);


	}

}
