/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Nicholas
 */
public class AuthorService {
    private Author one = new Author(001,"bob",new Date(95,5,2)); 
    private Author two = new Author(002,"chris",new Date(100,2,7)); 
    private Author three = new Author(003,"evan",new Date(112,10,27)); 
    
    public List getAllAuthors(){
    List authors = new ArrayList();
    authors.add(one);
    authors.add(two);
    authors.add(three);
    return authors;
    }
}
