package main.library.api;

import java.net.http.HttpRequest;

public class UserService {


    public String reserveBook(String bookId, Integer userId , String reserveType, Integer qty) throws Exception {

      if(reserveType.equals("soft")){

          //soft reservation

          //Step 1 : update book inventory table
          // step 2 : update userbooks table

          return "Successfully updated";

      }else if (reserveType.equals("hard")){
          // hard reservation
          //Step 1 : update book inventory table
          // step 2 : update userbooks table
          return "Successfully updated";
      }else{
           throw  new Exception("Bad input");

      }


    }
}
