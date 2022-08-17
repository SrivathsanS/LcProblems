package main.library.api;

import java.util.List;

public class BookController {


    public List<SearchBookResponse> searchBook(String searchInput){

        BookService bookService = new BookService();
        return bookService.search(searchInput);

    }
}
