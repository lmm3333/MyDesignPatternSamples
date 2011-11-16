package designpattern.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

/**
 * @author lmm333
 */
public class iteratorSample {

    public static void showNums(List<Integer> list) {
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println("END");
    }

    public static void showNums2(List<Integer> list) {
        ListIterator<Integer> iterator = list.listIterator(list.size());
        while (iterator.hasPrevious()) {
            System.out.print(iterator.previous() + " ");
        }
        System.out.println("END");
    }

    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < 50; ++i) {
            list.add(random.nextInt(1000));
        }
        showNums(list);
        showNums2(list);
//        Integer[] nums = list.toArray(new Integer[0]);
//        Arrays.sort(nums);
//        for(int i=0;i<nums.length;++i){
//            System.out.print(nums[i]+" ");
//        }
    }
}
