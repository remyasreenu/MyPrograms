package myprograms;


public class SuperPrg2 extends SuperPrg1{
	
	public SuperPrg2() {
		
		int x=super.s;
		
		if(x%10==0) {
			
			System.out.println("Divisible");
			
		}else {
			System.out.println("Not Divisible");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperPrg2 obj=new SuperPrg2();
	}

}
