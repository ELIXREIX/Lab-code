package oopweek1;

import javax.swing.JOptionPane; 

public class dialog { 
    public static void main(String[] args) { 

        //JOptionPane.showMessageDialog(null, "Welcome\nto\nJava"); 

        String name = JOptionPane.showInputDialog("โปรดใส่ชื่อของคุณ"); 

        String message = String.format("Welcome %s to Java Programming ", name); 

        JOptionPane.showMessageDialog(null, message); 

    } 

} 