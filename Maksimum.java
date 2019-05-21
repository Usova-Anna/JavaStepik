package lesson1;

import java.util.Scanner;

public class Maksimum {

	public static void main(String[] args) {

		System.out.println("Придумайте два числа. \nВведите первое число: ");
		Scanner sc = new Scanner(System.in);
		int chislo1 = sc.nextInt();

		System.out.println("Введите второе число: ");
		int chislo2 = sc.nextInt();
		int max;

		if (chislo1 > chislo2)
			max = chislo1;
		else
			max = chislo2;
		System.out.println("Максимальное из двух чисел: " + max);
	}

}
