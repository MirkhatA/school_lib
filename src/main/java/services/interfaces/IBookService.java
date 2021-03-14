package services.interfaces;

import entities.Books;

import java.util.List;

public interface IBookService {
    List<Books> getAll();

    boolean create(Books user);

    Books get(int id);

    boolean delete(int id);
}
