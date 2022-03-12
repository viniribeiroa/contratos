package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Departament;
import entities.HourContract;
import entities.Worker;
import entities.enums.workLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
		
		System.out.println("entre com o nome do Departamento");
		String departamentName = sc.nextLine();
		System.out.println("entre com os dados do trabalhador");
		System.out.println("Name");
		String name = sc.nextLine();
		System.out.println("level");
		String level = sc.nextLine();
		System.out.println("salario base");
		double salarioBase =sc.nextDouble();
		Worker worker = new Worker(name, workLevel.valueOf(level), salarioBase, new Departament(departamentName));
		
		System.out.println("Quanto contrados este trabalhador tem?");
		int n = sc.nextInt();
		
		for(int i=1; i<= n; i++) {
			System.out.println("entre com o contrato nº" + i + "data:");
			System.out.print("Data DD/MM/YYYY : ");
			Date contractDate = sdf.parse(sc.next());
			System.out.println("valor por hora");
			double valorPorHora = sc.nextDouble();
			System.out.println("duração do contrato (horas)");
			int horas = sc.nextInt();
			
			HourContract contract = new HourContract(contractDate, valorPorHora, horas);
			worker.addContract(contract);
		}
		
		System.out.println();
		System.out.println("entre com mes e ano para calcular o salario (MM/YYYY) :");
		String mesAno = sc.next();
		int month = Integer.parseInt(mesAno.substring(0, 2));
		int year = Integer.parseInt(mesAno.substring(3));
		
		System.out.println("Name"+ worker.getName());
		System.out.println("departamento"+ worker.getDepartament().getName());
		System.out.println("Salario no periodo"+ mesAno +":" + String.format("%.2f", worker.income(year, month)));
		
		
		
		sc.close();

	}

}
