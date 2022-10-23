package classesWithAttributes;

public class ProductManager {
	public void Add(Product product) {
		// CDBC

		// classlar ilgili operasyonları ilgili özellikleri tutarlar

		// classlar tek bir işi yaparlar her class tek bir işten sorumludur
		// SOLID Prensibinin S harfi yani 'Single Responsibility' prensibi bunu
		// gerektirir
		System.out.println("Ürün Eklendi " + product.getName());

	}

	public void Add2(int id, String name, String description, int stockAmount,
			double price, String renk) {

	}
}
