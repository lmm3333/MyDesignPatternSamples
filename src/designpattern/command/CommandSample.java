package designpattern.command;

/**
 * @author lmm333
 */

//首先定义各位大哥类，大哥们各有所能，给了软蛋强大的后援。。。
class 刘铁俊 {
    public static void 装软件() {
        System.out.println("刘铁俊装软件");
    }
}
class 李亨军 {
    public static void 修硬件() {
        System.out.println("李亨军修硬件");
    }
}
class 兰斌 {
    public static void 借自行车() {
        System.out.println("兰斌借自行车");
    }
}
class 常峥 {
    public static void 借钱() {
        System.out.println("常峥借钱");
    }
}
class 任佳鑫{
    public static void 带外卖() {
        System.out.println("任佳鑫帮带外卖");
    }
    public static void 支付() {
        System.out.println("任佳鑫用网银支付");
    }
}

//接着定义抽象的【命令Command类】，只有一个【执行Execute方法】，由子类具体实现
abstract class Command {
    public abstract void Execute();
}
//子类实现【执行Execute方法】
class 修电脑 extends Command {
    @Override
    public void Execute() {
        System.out.println("执行修电脑服命令");
        李亨军.修硬件();
        刘铁俊.装软件();
    }
}
class 买饭 extends Command{
    @Override
    public void Execute() {
        System.out.println("执行买饭命令");
        兰斌.借自行车();
        任佳鑫.带外卖();
    }
}
class 买衣服 extends Command{
    @Override
    public void Execute() {
        System.out.println("执行买衣服命令");
        常峥.借钱();
        任佳鑫.支付();
    }
}
//软蛋作为Invoker，就好像一个中介一样
class Invoker{
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }
    //用action去执行各种command的excute
    public void action(){
        command.Execute();
    }
}
public class CommandSample {
    public static void main(String[] args) {
        Invoker ruandan=new Invoker();
        Command command=new 买衣服();
        ruandan.setCommand(command);
        ruandan.action();
    }
}
