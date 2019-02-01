package test;

import java.util.Random;
import java.util.Arrays;

import javax.swing.*;

public class Test {
	public static int poisk(char[] arrayt, char cht) {
		// ну типо же метод надо было создать
		return Arrays.binarySearch(arrayt, cht);
	}

	static int frequency(char a[], char x) {
		int count = 0;
		for (int i = 0; i < a.length; i++)
			if (a[i] == x)
				count++;
		return count;
	}

	public static void main(String[] args) {

		try {
			int num = Integer.parseInt(JOptionPane.showInputDialog("Введите размер массива =< 26:"));
			char[] array = new char[num];
			for (int i = 0; i < array.length; i++) {

				System.out.print("[" + i + "]");
			}
			System.out.print("\n");
			Random rand = new Random();
			for (int i = 0; i < array.length; i++) {
				array[i] = (char) (97 + rand.nextInt(26));
				if (i >= 10) {
					System.out.print("[" + array[i] + " ]");
				} else {

					System.out.print("[" + array[i] + "]");
				}
			}
			Arrays.sort(array);
			System.out.print("\n");
			for (int i = 0; i < array.length; i++) {

				if (i >= 10) {
					System.out.print("[" + array[i] + " ]");
				} else {

					System.out.print("[" + array[i] + "]");
				}
			}
			String stroka = (JOptionPane.showInputDialog("Введите символ для поиска :"));
			char ch = stroka.charAt(0);
			if (((ch >= 'a') && (ch <= 'z'))) {
				if (frequency(array, ch) > 1) {
					System.out.println(
							"\n" + ch + " это элемент массива №" + poisk(array, ch) + " и парочка еще каких то");
				} else {
					System.out.println("\n" + ch + " это элемент массива №" + poisk(array, ch));
				}

			} else {
				System.out.println("\nВы должны были ввести eng символ");
			}

		} catch (

		NumberFormatException ex) {
			System.out.println("\nВы должны были ввести целое число !111");
			System.exit(0);
		} catch (

		NullPointerException ex) {
			System.out.println("\nВы должны были ввести eng символ!11");
			System.exit(0);
		}
		catch (

				StringIndexOutOfBoundsException ex) {
					System.out.println("\nВы должны были ввести eng символ!11");
					System.exit(0);
				}
	}
}
