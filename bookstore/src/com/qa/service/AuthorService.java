package com.qa.service;

import javax.persistence.EntityManager;

import com.qa.persistence.Author;

public class AuthorService {

	private EntityManager em;

	public AuthorService(EntityManager em) {
		this.em = em;
	}

	public Author createAuthor(Author author) {
		em.persist(author);
		return author;
	}

}
