package thesixPag;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

/**
 * @author 六诗人
 * @title: TimerTest
 * @projectName newDemoGit
 * @description: TODO
 * @date 2019/6/12下午 2:18
 */
@SuppressWarnings("all")
public class TimerTest {
    public static void main(String[] args) {
        try {
            ActionListener actionListener = new TimePrinter();
            Timer t = new Timer(1000, actionListener);
            t.start();
            JOptionPane.showMessageDialog(null, "Quit program?");
            System.exit(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class TimePrinter implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("At the tone,the time is" + new Date());
        Toolkit.getDefaultToolkit().beep();
    }
}