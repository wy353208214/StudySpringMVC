package com.zun1.service;

import com.zun1.model.Book;
import com.zun1.model.Category;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by 王洋 on 2017/1/23.
 */
@Service
public class BookServiceImpl implements BookService {

    private List<Category> categories = new ArrayList<Category>();
    private List<Book> books = new ArrayList<Book>();

    private String[] cateName = {"技术", "运营", "管理"};
    private String[] bookName = {"数据实战", "运营思维", "人才培养"};
    private String[] authorName = {"张三", "李四", "王五"};


    public BookServiceImpl() {
        for (int i = 0; i < cateName.length; i++) {
            Category category = new Category();
            category.setId(i);
            category.setName(cateName[i]);
            categories.add(category);

            Book book = new Book();
            book.setId((long) i);
            book.setAuthor(authorName[i]);
            book.setIsbn(Integer.toString(new Random().nextInt(1000) + 1000));
            book.setTitle(bookName[i]);
            book.setCategory(category);
            books.add(book);
        }
    }

    public List<Category> getAllCategories() {
        return categories;
    }

    public Category getCategory(int id) {
        for (Category category : categories) {
            if (category.getId() == id)
                return category;
        }
        return null;
    }

    public List<Book> getAllBooks() {
        return books;
    }

    public Book saveBook(Book book) {
        books.add(book);
        return book;
    }

    public Book updateBook(Book book) {
        for (int i = 0; i < books.size(); i++) {
            Book oldBook = books.get(i);
            if (oldBook.getId() == book.getId()) {
                oldBook.setTitle(book.getTitle());
                oldBook.setIsbn(book.getIsbn());
                oldBook.setAuthor(book.getAuthor());
                return oldBook;
            }
        }
        return null;
    }

    public Book get(long id) {
        for (Book book : books) {
            if (book.getId() == id)
                return book;
        }
        return null;
    }

    public long getNextId() {
        long nextId = 0L;
        for (Book book : books) {
            long id = book.getId();
            if (id > nextId)
                nextId = id;
        }
        return nextId + 1L;
    }
}
