package designpattern.factoryMethod;

/**
 *
 * @author lmm333
 */
public class FactoryMethod {

    public static void main(String[] args) {
//        sample1();
        sample2();
    }

    public static void sample1(){
        IFactory factory=new 南方妹纸工厂();
        妹纸 meizhi=factory.Create();
        meizhi.shape();
        meizhi.cry();
        meizhi.laugh();
        meizhi.talk();
        meizhi.doThings();
    }

    public  static void sample2() {
        System.out.println("先构造个北方妹纸:");
        妹纸 meizhi1=create(北方妹纸.class);
        meizhi1.shape();
        meizhi1.cry();
        meizhi1.laugh();
        meizhi1.talk();
        meizhi1.doThings();

        System.out.println("\n利用反射再构造个南方妹纸:");
        妹纸 meizhi2=create("designpattern.factoryMethod.南方妹纸");
        meizhi2.shape();
        meizhi2.cry();
        meizhi2.laugh();
        meizhi2.talk();
        meizhi2.doThings();
    }
    private static 妹纸 create(Class c){
         妹纸 meizhi=null;
        try {
            meizhi = (妹纸)Class.forName(c.getName()).newInstance();
        } catch (ClassNotFoundException ex) {
            System.out.println("找不到这个妹纸！！！");
        } catch (InstantiationException ex) {
            System.out.println("搞错了吧，这个妹纸无法实例化！");
        } catch (IllegalAccessException ex) {
            System.out.println("妹纸定义错误！！！");
        }
        return meizhi;
    }
    private static 妹纸 create(String name){
         妹纸 meizhi=null;
        try {
            meizhi = (妹纸)Class.forName(name).newInstance();
        } catch (ClassNotFoundException ex) {
            System.out.println("找不到这个妹纸！！！");
        } catch (InstantiationException ex) {
            System.out.println("搞错了吧，这个妹纸无法实例化！");
        } catch (IllegalAccessException ex) {
            System.out.println("妹纸定义错误！！！");
        }
        return meizhi;
    }
}
interface 妹纸 {

    public void laugh();

    public void cry();

    public void talk();

    public void shape();

    public void doThings();
}

class 南方妹纸 implements 妹纸 {

    @Override
    public void cry() {
        System.out.println("一边抹眼泪，一边低声地哭");
    }

    @Override
    public void laugh() {
        System.out.println("捂着脸偷笑");
    }

    @Override
    public void talk() {
        System.out.println("吴侬软语,，非常好听！");
    }

    @Override
    public void shape() {
        System.out.println("身材娇小，秀气，长相甜美，肤质很好");
    }

    @Override
    public void doThings() {
        System.out.println("做事认真，讲求周全和细腻");
    }
}

class 北方妹纸 implements 妹纸 {

    @Override
    public void cry() {
        System.out.println("狠狠地大哭一场");
    }

    @Override
    public void laugh() {
        System.out.println("哈哈大笑！");
    }

    @Override
    public void talk() {
        System.out.println("奔放、热情、粗粝、爽朗");
    }

    @Override
    public void shape() {
        System.out.println("身材性感，外表端庄");
    }

    @Override
    public void doThings() {
        System.out.println("处事风格干练，喜欢一步到位");
    }
}
interface IFactory{
    妹纸 Create();
}
class 南方妹纸工厂 implements IFactory{
    @Override
    public 妹纸 Create() {
        return new 南方妹纸();
    }
}
class 北方妹纸工厂 implements IFactory{
    @Override
    public 妹纸 Create() {
        return new 北方妹纸();
    }
}
