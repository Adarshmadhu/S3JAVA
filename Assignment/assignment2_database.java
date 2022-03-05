import java.sql.*;

public class assignment2_database {

    public static void main (String args[]) {

        try {

            Class.forName("com.mysql.jdbc.Driver");

            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");

            Statement stmt=con.createStatement();

            int a = stmt.executeUpdate("create database student");

            System.out.print(a);

            int b = stmt.executeUpdate("use student");

            System.out.print(b);

            int c = stmt.executeUpdate("create table details (adm_no int,name varchar(30),age int,address varchar(50))");

            System.out.print(c);

            PreparedStatement stmt1=con.prepareStatement("insert into details values(101,?,20,?)");

            stmt1.setString(1,"Vishal");

            stmt1.setString(2,"Vishal Home);
            int d =stmt1.executeUpdate();
            System.out.print(d);
        }
        catch(Exception e){System.out.print(e);}
    }
    
}
