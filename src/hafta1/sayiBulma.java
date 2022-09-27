package hafta1;

public class sayiBulma {

	public static void main(String[] args) {
		int [] sayilar = new int [] {1,2,3,4,5,9,21,0,9};
		int aranacak = 6;
		boolean varMi = false;
		
		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;
				break;
			}
		}
		if (varMi) {
			System.out.println("Sayı Bulundu: "+aranacak);
		}
		else {
			System.out.println("Sayı Bulunamadı: ?");
		}
		
	}

}
