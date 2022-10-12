package main;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import com.mysql.jdbc.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class connSignUp {

    private static String servername = "localhost";
    private static String username = "root";
    private static String dbname = "emploginnew";
    private static Integer portnumber = 8111;
    private static String password = "";

    public static Connection getConnection() 
    {

        Connection cnx = null;

        MysqlDataSource datasource = new MysqlDataSource();

        datasource.setServerName(servername);
        datasource.setUser(username);
        datasource.setPassword(password);
        datasource.setDatabaseName(dbname);
        datasource.setPortNumber(portnumber);

        try 
        {
            cnx = (Connection) datasource.getConnection();
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger("Get Connection ->" + connSignUp.class.getName()).log(Level.SEVERE, null, ex);
        }

        return cnx;

    }

}
