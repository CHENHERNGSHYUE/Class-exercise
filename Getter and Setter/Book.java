/*
 * There are three variables about the book (title, year and isbn)
 * The type of these three variables are string, int and string respectively
 * 
 * @author HERNG-SHYUE CHEN
 * @version 2018-10-16 
 */
public class Book {
	private String title;
	private int year;
	private String isbn;
	/*
	 * The constructor of the book with three variables
	 * @para title stands for the book's title 
	 * @para year stands for the book's year 
	 * @para isbn stands for the book's isbn
	 */
	public Book(String title, int year, String isbn) {
		this.title=title;
		this.year=year;
		this.isbn=isbn;
	}
	/*
	 * The getter methods which give the information of the book
	 * @return the book's title, year and isbn
	 */
	public String getTitle() {
		return title;
	}
	public int getYear() {
		return year;
	}
	public String getIsbn() {
		return isbn;
	}
	/*
	 * The book's information about title, year and isbn which are set by us
	 * @param newTitle is the new title of book which is set by us
	 * @param newYear is the new year of book which is set by us
	 * @param newIsbn is the new isbn of book which is set by us
	 */
	public void setTitle(String newTitle) {
		title = newTitle;
	}
	public void setYear(int newYear) {
		year = newYear;
	}
	public void setIsbn(String newIsbn) {
		isbn = newIsbn;
	}
	/*
	 * show how to print a book
	 * @param toString() is the method to print the book's information
	 */
	public String toString() {
		return "Book title is " + title + ", year is " + year + ", isbn is " + isbn;
	}
}