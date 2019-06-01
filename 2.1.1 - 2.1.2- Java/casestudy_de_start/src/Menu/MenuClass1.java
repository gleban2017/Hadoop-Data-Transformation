package Menu;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;
import dao.dbconnection_abstract;
import  runner.Transaction_runnable;
import runner.main;





public class MenuClass1 {	
	
	
	public static void menu() throws InstantiationException, IllegalAccessException, ClassNotFoundException, IOException, SQLException {
		for (int i = 0; i < 200; ++i) System.out.println();
		System.out.println("\nChoose an action:");
		System.out.println("1. Display transactions made by customer");
		System.out.println("2. Display transactions by Type");
		System.out.println("3. Display transactions by State");
		
	
		System.out.println("4. Quit");
		final String ESC = "\033[";
		
		Scanner reader = new Scanner(System.in);
		Integer choice = 0;
		
		while (choice != 3) {
			System.out.println("----------------------------------------------------------------");
			
			choice = reader.nextInt();
			switch (choice) {
			case 1:
				Transaction_runnable td = new Transaction_runnable();
				td.DisplayTransactions();
				if(NextChoice()) {
					
					for (int i = 0; i < 100; ++i) System.out.println(); 
					main mm=new main();
					mm.openmenu();
					}
				else {System.out.println("Program is completed");}
				
				
				break;
			case 2:
				Transaction_runnable t = new Transaction_runnable();
				t.getTotalByType();
				
				if(NextChoice()) {
					for (int i = 0; i < 50; ++i) System.out.println();
					main mm=new main();
					mm.openmenu();}
				else {System.out.println("Program is completed");}
				
				break;
			case 3:
				Transaction_runnable tb = new Transaction_runnable();
				tb.ShowTransactionsByState();
				if(NextChoice()) {
					for (int i = 0; i < 50; ++i) System.out.println();
					main mm=new main();
					mm.openmenu();}
				else {System.out.println("Program is completed");}
				
				
				break;
			
			

			
			case 4:
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
