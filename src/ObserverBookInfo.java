
import java.sql.Connection;
import java.sql.Statement;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author berka
 */
public class ObserverBookInfo extends RAbstractObserver{
    
    Session session = Session.getInstance();
    private Book book;
    
    public ObserverBookInfo(Book book){
        this.book = book;
        this.book.attachBookInfo(this);
    }
    
    void Update(String notifyString) {
        System.out.println(session.rank);
        if(session.rank.equals("Admin")){
            String query = ("INSERT INTO notifies(RANK, Notifies) VALUES ('" + session.rank + "','" + notifyString + "');");
        
            try{

                DatabaseConnector dbConnection = DatabaseConnector.getInstance();
                Connection connection = dbConnection.getConnection();
                Statement stm = connection.createStatement();
                int ts = stm.executeUpdate(query);

                stm.close();

            } catch (Exception e){

            }
        }
        

    }
    
}
