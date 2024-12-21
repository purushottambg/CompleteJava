package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCProgram{
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/prodfeatures";   //Credentials
        String user="root";
        String password="root";
        String query="select * from prodfeatures.posts";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);   //Establish Connection

            Statement statement = connection.createStatement();             //Create Statement
            ResultSet posts = statement.executeQuery(query);        //Execute Statement
            if (posts.next()) {
                String createdAt = posts.getString("created_at");
                int id = posts.getInt("id");
                String lastUpdate = posts.getString("last_updated_on");
                String createdBy = posts.getString("created_by");
                String description = posts.getString("description");
                String lastUpdatedBy = posts.getString("last_updated_by");
                String title = posts.getString("title");
                System.out.println("Record Details:  \n" + id + " " + createdAt + " " + createdBy + " " + lastUpdate + " " + lastUpdatedBy + " " + title + " " + description);
            }else{
                System.out.println("couldn't get any records");
            }
            connection.close();     //Close Connection
        }catch (Exception e){
             e.printStackTrace();
        }
    }
}