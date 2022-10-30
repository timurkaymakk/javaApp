
public class Main {

	public static void main(String[] args) {
		Product product= new Product();
		Product product1=new Product();
		
		product.id=1;
		product.name="Laptop";
		product.description="Apple Laptop";
		product.price=5000;
		product.stockAmount=7;
		product.renk="kırmızı";
		
		//getter ve setter lar ile bu hatalar giderilecek bunun hatasız hali getter setter 
		// project branchinde düzeltilecektir
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		

		
	}

}
