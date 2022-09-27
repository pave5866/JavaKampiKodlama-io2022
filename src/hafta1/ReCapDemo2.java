package hafta1;

public class ReCapDemo2 {

	public static void main(String[] args) {
		double [] myList={1.8,1.3,1.4,1.5};
		double total =0;
		double max = myList[3];
		for (double number : myList) {
			if (max<number) {
				max=number;
			}
			total = total + number;
			System.out.println(number);
		}
		System.out.println("Toplam Değer: "+ total);
		System.out.println("En Büyük Sayı: " + max);
	}
}