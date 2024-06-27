package myprograms;

public class SalaraySlip extends FindSalarycls2 {
	
	public void SalarySlp(int hra,int pf) {
		
		int totded=hra+pf+ded;
		
		int tot=ba_py+bon;
		
		int totsal=tot-totded;	
		
		System.out.println("HRA:"+hra);
		System.out.println("PF:"+pf);
		
		System.out.println("Total Salary:"+totsal);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SalaraySlip ob=new SalaraySlip();
		ob.GetSalary();
		int hra= ob.Findhra();
		int pf= ob.Findpf();
		ob.SalarySlp(hra,pf);

	}

}
