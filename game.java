import java.util.*;
public class game{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int userNumber = 0;
		int myNumber = (int)(Math.random()*100);
		do{
				System.out.println("Guess my Number: ");
				userNumber = sc.nextInt();
				if(userNumber == myNumber) {
					System.out.println("Correct");
					break;
				}
				else if(userNumber> myNumber) {
					System.out.println("Larger");
				}
				else {
					System.out.println("Smaller");
				}
		    }while(userNumber >= 0);
			System.out.println("my number was");
			System.out.println(myNumber);
	}
}