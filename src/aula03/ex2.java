package aula03;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		
	//Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
		
	Scanner leia = new Scanner(System.in);
	
	int i, num, par = 0, impar = 0; 

	for(i = 1; i<=10; i++) {
		
	System.out.println("Digite um número");
	num = leia.nextInt();
	
	if(num%2==0) {
		
		par++;
	}
	
	else { 
		impar++;
	}
	}
	
	System.out.println("A quantidade de ímpares é : " + impar);
	System.out.println("A quantidade de pares é : " + par);
	} 
}
		
	
	
