import java.sql.*;  
public class MsAcessODBC {  
    public static void main(String[] args) {  
        try {  
            // loading thejdbc odbc driver  
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");  
            // creating connection toth data base  
            Connection con = DriverManager.getConnection("jdbc:odbc:mydsn", "", "");  
            Statement st = con.createStatement();  
            // create an execute sql command on database      
            ResultSet rs = st.executeQuery("Select * from student order by rollno asc");  
            ResultSetMetaData rsmd = rs.getMetaData();  
            // this getColumnCount reurn the number of column in the selected table  
            int numberOfColumns = rsmd.getColumnCount();  
            // while loop and with while loop code use for print the data  
            while (rs.next()) {  
                for (int i = 1; i <= numberOfColumns; i++) {  
                    if (i > 1)  
                        System.out.print(", ");  
                    String columnValue = rs.getString(i);  
                    System.out.print(columnValue);  
                }  
                System.out.println("");  
            }  
            st.close();  
            con.close();  
        } catch (Exception ex) {  
            System.err.print("Exception: ");  
            System.err.println(ex.getMessage());  
        }  
    }  
}  
