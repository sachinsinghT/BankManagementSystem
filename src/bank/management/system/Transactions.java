package bank.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Transactions extends JFrame implements ActionListener {

    JLabel l1;
    JButton b1, b2, b3, b4, b5, b6, b7;
    String pin;

    public Transactions(String pin) {
        this.pin = pin;

        setLayout(null);

        // ===== Load Image (960x1080) =====
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image img = i1.getImage().getScaledInstance(800, 700, Image.SCALE_SMOOTH);
        ImageIcon i3 = new ImageIcon(img);

        JLabel l2 = new JLabel(i3);
        l2.setBounds(0, 0, 800, 700);
        add(l2);

        // ===== Heading =====
        l1 = new JLabel("Please Select Your Transaction");
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("System", Font.BOLD, 16));
        l1.setBounds(150, 220, 700, 35);
        l2.add(l1);

        // ===== Buttons =====
        b1 = new JButton("DEPOSIT");
        b2 = new JButton("CASH WITHDRAWL");
        b3 = new JButton("FAST CASH");
        b4 = new JButton("MINI STATEMENT");
        b5 = new JButton("PIN CHANGE");
        b6 = new JButton("BALANCE ENQUIRY");
        b7 = new JButton("EXIT");

        // Position like real ATM options
        b1.setBounds(140, 320, 150, 20);
        b2.setBounds(305, 320, 152, 20);
        b3.setBounds(140, 350, 150, 20);
        b4.setBounds(305, 350, 152, 20);
        b5.setBounds(140, 380, 150, 20);
        b6.setBounds(305, 380, 152, 20);
        b7.setBounds(305, 405, 152, 20);

        l2.add(b1);
        l2.add(b2);
        l2.add(b3);
        l2.add(b4);
        l2.add(b5);
        l2.add(b6);
        l2.add(b7);

        // ===== Action Listeners =====
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);

        // ===== Frame Settings =====
        setSize(900, 900);
//        setLocationRelativeTo(null);  // Center on screen
        setUndecorated(true);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == b1) {
            setVisible(false);
             new Deposit(pin).setVisible(true);

        } else if (ae.getSource() == b2) {
            setVisible(false);
             new Withdrawl(pin).setVisible(true);

        } else if (ae.getSource() == b3) {
            setVisible(false);
             new FastCash(pin).setVisible(true);

        } else if (ae.getSource() == b4) {
             new MiniStatement(pin).setVisible(true);

        } else if (ae.getSource() == b5) {
            setVisible(false);
             new Pin(pin).setVisible(true);

        } else if (ae.getSource() == b6) {
            setVisible(false);
             new BalanceEnquiry(pin).setVisible(true);

        } else if (ae.getSource() == b7) {
            System.exit(0);
        }
    }

   
}
