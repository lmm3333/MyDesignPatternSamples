/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.facade;

import sun.util.BuddhistCalendar;

/**
 *
 * @author 编程是一门艺术
 */
public class Facade {

    图书馆 四工图书馆 = new 图书馆();
    教学楼 四工教学楼 = new 教学楼();
    吃饭 食堂 = new 吃饭();
    宿舍 三十一舍 = new 宿舍();
    电影院 工人电影院 = new 电影院();

    public void 周三晚上() {
        System.out.println("周三晚上:");
        四工图书馆.自习();
        食堂.吃夜宵();
        三十一舍.送女友回宿舍();
    }

    public void 周一早上() {
        System.out.println("周一早上:");
        食堂.吃早饭();
        四工图书馆.占座();
        四工教学楼.打开水();
        四工教学楼.上课();
        四工图书馆.自习();
        食堂.吃午餐();
    }

    public void 周末() {
        System.out.println("周末:");
        工人电影院.买爆米花();
        工人电影院.看电影();
        食堂.吃大餐();
        三十一舍.送女友回宿舍();
    }

    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.周一早上();
        facade.周三晚上();
        facade.周末();
    }
}