import java.util.Random;
import java.util.Scanner;

public class Exam003 {

	public static void main(String[] args) {

		Random random = new Random();
		Scanner sc = new Scanner(System.in);

		System.out.println("PlUS GAME!!!!!");
		int answer = 0;
		int result = 0;
		int num1 = 0;
		int num2 = 0;
		while (true) {
			if (answer == result) {
				num1 = random.nextInt(5) + 1;
				num2 = random.nextInt(5) + 1;
				System.out.print(num1 + " + " + num2 + " = ");
				result = num1 + num2;
				answer = sc.nextInt();

				if (answer == result) {
					System.out.println("정답입니다!!!");
				} else {
				}
			} else {
				System.out.println("오답입니다...");
				System.out.print(num1 + " + " + num2 + " = ");
				answer = sc.nextInt();
			}
		}
	}
}