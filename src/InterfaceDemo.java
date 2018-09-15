public class InterfaceDemo implements myInterface {

    //在implement interface的类中需要实现所有interface里的方法
    @Override                          //用@Override标示覆盖的方法，是个标识符
    public void interfaceMethod1() { //在父类或接口中出现过的方法
        System.out.println("This is an implement code.");

    }
    //除了interface方法 也可以有自己的方法
    void method2() {

    }
}

interface myInterface {
    //Interface 方法不能实现
    public void interfaceMethod1();
}

