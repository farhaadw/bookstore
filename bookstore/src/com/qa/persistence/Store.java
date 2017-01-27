package com.qa.persistence;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

@Entity
public class Store {

	@Id
	@GeneratedValue
	@Column(name = "store_ID")
	private Long storeID;

	@Column(length = 30)
	@NotNull
	private String name;

	@OneToMany(cascade = CascadeType.ALL)
	private List<Book> books = new ArrayList<Book>();

	public Store() {

	}

	public Long getStoreID() {
		return storeID;
	}

	public void setStoreID(Long storeID) {
		this.storeID = storeID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((books == null) ? 0 : books.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((storeID == null) ? 0 : storeID.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Store other = (Store) obj;
		if (books == null) {
			if (other.books != null)
				return false;
		} else if (!books.equals(other.books))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (storeID == null) {
			if (other.storeID != null)
				return false;
		} else if (!storeID.equals(other.storeID))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Store [storeID=" + storeID + ", name=" + name + ", books="
				+ books + "]";
	}

}
