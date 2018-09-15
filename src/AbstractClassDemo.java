public class AbstractClassDemo {

}

abstract class Employee {
    private String name;
    public  int num;
    //构造函数 是个方法。 与实例化的区别是构造函数是过程，实例化是Class object = new Class();
    public Employee(String name, int num) {
    System.out.println("New employee");
    this.name = name;
    this.num = num;
    }
    public double computePay() {
        System.out.println("Inside Employee computePay");
        return 0.0;
    }

    public void mailCheck() {
        System.out.println("Mailing a check to" + this.name);
    }


    public int getNum() {
        return num;
    }
}