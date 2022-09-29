package com.syntax.class03;

public class IfElse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		boolean isHungrey=false;
    if(isHungrey){
    	System.out.println("let's eat something yammy");
    }
		if(3>2) {
			System.out.println("there is true statment inside parentheses");
		}
		double myBalance=2000;
		double theAmountThatIwantToTransfer=250;// if this amount=2500, the console will print else st,
		if(myBalance>theAmountThatIwantToTransfer) {
			System.out.println("Funds transfered succesfuly");
		}
		else{
			System.out.println(("please try again not enough balance"));
		}
		
		
	}

}
