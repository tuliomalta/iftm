package com.example.ficha_pessoal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class App {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

	public static FichaPessoal le() {
		System.out.println("Digite o nome: ");
		String nome = scanner.nextLine();
		System.out.println("Digite a idade: ");
		int idade = scanner.nextInt();
		FichaPessoal p = new FichaPessoal(nome, idade);
		return p;
	}


}
