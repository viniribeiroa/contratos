package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("entre com o nome do Departamento");
		String departamentName = sc.nextLine();
		System.out.println("entre com os dados do trabalhador");
		System.out.println("Name");
		String name = sc.nextLine();
		System.out.println("level");
		String level = sc.nextLine();
		System.out.println("salario base");
		String salarioBase =sc.nextLine();
		
		sc.close();

	}

}
