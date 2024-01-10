
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
public class Student extends RankUserAbstract implements ICrud{
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setNo(String no){
        this.no = no;
    }
    
    @Override
    public void Update(String updateName) {
        
        String query = ("UPDATE STUDENTS SET NAME='" + name + "', NO='" + no + "' WHERE NAME='" + updateName + "';");
        
        try{
            
            DatabaseConnector dbConnection = DatabaseConnector.getInstance();
            Connection connection = dbConnection.getConnection();
            Statement stm = connection.createStatement();
            
            int ts = stm.executeUpdate(query);
                
            stm.close();
            
        } catch (Exception e){
            
        }
        
    }

    @Override
    public void Delete() {
        String query = ("DELETE FROM STUDENTS WHERE NAME='" + name + "';");
        
        try{
            
            DatabaseConnector dbConnection = DatabaseConnector.getInstance();
            Connection connection = dbConnection.getConnection();
            Statement stm = connection.createStatement();

            int ts = stm.executeUpdate(query);

            stm.close();
            
        } catch (Exception e){
            
        }
    }

    @Override
    public void Create() {
        String query = ("INSERT INTO STUDENTS(NAME, NO, PASSWORD) VALUES ('" + name + "','" + no + "','" + password + "');");
        
        
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
