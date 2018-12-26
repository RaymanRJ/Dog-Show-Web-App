package ca.sheridancollege.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

import ca.sheridancollege.beans.DogBean;
import ca.sheridancollege.beans.ListBean;
import ca.sheridancollege.enums.DogBreed;
import ca.sheridancollege.enums.DogGender;
import ca.sheridancollege.enums.DogGroup;
import ca.sheridancollege.enums.DogSpecialty;

public class DAO {
	
	public static void addDog(DogBean db) {
    	try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = null;
        
            conn = DriverManager.getConnection("jdbc:mysql://localhost/"
            		+ DAOStrings.dbName, DAOStrings.dbUserName, DAOStrings.dbPassword);
            
            String q = "insert into " + DAOStrings.dbMainTable + " values (" + db.toSQLString() + ")";
            
            Statement st = conn.createStatement();
           
            
            //st.executeQuery(q);  <-- Expecting a return
            st.executeUpdate(q); //<-- Making a change.
            
            System.out.println("Connection Success");
            conn.close();
        } catch (Exception e) {
            System.out.println("Connection Failed");
            System.out.println(e);
        }
    }
	
	public static void updateDog(String q) {
    	try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = null;
        
            conn = DriverManager.getConnection("jdbc:mysql://localhost/"
            		+ DAOStrings.dbName, DAOStrings.dbUserName, DAOStrings.dbPassword);
            
            Statement st = conn.createStatement();
           
            //st.executeQuery(q);  <-- Expecting a return
            st.executeUpdate(q); //<-- Making a change.
            
            System.out.println("Connection Success");
            conn.close();
        } catch (Exception e) {
            System.out.println("Connection Failed");
            System.out.println(e);
        }
    }
	
	public static ArrayList<DogBean> getDogs(String category, String value){
		ArrayList<DogBean> dogs = new ArrayList<>();
		
		try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = null;
        
            conn = DriverManager.getConnection("jdbc:mysql://localhost/"
            		+ DAOStrings.dbName, DAOStrings.dbUserName, DAOStrings.dbPassword);
            
            String q = "select * from " + DAOStrings.dbMainTable + " where " + category + " = '" + value + "'";
            Statement st = conn.createStatement();
            
            ResultSet rs = st.executeQuery(q);  //<-- Expecting a return
            //st.executeUpdate(q); //<-- Making a change.
            ResultSetMetaData rsmd = rs.getMetaData(); // <-- Get MetaData about data
            
            int numColumns = rsmd.getColumnCount();
            
            DogBean db;
            while(rs.next()) {
            	db = new DogBean();
            	
            	db.setDogNumber(rs.getInt(1));
            	db.setDogName(rs.getString(2));
            	db.setOwnerName(rs.getString(3));
            	db.setDogBreed(rs.getString(4));
            	db.setDogGroup(rs.getString(5));
            	db.setDogGender(DogGender.getGender(rs.getString(6)));
            	db.setDogSpeciality(DogSpecialty.getSpeciality(rs.getString(7)));
            	db.setOwnerEmail(rs.getString(8));
            	db.setFriday(rs.getString(9).equals("1") ? true : false);
            	db.setSaturday(rs.getString(10).equals("1") ? true : false);
            	db.setSunday(rs.getString(11).equals("1") ? true : false);
            	
            	dogs.add(db);
            }
            
            System.out.println("Connection Success");
            System.out.println(rs);
            conn.close();
        } catch (Exception e) {
            System.out.println("Connection Failed");
            System.out.println(e);
        }
		
		return dogs;
	}
	
	public static ArrayList<DogBean> getDogs() {
    	ArrayList<DogBean> dogs = new ArrayList<DogBean>();
    	
    	try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = null;
        
            conn = DriverManager.getConnection("jdbc:mysql://localhost/"
            		+ DAOStrings.dbName, DAOStrings.dbUserName, DAOStrings.dbPassword);
            
            String q = "select * from " + DAOStrings.dbMainTable;
            
            Statement st = conn.createStatement();
            
            ResultSet rs = st.executeQuery(q);  //<-- Expecting a return
            //st.executeUpdate(q); //<-- Making a change.
            ResultSetMetaData rsmd = rs.getMetaData(); // <-- Get MetaData about data
            
            int numColumns = rsmd.getColumnCount();
            
            DogBean db;
            while(rs.next()) {
            	db = new DogBean();
            	
            	db.setDogNumber(rs.getInt(1));
            	db.setDogName(rs.getString(2));
            	db.setOwnerName(rs.getString(3));
            	db.setDogBreed(rs.getString(4));
            	db.setDogGroup(rs.getString(5));
            	db.setDogGender(DogGender.getGender(rs.getString(6)));
            	db.setDogSpeciality(DogSpecialty.getSpeciality(rs.getString(7)));
            	db.setOwnerEmail(rs.getString(8));
            	db.setFriday(rs.getString(9).equals("1") ? true : false);
            	db.setSaturday(rs.getString(10).equals("1") ? true : false);
            	db.setSunday(rs.getString(11).equals("1") ? true : false);
            	
            	dogs.add(db);
            }
            
            System.out.println("Connection Success");
            System.out.println(rs);
            conn.close();
        } catch (Exception e) {
            System.out.println("Connection Failed");
            System.out.println(e);
        }
    	
    	return dogs;
    }
	
	public static ArrayList<ListBean> getListBeans(String query) {
    	ArrayList<ListBean> listBeans = new ArrayList<ListBean>();
    	
    	try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = null;
        
            conn = DriverManager.getConnection("jdbc:mysql://localhost/"
            		+ DAOStrings.dbName, DAOStrings.dbUserName, DAOStrings.dbPassword);
            
            Statement st = conn.createStatement();
            
            ResultSet rs = st.executeQuery(query);  //<-- Expecting a return
            //st.executeUpdate(q); //<-- Making a change.
            ResultSetMetaData rsmd = rs.getMetaData(); // <-- Get MetaData about data
            
            int numColumns = rsmd.getColumnCount();
            
            ListBean lb;
            while(rs.next()) {
            	lb = new ListBean();
            	
            	lb.setBreed(rs.getString(4));
            	lb.setGender(DogGender.getGender(rs.getString(6)));
            	lb.setSpecialty(DogSpecialty.getSpeciality(rs.getString(7)));
            	
            	listBeans.add(lb);
            }
            
            System.out.println("Connection Success");
            System.out.println(rs);
            conn.close();
        } catch (Exception e) {
            System.out.println("Connection Failed");
            System.out.println(e);
        }
    	
    	return listBeans;
    }

	public static DogBean getDog(String query) {
    	DogBean db = new DogBean();
    	
    	try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = null;
        
            conn = DriverManager.getConnection("jdbc:mysql://localhost/"
            		+ DAOStrings.dbName, DAOStrings.dbUserName, DAOStrings.dbPassword);
            
            Statement st = conn.createStatement();
            
            ResultSet rs = st.executeQuery(query);  //<-- Expecting a return
            //st.executeUpdate(q); //<-- Making a change.
            ResultSetMetaData rsmd = rs.getMetaData(); // <-- Get MetaData about data
            
            int numColumns = rsmd.getColumnCount();

            while(rs.next()) {
            	db.setDogNumber(rs.getInt(1));
            	db.setDogName(rs.getString(2));
            	db.setOwnerName(rs.getString(3));
            	db.setDogBreed(rs.getString(4));
            	db.setDogGroup(rs.getString(5));
            	db.setDogGender(DogGender.getGender(rs.getString(6)));
            	db.setDogSpeciality(DogSpecialty.getSpeciality(rs.getString(7)));
            	db.setOwnerEmail(rs.getString(8));
            	db.setFriday(rs.getString(9).equals("1") ? true : false);
            	db.setSaturday(rs.getString(10).equals("1") ? true : false);
            	db.setSunday(rs.getString(11).equals("1") ? true : false);
            }
            
            System.out.println("Connection Success");
            conn.close();
        } catch (Exception e) {
            System.out.println("Connection Failed");
            System.out.println(e);
        }
    	
    	return db;
	}

	public static String[] get(String query) {
    	ArrayList<String> breedList = new ArrayList<>();
    	
    	try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = null;
        
            conn = DriverManager.getConnection("jdbc:mysql://localhost/"
            		+ DAOStrings.dbName, DAOStrings.dbUserName, DAOStrings.dbPassword);
            
            Statement st = conn.createStatement();
            
            ResultSet rs = st.executeQuery(query);  //<-- Expecting a return
            //st.executeUpdate(q); //<-- Making a change.
            ResultSetMetaData rsmd = rs.getMetaData(); // <-- Get MetaData about data
            
            int numColumns = rsmd.getColumnCount();

            String breed;
            while(rs.next()) {
            	breed = rs.getString(1);
            	breedList.add(breed);
            }
            
            System.out.println("Connection Success");
            conn.close();
        } catch (Exception e) {
            System.out.println("Connection Failed");
            System.out.println(e);
        }
    	
    	String[] breedString = new String[breedList.size()];
    	
    	int i = 0;
    	for(String s : breedList) {
    		breedString[i] = s;
    		i++;
    	}
    	return breedString;
	}

	public static ArrayList<Integer> getCurrentList(String username) {
    	ArrayList<Integer> il = new ArrayList<Integer>();
    	
    	try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = null;
        
            conn = DriverManager.getConnection("jdbc:mysql://localhost/"
            		+ DAOStrings.dbName, DAOStrings.dbUserName, DAOStrings.dbPassword);
            
            String q = "select id from " + DAOStrings.dbUserTable + " where doghandler='" + username + "'";
            
            Statement st = conn.createStatement();
            
            ResultSet rs = st.executeQuery(q);  //<-- Expecting a return
            //st.executeUpdate(q); //<-- Making a change.
            ResultSetMetaData rsmd = rs.getMetaData(); // <-- Get MetaData about data
            
            int numColumns = rsmd.getColumnCount();

            while(rs.next()) {
            	il.add(rs.getInt(1));
            }
            
            System.out.println("Connection Success");
            conn.close();
        } catch (Exception e) {
            System.out.println("Connection Failed");
            System.out.println(e);
        }
    	
    	return il;
	}

	public static void updateDogHandler(String username, String[] dognumbers) {
    	
    	try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = null;
        
            conn = DriverManager.getConnection("jdbc:mysql://localhost/"
            		+ DAOStrings.dbName, DAOStrings.dbUserName, DAOStrings.dbPassword);

            Statement st = conn.createStatement();
            
            String q = "";
            for(String s : dognumbers) {
            	q = "insert into " + DAOStrings.dbUserTable + " values('";
            	q += s + "','" + username + "')";
            	st.executeUpdate(q);
            }
            
            //ResultSet rs = st.executeQuery(q);  //<-- Expecting a return
            //st.executeUpdate(q); //<-- Making a change.
            //ResultSetMetaData rsmd = rs.getMetaData(); // <-- Get MetaData about data

            System.out.println("Connection Success");
            conn.close();
        } catch (Exception e) {
            System.out.println("Connection Failed");
            System.out.println(e);
        }
	}
	
}