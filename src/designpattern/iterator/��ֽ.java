/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/**
 *
 * @author 编程是一门艺术
 */
public class 妹纸 {

    String name;
    int age;

    public 妹纸(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "有一个名叫" + name + "的妹纸, 芳龄=" + age  ;
    }

    public static void main(String[] args) {
        集合接口<妹纸> 妹纸们 = new 集合<妹纸>();
        妹纸们.add(new 妹纸("小红",18));
        妹纸们.add(new 妹纸("小黄",19));
        妹纸们.add(new 妹纸("小自",20));
        妹纸们.add(new 妹纸("小白",21));
        妹纸们.add(new 妹纸("小橙",22));
        Iterator<妹纸> iterator = 妹纸们.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}


interface 集合接口<E> {//定义一个集合接口

    public void add(E e);

    public Iterator<E> iterator();

    public int size();

    public E get(int index);
}

class 集合<E> implements 集合接口<E> {//具体集合用arraylist实现

    private List<E> items = new ArrayList<E>();

    @Override
    public Iterator<E> iterator() {
        return new myIterator<E>(this);
    }

    @Override
    public int size() {
        return items.size();
    }

    @Override
    public E get(int index) {
        return items.get(index);
    }

    @Override
    public void add(E e) {
        items.add(e);
    }
}

class myIterator<E> implements Iterator<E> {//定义自己的迭代器，实现Iterator接口的功能

    private int cursor = 0;//迭代器内部用游标cursor标注位置
    private 集合接口<E> juji;

    public myIterator(集合接口<E> juji) {
        cursor = 0;
        this.juji = juji;
    }

    @Override
    public boolean hasNext() {
        return cursor < juji.size();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public E next() {
        return juji.get(cursor++);
    }
}
