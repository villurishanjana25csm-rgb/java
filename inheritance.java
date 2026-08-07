public class inheritance {
    interface I1 {
        int x = 10;
        void method1();
    }
    interface I2 {
        int y = 20;
        void method2();
    }
    class C implements I1, I2 {
        public void method1() {
            System.out.println("Method 1 from interface I1: " + x);
        }
        public void method2() {
            System.out.println("Method 2 from interface I2: " + y);
        }
    }
     public static void main(String[] args) {
        inheritance obj = new inheritance();
        C c = obj.new C();
        c.method1();
        c.method2();
    }
}
