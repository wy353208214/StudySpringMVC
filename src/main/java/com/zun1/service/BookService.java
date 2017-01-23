package com.zun1.service;

import com.zun1.model.Book;
import com.zun1.model.Category;

import java.util.List;

/**
 * Created by 王洋 on 2017/1/23.
 */
public interface BookService {
    List<Category> getAllCategories();
    Category getCategory(int id);
    List<Book> getAllBooks();
    Book saveBook(Book book);
    Book updateBook(Book book);
    Book get(long id);
    long getNextId();
}
