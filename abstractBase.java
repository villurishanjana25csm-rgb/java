abstract class Base{
    int x;

    void add() {
        System.out.println("Add from first is: " + (x + 20));
    }
    abstract void sub();
}

public class abstractBase extends Base {
    abstractBase() {
       int y = 10;
    }

    @Override
    public void sub() {
        System.out.println("Sub from second is: " + (x - 20));
        }

    public static void main(String[] args) {
        abstractBase obj = new abstractBase();
        System.out.println("Variable : " + obj.x);
        obj.add();
        obj.sub();
    }
}
       

