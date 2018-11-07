/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jokenpo;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class Jokenpo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
		int valor1,valor2;
		
		System.out.println("Escolha entre 0, 1 e 2 , sendo : ");
		System.out.println("Pedra = 0 ");
		System.out.println("Papel = 1  ");      //Menu
		System.out.println("Tesoura = 2");
		
		System.out.println("Jogador 1: ");      // Entrada de Dados Jogador 1
		valor1 = sc.nextInt();
                                                        
		System.out.println("Jogador 2: ");      // Entrada de Dados Jogador 2
		valor2 = sc.nextInt();
		
		switch (valor1){
			case 0: 
				switch (valor2){
					case 0:
                                                System.out.println("Jogador 1 = Pedra e Jogador 2 = Pedra");
						System.out.println("Empate");
						break;
					case 1:
                                                System.out.println("Jogador 1 = Pedra e Jogador 2 = Papel");
						System.out.println("Jogador 2 ganhou!");
						break;
					case 2:
                                                System.out.println("Jogador 1 = Pedra e Jogador 2 = Tesoura");
						System.out.println("Jogador 1 ganhou");
						break;
						default: 
							System.out.println ("Numero Invalido");
				} break;
			case 1:
				switch(valor2) {
					case 0: 
                                                System.out.println("Jogador 1 = Papel e Jogador 2 = Pedra");
						System.out.println("Jogador 1 ganhou");
						break;
					case 1:
                                                System.out.println("Jogador 1 = Papel e Jogador 2 = Papel");
						System.out.println("Empatou");
						break;
					case 2:
                                                System.out.println("Jogador 1 = Papel e Jogador 2 = Tesoura");
						System.out.println("Jogador 2 ganhou");
						break;
					default: 
						System.out.println ("Numero Invalido");
				} break;
			case 2:
				switch(valor2) {
						case 0:
                                                        System.out.println("Jogador 1 = Tesoura e Jogador 2 = Pedra");
							System.out.println("Jogador 2 ganhou");
							break;
						case 1:
                                                        System.out.println("Jogador 1 = Tesoura e Jogador 2 = Papel");
							System.out.println("Jogador 1 ganhou");
							break;
						case 2:
                                                        System.out.println("Jogador 1 = Tesoura e Jogador 2 = Tesoura");
							System.out.println("Empate");
							break;
						default: 
				            System.out.println ("Numero Invalido");
				} break;
			default: 
				System.out.println ("Numero Invalido");
		}
	}
    }
    

