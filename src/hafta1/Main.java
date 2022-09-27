package hafta1;

public class Main {

	public static void main(String[] args) {
		
		String[] students = new String[4];
		students[0]="kadir";
		students[1]="apo";
		students[2]="akif";
		students[3]="nefise";
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}
		System.out.println("--------------");
		for (String student : students) {
			System.out.println(student);
		}
	}
}