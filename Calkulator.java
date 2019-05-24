import java.util.Scanner;

public class Calkulator {
	static Scanner scan = new Scanner(System.in);

	public static int getInt() {// ��������� � ������� ����� ����� � ���������� ���
		System.out.print("������� �����: ");
		int number;
		if (scan.hasNextInt())
			number = scan.nextInt();
		else {
			System.out.println("�� ��������� ������ ��� ����� �����. ���������� ��� ���.");
			scan.next();// ��������, �� �������
			number = getInt();
		}

		return number;
	}

	static char getOperation() {// ������ ��������� � ������� �����-�� �������� � ���������� ������ � ���������
								// (+, -, * ��� /)
		System.out.print("������� ��������: ");
		char operation;
		if (scan.hasNext())
			operation = scan.next().charAt(0); // �������� ��������, ��������� ������� ����� ������ ��������. ��
												// �������.
		else {
			System.out.println("�� ��������� ������ ��� ����� ��������. ���������� ��� ���.");
			scan.next();// �������� , �� �������
			operation = getOperation();
		}
		return operation;
	}

	public static long schet(int x1, int x2, char oper) {
		long result;
		if (oper == '+') {
			result = x1 + x2;
			return (int) result;

		}
		if (oper == '-') {
			result = x1 - x2;
			return (int) result;

		}
		if (oper == '/') {
			result = x1 / x2;
			return (int) result;

		}
		if (oper == '*') {
			result = x1 * x2;
			return (int) result;

		}
		if (oper == '%') {
			result = x1 % x2;
			return (int) result;

		}
		if (oper == '^') { // �� �������� ��-�� ���� ������ �� �������.
			result = x1 ^ x2;
			return result;

		} else
			return 0; // �� ������� ��� ��� ELSE
	}

	public static void main(String[] arg) {
		System.out.print("������ �����.  ");
		int num1 = getInt();
		System.out.print("������ �����.  ");
		int num2 = getInt();
		System.out.print("�� ����� ��������: ");
		char operation = getOperation();
		long result = schet(num1, num2, operation);
		System.out.println("��������� ��������: " + result);
	}

}
