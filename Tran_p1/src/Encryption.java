import java.util.Scanner;
public class Encryption {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a 4 digit integer: ");
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
		
		//encryption formula using a temp array
		for(i = 0; i < 4; i++)
			array2[i] = (array[i] + 7) % 10;
		
		//swapping the array values
		temp = array2[0];
		array2[0] = array2[2];
		array2[2] = temp;
		temp = array2[1];
		array2[1] = array2[3];
		array2[3]= temp;
		
		//prints the encrypted value
		System.out.printf("Your encrypted number is: %d%d%d%d", array2[3], array2[2], array2[1], array2[0]);
		
		sc.close();
	}
	
	

}
