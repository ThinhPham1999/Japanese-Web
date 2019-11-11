package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import bean.User;
import static dao.CreateConnection.getConnect;;

public class UserDao {
	public static int addUser(User u) {
		try (Connection con = getConnect()) {
			String sql = "Insert into Users(UserName, UserPass, Name, DoB, Gender, Permission) output inserted.UserID values(?,?,?,?,?,?)";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, u.getUserName());
			stmt.setString(2, u.getUserPass());
			stmt.setString(3, u.getName());
			DateFormat osLocalizedDateFormat = new SimpleDateFormat("yyyy-MM-dd");
			String date = osLocalizedDateFormat.format(u.getDob());
			stmt.setDate(4, java.sql.Date.valueOf(date));
			stmt.setInt(5, u.getGender());
			stmt.setInt(6, u.getPermission());
			stmt.execute();
			con.close();
			return 1;
		}catch(Exception ex) {	
			ex.printStackTrace();
			return 0;
		}
	}
	
	public static User getUser(String username) {
		User user = null;
		try (Connection con=CreateConnection.getConnect()){
            con.setAutoCommit(false);
            Statement stmt= con.createStatement(); 
            ResultSet rs=stmt.executeQuery("Select UserID, UserName, UserPass, Name, DoB, Gender, Permission from Users where UserName='"+username+"'"); 
            if(rs.next()){
            	int userid = rs.getInt(1);
            	username = rs.getString(2);
            	String userpass = rs.getString(3);
            	String name = rs.getString(4);
            	String dob = rs.getDate(5).toString();
            	int gender = rs.getInt(6);
            	int permission = rs.getInt(7);
            	user = new User(userid, username, userpass, name, new SimpleDateFormat("yyyy-MM-dd").parse(dob), gender, permission);
            }
            con.commit();
            con.close();
            return user;
		}catch(Exception ex) {
			Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
            
		}
		return null;
	}
	
	public static boolean updateUser(User user){
		try (Connection con=CreateConnection.getConnect()){
            PreparedStatement stmt= con.prepareStatement("Update Users set UserPass=?, Name=?, DoB=?, Gender=?, Permission=? where userid=?"); // Should use
            stmt.setString(1, user.getUserPass());
            stmt.setString(2, user.getName());
            DateFormat osLocalizedDateFormat = new SimpleDateFormat("yyyy-MM-dd");
			String date = osLocalizedDateFormat.format(user.getDob());
            stmt.setDate(3, java.sql.Date.valueOf(date));
            stmt.setInt(4, user.getGender());
            stmt.setInt(5, user.getPermission()); 
            stmt.setInt(6, user.getUserID());
            int rc=stmt.executeUpdate();
            con.close();
            return rc==1;
        }
        catch(Exception e){
        	Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, e);
        }
        return false;
	}
	
	public static ArrayList<User> getAll(){
		ArrayList<User> result = new ArrayList<>();
        try (Connection con=CreateConnection.getConnect()){
            con.setAutoCommit(false);
            Statement stmt = con.createStatement();
            ResultSet re = stmt.executeQuery("Select UserID, UserName, UserPass, Name, DoB, Gender, Permission from Users");
            while (re.next()) {
                int userID = re.getInt(1);
                String userName = re.getString(2);
                String userPass = re.getString(3);
                String name = re.getString(4);
                String dob = re.getDate(5).toString();
                int gender = re.getInt(6);
                int permission = re.getInt(7);
                result.add(new User(userID, userName, userPass, name, new SimpleDateFormat("yyyy-MM-dd").parse(dob), gender, permission));
            }
            con.commit();
            con.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return result;
	}
	
	public static User getUserByID(int ID) {
		User user = null;
		try (Connection con=CreateConnection.getConnect()){
            con.setAutoCommit(false);
            Statement stmt= con.createStatement(); 
            ResultSet rs=stmt.executeQuery("Select UserID, UserName, UserPass, Name, DoB, Gender, Permission from Users where UserID='"+ID+"'"); 
            if(rs.next()){
            	int userid = rs.getInt(1);
            	String username = rs.getString(2);
            	String userpass = rs.getString(3);
            	String name = rs.getString(4);
            	String dob = rs.getDate(5).toString();
            	int gender = rs.getInt(6);
            	int permission = rs.getInt(7);
            	user = new User(userid, username, userpass, name, new SimpleDateFormat("yyyy-MM-dd").parse(dob), gender, permission);
            }
            con.commit();
            con.close();
            return user;
		}catch(Exception ex) {
			Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
            
		}
		return null;
	}
}
