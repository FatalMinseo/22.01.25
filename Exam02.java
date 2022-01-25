
public class Exam02 {

	public static void main(String[] args) {
		// while을 활용하여 1부터 100까지 숫자 중 3의 배수만 출력하시오.
		int a = 1;
		while (a <= 100) {
			if (a % 3 == 0) {
				System.out.println(a);
				}
				a++;
		}
	}

}
