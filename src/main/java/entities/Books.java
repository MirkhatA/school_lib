package entities;

import java.util.Date;

public class Books {
    private int id;
    private int numberOfBooks;
    private String bookTitle;
    private float bookPrice;
    private Date dateOfPublication;
    private boolean inStock;
    private String authorName;

    public Books() {

    }

    public Books(int numberOfBooks, String bookTitle, float bookPrice, Date dateOfPublication, boolean inStock, String authorName) {
        setNumberOfBooks(numberOfBooks);
        setBookTitle(bookTitle);
        setDateOfPublication(dateOfPublication);
        setInStock(inStock);
        setAuthorName(authorName);
    }

    public Books(int id, int numberOfBooks, String bookTitle, float bookPrice, Date dateOfPublication, boolean inStock, String authorName) {
        this(numberOfBooks, bookTitle, bookPrice, dateOfPublication, inStock, authorName);
        setId(id);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumberOfBooks() {
        return numberOfBooks;
    }

    public void setNumberOfBooks(int numberOfBooks) {
        this.numberOfBooks = numberOfBooks;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public float getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(float bookPrice) {
        this.bookPrice = bookPrice;
    }
    public Date getDateOfPublication() {
        return dateOfPublication;
    }

    public void setDateOfPublication(Date dateOfPublication) {
        this.dateOfPublication = dateOfPublication;
    }

    public boolean getInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
}
