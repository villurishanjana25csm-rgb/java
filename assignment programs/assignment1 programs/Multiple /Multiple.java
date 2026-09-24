package core_java;
interface I1{
    int a = 10 ;
    void student1();
    void student3();
}
interface I2{
    double b = 30 ;
    void student2();
} 
  public class Multiple implements I1,I2{

      public void student2(){
        System.out.println(" i am student 2");
      }
        public void student1(){
        System.out.println("i am student 1");
 }
      public void student3(){
        System.out.println(" i am student 3");
      }
  public static void main(String[] args){
    Multiple m = new Multiple();
    m.student1();
    m.student2();
    m.student3();
      System.out.println(m.a);
    }
  }
