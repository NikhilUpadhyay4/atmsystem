/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asimulatorsystem;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;
/**
 *
 * @author Nikhil
 */
public class FastCash extends JFrame implements ActionListener {
     JButton b1,b2,b3,b4,b5,b6,b7,b8;
    JLabel l1,l2;
    JTextField t1;
    FastCash(){
         setFont(new Font("System", Font.BOLD, 22));
          Font f = getFont();
          FontMetrics fm = getFontMetrics(f);
          int x = fm.stringWidth("FAST CASH");
          int y = fm.stringWidth(" ");
          int z = getWidth()-(4*x);
          int w = z/y;
          String pad ="";
          pad = String.format("%"+w+"s", pad);
          setTitle(pad+"FAST CASH");
        
          l1 =new JLabel("SELECT WITHDRAWL AMOUNT");
          l1.setFont(new Font ("System", Font.BOLD, 13));
          
          l2 =new JLabel("Enter PIN");
          l2.setFont(new Font ("System", Font.BOLD, 13));
              
          t1 =new JTextField();
          t1.setFont(new Font ("Raleway", Font.BOLD, 13));
           
          b1 = new JButton("Rs 100");
          b1.setFont(new Font("System", Font.BOLD,18));
          b1.setBackground(Color.black);
          b1.setForeground(Color.white);
          
          b2 = new JButton("Rs 500");
          b2.setFont(new Font("System", Font.BOLD,18));
          b2.setBackground(Color.black);
          b2.setForeground(Color.white);
          
          b3 = new JButton("Rs 1000");
          b3.setFont(new Font("System", Font.BOLD,18));
          b3.setBackground(Color.black);
          b3.setForeground(Color.white);
          
          b4 = new JButton("Rs 2000");
          b4.setFont(new Font("System", Font.BOLD,18));
          b4.setBackground(Color.black);
          b4.setForeground(Color.white);
          
          b5 = new JButton("Rs 5000");
          b5.setFont(new Font("System", Font.BOLD,18));
          b5.setBackground(Color.black);
          b5.setForeground(Color.white);
          
          b6 = new JButton("Rs 10000");
          b6.setFont(new Font("System", Font.BOLD,18));
          b6.setBackground(Color.black);
          b6.setForeground(Color.white);
          
          
          b7 = new JButton("BACK");
          b7.setFont(new Font("System", Font.BOLD,18));
          b7.setBackground(Color.black);
          b7.setForeground(Color.white);
          
         
          setLayout(null);
          
          l2.setBounds(640,10,60,40);
          add(l2);
          
          t1.setBounds(710,10,60,40);
          add(t1);
          
          l1.setBounds(100,100,700,40);
          add(l1);
          
          b1.setBounds(40,250,300,60);
          add(b1);
          
          b2.setBounds(440,250,300,60);
          add(b2);
          
          b3.setBounds(40,360,300,60);
          add(b3);
          
          b4.setBounds(440,360,300,60);
          add(b4);
          
          b5.setBounds(40,470,300,60);
          add(b5);
          
          b6.setBounds(440,470,300,60);
          add(b6);

          b7.setBounds(240,600,300,60);
          add(b7);
          
          
          b1.addActionListener(this);
          b2.addActionListener(this);
          b3.addActionListener(this);
          b4.addActionListener(this);
          b5.addActionListener(this);
          b6.addActionListener(this);
          b7.addActionListener(this);
                    
          
         getContentPane().setBackground(Color.white); 
          
          setSize(800,800);
          setLocation(550,90);
          setVisible(true);
          
      
    }
     public void actionPerformed(ActionEvent ae){
        
        try{
            String a = t1.getText();
            double balance =0;
            
            if(ae.getSource()==b1){
                connect c1 = new connect();
                ResultSet rs = c1.s.executeQuery(" select * from bank where pin = '"+a+"'");
                if(rs.next()){
                   String pin = rs.getString("pin");
                   
                   balance = rs.getDouble("balance");
                   balance-=100;
                   String q1 = "insert into bank value('"+pin+"',null,100,'"+balance+"')";
                   c1.s.executeUpdate(q1);
               }
                JOptionPane.showMessageDialog(null,"Rs. "+100+" Debited Successfully");
                 new Transcations().setVisible(true);
                           setVisible(false);

            }else if(ae.getSource()==b2){
                connect c1 = new connect();
                ResultSet rs = c1.s.executeQuery(" select * from bank where pin = '"+a+"'");
                if(rs.next()){
                   String pin = rs.getString("pin");
                   
                   balance = rs.getDouble("balance");
                   balance-=500;
                   String q1 = "insert into bank value('"+pin+"',null,500,'"+balance+"')";
                   c1.s.executeUpdate(q1);
               }
                JOptionPane.showMessageDialog(null,"Rs. "+500+" Debited Successfully");
                 new Transcations().setVisible(true);
                           setVisible(false);

            }else if(ae.getSource()==b3){
                connect c1 = new connect();
                ResultSet rs = c1.s.executeQuery(" select * from bank where pin = '"+a+"'");
                if(rs.next()){
                   String pin = rs.getString("pin");
                   
                   balance = rs.getDouble("balance");
                   balance-=1000;
                   String q1 = "insert into bank value('"+pin+"',null,1000,'"+balance+"')";
                   c1.s.executeUpdate(q1);
               }
                JOptionPane.showMessageDialog(null,"Rs. "+1000+" Debited Successfully");
                 new Transcations().setVisible(true);
                           setVisible(false);

            }else if(ae.getSource()==b4){
                connect c1 = new connect();
                ResultSet rs = c1.s.executeQuery(" select * from bank where pin = '"+a+"'");
                if(rs.next()){
                   String pin = rs.getString("pin");
                   
                   balance = rs.getDouble("balance");
                   balance-=2000;
                   String q1 = "insert into bank value('"+pin+"',null,2000,'"+balance+"')";
                   c1.s.executeUpdate(q1);
               }
                JOptionPane.showMessageDialog(null,"Rs. "+2000+" Debited Successfully");
                 new Transcations().setVisible(true);
                           setVisible(false);

            }else if(ae.getSource()==b5){
                connect c1 = new connect();
                ResultSet rs = c1.s.executeQuery(" select * from bank where pin = '"+a+"'");
                if(rs.next()){
                   String pin = rs.getString("pin");
                   
                   balance = rs.getDouble("balance");
                   balance-=5000;
                   String q1 = "insert into bank value('"+pin+"',null,5000,'"+balance+"')";
                   c1.s.executeUpdate(q1);
               }
                JOptionPane.showMessageDialog(null,"Rs. "+5000+" Debited Successfully");
                 new Transcations().setVisible(true);
                           setVisible(false);

            }else if(ae.getSource()==b6){
                connect c1 = new connect();
                ResultSet rs = c1.s.executeQuery(" select * from bank where pin = '"+a+"'");
                if(rs.next()){
                   String pin = rs.getString("pin");
                   
                   balance = rs.getDouble("balance");
                   balance-=1000;
                   String q1 = "insert into bank value('"+pin+"',null,10000,'"+balance+"')";
                   c1.s.executeUpdate(q1);
               }
                JOptionPane.showMessageDialog(null,"Rs. "+10000+" Debited Successfully");
                 new Transcations().setVisible(true);
                           setVisible(false);

            }else if(ae.getSource()==b7){
                System.exit(0);
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
     }
      public static void main(String[]args){
        new FastCash().setVisible(true);
    }
    
}
