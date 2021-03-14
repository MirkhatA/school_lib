package entities;

public class AssignedBooks {
    private int courseId;
    private int bookId;

    public AssignedBooks() {

    }

    public AssignedBooks(int courseId, int bookId) {
        setCourseId(courseId);
        setBookId(bookId);
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }
}
