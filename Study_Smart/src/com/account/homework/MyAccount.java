package com.account.homework;

public class MyAccount {

		
		int initiabalance;
		int add=100;
		int withdraw=500;
		int updatebalance;
	
		MyAccount(int initiabalance){
			this.initiabalance=initiabalance;
	
		}// constructor 
	
	
	
		void add() {
		//+$100	
	
			updatebalance= initiabalance+add;
	
			System.out.println(updatebalance);
	
		}
	
		// none void method returns something!!
	
	
		void withdraw() {
			// -$500
	
			int finalbalance=updatebalance -withdraw;
	
			System.out.println(finalbalance);
	
		}
	

	}// end of class
