package entities;

import java.util.Date;

public class BorrowedBooks {
    private int id;
    private int bookId;
    private int userId;
    private Date dateIssued;
    private Date dateDueForReturn;
    private Date dateReturned;
    private boolean isPaid;
    private boolean isLost;
    private boolean isReturned;

    public BorrowedBooks() {

    }

    public BorrowedBooks(int bookId, int userId, Date dateIssued, Date dateDueForReturn, Date dateReturned, boolean isPaid, boolean isLost, boolean isReturned) {
        setBookId(bookId);
        setUserId(userId);
        setDateIssued(dateIssued);
        setDateDueForReturn(dateDueForReturn);
        setDateReturned(dateReturned);
        setPaid(isPaid);
        setLost(isLost);
        setReturned(isReturned);
    }

    public BorrowedBooks(int id, int bookId, int userId, Date dateIssued, Date dateDueForReturn, Date dateReturned, boolean isPaid, boolean isLost, boolean isReturned) {
        this(bookId, userId, dateIssued, dateDueForReturn, dateReturned, isPaid, isLost, isReturned);
        setId(id);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Date getDateIssued() {
        return dateIssued;
    }

    public void setDateIssued(Date dateIssued) {
        this.dateIssued = dateIssued;
    }

    public Date getDateDueForReturn() {
        return dateDueForReturn;
    }

    public void setDateDueForReturn(Date dateDueForReturn) {
        this.dateDueForReturn = dateDueForReturn;
    }

    public Date getDateReturned() {
        return dateReturned;
    }

    public void setDateReturned(Date dateReturned) {
        this.dateReturned = dateReturned;
    }

    public boolean getPaid() {
        return isPaid;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    public boolean getLost() {
        return isLost;
    }

    public void setLost(boolean lost) {
        isLost = lost;
    }

    public boolean getReturned() {
        return isReturned;
    }

    public void setReturned(boolean returned) {
        isReturned = returned;
    }
}
