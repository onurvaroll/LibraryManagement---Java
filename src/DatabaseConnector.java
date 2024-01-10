import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.jdbc.Driver;

public class DatabaseConnector {
    // Singleton instance
    private static DatabaseConnector instance;

    private Connection connection;

    private DatabaseConnector() {
        try {
            // MySQL JDBC sürücüsünü yükle
            Class.forName("com.mysql.jdbc.Driver");
            // Veritabanı bağlantısı oluştur
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    // Singleton instance döndür
    public static synchronized DatabaseConnector getInstance() {
        if (instance == null) {
            instance = new DatabaseConnector();
        }
        return instance;
    }

    // Bağlantıyı alma
    public Connection getConnection() {
        return connection;
    }

    // Bağlantıyı kapatma
    public void closeConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
    