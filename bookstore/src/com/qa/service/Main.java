package com.qa.service;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.qa.persistence.Book;

public class Main {

	public static void main(String[] args) {

		System.out.println("\n\n>>> Executing : " + Main.class.toString()
				+ " <<<\n");

		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("bookstore-persistence-unit");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();

		tx.begin();

		Book book = new Book("Harry Potter", new Date());
		BookService bookService = new BookService(em);
		bookService.createBook(book);

		tx.commit();

		em.close();
		emf.close();
	}
}
