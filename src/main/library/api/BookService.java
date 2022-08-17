package main.library.api;

import main.library.BookDetails;
import main.library.BookInventory;

import java.util.ArrayList;

import java.util.List;

public class BookService {

    public List<SearchBookResponse> search(String input){

       SearchBookResponse searchBookResponse = new SearchBookResponse();

        BookInventory bookInventory = new BookInventory();
        BookDetails bookDetails = new BookDetails();

        // TO DO  - get db calls to Book details and book inventory table
        // Step 1 : search book details table by search input
        // Step 2 : if results found , get inventory for the results



        List output = new ArrayList();
        output.add(searchBookResponse);
       return output;
    }
}
