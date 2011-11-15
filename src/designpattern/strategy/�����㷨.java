/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.strategy;

interface 把妹算法 {

    void 把妹();
}

class 巴甫洛夫把妹法 implements 把妹算法 {

    @Override
    public void 把妹() {
        System.out.println("每天给你那位心仪的女同事/女同学的抽屉里都放上精心准备的早餐，并且保持缄默不语，无论她如何询问，都不要说话。");
    }
}

class 薛定谔把妹法 implements 把妹算法 {

    @Override
    public void 把妹() {
        System.out.println("每天早上，你拿出一个硬币抛掷，让伟大的随机性来决定今天是否给妹子送早餐。");
    }
}

class 华生把妹法 implements 把妹算法 {

    @Override
    public void 把妹() {
        System.out.println("取一定的样本量，在一批女同事/女同学抽屉里都放上精心准备的早餐，并且保持缄默不语，无论她如何询问，都不要说话。（S） 另取同样样本量的女同事/女同学作对照组，两组都安装摄像头和外部体温计观察。 在一定时间后，早餐的行为形成之后再从原来的组中挑选一半施以午餐反馈行为，对照组将自动离开，而目标组将继续情绪条件反射的习得。（R） ");
    }
}

class 帕金森把妹法 implements 把妹算法 {

    @Override
    public void 把妹() {
        System.out.println("你那位心仪的女同事/女同学的抽屉里都放上精心准备的早餐28份，没错也就是四周且包含休息日的量，并且保持缄默不语，无论她如何询问，都不要说话。");
    }
}

class 弱爆了把妹法 implements 把妹算法 {

    @Override
    public void 把妹() {
        System.out.println("我弱爆了，这么多把妹算法都看不懂，还是不会把妹！");
    }
}