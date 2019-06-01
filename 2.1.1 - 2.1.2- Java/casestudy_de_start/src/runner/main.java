package runner;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import dao.dbconnection_abstract;
import Menu.MenuClass1;
import Menu.MenuClass2;

public class main  {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, IOException, SQLException {
		// TODO Auto-generated method stub
		openmenu();
	}
		
			public static void openmenu() throws InstantiationException, IllegalAccessException, ClassNotFoundException, IOException, SQLException {
				
				System.out.println("Which details would you like to check?");
				System.out.println("[1]. Transaction Details");
				System.out.println("[2]. Customer Details");
				System.out.println("[3]. Quit");
				Scanner sc=new Scanner(System.in);
				
				try {
				int n=sc.nextInt();
				
	
				
						if(n==1) {		
								MenuClass1 menu=new MenuClass1();
								menu.menu();}
						
						else if(n==2) {MenuClass2 menu=new MenuClass2();
						menu.menu();}
						
						else if(n==3) {System.out.println("Program is finished");} 
						
						else {
							System.out.println("The choice made is wrong, please try again.");
							System.out.println("------------------------------------------");
							System.out.println();
							System.out.println();
							openmenu();
						}
				}
				catch(Exception e)
				{
					System.out.println("This is incorrect input. Please try again.");
				System.out.println("------------------------------------------");
				System.out.println();
				System.out.println();
				openmenu();
				}
			
			}
	

}
