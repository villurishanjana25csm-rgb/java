package inheritance;
abstract class Base {
	int x=9;
	
	void Name( ) {
		System.out.println("My name is Deekshitha");
	}
	abstract void Age();
}
public class AbstractDemo extends Base {

	@Override
	void Age() {
		System.out.println("age from AbstractDemo is 20");
	}
public static void main(String[] args) {
	AbstractDemo ad = new AbstractDemo();
	System.out.println("value of x from Base is:" + ad.x);
	ad.Name();
	ad.Age();
}
}