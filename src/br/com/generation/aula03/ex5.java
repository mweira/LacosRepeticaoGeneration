package br.com.generation.aula03;

import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {

	Scanner leia = new Scanner(System.in);
	
	int x, y=0; 
	
	do {
		System.out.println("Digite um número");
		x = leia.nextInt(); 
		y += x;
	} 
	while(x != 0);
	System.out.println("O resultado da soma é " + y);
	}
}
