
public class ChartsExample {

	public static void main(String[] args) {
		
		char caracter = 'a';
		System.out.println(caracter);
		
		caracter = 65;
		System.out.println(caracter);
		
		caracter = 65+1;
		char secondCaracter = (char) (caracter+1); //This is a cast to char
		
		System.out.println(secondCaracter);
		
		String word = "Alura online courses";
		System.out.println(word);
		
		word = word + " 2023";
		System.out.println(word);

	}

}
