/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author berka
 */
public class Factory {
    public Book createBook(){
        return new Book();
    }
    
    public RankUserAbstract createUser(String userType){
        if(userType == null){
            return null;
        }
        if(userType.equals("STUDENT")){
            return new Student();
        }
        if(userType.equals("TEACHER")){
            return new Teacher();
        }
        return null;
    }
}
