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
public class Signup3 extends JFrame implements ActionListener {

  JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
  JCheckBox c2,c3,c4,c5,c6,c7,c1;
  JRadioButton r1,r2,r3,r4;
  JButton b1,b2;
  JTextField t1;
  
  Signup3(){
      
        setFont(new Font("System", Font.BOLD, 22));
          Font f = getFont();
          FontMetrics fm = getFontMetrics(f);
          int x = fm.stringWidth("NEW ACCOUNT APPLICATION FORM - Page:3");
          int y = fm.stringWidth(" ");
          int z = getWidth()-x;
          int w = z/y;
          String pad ="";
          pad = String.format("%"+w+"s", pad);
          setTitle(pad+"NEW ACCOUNT APPLICATION FORM - Page:3");
          
          
          l1 =new JLabel("Page:3  Additional Details");
          l1.setFont(new Font ("Raleway", Font.BOLD, 22));
          
          
          l2 =new JLabel("Account Type:");
          l2.setFont(new Font ("Raleway", Font.BOLD, 18));
           
          l3 =new JLabel("Card Number:");
          l3.setFont(new Font ("Raleway", Font.BOLD, 18));
          
          l4 =new JLabel("XXX-XXX-XXX-4184");
          l4.setFont(new Font ("Raleway", Font.BOLD, 18));
          
          l5 =new JLabel("Your 16-digit Card Number");
          l5.setFont(new Font ("Raleway", Font.BOLD, 12));
          
          l6 =new JLabel("It would appear on ATM Card/Cheque Book and Statement");
          l6.setFont(new Font ("Raleway", Font.BOLD, 12));
          
          l7 =new JLabel("PIN:");
          l7.setFont(new Font ("Raleway", Font.BOLD, 18));
          
          l8 =new JLabel("XXX");
          l8.setFont(new Font ("Raleway", Font.BOLD, 18));
          
          l10 =new JLabel("Service Required:");
          l10.setFont(new Font ("Raleway", Font.BOLD, 18));
          
          l9 =new JLabel("4-digit Password");
          l9.setFont(new Font ("Raleway", Font.BOLD, 12));
          
          l11  =new JLabel("Form No:");
          l11.setFont(new Font ("Raleway", Font.BOLD, 14));
          
          b1 = new JButton("Submit");
          b1.setFont(new Font("Raleway", Font.BOLD,14));
          b1.setBackground(Color.black);
          b1.setForeground(Color.white);
          
          b2 = new JButton("Cancle");
          b2.setFont(new Font("Raleway", Font.BOLD,14));
          b2.setBackground(Color.black);
          b2.setForeground(Color.white);
      
       
          c1 = new JCheckBox("ATM Card");
          c1.setBackground(Color.white);
          c1.setFont(new Font("Raleway",Font.BOLD,16));
           
          c2 = new JCheckBox("Internet Banking");
          c2.setBackground(Color.white);
          c2.setFont(new Font("Raleway",Font.BOLD,16));
          
          c3 = new JCheckBox("Mobile Banking");
          c3.setBackground(Color.white);
          c3.setFont(new Font("Raleway",Font.BOLD,16));
          
          c4 = new JCheckBox("Email Alerts");
          c4.setBackground(Color.white);
          c4.setFont(new Font("Raleway",Font.BOLD,16));
          
          c5 = new JCheckBox("Cheque Book");
          c5.setBackground(Color.white);
          c5.setFont(new Font("Raleway",Font.BOLD,16));
          
          c6 = new JCheckBox("E-Statement");
          c6.setBackground(Color.white);
          c6.setFont(new Font("Raleway",Font.BOLD,16));
          
          c7 = new JCheckBox("I hereby declares that the above entered correct to the best of my knowledge",true);
          c7.setBackground(Color.white);
          c7.setFont(new Font("Raleway",Font.BOLD,12));
          
          r1 = new JRadioButton("Saving Account");
          r1.setFont(new Font("Raleway",Font.BOLD,16));
          r1.setBackground(Color.white);
          
          
          r2 = new JRadioButton("fixed Deposite Account");
          r2.setFont(new Font("Raleway",Font.BOLD,16));
          r2.setBackground(Color.white);
       
          
          r3 = new JRadioButton("Current Account");
          r3.setFont(new Font("Raleway",Font.BOLD,16));
          r3.setBackground(Color.white);
      
          
          r4 = new JRadioButton("Recurring Deposit Account");
          r4.setFont(new Font("Raleway",Font.BOLD,16));
          r4.setBackground(Color.white);
        
          t1 =new JTextField();
          t1.setFont(new Font ("Raleway", Font.BOLD, 12));
          
          
          setLayout(null);
          
          l11.setBounds(700,10,70,30);
          add(l11);
          
          t1.setBounds(770,10,40,30);
          add(t1);
          
          l1.setBounds(280,50,400,40);
          add(l1);
      
          l2.setBounds(100,140,200,30);
          add(l2);
          
          r1.setBounds(100,180,150,30);
          add(r1);
          
          r2.setBounds(350,180,300,30);
          add(r2);
          
          r3.setBounds(100,220,250,30);
          add(r3);
          
          r4.setBounds(350,220,250,30);
          add(r4);
          
          l3.setBounds(100,300,200,30);
          add(l3);
          
          l4.setBounds(330,300,250,30);
          add(l4);
          
          l5.setBounds(100,330,200,20);
          add(l5);
          
          l6.setBounds(330,330,500,20);
          add(l6);
          
          l7.setBounds(100,370,200,30);
          add(l7);
          
          l8.setBounds(330,370,200,30);
          add(l8);
          
          l9.setBounds(100,400,200,20);
          add(l9);
          
          l10.setBounds(100,450,200,30);
          add(l10);
          
          c1.setBounds(100,500,200,30);
          add(c1);
          
          c2.setBounds(350,500,200,30);
          add(c2);
          
          c3.setBounds(100,550,200,30);
          add(c3);
          
          c4.setBounds(350,550,200,30);
          add(c4);
          
          c5.setBounds(100,600,200,30);
          add(c5);
          
          c6.setBounds(350,600,200,30);
          add(c6);
          
          c7.setBounds(300,720,100,30);
          add(c7);
          
          b2.setBounds(420,720,100,30);
          add(b2);
          
          getContentPane().setBackground(Color.white);
          
          setSize(850,850);
          setLocation(500,90);
          setVisible(true);
          
          b2.addActionListener(this);
          b2.addActionListener(this);
          
    
  }


public void actionPerformed(ActionEvent ae){
    String a = null;
    if(r1.isSelected()){
        a = "Saving Accout";
    }else if(r2.isSelected()){
        a = "Fixed Deposit Account";
    }
    else if(r3.isSelected()){
        a = "Current Account";
    }
    else if(r4.isSelected()){
        a ="Rceurring Deposit Account";
    }
    Random ran = new Random();
    long first7 = (ran.nextLong()%900000000L) + 5040936000000000L;
    long first8 = Math.abs(first7);
    
    long first3 = (ran.nextLong()%9000L) + 1000L;
    long first4 = Math.abs(first3);
    
    String b = "";
    if(c1.isSelected()){
        b = b+" ATM Card";
    }
    if(c2.isSelected()){
        b = b+" Internet Banking";
    }
    if(c3.isSelected()){
        b = b+" Mobile Banking";
    }
    if(c4.isSelected()){
        b = b+" Email Alerts";
    }
    if(c5.isSelected()){
        b = b+" Cheque Book";
    }
    if(c6.isSelected()){
        b = b+" E-Statement";
    }
    
    String c = t1.getText();
    
    try{
         
        if(ae.getSource()==b1){
            if(b.equals("")){
                JOptionPane.showMessageDialog(null,"Fill The Required Field");
            }
            else{
                connect c1 = new connect();
                String q1 = "insert into signup3 value('"+a+"','"+first8+"','"+first4+"','"+b+"','"+c+"')";
                String q2 = "insert into login values('"+first8+"','"+first4+"')";
                c1.s.executeUpdate(q1);
                c1.s.executeUpdate(q2);
                JOptionPane.showMessageDialog(null, "Card Number: "+first8+"\nPin:"+first4);
                new Deposit().setVisible(true);
                setVisible(false);
            }
        }else if(ae.getSource()==b2){
            System.exit(0);
        }    
    }catch(Exception ex){
       ex.printStackTrace();
    }
    
}
public static void main(String [] args){
    new Signup3().setVisible(true);
}



  
}
    

