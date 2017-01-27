package com.qa.service;

import javax.persistence.EntityManager;

import com.qa.persistence.Book;

public class BookService {

	private EntityManager em;

	public BookService(EntityManager em) {
		this.em = em;
	}

	public Book createBook(Book book) {
		em.persist(book);
		return book;
	}

	// If not found will return null
	public Book findBookByID(Long id) {
		return em.find(Book.class, id);
	}

	public void removeBook(Long id) {
		Book bk = em.find(Book.class, id);
		if (bk != null)
			em.remove(bk);
	}

}
