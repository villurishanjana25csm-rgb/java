package core_java;
 abstract class Parent{
	int integer;
    public Parent(){
    	this.integer=10;
		System.out.println("INTERGER IS :" +this.integer);
		 
	 }
	 
	 abstract void student();
	 
 }
  class Child extends Parent{
  }
public class Abstraction {
	public static void main(String[] args) {
		Child ch=new Child();
		ch.student();
		
	}
    
}
