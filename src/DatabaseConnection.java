import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    public static Connection getConnection() {
        Connection connection = null;
        try {
            String url = "jdbc:mysql://localhost:3306/kontak_db";
            String user = "root";
            String password = ""; // Ganti dengan password MySQL Anda
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Koneksi berhasil");
        } catch (SQLException e) {
            System.out.println("Koneksi gagal: " + e.getMessage());
        }
        return connection;
    }
}
