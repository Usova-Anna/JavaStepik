package lesson1;

public class Unikod {

	public static void main(String[] args) {
		String simv = "";
		for (int i = 9398; i <= 10178; i++) {
			simv = "\\u" + i;
			simv = simv.substring(0);
			System.out.println(simv);
		}

	}

}
