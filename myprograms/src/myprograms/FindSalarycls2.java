package myprograms;

public class FindSalarycls2 extends FindSalary{
	
	int hra;
	int pf;
	
	public int Findhra(){
		
		 hra =(ba_py * 5)/100;
		 		 
		 return hra;
				
		/*System.out.println("HRA:"+hra);
		System.out.println("PF:"+pf);*/
		
	}
	public int Findpf(){
		
		 
		 pf =(ba_py * 20)/100;
		 
		 return pf;
		
	}
	
	

}
