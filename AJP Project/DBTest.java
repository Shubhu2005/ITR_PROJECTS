import java.sql.*;

/**
 *
 * @author admin
 */
class DBTest
{

    public static void main(String[] args)throws ClassNotFoundException
    {
        try{
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection con=DriverManager.getConnection("jdbc.odbc.Test");
            Statement st=con.createStatement();
            String sql="Select * from Playlist";
            st.executeQuery(sql);
            ResultSet rs=st.executeQuery(sql);
            while(rs.next()){
                  System.out.println("\n"+rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4));   
            }
        }
            catch(Exception e)
            {
            	System.out.println(e.getMessage());
            }     
        }
    }