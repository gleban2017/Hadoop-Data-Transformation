package dao;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import model.transaction;
import resources.myQuries;

public class TransactionDao extends dbconnection_abstract {
	
	
	
//Function to for pulling number and total values from SQL
 public transaction gettotalbyType(String type) throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException, IOException
 {
	 myconnection();
	 ps = con.prepareStatement(myQuries.totaByType);
		ps.setString(1, type);
		rs = ps.executeQuery();
		transaction t = new transaction();
		if(rs.next())
		{
			

			t.setValue(rs.getInt(1));
			t.setCount(rs.getInt(2));
	
			return t; 

 }
		return null;
 }
 
 
 
 //DAO function to pull transactions from SQL
public ArrayList<transaction> DisplayTran(int zip, int yr, int mn) throws InstantiationException, IllegalAccessException, ClassNotFoundException, IOException, SQLException {
	
	myconnection();
     ps = con.prepareStatement(myQuries.displayTransactionsQuery);
		ps.setString(1, Integer.toString(zip));
		ps.setInt(2, yr);
		ps.setInt(3, mn);
		rs = ps.executeQuery();
		ArrayList<transaction> ar_t=new ArrayList<transaction>();
		while(rs.next()) {
			
			transaction t=new transaction();
			t.setFname(rs.getString(1));
			t.setLname(rs.getString(2));
			t.setSsn(rs.getInt(3));
			t.SetZip(rs.getString(5));
			t.setMonth(rs.getInt(8));
			t.setYear(rs.getInt(9));
			t.setTranId(rs.getInt(6));
			ar_t.add(t);
			
		}
		
		return ar_t;

  
  		}
  


//DAO Function to pull state transactions from SQL
public transaction gettotalbyState(String st) throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException, IOException
{
	 myconnection();
	 ps = con.prepareStatement(myQuries.totalByBranch);
		ps.setString(1, st);
		rs = ps.executeQuery();
		transaction t = new transaction();
		if(rs.next())
		{
			
		
			t.setValue(rs.getInt(2));
			t.setCount(rs.getInt(1));

			return t; 

}
		return null;
}



//DAO function to pull customer details by SSN# from SQL
public transaction getDetailsofCustomer(int ssn) throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException, IOException {
	myconnection();
	ps=con.prepareStatement(myQuries.infoCustomer);
	ps.setInt(1, ssn);
	rs = ps.executeQuery();
	transaction t = new transaction();

	if(rs.next()) {
		t.setFname(rs.getString(1));
		t.setLname(rs.getString(2));
		t.setSsn(rs.getInt(3));
		t.setCardNo(rs.getString(4));
		t.SetZip(rs.getString(5));
		t.setEmail(rs.getString(6));
	
	
	
	return t;
	}
	return null;

	
}


//DAO function to pull customer details from SQL by CCN#
public transaction getDetailsofCustomer_CC(String ccn) throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException, IOException {
	myconnection();
	ps=con.prepareStatement(myQuries.infoCustomer_cc);
	ps.setString(1, ccn);
	rs = ps.executeQuery();
	transaction t = new transaction();

	if(rs.next()) {
		t.setFname(rs.getString(1));
		t.setLname(rs.getString(2));
		t.setSsn(rs.getInt(3));
		t.setCardNo(rs.getString(4));
		t.SetZip(rs.getString(5));
		t.setEmail(rs.getString(6));
	
	
	
	return t;
	}
	return null;

	
}


//DAO function to modify all info of customer
public void ModifyDetailsofCustomer(int ssn,String fname, String lname, String eml) throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException, IOException {
	myconnection();
	ps=con.prepareStatement(myQuries.infoCustomerUpdate);
	ps.setString(1,fname);
	ps.setString(2,lname);
	ps.setString(3,eml);
	ps.setInt(4, ssn);
	ps.executeUpdate();


	
	
}

//DAO function to modify Firstname of customer
public void ModifyDetailsofCustomer_FN(int ssn,String fname) throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException, IOException {
	myconnection();
	ps=con.prepareStatement(myQuries.infoCustomerUpdate_fn);
	ps.setString(1,fname);
	ps.setInt(2, ssn);
	ps.executeUpdate();



	System.out.println("Update completed");
	System.out.println();
	
	
}

//DAO function to modify Lastname of customer
public void ModifyDetailsofCustomer_LN(int ssn,String lname) throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException, IOException {
	myconnection();
	ps=con.prepareStatement(myQuries.infoCustomerUpdate_ln);
	ps.setString(1,lname);
	ps.setInt(2, ssn);
	ps.executeUpdate();



	System.out.println("Update completed");
	System.out.println();
	
	
}

//DAO function to modify Email of customer
public void ModifyDetailsofCustomer_EML(int ssn,String eml) throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException, IOException {
	myconnection();
	ps=con.prepareStatement(myQuries.infoCustomerUpdate_eml);
	ps.setString(1,eml);
	ps.setInt(2, ssn);
	ps.executeUpdate();



	System.out.println("Update completed");
	System.out.println();
	
	
}



//DAO Function to monthly transactions from SQL
public ArrayList<transaction> getTransactionDetails(String ccn, int yr, int mon) throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException, IOException {
	myconnection();
	ps=con.prepareStatement(myQuries.infoTransactions);
	ps.setString(1, ccn);
	ps.setInt(2, yr);
	ps.setInt(3, mon);
	rs = ps.executeQuery();
	
	ArrayList<transaction> ar_t2=new ArrayList<transaction>();
	while(rs.next()) {
		transaction t = new transaction();
		t.setTranId(rs.getInt(1));
		t.setDay(rs.getInt(2));
		t.setMonth(rs.getInt(3));
		t.setYear(rs.getInt(4));
		t.setCardNo(rs.getString(5));
		t.setSsn(rs.getInt(6));
		t.setBranchCode(rs.getInt(7));
		t.setType(rs.getString(8));
		t.setValue(rs.getInt(9));
		ar_t2.add(t);
		
	
	}
	return ar_t2;

	
}


//DAO Function to pull detisl by date range from SQL
public ArrayList<transaction> getTransactionDetailsbyDate(int ssn, String b_date, String e_date) throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException, IOException {
	myconnection();
	ps=con.prepareStatement(myQuries.getTransactionByDates);
	ps.setDate(1, java.sql.Date.valueOf(b_date));
	ps.setDate(2, java.sql.Date.valueOf(e_date));
	ps.setInt(3, ssn);
	rs = ps.executeQuery();
	
	ArrayList<transaction> ar_t2=new ArrayList<transaction>();
	while(rs.next()) {
		transaction t = new transaction();
		t.setTranId(rs.getInt(1));
		t.setValue(rs.getInt(2));
		t.setTdate(rs.getString(3));
		
		t.setFname(rs.getString(4));
		t.setLname(rs.getString(5));
		t.setSsn(rs.getInt(6));
	
	
		ar_t2.add(t);
		
	
	}
	return ar_t2;

	
}

}






