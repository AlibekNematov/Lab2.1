package com.company;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleGUI extends JFrame {
    private int a = 0;
    private int b = 0;

    private JButton button1 = new JButton("End game");
    private JButton button2 = new JButton ("AC Milan");
    private JButton button3 = new JButton ("Real Madrid");
    private JLabel label1 = new JLabel("Result: 0x0");
    private JLabel label2 = new JLabel("Last Scorer: N/A ");
    private JLabel label3 = new JLabel("Winner: DRAW");

    public SimpleGUI() {
        super ("Football match");
        setSize (400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout (3, 2, 2, 2));
        container.add(label1);
        container.add(label2);
        container.add(label3);

        ButtonGroup group = new ButtonGroup();

        addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {}

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {}

            @Override
            public void mouseExited(MouseEvent e) {}
        });
    }
}
