import java.util.*;

public class Object {
    int instanceVariable1 = 0; //成员变量的英文是 instance variable
    float instanceVariable2;
    char instanceVariable3 ='a';
    double instanceVariable4; //带小数点的默认的是double类型，所以float类型都要写f，如1.0f。
    boolean instanceVariable5 = true;
    String instanceVariable6;
    String[] instanceVariable7 = {"ab"};
    List<Integer> instanceVariable8;
    Map<Character, List<String>> instanceVariable9 = new HashMap<>();//<>里有key 和 value
    Set<Double> instanceVariable10;

    /*
    以下是构造体 只有构造体的名字可以并且必须和类名一样
    方法的区别是方法的名字不同
    构造体的区别是 参数的类型和数量 至少有一个不一样 如：int a 和 int b 类型相同 不可以写成两个。
    一个参数是int a，另一个参数是 int a，int b 这样就可以写成两个
    */
    public Object() {

        instanceVariable2 = 1.0f;
    }
    /*
    初始化构造体. myObject1初始化后 instanceVariable2 的值 才是1.0f。 任何成员变量（从1-10）都是初始化（= new Object()）之后才生效
    Object myObject1 是声明。 后半句才是初始化
    Object myObject1 = new Object();  这是调用没传参的constructor
     */

    //第二种构造体(constructor)
    public Object(double instanceVariable4_2, String instanceVariable6_2) {
        this();  //这是在调用同一类中的第一个Object（instanceVariable4）。
        this.instanceVariable4 = instanceVariable4_2;
        this.instanceVariable6 = instanceVariable6_2;
    }

    //Object myObject2 = new Object(1.2, "My string is good."); 这是调用传参的constructor

    public Object(double instanceVariable4_3, String instanceVariable6_3, List<Integer> instanceVariable8_3,
                  Set<Double> instanceVariable10_3) {
        this(instanceVariable4_3,instanceVariable6_3);
        this.instanceVariable8 = instanceVariable8_3;
        this.instanceVariable10 = instanceVariable10_3;
    }

    //方法
    int function1(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.println(i);
        }
        int sum = 0;
        while (n >= 0) {
            sum += n;
            n--;
        }
        return sum;
    }

    String function2(int n) {
        if (n % 3 == 0 && n % 5 == 0) return "BizzBuzz";
        else if (n % 3 == 0) return "Bizz";
        else if (n % 5 == 0) return "Buzz";
        else return "";

    }

    void function3(int n) {
        switch (n) {
            case 1:
                System.out.println("yi");
                break;
            case 2:
                System.out.println("er");
                break;
            default:
                break;
                /*
                有break才能只执行一个case， 否则 就是输出选择的case 以及之后所有case的结果都输出。 最后default
                有break是为了工整（以免觉得少一个break）。
                */
        }
    }
    //collection type 的 api练习 （List Map Set）
    void function4() {
        instanceVariable8.add(1);
        

    }


}
