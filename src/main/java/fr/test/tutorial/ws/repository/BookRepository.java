/**
 * 
 */
package fr.test.tutorial.ws.repository;

import java.util.List;

import fr.test.tutorial.ws.model.Book;

/**
 * @author julien.aubert (AUBAY)
 * @date 31 janv. 2017
 * @version 1.0
 */
public interface BookRepository {
	/**
	 * Permet de récupérer tous les enregistrements de la table BOOK
	 * 
	 * @return Liste de Book
	 */
	List<Book> getAll();

	/**
	 * Permet de rechercher un BOOK à partir de son identifiant
	 * 
	 * @param id
	 * @return Book
	 */
	Book get(Long id);

	/**
	 * Permet d'ajouter un nouvel enregistrement de la table BOOK
	 * 
	 * @param book
	 */
	void create(Book book);

	/**
	 * 
	 * Permet de supprimer un BOOK
	 * 
	 * @param book
	 */
	void delete(Book book);

	/**
	 * Permet de mettre à jour un BOOK
	 * 
	 * @param book
	 */
	void update(Book book);

}