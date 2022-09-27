package hafta1;

public class strings {

	public static void main(String[] args) {
		String mesaj = "Canım Biz Izmırlıyız Ya";
		System.out.println(mesaj);
		
		// lenght = mesajın uzunluğunu buldurur
		System.out.println("Eleman Sayısı: " + mesaj.length());
		
		// charAt() = içine hangi sayıyı verirsek o uzunluktaki harfi bulur. 
		System.out.println("5.Eleman: " + mesaj.charAt(5));
		
		// concat = birleştirme anlamında
		System.out.println(mesaj.concat("yeminime Kuran"));
		
		// startsWith() = baştan başlayıp verdiğimiz değeri bulur ekrana yazar sonlanır.
		System.out.println(mesaj.startsWith("C"));
		
		// endsWith() = sondan başlayıp verdiğimiz değeri bulur ekrana yazar sonlanır.
		System.out.println(mesaj.endsWith("a"));
		
		// getChars(0 dan başla 5 e kadar olan elemanları al karakterler değişkenine ata 0 dan itibaren yazdır)
		char [] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);
		
		// indexOf = baştan itibaren ara verdiğimiz kelimeyi bul yazdır demek.
		System.out.println(mesaj.indexOf("Biz"));
		
		// lastIndexOf = sondan başla verdiğimiz kelimeyi bul yazdır demek.
		System.out.println(mesaj.lastIndexOf("Ya"));
		
		// replace() = değer değiştirmede kullanılıyor örnek metinimizde ki boşlukları - ile değiştirmek için kullanırız
		System.out.println(mesaj.replace(" ", "-"));
		
		// substring() = içine girdiğimiz değerde ki metinden parça almak için kullanılır
		System.out.println(mesaj.substring(5));
		
		// substring() = bir farklı kullanımı da bu şekildedir.
		System.out.println(mesaj.substring(0,5));
		
		// split = içeriği bölmek için kullanılır.
		for (String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		}
		
		// toLowerCase tüm metin'i küçültür
		System.out.println(mesaj.toLowerCase());
		// toUpperCase tüm metin'i büyültür
		System.out.println(mesaj.toUpperCase());
		
		
		
		
		
		
		
		
		
	}

}
