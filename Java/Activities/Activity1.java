
package fst_m1_java;

public class Activity1 {

	public static void main(String[] args) {
	
		for(int i=0;i<=10;i++)
		{
			System.out.println(i);
		}
		
		int a=10;
		int b=8;
		if (a<b)
		{
			System.out.println("A is greater");
		}
		else
		{
			System.out.println("B is greater");
		}
		
		Car car1= new Car("Red", "Automatic",4,0);
		Car car2= new Car("Blue", "Manual", 4,0);
		
		car1.increase(5);
		car1.printColor("Blue");
	}

}
