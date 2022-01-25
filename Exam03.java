import java.util.Random;
import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		// 랜덤숫자 추출하기
		Random random = new Random();
		Scanner sc = new Scanner(System.in);

		System.out.println("PlUS GAME!!!!!");

		while (true) {
			int num1 = random.nextInt(5) + 1;
			int num2 = random.nextInt(5) + 1;
			System.out.print(num1 + " + " + num2 + " = ");
			int answer = sc.nextInt();
			int result = num1 + num2;
			if (answer == result) {
				System.out.println("정답입니다!!!");
			} else {
				while (answer != result) {
					System.out.println("오답입니다...");
					System.out.print(num1 + " + " + num2 + " = ");
					answer = sc.nextInt();
				}
			}
			sc.close();
		}
	}
}
