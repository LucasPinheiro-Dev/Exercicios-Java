package Exe01;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Exe01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome;
		int idade;
		double altura = 0;
		
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite Seu nome:"); 
		nome = sc.nextLine(); 
		System.out.println("Digite sua idade:"); 
		idade = sc.nextInt();
		System.out.println("Digite sua altura"); 
		altura = sc.nextDouble();

		System.out.print("Nome: " + nome + "\nIdade: " + idade
		+ "\nAltura:" + altura);

	}

}
