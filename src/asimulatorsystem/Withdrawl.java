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
public class Withdrawl extends JFrame implements ActionListener {
     JTextField t1,t2;
    JButton b1,b2,b3;
    JLabel l1,l2,l3,l4;
    
    Withdrawl(){
         setFont(new Font("System", Font.BOLD, 22));
          Font f = getFont();
          FontMetrics fm = getFontMetrics(f);
          int x = fm.stringWidth("WITHDRAWAL");
          int y = fm.stringWidth(" ");
          int z = getWidth()-(5*x);
          int w = z/y;
          String pad ="";
          pad = String.format("%"+w+"s", pad);
          setTitle(pad+"WITHDRAWAL");
          
          
          l1 =new JLabel("MAXIMUM DAILY WITHDRAWAL");
          l1.setFont(new Font ("System", Font.BOLD, 40));
          
          l2 =new JLabel("IS RS 10,000");
          l2.setFont(new Font ("System", Font.BOLD, 40));
          
          l3 =new JLabel("PLEASE ENTER YOUR AMOUNT");
          l3.setFont(new Font ("System", Font.BOLD, 35));
          
          l4 =new JLabel("ENTER PIN");
          l4.setFont(new Font ("System", Font.BOLD, 14));
          
          
          t1 =new JTextField();
          t1.setFont(new Font ("Raleway", Font.BOLD, 22));
          
          t2 =new JTextField();
          t2.setFont(new Font ("Raleway", Font.BOLD, 14));
           
          b1 = new JButton("WITHDRAWAL");
          b1.setFont(new Font("System", Font.BOLD,18));
          b1.setBackground(Color.black);
          b1.setForeground(Color.white);
          
          b2 = new JButton("BACK");
          b2.setFont(new Font("System", Font.BOLD,18));
          b2.setBackground(Color.black);
          b2.setForeground(Color.white);
          
          b3 = new JButton("EXIT");
          b3.setFont(new Font("System", Font.BOLD,18));
          b3.setBackground(Color.black);
          b3.setForeground(Color.white);
          
          setLayout(null);
          
          l3.setBounds(620,10,80,30);
          add(l3);
          
          t2.setBounds(700,10,40,30);
          add(t2);
          
          l1.setBounds(150,150,800,60);
          add(l1);
          
          l2.setBounds(290,210,800,60);
          add(l2);
          
          t1.setBounds(250,300,300,50);
          add(t1);
          
          b1.setBounds(260,380,125,50);
          add(b1);
          
          b2.setBounds(415,380,125,50);
          add(b2);
          
          b3.setBounds(300,550,200,50);
          add(b3);
          
          b1.addActionListener(this);
          b2.addActionListener(this);
          b3.addActionListener(this);
          
          
          getContentPane().setBackground(Color.white);
          
          setSize(800,800);
          setLocation(500,90);
          setVisible(true);
          
          
    }
    public void actionPerformed(ActionEvent ae){
        
        try{
            String a = t1.getText();
            String b = t2.getText();
            
            if(ae.getSource()==b1){
                if(t1.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Please enter the Amount to you want to withdrawl");
                }else{
                    connect c1 = new connect();
                    ResultSet rs = c1.s.executeQuery("select * from bank where pin = '"+b+"'");
                   double balance =0; 
                           if(rs.next()){
                               String pin = rs.getString("pin");
                               balance = rs.getDouble("balance");
                               double d=Double.parseDouble(a);
                               
                               balance-=d;
                               String q1 =  "inert into bank values('"+pin+"','"+d+"',null,'"+balance+"')";
                               c1.s.executeUpdate(q1);
                           }
                           
                           JOptionPane.showMessageDialog(null,"Rs. "+a+" Withdrawl Successfully");
                           
                           new Transcations().setVisible(true);
                           setVisible(false);
                
                }
            }else if(ae.getSource()==b2){
                new Transcations().setVisible(true);
                setVisible(false);
            }else if(ae.getSource()==b3){
                System.exit(0);
                
            }
            
            
        }catch(Exception ex){
            ex.printStackTrace();
            System.out.print("error:"+ex);
        }
        
        
    }
    
    public static void main(String[]args){
        new Deposit().setVisible(true);
    }
}


