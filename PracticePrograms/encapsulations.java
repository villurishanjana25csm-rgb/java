package javacore;

class A{
	private int items;
	 private int count;
	 void set(){
		 items=2;
		 count=2;
	 }
		 int get() {
		 return items+count;
	 }
	 class B extends A {
		 String name ="deekshitha";
		 private void name() {
			 System.out.println("My name is:");
		 }
		 void sets() {
			 name="deekshitha";
		 }
		 String gets(){
			 return name;
		 }
	 }
}
public class Encapsulation {
	public static void main(String[] args) {
		A a= new A();
		a.set();
		System.out.println(a.get());
		A.B b= a.new B();
		b.sets();
		System.out.println(b.gets());
	}

}
