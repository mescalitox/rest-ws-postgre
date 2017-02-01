/**
 * 
 */
package fr.test.tutorial.ws.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author julien.aubert (AUBAY)
 * @date 31 janv. 2017
 * @version 1.0
 */
public class Book {

	private Long bookId;
	private String isbn;
	private String title;
	private BigDecimal price;
	private Date dtCreate;
	private Date dtUpdate;

	/**
	 * @return the bookId
	 */
	public Long getBookId() {
		return bookId;
	}

	/**
	 * @param bookId the bookId to set
	 */
	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}

	/**
	 * @return the isbn
	 */
	public String getIsbn() {
		return isbn;
	}

	/**
	 * @param isbn the isbn to set
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the price
	 */
	public BigDecimal getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	/**
	 * @return the dtCreate
	 */
	public Date getDtCreate() {
		return dtCreate;
	}

	/**
	 * @param dtCreate the dtCreate to set
	 */
	public void setDtCreate(Date dtCreate) {
		this.dtCreate = dtCreate;
	}

	/**
	 * @return the dtUpdate
	 */
	public Date getDtUpdate() {
		return dtUpdate;
	}

	/**
	 * @param dtUpdate the dtUpdate to set
	 */
	public void setDtUpdate(Date dtUpdate) {
		this.dtUpdate = dtUpdate;
	}

}
