package repositories;

import data.interfaces.IDB;
import entities.Books;
import entities.Category;
import entities.Product;
import entities.User;
import repositories.interfaces.IProductRepository;

import javax.inject.Inject;
import java.sql.*;
import java.util.List;

import data.interfaces.IDB;

public class BooksRepository {
    @Inject
    private IDB db;

    @Override
    public boolean create(Books book) {
        Connection con = null;
        try {
            con = db.getConnection();
            String sql = "INSERT INTO books(number_of_books,book_title,book_price,date_of_publication,in_stock,author_name) VALUES (?,?,?,?,?,?)";
            PreparedStatement st = con.prepareStatement(sql);

            st.setInt(1, book.getNumberOfBooks());
            st.setString(2, book.getBookTitle());
            st.setFloat(3, book.getBookPrice());
            st.setDate(4, (Date) book.getDateOfPublication());
            st.setBoolean(5, book.getInStock());
            st.setString(6, book.getAuthorName());

            st.execute();
            return true;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return false;
    }

    @Override
    public Books get(int id) {
        Connection con = null;
        try {
            con = db.getConnection();
            String sql = "SELECT * from books WHERE book_id=?";
            PreparedStatement st = con.prepareStatement(sql);

            st.setInt(1, id);

            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                Books book = new Books(
                        rs.getInt("id"),
                        rs.getInt("number_of_books"),
                        rs.getString("book_title"),
                        rs.getFloat("book_price"),
                        rs.getDate("date_of_publication"),
                        rs.getBoolean("in_stock"),
                        rs.getString("author_name")
                );

                return book;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public List<Books> getAll() {
        return null;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }
}
