package com.zun1.controller;

import com.zun1.model.Book;
import com.zun1.model.Category;
import com.zun1.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by 王洋 on 2017/1/23.
 */
@Controller
public class BookController {

    @Autowired
    BookService bookService;

    @Autowired
    ApplicationContext applicationContext;

    @RequestMapping(value = "/book_add")
    public String addBook(Model model) {
        model.addAttribute("categories", bookService.getAllCategories());
        model.addAttribute("book", applicationContext.getBean("book", Book.class));
        return "bookAddForm";
    }

    @RequestMapping(value = "/book_save")
    public String saveBook(@ModelAttribute Book book) {
        Category category = bookService.getCategory(book.getCategory().getId());
        book.setCategory(category);
        bookService.saveBook(book);
        return "redirect:/book_list";
    }

    @RequestMapping(value = "/book_edit/{id}")
    public String editBook(Model model, @PathVariable long id) {
        List<Category> categories = bookService.getAllCategories();
        Book book = bookService.get(id);
        model.addAttribute("categories", categories);
        model.addAttribute("book", book);
        return "bookEditForm";
    }

    @RequestMapping(value = "/book_update")
    public String updateBook(@ModelAttribute Book book) {
        bookService.updateBook(book);
        return "redirect:/book_list";
    }

    @RequestMapping(value = "/book_list")
    public String getBookList(Model model) {
        List<Book> bookList = bookService.getAllBooks();
        model.addAttribute("books", bookList);
        return "bookList";
    }

}
