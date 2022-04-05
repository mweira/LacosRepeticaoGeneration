package aula03;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		
		Scanner	leia = new Scanner(System.in);
		
		int i = 1, idade, sexo, opcoes, x1 = 0, x2 = 0, x3 = 0, x4 = 0, x5 = 0, x6 = 0;
		
		while(i<=150) { 
			
			System.out.println("Qual a idade ?");
			idade = leia.nextInt();
			
			System.out.println("1 - feminino, 2 - masculino, 3 - Outros");
			sexo = leia.nextInt(); 
			
			System.out.println("1 - calma, 2 - nervosa, 3 - agressiva");
			opcoes = leia.nextInt(); 
			
			i++;
		
		if(opcoes == 1) {
			x1++;
		}
		else if (sexo == 2 && opcoes == 2) {
			x2++;
		} 
		else if (sexo == 1 && opcoes == 3) { 
			x3++;
		}
		else if (sexo == 3 && opcoes == 1) {
			x4++;
		}
		else if(idade > 40 && opcoes == 2) {
			x5++; 
		}
		else if(idade < 18 && opcoes == 1) {
		    x6++;
		}
		
		System.out.println("O número de pessoas calmas : " + x1);
		System.out.println("O número de mulheres nervosas : " + x2);
		System.out.println("O número de homens agressivos : " + x3);
		System.out.println("O número de outros calmos : " + x4);
		System.out.println("O número de pessoas nervosas com mais de 40 anos : " + x5);
		System.out.println("O número de pessoas calmas com menos de 18 anos : " + x6);
		
		}
	}
}
	
