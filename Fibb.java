class Fibb
{
	
	public static void main(String[] args)
	{
		int n1=0,n2=1,n3,i,n,count=10;
		System.out.print(n1+" "+n2);
		 
		 for(i=1;i<=20;i++)
		 {
			 n3=n1+n2;
			 System.out.print(" "+n3);
			 
			 n1=n2;
			 n2=n3;
			 
			 
		 }
		 System.out.println();
	System.out.println(" "+"fibbunocci series ends ");
}
}