package test;

import javax.swing.*;

public class Test {

	public static void main(String[] args) {

		try {
			int num = Integer.parseInt(JOptionPane.showInputDialog("Введите количество чисел:"));
			int i = 1, t1 = 0, t2 = 1;
			System.out.print("Первые " + num + " чисел: ");
			while (i <= num) {
				System.out.print(t1 + "; ");
				int sum = t1 + t2;
				t1 = t2;
				t2 = sum;
				i++;
			}
		} catch (

		NumberFormatException ex) {
			System.out.println("Вы должны были ввести целое число !111");
			System.exit(0);
		}
	}
}
