package aula03;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		
	/* Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
	21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
	idade for =-99. (WHILE) */

	Scanner	leia = new Scanner(System.in);
	
	int i=0, x1 = 0, x2 = 0;
	
	while(i != 99) { 
		
		System.out.println("Digite sua idade");
		i = leia.nextInt();
	
	if(i < 21) { 
		
		x1++;
	}
	
	else if(i > 50) { 
		
		x2++;
	}
	}
	System.out.println("O número de pessoas com menos de 21 : " + x1);
	System.out.println("O número de pessoas com mais de 50 : " + x2);
	}
}
