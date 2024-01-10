/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author berka
 */
public class StateHidden implements IState{

    @Override
    public void doAction(Book book, String date) {
        book.setState(this, date);
    }
    
    public String getState(){
        return "Hidden";
    }
    
}
