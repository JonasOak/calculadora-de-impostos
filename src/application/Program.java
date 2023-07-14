package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<TaxPayer> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for (byte i=1; i<=n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			
			if (ch == 'i') {
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("Anual income: ");
				Double anualIncome = sc.nextDouble();
				System.out.print("Health expenditures: ");
				Double healthExpenditures = sc.nextDouble();
				
				TaxPayer tx = new Individual(name, anualIncome, healthExpenditures);
				tx.tax();
				list.add(tx);
			}
			else if (ch == 'c') {
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("Anual income: ");
				Double anualIncome = sc.nextDouble();
				System.out.print("Number of employees: ");
				Integer numberOfEmployees = sc.nextInt();
				
				TaxPayer tx = new Company(name, anualIncome, numberOfEmployees);
				tx.tax();
				list.add(tx);
			}
			else {
				System.out.println("Failed!");
				i--;
				continue;
			}
		}
		
		double sum = 0.0;
		
		System.out.println();
		System.out.println("TAXES PAID:");
		
		for (TaxPayer taxespaid : list) {
			System.out.println(taxespaid.getName() + ": $ " + String.format("%.2f", taxespaid.tax()));
		}
		
		System.out.println();
		
		for (TaxPayer taxespaid : list) {
			sum += taxespaid.tax();
		}
		
		System.out.println("TOTAL TAXES: $" + String.format("%.2f", sum));

		sc.close();
		
	}

}
