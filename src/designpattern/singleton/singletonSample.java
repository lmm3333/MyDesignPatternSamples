/*

 * and open the template in the editor.
 */
package designpattern.singleton;

/**
 *
 * @author lmm333
 */
public class singletonSample {


    public static void main(String[] args) {
//        Calendar calendar=Calendar.getInstance();
//        System.out.println(calendar.getTime());

        GirlFriend gf1=GirlFriend.getInstance();
        GirlFriend gf2=GirlFriend.getInstance();
        System.out.println(gf1==gf2);
    }
}
class GirlFriend{
//    private static GirlFriend instance;
    private static final GirlFriend instance=new GirlFriend();

    private  GirlFriend() {//构造函数改成private，不允许直接调用
    }

    public static GirlFriend getInstance(){
//        if(instance==null){
//            instance=new GirlFriend();
//        }
        return instance;
    }
}
