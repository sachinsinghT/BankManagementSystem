package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class SignUpOne extends JFrame implements ActionListener {

    public long random;
    JTextField nameTextField, fnameTextField, emailTextField, addressTextField, cityTextField, stateTextField, pinTextField;
    JButton next;
    JRadioButton male, female, other, married, unmarried;
    JDateChooser dateChooser;

    JPanel panel; // MAIN PANEL FOR SCROLLING

    SignUpOne() {

        setTitle("ACCOUNT APPLICATION FORM - PAGE 1");

        panel = new JPanel();
        panel.setLayout(null);
        panel.setPreferredSize(new Dimension(850, 900));  // IMPORTANT FOR SCROLL
        panel.setBackground(Color.WHITE);

        // ---------- RANDOM FORM NUMBER ----------
        Random ran = new Random();
        random = Math.abs(ran.nextLong() % 9000L) + 1000L;
        JLabel formno = new JLabel("APPLICATION FORM NO. " + random);
        formno.setBounds(140, 20, 600, 40);
        formno.setFont(new Font("Raleway", Font.BOLD, 38));
        panel.add(formno);

        JLabel personalDetails = new JLabel("Page 1: Personal Details");
        personalDetails.setBounds(290, 60, 400, 30);
        personalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        panel.add(personalDetails);

        JLabel name = new JLabel("Name:");
        name.setBounds(100, 140, 200, 30);
        name.setFont(new Font("Raleway", Font.BOLD, 20));
        panel.add(name);

        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        nameTextField.setBounds(300, 140, 400, 30);
        panel.add(nameTextField);

        JLabel fname = new JLabel("Father's Name:");
        fname.setBounds(100, 190, 200, 30);
        fname.setFont(new Font("Raleway", Font.BOLD, 20));
        panel.add(fname);

        fnameTextField = new JTextField();
        fnameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        fnameTextField.setBounds(300, 190, 400, 30);
        panel.add(fnameTextField);

        JLabel dob = new JLabel("Date of Birth:");
        dob.setBounds(100, 240, 200, 30);
        dob.setFont(new Font("Raleway", Font.BOLD, 20));
        panel.add(dob);

        dateChooser = new JDateChooser();
        dateChooser.setBounds(300, 240, 400, 30);
        dateChooser.setForeground(new Color(105, 105, 105));
        panel.add(dateChooser);

        JLabel gender = new JLabel("Gender:");
        gender.setBounds(100, 290, 200, 30);
        gender.setFont(new Font("Raleway", Font.BOLD, 20));
        panel.add(gender);

        male = new JRadioButton("Male");
        male.setBounds(300, 290, 120, 30);
        male.setBackground(Color.WHITE);
        panel.add(male);

        female = new JRadioButton("Female");
        female.setBounds(450, 290, 120, 30);
        female.setBackground(Color.WHITE);
        panel.add(female);

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);

        JLabel email = new JLabel("Email Address:");
        email.setBounds(100, 340, 200, 30);
        email.setFont(new Font("Raleway", Font.BOLD, 20));
        panel.add(email);

        emailTextField = new JTextField();
        emailTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        emailTextField.setBounds(300, 340, 400, 30);
        panel.add(emailTextField);

        JLabel marital = new JLabel("Marital Status:");
        marital.setBounds(100, 390, 200, 30);
        marital.setFont(new Font("Raleway", Font.BOLD, 20));
        panel.add(marital);

        married = new JRadioButton("Married");
        married.setBounds(300, 390, 100, 30);
        married.setBackground(Color.WHITE);
        panel.add(married);

        unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(450, 390, 100, 30);
        unmarried.setBackground(Color.WHITE);
        panel.add(unmarried);

        other = new JRadioButton("Other");
        other.setBounds(630, 390, 100, 30);
        other.setBackground(Color.WHITE);
        panel.add(other);

        ButtonGroup maritalGroup = new ButtonGroup();
        maritalGroup.add(married);
        maritalGroup.add(unmarried);
        maritalGroup.add(other);

        JLabel address = new JLabel("Address:");
        address.setBounds(100, 440, 200, 30);
        address.setFont(new Font("Raleway", Font.BOLD, 20));
        panel.add(address);

        addressTextField = new JTextField();
        addressTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        addressTextField.setBounds(300, 440, 400, 30);
        panel.add(addressTextField);

        JLabel city = new JLabel("City:");
        city.setBounds(100, 490, 200, 30);
        city.setFont(new Font("Raleway", Font.BOLD, 20));
        panel.add(city);

        cityTextField = new JTextField();
        cityTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        cityTextField.setBounds(300, 490, 400, 30);
        panel.add(cityTextField);

        JLabel state = new JLabel("State:");
        state.setBounds(100, 540, 200, 30);
        state.setFont(new Font("Raleway", Font.BOLD, 20));
        panel.add(state);

        stateTextField = new JTextField();
        stateTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        stateTextField.setBounds(300, 540, 400, 30);
        panel.add(stateTextField);

        JLabel pincode = new JLabel("Pin Code:");
        pincode.setBounds(100, 590, 200, 30);
        pincode.setFont(new Font("Raleway", Font.BOLD, 20));
        panel.add(pincode);

        pinTextField = new JTextField();
        pinTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        pinTextField.setBounds(300, 590, 400, 30);
        panel.add(pinTextField);

        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(700, 650, 80, 30);
        next.addActionListener(this);
        panel.add(next);

        // ---------- SCROLLPANE ----------
        JScrollPane scroll = new JScrollPane(panel);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        add(scroll);

        setSize(900, 700);
        setLocation(350, 10);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {

        String formno = "" + random;
        String name = nameTextField.getText();
        String fname = fnameTextField.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();

        String gender = null;
        if (male.isSelected()) gender = "Male";
        else if (female.isSelected()) gender = "Female";

        String email = emailTextField.getText();

        String marital = null;
        if (married.isSelected()) marital = "Married";
        else if (unmarried.isSelected()) marital = "Unmarried";
        else if (other.isSelected()) marital = "Other";

        String address = addressTextField.getText();
        String city = cityTextField.getText();
        String state = stateTextField.getText();
        String pin = pinTextField.getText();

        try {
            if (name.equals("")) JOptionPane.showMessageDialog(null, "Name is required");
            else if (fname.equals("")) JOptionPane.showMessageDialog(null, "Father's Name is required");
            else if (dob.equals("")) JOptionPane.showMessageDialog(null, "DOB is required");
            else if (gender == null) JOptionPane.showMessageDialog(null, "Gender is required");
            else if (email.equals("")) JOptionPane.showMessageDialog(null, "Email is required");
            else if (marital == null) JOptionPane.showMessageDialog(null, "Marital status is required");
            else if (address.equals("")) JOptionPane.showMessageDialog(null, "Address is required");
            else if (city.equals("")) JOptionPane.showMessageDialog(null, "City is required");
            else if (state.equals("")) JOptionPane.showMessageDialog(null, "State is required");
            else if (pin.equals("")) JOptionPane.showMessageDialog(null, "Pin Code is required");

            else {
                Conn c = new Conn();
                String query = "insert into signup values('" + formno + "', '" + name + "', '" + fname + "', '" + dob + "', '" + gender + "', '" + email + "', '" + marital + "', '" + address + "', '" + city + "', '" + state + "', '" + pin + "')";
                c.s.executeUpdate(query);

                new SignUpTwo(formno).setVisible(true);
                setVisible(false);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

   
}
