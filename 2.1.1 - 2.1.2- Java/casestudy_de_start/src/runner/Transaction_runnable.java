package runner;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;
import runner.main;


import dao.TransactionDao;
import dao.dbconnection_abstract;
import model.transaction;
import resources.myQuries;


public class Transaction_runnable extends dbconnection_abstract{
	
	//Function to display number and total values by type
	public void getTotalByType() throws InstantiationException, IllegalAccessException, ClassNotFoundException, IOException, SQLException
	{
			
		myconnection();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter transaction Type:");
		
		String type = sc.nextLine();
		
		TransactionDao td = new TransactionDao();
		transaction mytransaction = td.gettotalbyType(type);
		if(mytransaction!=null) {
		System.out.println("The number of transactions: "+mytransaction.getCount()+" With total value of "+mytransaction.getValue());}
		else {System.out.println("There is no such option, please try again");
		System.out.println();
		getTotalByType();}
	}
		
	
	
	//Function to return transactions made by customer
	public void DisplayTransactions() throws InstantiationException, IllegalAccessException, ClassNotFoundException, IOException, SQLException
	{
		
		Scanner sc1  = new Scanner(System.in);
		
		System.out.println("Please put in the ZipCode");		
		Integer zip = sc1.nextInt();		
				
		System.out.println("Please put in the Year");
		Integer yr = sc1.nextInt();
		
		System.out.println("Please put in the Month");
		Integer mn = sc1.nextInt();
	
		
			


		TransactionDao td = new TransactionDao();
		ArrayList<transaction> kk=td.DisplayTran(zip, yr, mn);

		
		if(kk.isEmpty()) {System.out.println("Information entered could not be found");}
		else{System.out.format("%16s%16s%16s%16s%16s%16s","Fullname","SSN","ZIPCODE","MONTH","YEAR","TRANSACION_ID");

		System.out.println();
		System.out.println();
		int i=0;
		for(transaction tran: kk) {
			i++;
			System.out.format("%16s%16d%16s%16d%16d%16d",tran.getFname()+", "+tran.getLname(),tran.getSsn(), tran.getZip(),tran.getMonth(),tran.getYear(),tran.getTranId());
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Total number of values: "+i);}


	}
		
	
	//Function to return transactions by state
	public void ShowTransactionsByState() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException, IOException {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Please put in the State");
		String st = sc.nextLine();
		TransactionDao td = new TransactionDao();
		transaction mytransaction = td.gettotalbyState(st);
		if(mytransaction!=null) {
		System.out.println("The number of transactions: "+mytransaction.getCount()+" With total value of "+mytransaction.getValue());}
		else {System.out.println("Thereis no info on this state, please try another");
		System.out.println();
		ShowTransactionsByState();}
	}
	
	
	
	//Function to show existing account details
	public void ShowCusDetails() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException, IOException {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Please put in the SSN");
		int ssn=sc.nextInt();
		TransactionDao td = new TransactionDao();
		transaction mt = td.getDetailsofCustomer(ssn);
		
		
		if(mt!=null) {
		System.out.format("%25s%25s%25s%25s","Full Name","SSN#","Credit Card No","ZIP Code");
		System.out.println();
		System.out.format("%25s%25d%25s%25s",mt.getFname()+", "+mt.getLname(),mt.getSsn(),mt.getCardNo(),mt.getZip());
		System.out.println();
		}
		else {System.out.println("SSN provided could not be found");}
	}
	
	
	//Function to update customer information
	@SuppressWarnings("unused")
	public void ModifyCusDetails() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException, IOException {
		Scanner sc  = new Scanner(System.in);
		TransactionDao td = new TransactionDao();
		
		
		
		System.out.println("Please put in the SSN");
		int ssn=sc.nextInt();
		sc.nextLine();
		
		
		//check whether SSN actually exists in SQL DB
		if (td.getDetailsofCustomer(ssn)!=null) {
		

		  System.out.println("What information would you like to update?");	
		  System.out.println("Please enter 1 for First name");
		  System.out.println("Please enter 2 for Last name");
		  System.out.println("Please enter 3 for Email");
		  System.out.println("Please enter 4 to change All");
		  System.out.println("Please enter 5 to QUIT");
		  
		  int input = sc.nextInt();
		  String query = "";
		  if (input == 1) {
			  System.out.println("Please enter new First Name");
			  String fname=sc.next();
			  td.ModifyDetailsofCustomer_FN(ssn,fname);
			  
			}else if (input == 2) {
				  System.out.println("Please enter new Last Name");
				  String lname=sc.next();
				td.ModifyDetailsofCustomer_LN(ssn,lname);
				
		    }else if (input == 3) {
				  System.out.println("Please enter new Email");
				  String eml=sc.next();
		    	td.ModifyDetailsofCustomer_EML(ssn,eml);}
		  
		    else if (input == 4) {
		    	System.out.println("Please enter new First Name");
		    	String fname=sc.next();
		    	System.out.println("Please enter new Last Name");
		    	String lname=sc.next();
		    	System.out.println("Please enter new Email");
		    	String eml=sc.next();
		    	td.ModifyDetailsofCustomer(ssn,fname, lname,eml);}
		    	
		    else if(input==5) {
		    	main jj=new main();
		    	jj.openmenu();}
		     else { System.out.println("Wrong input, try again");
		     ModifyCusDetails();}
		  
		  

		//Show the output
		  ShowCusDetailsforKnownSSN(ssn);

		}
		//If SSN does not exist - start over
		else {System.out.println("Such SSN# does not exist, do you want to try again? Y/N");
		
		String answ2=sc.nextLine();
		
		if (answ2.toLowerCase().equals("y")) {
			ModifyCusDetails();}
		else {
			main kk=new main();
			kk.openmenu();}
		
		}
		
	}
	
	
	//Function to return Customer info by SSN#
	public void ShowCusDetailsforKnownSSN(int ssn) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException, IOException {
		Scanner sc  = new Scanner(System.in);
		TransactionDao td = new TransactionDao();
		transaction mt = td.getDetailsofCustomer(ssn);
		
		System.out.format("%25s%25s%25s%25s%25s","Full Name","SSN#","Credit Card No","ZIP Code","Email");
		System.out.println();
		System.out.format("%25s%25d%25s%25s%25s",mt.getFname()+", "+mt.getLname(),mt.getSsn(),mt.getCardNo(),mt.getZip(),mt.getEmail());
		System.out.println();
	}
	
	
	//Function to return monthly bill
	public void GenerateMonthlyBill() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException, IOException {
		Scanner sc  = new Scanner(System.in);
		
		TransactionDao td = new TransactionDao();
		
		
		
		System.out.println("Please put in the CreditCardNo");
		String ccn=sc.next();
		
		if(td.getDetailsofCustomer_CC(ccn)!=null) {
		
		
					System.out.println("Please put in the year");
					int yr=sc.nextInt();
					
					
					
					System.out.println("Please put in the month");
					int mon=sc.nextInt();
					
		
		
				
				ArrayList<transaction> mb = td.getTransactionDetails(ccn,yr,mon);
				
				if(mb.isEmpty()) {System.out.println("Information entered could not be found");}
				else{
					System.out.format("%16s%16s%16s%16s%16s%16s%16s%16s%16s","TRANSACTION_ID","Day","Month","Year","CreditCard #","SSN#","Branch Code","Transaction Type","Transaction Value");
				
				System.out.println();
				int i=0;
				for(transaction tran: mb) {
					i++;
					System.out.format("%16d %16d %16d %16d %16s %16d %16d %16s %16d",tran.getTranId(),tran.getDay(), tran.getMonth(),tran.getYear(),tran.getCardNo(),tran.getSsn(),tran.getBranchCode(),tran.getType(),tran.getValue());
					System.out.println();
				}
				
				System.out.println();
				System.out.println("Total number of values: "+i);}
		}
		else {System.out.println("Such CCN# does not exist, do you want to try again? Y/N");
		String answ=sc.next();
		if (answ.toLowerCase().equals("y")) {
		GenerateMonthlyBill();}
		else {
			main kk=new main();
			kk.openmenu();}
		}
	}
	
	
	
	
	//Function to display transactions by date range
	public void GenerateMonthlyBillbyDates() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException, IOException {
		Scanner scan  = new Scanner(System.in);
		TransactionDao td = new TransactionDao();
		
		System.out.println("Enter SSN of a customer");		
		int ssn = scan.nextInt();
		
		
		//Check whether SSN# is valid
		if(td.getDetailsofCustomer(ssn)!=null){
					System.out.println("Enter Beginning date in 'yyyy-mm-dd' format");		
					String b_date = scan.next();
					
					System.out.println("Enter End date in 'yyyy-mm-dd' format");		
					String e_date = scan.next();
					
					
					
					ArrayList<transaction> mb = td.getTransactionDetailsbyDate(ssn,b_date,e_date);
					
					if(mb.isEmpty()) {System.out.println("Information entered could not be found");}
					else{
						System.out.println("Here is table of transactions for "+mb.get(0).getFname()+", "+mb.get(0).getLname()+ " with SSN= "+mb.get(0).getSsn());
						System.out.println("-------------------------------------------------------------------------------------------------------------------");
						System.out.println();
						System.out.format("%30s%30s%30s","TRANSACTION_ID","TRANSACTION_VALUE","TRANSACTION_DATE");
					
					System.out.println();
					int i=0;
					for(transaction tran: mb) {
						i++;
						System.out.format("%30d %30d %30s",tran.getTranId(),tran.getValue(), tran.getTdate());
						System.out.println();
					}
					
					System.out.println();
					System.out.println("Total number of values: "+i);}
				}
					
		else {System.out.println("SSN# is not valid, do you want to try again? Y/N");
		
					String answ=scan.next();
					if (answ.toLowerCase().equals("y")) {
						GenerateMonthlyBillbyDates();}
					else {
						main kk=new main();
						kk.openmenu();}
			}
					
		}
	}
	
	



	

