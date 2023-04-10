package AtmProject;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		Scanner X=new Scanner(System.in);
		long inner_card_num=123456;
		 long inner_pin_num=1234;
		int balance=5000;
		 
		 System.out.println("Enter card num");
		 long outer_card_num=X.nextLong();
		 System.out.println("Enter pin num");
		 long outer_pin_num=X.nextLong();
		 
		 
		 if(inner_card_num==outer_card_num &&inner_pin_num==outer_pin_num)
		 {
								for(int i=1;i>=1;i++)
								{
								System.out.println("\n\nwelcome\n\n 1.withdrawl\t\t 2.deposit\n\n 3.balance\t\t 4.exit \n\n Enter your choice");
								
								int l=X.nextInt();
								if(l==1)
								{
											System.out.println("\nHow much amount you want to withdrawl\n");
											int withdrawl=X.nextInt();				
											
											System.out.println("\nWithdrwal success\n\n Do you want balance\n\n1.yes\t\t2.no");
											
											int a=X.nextInt();
											if(a==1)
											{
												 balance=balance-withdrawl;
												System.out.println("\nYour Avabile balance  =\t"+balance);
											}
											else 
											{
												System.out.println("Thank you");
											}
							}
								
								if(l==2)
								{
									System.out.println("\nHow much amount you want to deposit\n");
					
									int deposit=X.nextInt();
												
									System.out.println("\nDeposit success\n\n Do you want balance\n1.yes\t\t2.no");
									int b=X.nextInt();
									
									if(b==1)
									{
										 balance=balance+deposit;
										System.out.println("\nYour Avabile balance  =\t"+balance);
									}
									else 
									{
										System.out.println("thank you");
									}
									
								}
								
								if(l==3)
								{
									System.out.println( "\nYour Avabile balance  =\t"+balance);
								}
								
								if(l==4)
								{
									System.out.println("Thank you\nVisit Again");
									break;
								}
								
											
						 }	
		 }	 	 
							 	
							 
							 else
							 {
								 System.out.println("\nYou have entered wrong card_num\n \t\t(or)\nWrong pin_num");
							 }
	}

}