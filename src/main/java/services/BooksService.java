package services;

import entities.Books;
import entities.User;
import repositories.interfaces.IBookRepository;
import repositories.interfaces.IUserRepository;
import services.interfaces.IBookService;

import java.util.List;

public class BooksService implements IBookService {
    @Inject
    private IBookRepository bookRepository;
    @Override
    public List<Books> getAll() {
        List<Books> books = bookRepository.getAll();
        return null;
    }

    @Override
    public boolean create(Books books) {
        return bookRepository.create(books);
    }

    @Override
    public Books get(int id) {
        return bookRepository.get(id);
    }

    @Override
    public boolean delete(int id) {
        return bookRepository.delete(id);
    }
}
