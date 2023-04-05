package com.vitorcamara.projetos;

import java.util.Scanner;

public class UltrapassagemPopulacao {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int anos = 0;
		
		System.out.println("Qual a quantidade de pessoas da população A?");
		int popA = scan.nextInt();
		
		System.out.println("Qual percentual de crescimento anual da população A?");
		double percentualA = scan.nextDouble(); 
		
		System.out.println("Qual a quantidade de pessoas da população B?");
		int popB = scan.nextInt();
		
		System.out.println("Qual percentual de crescimento anual da população B?");
		double percentualB = scan.nextDouble();
		
		while (popA > popB) {
			popA += (popA/100) * percentualA;
			popB += (popB/100) * percentualB;
			anos++;
		}
		
		System.out.println("Vai levar " + anos + " anos para a população do país A ultrapassar a do país B.");
		System.out.println("População A: " + popA);
		System.out.println("População B: " + popB);
		
	}

}
