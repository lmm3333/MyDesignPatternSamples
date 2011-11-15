package designpattern.adapter;

/**
 * @author lmm333
 */

//客户端期待的接口
class Target{
    public void Request(){
        System.out.println("普通请求");
    }
}

//实际遇到的接口，需要被适配
class Adaptee{
    public  void SpecificRequest(){
        System.out.println("特殊请求");
    }
}

//适配器，内部包装了一个Adaptee对象，完成接口的转换
class Adapter extends Target{
    private Adaptee adaptee=new Adaptee();

    @Override
    public void Request() {
        adaptee.SpecificRequest();
    }
}

//客户端执行代码：
public class AdapterSample {
    public static void main(String[] args) {
        Target target1=new Target();
        Target target2=new Adapter();
        target1.Request();
        target2.Request();
    }
}
/*
输出：
普通请求
特殊请求
 */
