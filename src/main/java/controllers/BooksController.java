package controllers;

import entities.Books;
import services.interfaces.IBookService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.ServerErrorException;
import javax.ws.rs.core.Response;

@Path("books")
public class BooksController {
    @Inject
    private IBookService bookService;

    @JWTTokenNeeded
    @GET
    public Response getAllBooks() {
        return Response.ok("Nothing").build();
    }

    @JWTTokenNeeded
    @GET
    @Path("/{id}")
    public Response getBooksById(@PathParam("id") int id) {
        Books book;
        try {
            book = bookService.getBookById(id);
        } catch (ServerErrorException ex) {
            return Response
                    .status(500).entity(ex.getMessage()).build();
        }

        if (book == null) {
            return Response
                    .status(Response.Status.NOT_FOUND)
                    .entity("Product does not exist!")
                    .build();
        }

        return Response
                .status(Response.Status.OK)
                .entity(product)
                .build();
    }
}
