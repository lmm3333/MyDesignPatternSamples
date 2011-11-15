/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.template;

/**
 *
 * @author 编程是一门艺术
 */
public class templateSample {

    public static void main(String[] args) {
        妹纸 meizhi = create("designpattern.template.南方妹纸");
        meizhi.show();
    }

    private static 妹纸 create(String name) {
        妹纸 meizhi = null;
        try {
            meizhi = (妹纸) Class.forName(name).newInstance();
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

abstract class 妹纸 {

    public abstract void laugh();

    public abstract void cry();

    public abstract void talk();

    public abstract void shape();

    public abstract void doThings();

    public void show() {
        cry();
        laugh();
        talk();
        shape();
        doThings();
    }
}

class 南方妹纸 extends 妹纸 {

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

class 北方妹纸 extends 妹纸 {

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