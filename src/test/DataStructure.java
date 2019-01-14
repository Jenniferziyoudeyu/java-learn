package test;

import java.util.*;
// java是单继承，多实现。只能继承一个类 implement多个类 用逗号相隔
public class DataStructure extends MyAbstractClass implements MyInterface, MyInterface2 {
    @Override
    public void needImplement1(String str) {

    }
    @Override
    public void needImplement2(List<String> list, Car myCar) {

    }

    @Override
    public void needImplement3(String str) {

    }

    @Override
    public void needImplement4(List<String> list, Car myCar) {

    }
// super.shixian(); 继承父类方法（super）加上自己的功能
    @Override
    void shixian() {
        super.shixian();
    }

    @Override
    void bushixian() {

    }

    public void funcA() {
        int a = 2;
        float b = 3.1f;
        double c = 4.32;
        int[] arr = {2,3,4};
        int[] array = new int[10];
        char q = 'c';
        Car myCar = new Car("pp");
        //根据之后要用到的增删改查，要想好用ArrayList还是LinkedList
        List<String> myList = new LinkedList<>();
        List<List<String>> yourList = new LinkedList<>();
        Map<String,Map<Integer,String>> map = new HashMap<>();
        Set<int[]> mySet = new HashSet<>();
        Stack<Integer> myStack = new Stack<>();
        Queue<String> myQueue = new LinkedList<>();

    }

}
//interface定义方法，实现接口的方法来实现
interface MyInterface {
//    interface的方法 不能实现 不能用{}
    void needImplement1(String str);
    void needImplement2(List<String> list, Car myCar);

}

interface MyInterface2 {
    //    interface的方法 不能实现 不能用{}
    void needImplement3(String str);
    void needImplement4(List<String> list, Car myCar);

}

//方法可实现 也可以不实现
abstract class MyAbstractClass {
    abstract void bushixian();
    void shixian() {
        Car myCar = new Car("aa");
        myCar.setName("bb");
        System.out.println(myCar.getName());
        myCar.setShouldNotSmallerThan0(-100);
        System.out.println(myCar.getShouldNotSmallerThan0());
        myCar.run();
        System.out.println(Car.staticFunc());
    }
}
class Car {
    private String name;
    private int shouldNotSmallerThan0;
    static int staticInt;
    Car(String name) {
        this.name = name;
    }
    void run() {
        int a = 0;
    }
    int sum(int a, int b) {
        shouldNotSmallerThan0 = a;
        staticFunc();
        return a + b;
    }

    static int staticFunc() {
        staticInt = 2;
        return 1;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
/* setter 和 getter 要成对出现，相比直接访问variable，setter/getter是java的编程习惯
而且setter/getter可以防止variable设置的错误出现，比如 shouldNotSmallerThan0 = -10
如果需要设置variable为只读，则设置setter为private，反之亦然
 */
    public void setShouldNotSmallerThan0(int shouldNotSmallerThan0) {
        this.shouldNotSmallerThan0 = shouldNotSmallerThan0 < 0 ? 0 : shouldNotSmallerThan0;
    }

    public int getShouldNotSmallerThan0() {
        return shouldNotSmallerThan0;
    }
}
