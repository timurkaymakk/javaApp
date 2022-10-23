package classesWithAttributes;

public class Product {
	/*
	 * //attribute | field int id;//bu şekilde tanımladığınız zaman public olarak
	 * tanımlamış //olursunuz default olarak String name; String description; double
	 * price; int stockAmount; String renk; //private : sadece tanımlandığı blokta
	 * geçerli demektir
	 */
	// getter : getir al demektir bir değeri okumaya yönelik işlemdir
	// setter : set kurmak ayarlamak demektir.bir nesneye değer vermeye yarar
	
	public Product(int id,String name,String description,double price,int stockAmount,String renk) {
		System.out.println("Yapıcı blok çalıştı");
		this.id = id;
		this.renk = renk;
		this.name = name;
		this.price = price;
		this.description = description;
		this.stockAmount = stockAmount;
		
		/* Burası bir constructordır
		 *  constructor yapıcı oluşturucu demektir
		classların constructorı olabilir
		default olarak bir constructor vardır
		istersek constructor geliştirebiliriz
		her bir classın kendi ismiyle bir constructorı vardır	
		*/
	}
	public Product() {
		//overloading
		//product classını bir parametresiz birde 6 parametreli constructorı var
		//isteyen istediğini kullanır anlamında
	}
	
	
	private int id;// başına koyduğumuz ' _ ' ile class ve field elemanların karışmasını önleriz
	private String name;
	private String description;
	private double price;
	private int stockAmount;
	private String renk;
	private String kod;

	// getter
	public int getId() {// böyle bırakınca idyi okuyabilir demektir
		// main bloğuna da product.getId(); yazarak okuyabiliriz
		// isimlendirme standardı get ve set ile başlar

		return id;
	}

	// setter
	public void setId(int id) {// set edilen değer parantez içinde parametre olarak verilmeli
		this.id = id;// this içerisinde bulunduğum class demektir
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {//kodu hiçbir şekilde yazılabilir olmasını 
									  //istemiyorsak set olan kısmı kaldırırız
		
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStockAmount() {
		return stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

	public String getKod() {
		return this.name.substring(0,1) + id ;
		
	}
	
	


}
