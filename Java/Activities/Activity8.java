package fst_m1_java;

public class Activity8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Mahantesh Assignment");
		try {
		Activity8.exceptionTest("Welcome");
		Activity8.exceptionTest(null);
		
		}
		catch(CustomExceptionActivity8 me) {
			System.out.println(me.getMessage());
		}
	}
	
	static void exceptionTest(String str)throws CustomExceptionActivity8 {
		if (str == null) {// it is not throwing the error
			
			throw new CustomExceptionActivity8("String is Null");
		}
		else
		{
			System.out.println(str);
		}
	}

}
