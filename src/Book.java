/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
/**
 *
 * @author berka
 */
public class Book implements ICrud{
    
    Session session = Session.getInstance();
    public IState state;
    
    public String bookState;
    public String name;
    public String author;
    public String category;
    public String startDate;
    public String endDate;
    
    public void Update(String updateName){     
        String query = ("UPDATE BOOKS SET NAME='" + name + "', CATEGORY='" + category + "' WHERE NAME='" + updateName + "';");
        
        
        try{
            
            DatabaseConnector dbConnection = DatabaseConnector.getInstance();
            Connection connection = dbConnection.getConnection();
            Statement stm = connection.createStatement();
            
            int ts = stm.executeUpdate(query);
            Notify(updateName + " renamed as " + name);
            stm.close();
            
        } catch (Exception e){
            
        }
    }
    
    public void Create(){      
        String query = ("INSERT INTO BOOKS(CATEGORY, NAME, AUTHOR, BOOKED) VALUES ('" + category + "','" + name + "','" + author + "', 0);");

        try{
            
            DatabaseConnector dbConnection = DatabaseConnector.getInstance();
            Connection connection = dbConnection.getConnection();
            Statement stm = connection.createStatement();
            int ts = stm.executeUpdate(query);
            Notify("new book added: " + name);
            stm.close();
            
        } catch (Exception e){
            
        }
    }
    
    public void Delete(){ 
        String query = ("DELETE FROM BOOKS WHERE NAME='" + name + "';");
        
        try{
            
            DatabaseConnector dbConnection = DatabaseConnector.getInstance();
            Connection connection = dbConnection.getConnection();
            Statement stm = connection.createStatement();
            Notify("book deleted from library: " + name);
            int ts = stm.executeUpdate(query);

            stm.close();
            
        } catch (Exception e){
            
        }
    }
    
    //STATE SETTINGS (STATE PATTERN)
    
    public void setState(IState state, String date){
        this.state = state;
    }
    
    public void writeState(String date){
        if(state.getState().equals("Hidden")){
            Notify(name + " is hidden!");
            Hidden(date);
        }else if(state.getState().equals("Available")){
            Notify(name + " is available now!");
            Available(date);
        }else if(state.getState().equals("Taken")){
            Notify(name + " is taken until " + date);
            Taken(date);
        }
    }
    
    void Hidden(String date){
        String query2 = ("UPDATE BOOKS SET BOOKED=3 WHERE NAME='" + name + "';");
        
        try{
            
            DatabaseConnector dbConnection = DatabaseConnector.getInstance();
            Connection connection = dbConnection.getConnection();
            
            Statement stm = connection.createStatement();
            int ts2 = stm.executeUpdate(query2);
            
            
            
            stm.close();
            
        } catch (Exception e){
            
        }
    }
    
    void Available(String date){
        String query2 = ("UPDATE BOOKS SET BOOKED=0 WHERE NAME='" + name + "';");
        
        try{
            
            DatabaseConnector dbConnection = DatabaseConnector.getInstance();
            Connection connection = dbConnection.getConnection();
            
            Statement stm = connection.createStatement();
            int ts2 = stm.executeUpdate(query2);
            
            stm.close();
            
        } catch (Exception e){
            
        }
    }
    
    void Taken(String date){
        String query2 = ("UPDATE BOOKS SET BOOKED=1 WHERE NAME='" + name + "';");
        
        try{
            
            DatabaseConnector dbConnection = DatabaseConnector.getInstance();
            Connection connection = dbConnection.getConnection();
            
            Statement stm = connection.createStatement();
            int ts2 = stm.executeUpdate(query2);
            
            stm.close();
            
        } catch (Exception e){
            
        }
    }
    
    //NOTIFY AND INFO TO ANNOUNCMENT (OBSERVER PATTERN)
    
    private RAbstractObserver infoObserver;
    private RAbstractObserver noticeObserver;
    
    public void attachBookInfo(RAbstractObserver observer){
        this.infoObserver = observer;
    }
    
    public void attachNotice(RAbstractObserver observer){
        this.noticeObserver = observer;
    }
    
    public void Notify(String notifyString){
        System.out.println(noticeObserver);
        if(noticeObserver != null && !session.rank.equals("Admin")) noticeObserver.Update(notifyString);
        if(infoObserver != null && session.rank.equals("Admin"))infoObserver.Update(notifyString);
    }

}
