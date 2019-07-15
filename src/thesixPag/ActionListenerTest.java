package thesixPag;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ActionListenerTest {
    public static void listener(String text, int delay) {
        ActionListener listener = e -> {
            System.out.println(text);
            Toolkit.getDefaultToolkit().beep();
        };
        new Timer(delay, listener).start();
    }

    public static void main(String[] args) {
        listener("helloworld",1000);
    }
}
