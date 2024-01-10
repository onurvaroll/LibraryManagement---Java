
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
public class Teacher extends RankUserAbstract implements ICrud{
    
    @Override
    public void Create() {
        String query = ("INSERT INTO STAFFS(NAME, NO, PASSWORD) VALUES ('" + name + "','" + no + "','" + password + "');");
        
        
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
        String query = ("DELETE FROM STAFFS WHERE NAME='" + name + "';");
        
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
    public void Update(String updateName) {
        String query = ("UPDATE STAFFS SET NAME='" + name + "', NO='" + no + "' WHERE NAME='" + updateName + "';");
        
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
