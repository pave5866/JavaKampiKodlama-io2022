package hafta1;

public class sesliHarf {

	public static void main(String[] args) 
	{
		char harf = 'a';
		switch (harf) 
		{
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Kalın Sesli Harf");
			break;
		default:
			System.out.println("İnce Sesli Harf");
			
		}
	}

}
