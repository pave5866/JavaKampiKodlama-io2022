package hafta2;

public class Main {

	public static void main(String[] args) {
		// Sadece Yazmak İçin "set" Ediyoruz
		// Sadece Okumak İçin "get" Ediyoruz

		Product product1 = new Product();
		// Ürünün Adı
		product1.setName("Monster Abra A7 Laptop");
		// Ürünün Fotoğrafı
		product1.setImageUrl("Monster.jpg");
		// Ürünün Fiyatı
		product1.setUnitPrice(5500);
		// Ürünün İndirim Tutarı
		// product1.setdiscount(500);
		// Ürünün Stoğu
		product1.setUnitsInStock(2500);

		Product[] products = new Product[] { product1 };

		for (var urun : products) {
			System.out.println("Ürünün Adı: " + urun.getName());
			System.out.println("Ürünün Resmi: " + urun.getImageUrl());
			System.out.println("Ürünün Fiyatı: " + urun.getUnitPrice());
			System.out.println("Ürünün İndirim Tutarı: " + urun.getDiscount());
			System.out.println("Ürünün Stok Adedi: " + urun.getUnitsInStock());
			System.out.println("---");
		}
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("05555555555");
		individualCustomer.setCustomerNumber("12345");
		individualCustomer.setFirtName("Kadir");
		individualCustomer.setLastName("Erdem");

		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("HasCraft");
		corporateCustomer.setPhone("05555555555");
		corporateCustomer.setTaxNumber("54321");
		
		Customer[] customers = {individualCustomer,corporateCustomer};
		
		
	}

}
