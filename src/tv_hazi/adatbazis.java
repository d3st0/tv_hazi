package tv_hazi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class adatbazis
{
    private static String url = "jdbc:mysql://localhost/";
    private static String dbname = "tv_hazi";
    private static String driver = "com.mysql.jdbc.Driver";
    private static String username = "root";
    private static String password = "root";
    private static Connection conn;    
    
    public static Connection getConnection()
    {
        try
        {
            Class.forName(driver);
            try
            {
                conn = DriverManager.getConnection(url+dbname,username,password);
                System.out.println("Sikeres csatlakozás!");                
            }
            catch (SQLException e)
            {
                System.out.println("Sikertelen csatlakozás!\n"+e);
            }
        }
        catch (ClassNotFoundException e)
        {
            System.out.println("Driver nem található\n" + e);
        }
        return conn;    
    }    
}