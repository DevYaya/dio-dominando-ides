package com.dio;

import com.dio.model.Cat;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		
		Cat cat = new Cat();
		Livro livro = new Livro();
		
		System.out.println(cat);
		System.out.println(livro);
		
		/*int a = 2;
		int b = 3;
		System.out.println("Hello, World!" + (a+b));*/
	}

}

class livro {
	private String nome;
	private String npag;
}
