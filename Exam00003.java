import java.util.Random;
import java.util.Scanner;

public class Exam00003 {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("PlUS GAME!!!!!");
		int num1 = random.nextInt(5) + 1;
		int num2 = random.nextInt(5) + 1;
		int cnt = 0; 
		
		while (cnt < 3) {
			
			System.out.print(num1 + " + " + num2 + " = ");
			int answer = sc.nextInt();
			int result = num1 + num2;

			if (answer == result) {
				System.out.println("�����Դϴ�!!!");
				num1 = random.nextInt(5) + 1;
				num2 = random.nextInt(5) + 1;
			} else {
				{
					System.out.println("�����Դϴ�...");
					cnt++;
					System.out.println("���� ��ȸ : " + (3 - cnt));
				}
			}
		}
		System.out.println("GAME OVER�Ф�");
	}
}
