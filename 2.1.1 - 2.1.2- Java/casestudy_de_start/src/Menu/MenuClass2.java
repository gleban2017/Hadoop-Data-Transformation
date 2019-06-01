package Menu;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;
import dao.dbconnection_abstract;
import  runner.Transaction_runnable;
import runner.main;





public class MenuClass2 {	
	
	
	public static void menu() throws InstantiationException, IllegalAccessException, ClassNotFoundException, IOException, SQLException {
		for (int i = 0; i < 200; ++i) System.out.println();
		System.out.println("\nChoose an action:");
		System.out.println("1. Display customer account details");
		System.out.println("2. Modify customer account details");
		System.out.println("3. Generate monthly bill");
		System.out.println("4. Display transactions for certain date period");
		System.out.println("5. Quit");
		
		
		Scanner reader = new Scanner(System.in);
		Integer choice = 0;
		
		while (choice != 5) {
			System.out.println("----------------------------------------------------------------");
			
			choice = reader.nextInt();
			switch (choice) {
						
			case 1:
				Transaction_runnable tc = new Transaction_runnable();
				tc.ShowCusDetails();
				if(NextChoice()) {
					for (int i = 0; i < 50; ++i) System.out.println();
					main mm=new main();
					mm.openmenu();}
				else {System.out.println("Program is completed");}
				
				
				break;
				
			case 2:
				Transaction_runnable tc2 = new Transaction_runnable();
				tc2.ModifyCusDetails();
				if(NextChoice()) {
					for (int i = 0; i < 50; ++i) System.out.println();
					main mm=new main();
					mm.openmenu();}
				else {System.out.println("Program is completed");}
				
				
				break;
			
				
				
			case 3:
				Transaction_runnable tc3 = new Transaction_runnable();
				tc3.GenerateMonthlyBill();
				if(NextChoice()) {
					for (int i = 0; i < 50; ++i) System.out.println();
					main mm=new main();
					mm.openmenu();}
				else {System.out.println("Program is completed");}
				
				
				break;
				
				
			case 4:
				Transaction_runnable tc4 = new Transaction_runnable();
				tc4.GenerateMonthlyBillbyDates();
				if(NextChoice()) {
					for (int i = 0; i < 50; ++i) System.out.println();
					main mm=new main();
					mm.openmenu();}
				else {System.out.println("Program is completed");}
				
				
				break;
				
			case 5:
				for (int i = 0; i < 200; ++i) System.out.println();
				main kk=new main();
				kk.openmenu();
				break;
			
			default:
				for (int i = 0; i < 200; ++i) System.out.println();
				System.out.println("There is no such option. Please try again");
				
				menu();
				
			}
		}
	}
	

	
	public static Boolean NextChoice() {
		boolean the_ans=true;
		Scanner reader2 = new Scanner(System.in);
		System.out.println("-------------------------------------------------------------");
		System.out.println("Would you like to choose another operation?");
		System.out.println("[1]. YES");
		System.out.println("[2]. NO");
		Integer ans=reader2.nextInt();
		if(ans==1) {
			return the_ans;
		}
		else {the_ans=false;
		return the_ans;}
	}
	
	

}
