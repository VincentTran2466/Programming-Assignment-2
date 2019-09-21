import java.util.Scanner;

public class Decryption {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a 4 digit encryption: ");
		int integer = sc.nextInt();
		
		int[] array = new int[4];
		int[] array2 = new int[4];
		int i;
		int temp;
		
		//separates each integer into their respective array index
		array[0] = (integer % 10);
		array[1] = (integer % 100) / 10;
		array[2] = (integer % 1000) / 100;
		array[3] = integer / 1000;
		
		//decryption formula using a temp array
		for(i = 0; i < 4; i++)
			array2[i] = (array[i] + 3) % 10;
		
		//swapping the numbers back to their original positions.
		temp = array2[2];
		array2[2] = array2[0];
		array2[0] = temp;
		temp = array2[3];
		array2[3] = array2[1];
		array2[1]= temp;
		
		//printing the decrypted value
		System.out.printf("Your decrypted number is: %d%d%d%d", array2[3], array2[2], array2[1], array2[0]);
		
		sc.close();

	}

}
