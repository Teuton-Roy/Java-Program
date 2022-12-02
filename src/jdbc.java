import java.sql.*;
public class jdbc{
    public static void main(String arg[]){
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");//Connecting drver
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/company", "root",
                    "root1234");//logging to the database
            Statement state;
            state = connection.createStatement();//establishing the connection to the mysql database
            ResultSet result;//object which will keep the retrived data from the database
            String myquery="select * from employee where Age>='40'";//SQL query to fetch the data from the table
            result = state.executeQuery(myquery);//Executing the SQL query
            String fname,lname;//string for the column name existing to the table of database
            int salary;
            while (result.next()) {//reading the data from the database
                fname = result.getString("Fname");
                lname = result.getString("Lname");
                salary = result.getInt("Salary");
                System.out.println("FNAME : " + fname  + " LNAME : " + lname  + " SALARY : " + salary);//printing the contens of the table
            }
            result.close();
            state.close();
            connection.close();//after retriving the data closing the database
        }catch (Exception exception){
            System.out.println(exception);
        }
    }
}

