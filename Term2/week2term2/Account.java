package Term2.week2term2;

import javax.swing.JOptionPane;

public class Account {
    public static void main (String [] args) { 

        Accounta me = new Accounta(100); //เงิน 100 

        me.deposit(300); // เงิน 100+300 = 400 

        System.out.println(me.getBalance());  

        me.withdraw(500); // เกินวงเงิน 

        System.out.println(me.getBalance());    } 

} 
    

class Accounta { 

/// ทำเพิ่มเติมเพื่อเก็บข้อมูล 

private double balance; 

     public Accounta(double initialBalance) { 

         if (initialBalance > 0.0) balance=initialBalance; 

     } 

     public void deposit(double amount){ /// การเพิ่มเงินเข้าบัญชี 

         balance=balance+amount; 

     } 

     public void withdraw(double amount){ /// การถอนเงินออกบัญชี 
        if (balance >= amount) {
         balance=balance-amount;
        } else {

        String message = String.format("ยอดเงินของท่านไม่พอในวงเงิน"); 

        JOptionPane.showMessageDialog(null, message);
        } 

     } 

     public double getBalance(){ /// ดูยอดเงินในบัญชี 

         return balance; 

     }
    
    }
     