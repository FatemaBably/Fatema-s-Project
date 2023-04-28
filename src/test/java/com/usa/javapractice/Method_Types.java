package com.usa.javapractice;

public class Method_Types {
	private static char[] getSalary;
	// void method
    public void getEmployee ( ) { 
    	System.out.println("Hasan");
    }
    // return method
    public int getSalary (){
		return 0;
    	} 
    // return method
    public String getName() {
		return null; 
    	
    }
    // parameterized method
    public void getEmployeeInfo (int salary,int bonus ) {
    
    }
   
    	public static void getEmployeeInfo1 (int salary, int bonus ) { 
    		salary = 10000;
    		bonus = 2000;
    				
    		System.out.println(salary+bonus);
    	
    	}
    	public static void main(String[] args) {
    		System.out.println(Method_Types.getSalary);
    		
			Method_Types obj= new Method_Types ();
			obj.getSalary();
		}
    }
