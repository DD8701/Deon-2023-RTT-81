package com.example.SpringSoapDemo.SoapWebServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.perscholas.xml.book.GetBookRequest;
import com.perscholas.xml.book.GetBookResponse;

@Endpoint//marks the class as an endpoint
public class BookEndpoint {
	
//NAMESPACE_URI identifies the XML namespace associated with the web service
	   private static final String NAMESPACE_URI = "http://www.perscholas.com/xml/book";
	   
//The class declares a dependency on a 'BookRepository' the dependency is likely to be
//injected, possibly through constructor injection or setter injection.
	   private BookRepository bookRepository;

	   //Instructs Spring to find an apporpriate 'BookRepository' object and pass it to the 
	   //constructor when creating a new 'BookEndpoint'.
	   @Autowired
	   public BookEndpoint(BookRepository bookRepository) {
		   
		   //Assigns the provided 'BookRepository' to the 'bookRepository' field of the
		   //'BookEndpoint' class. This way, the 'BookEndPoint' can use the 'BookRepository'
		   //throughout its lifecycle.
	       this.bookRepository = bookRepository;
	   }
	   
	   //'@PayloadRoot' specifies the root element of the XML payload that this method can 
	   //handle.
	   //'namespace' is the XML namespacem and 'localPart' is the name of the XML element. 
	   ///It's saying this method can handle XML payloads with the namespace defined by
	   //'NAMESPACE_URI' and the root element named "getBookRequest."
	   @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getBookRequest")
	   
	   //'@ResponsePayload' indicates that the return value of this method should be used
	   // as the payload of the response. "Whatever this method returns, send 
	   //it as the reponse payload."
	   //'getCountry' handles requests with a payload that matches the specified XML root
	   //element ("getBookRequest").
	   //It takes a parameter 'GetBookRequest request', which represents the incoming request
	   //with the specified payload structure.
	   @ResponsePayload
	   public GetBookResponse getCountry(@RequestPayload GetBookRequest request) {
		   
		   //Creates a new 'GetBookResponse' object, which is likely a class representing the
		   //response structure.
		   GetBookResponse response = new GetBookResponse();
	       
	       //It sets the 'book' property of the response by calling a method of the
		   //'bookRepository' to find a book by the ID provided in the request 
		   //('request.getId()').
	       response.setBook(bookRepository.findBookById(request.getId()));
	       
	       //The method returns the populated 'GetBookResponse' object, which will be 
	       //converted to the response payload.
	       return response;
	   }
	   
}
