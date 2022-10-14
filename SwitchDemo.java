
class SwitchDemo 
{
public static void main(String[] args)
{
	int a=21;
	int b=22;
	int i;
    int add;
	int number=8;

switch(number)
{
	case  1:System.out.println("first added number");
	      add=a+b;
		  System.out.println(add);
		  break;
		 
		  
    case  2:System.out.println("second subtracted number");
           add=a-b;
		   System.out.println(add);
          break;
    
	case  3:System.out.println("third multiplied number");
            add=a*b;
           System.out.println(add);
          break;
 
  default: System.out.println("invalid case");
          break;
	 
		   
		   
		  }	
}

}


/*output
C:\Users\user\OneDrive\Desktop\java\java-programs->javac SwitchDemo.java

C:\Users\user\OneDrive\Desktop\java\java-programs->java SwitchDemo
invalid case
*/