/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wctc.nap.bookwebapp.model;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Nicholas
 */
public class AuthorService {
    private AuthorDaoStrategy dao = new AuthorDao();
    public List<Author> getAuthorList() throws ClassNotFoundException, SQLException{
        return dao.getAuthorList();
    }
    public int deleteAuthorByID(Object id) throws ClassNotFoundException, SQLException{
        return dao.deleteAuthorByID(id);
    }

    public int updateAuthorbyId(Author author) throws SQLException {
        return dao.updatebyID(author);
    }

    public int addAuthor(Author author) throws SQLException {
        return dao.addAuthor(author);
    }

    public Object deleteAuthorbyID(String authorId) throws ClassNotFoundException, SQLException {
        return dao.deleteAuthorByID(authorId);
    }
        public static void main(String[] args) throws ClassNotFoundException, SQLException {
        AuthorService srv = new AuthorService();
        List<Author> authors = srv.getAuthorList();
        System.out.println(authors);
    }
}
