/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author berka
 */
public class Session {
    private static Session instance;
    
    public String rank;
    public String name;
    public String no;
    public String id;
    
    public static Session getInstance(){
        if(instance == null){
            instance = new Session();
        }
        return instance;
    }
    
    public void logout(){
        instance = null;
    }
}
