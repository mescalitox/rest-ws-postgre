/**
 * 
 */
package fr.test.tutorial.ws.repository;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import fr.test.tutorial.ws.model.Book;

/**
 * @author julien.aubert (AUBAY)
 * @date 31 janv. 2017
 * @version 1.0
 */

@Repository
public class BookRepositoryImpl implements BookRepository {

	@Resource
	private JdbcTemplate jt;

	@Override
	public Book get(Long id) {
		String GET_ARTICLE_BY_ID = "select * from book where book_id=?";
		return jt.queryForObject(GET_ARTICLE_BY_ID, BeanPropertyRowMapper.newInstance(Book.class), id);
	}

	@Override
	public List<Book> getAll() {
		String GET_ALL_ARTICLES = "select * from book";
		return jt.query(GET_ALL_ARTICLES, BeanPropertyRowMapper.newInstance(Book.class));
	}

	@Override
	public void create(Book article) {
		// TODO Auto-generated method stub
	}

	@Override
	public void delete(Book article) {
		// TODO Auto-generated method stub
	}

	@Override
	public void update(Book article) {
		// TODO Auto-generated method stub
	}
}
