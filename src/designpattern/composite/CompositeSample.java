package designpattern.composite;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 * @author lmm333
 */
public class CompositeSample {

    public static void main(String[] args) {
        JFrame frame = new JFrame("测试");

        JMenu jMenu1 = new JMenu("1");
        JMenu jMenu2 = new JMenu("2");
        JMenu jMenu3 = new JMenu("3");

        JMenuItem jMenuItem1 = new JMenuItem("1-1");
        jMenu1.add(jMenuItem1);

        JMenuItem jMenuItem2 = new JMenuItem("2-1");
        jMenu2.add(jMenuItem2);

        JMenuItem jMenuItem3 = new JMenuItem("3-1");
        jMenu3.add(jMenuItem3);

        JMenuBar jMenuBar = new JMenuBar();
        frame.setJMenuBar(jMenuBar);

        jMenuBar.add(jMenu1);
        jMenuBar.add(jMenu2);
        jMenuBar.add(jMenu3);

        JMenu jMenu0 = new JMenu("0");
        jMenu1.add(jMenu0);
        jMenu0.add(new JMenuItem("0-1"));

        frame.setSize(200, 200);
        frame.setVisible(true);

    }
}
