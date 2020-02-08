import java.util.Scanner;

public class LeJustePrix {

	public static void main(String[] args) {
		
		int nb = 0;
		int max = 1000;
		int min = 1;
		int range = max - min + 1;
		int rand = (int)(Math.random() * range) + min; 
		int count = 0;
		
	do {
		@SuppressWarnings("resource")
		Scanner clavier = new Scanner(System.in);
		
		System.out.println("Entrez une valeur entre 1 et 1000: ");
		
		nb = clavier.nextInt();
		
		count += 1;
		
		if (nb < 1) {
			System.out.println("Il est écrit que la valeur doit etre entre 1 et 1000...");
		}
		else if (nb > 1000) {
			System.out.println("Il est écrit que la valeur doit etre entre 1 et 1000...");
		}
		else if(nb < rand) {
		System.out.println("C'est plus!");
		}
		else if (nb > rand) {
		System.out.println("C'est moins!");
		}
	} while(nb != rand);
	System.out.println("Touché! Nombre de tentative: " + count);
	}

}
