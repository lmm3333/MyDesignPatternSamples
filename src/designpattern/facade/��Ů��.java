package designpattern.facade;

/**
 *
 * @author lmm333
 */
class 吃饭 {

    public void 吃早饭() {
        System.out.println("吃早饭");
    }

    public void 吃午餐() {
        System.out.println("吃午餐");
    }

    public void 吃晚饭() {
        System.out.println("吃晚饭");
    }

    public void 吃夜宵() {
        System.out.println("吃夜宵");
    }

    public void 吃大餐() {
        System.out.println("吃大餐");
    }
}

class 教学楼 {

    public void 上课() {
        System.out.println("上课");
    }

    public void 打开水() {
        System.out.println("打开水");
    }
}

class 宿舍 {

    public void 送女友回宿舍() {
        System.out.println("送女友回宿舍");
    }
}

class 图书馆 {

    public void 占座() {
        System.out.println("占座");
    }
    public void 自习() {
        System.out.println("一起自习");
    }

    public void 借书() {
        System.out.println("借书");
    }
}
class 电影院{
    public void 看电影(){
        System.out.println("看电影");
    }
    public void 买爆米花(){
        System.out.println("买爆米花");
    }
}
