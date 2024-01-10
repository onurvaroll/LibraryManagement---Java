/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author berka
 */
public class BookBuilder {
    
    private Book book;
    
    public void SetBookName(String name){
        book.name = name;
    }
    
    public void SetBookAuthor(String name){
        book.author = name;
    }
    
    public void SetBookCategory(String name){
        book.category = name;
    }
    
    public Book GetBook(){
        return book;
    }
    
    public BookBuilder(){
        Factory factory = new Factory();
        this.book = factory.createBook();
    }
    
}
