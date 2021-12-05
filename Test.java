 package test;
 
//heyyyyyyy
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
 
public class Test {
    JFrame frame;
    JPanel one, two;
     
    Test(){
        frame = new JFrame();
         
        one = new JPanel();
         
        JLabel l1 = new JLabel("one");
        JButton b1 = new JButton("hop to two");
        b1.addActionListener( new ActionListener() {
             
            @Override
            public void actionPerformed(ActionEvent arg0) {
                frame.setContentPane(two);
                two.revalidate();
            }
        });
        one.add(l1);
        one.add(b1);
         
        two = new JPanel();
         
        JLabel l2 = new JLabel("two");
        JButton b2 = new JButton("hop to one");
        b2.addActionListener( new ActionListener() {
             
            @Override
            public void actionPerformed(ActionEvent arg0) {
                frame.setContentPane(one);
                one.revalidate();
            }
        });
        two.add(l2);
        two.add(b2);
                 
        frame.setContentPane(one);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
         
         
         
    }
     
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new Test();
            }
        });
 
    }
}
