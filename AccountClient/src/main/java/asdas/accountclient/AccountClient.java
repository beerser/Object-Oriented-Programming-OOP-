
package asdas.accountclient;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.TitledBorder;

public class AccountClient extends JFrame{
    private JTextField jtfID = new JTextField(10);
    private JTextField jtfMoney = new JTextField(10);
    private JTextField jtfAnnualInterestRate = new JTextField(10);
    private JComboBox<String> jcbDay1 = new JComboBox<>();
    private JComboBox<String> jcbMonth1 = new JComboBox<>();
    private JComboBox<String> jcbYear1 = new JComboBox<>();
    private JTextField jtfFN = new JTextField(10);
    private JTextField jtfLN = new JTextField(10);
    private JComboBox<String> jcbDay2 = new JComboBox<>();
    private JComboBox<String> jcbMonth2 = new JComboBox<>();
    private JComboBox<String> jcbYear2 = new JComboBox<>();
    private JTextField jtfAge = new JTextField(5);
    
    public static Connection conn(){
        try{
            String url = "jdbc:mysql://localhost:3306/mydatabase";
            String user = "admin";
            String password = "1234";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, user, password);
            return conn;
            
        }catch(SQLException|ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }
    
    class ShowBt implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
           
            String id = jtfID.getText();
            String money = jtfMoney.getText();
            String annualInterestRate = jtfAnnualInterestRate.getText();
            String openAccountDay = (String) jcbDay1.getSelectedItem();
            String openAccountMonth = (String) jcbMonth1.getSelectedItem();
            String openAccountYear = (String) jcbYear1.getSelectedItem();
            String firstName = jtfFN.getText();
            String lastName = jtfLN.getText();
            String birthDay = (String) jcbDay2.getSelectedItem();
            String birthMonth = (String) jcbMonth2.getSelectedItem();
            String birthYear = (String) jcbYear2.getSelectedItem();
            String age = jtfAge.getText();


            String message = "Current Information:\n" +
                             "ID: " + id + "\n" +
                             "Money: " + money + "\n" +
                             "Annual Interest Rate: " + annualInterestRate + "\n" +
                             "Open Account: " + openAccountDay + " " + openAccountMonth + " " + openAccountYear + "\n" +
                             "First Name: " + firstName + "\n" +
                             "Last Name: " + lastName + "\n" +
                             "Birth Date: " + birthDay + " " + birthMonth + " " + birthYear + "\n" +
                             "Age: " + age;

            JOptionPane.showMessageDialog(null, message, "Account Information", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public AccountClient() {
        JPanel p1 = new JPanel();
        p1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 15));
        
       
        JLabel titleLabel = new JLabel("ACCOUNT");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 16)); 
        p1.add(titleLabel);

        JPanel p2 = new JPanel();
        p2.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
        p2.setBorder(new TitledBorder("Enter Data Account Money"));
        p2.add(new JLabel("ID:"));
        p2.add(jtfID);
        p2.add(new JLabel("MONEY:"));
        p2.add(jtfMoney);
        p2.add(new JLabel("BATH"));
        p2.add(new JLabel("ANNUAL INTEREST RATE:"));
        p2.add(jtfAnnualInterestRate);
        p2.add(new JLabel("DAY OPEN ACCOUNT: "));

        jcbDay1.addItem("day");
        for (int i = 1; i <= 31; i++) {
            jcbDay1.addItem(String.format("%02d", i));
        }
        p2.add(jcbDay1);

        jcbMonth1.addItem("month");
        jcbMonth1.addItem("January");
        jcbMonth1.addItem("February");
        jcbMonth1.addItem("March");
        jcbMonth1.addItem("April");
        jcbMonth1.addItem("May");
        jcbMonth1.addItem("June");
        jcbMonth1.addItem("July");
        jcbMonth1.addItem("August");
        jcbMonth1.addItem("September");
        jcbMonth1.addItem("October");
        jcbMonth1.addItem("November");
        jcbMonth1.addItem("December");
        p2.add(jcbMonth1);

        jcbYear1.addItem("year");
        for (int i = 1950; i <= 2030; i++) {
            jcbYear1.addItem(String.valueOf(i));
        }
        p2.add(jcbYear1);

        p2.add(new JLabel("FIRST NAME: "));
        p2.add(jtfFN);
        p2.add(new JLabel("LAST NAME: "));
        p2.add(jtfLN);
        p2.add(new JLabel("BIRTH DAY: "));

        jcbDay2.addItem("day");
        for (int i = 1; i <= 31; i++) {
            jcbDay2.addItem(String.format("%02d", i));
        }
        p2.add(jcbDay2);

        jcbMonth2.addItem("month");
        jcbMonth2.addItem("January");
        jcbMonth2.addItem("February");
        jcbMonth2.addItem("March");
        jcbMonth2.addItem("April");
        jcbMonth2.addItem("May");
        jcbMonth2.addItem("June");
        jcbMonth2.addItem("July");
        jcbMonth2.addItem("August");
        jcbMonth2.addItem("September");
        jcbMonth2.addItem("October");
        jcbMonth2.addItem("November");
        jcbMonth2.addItem("December");
        p2.add(jcbMonth2);

        jcbYear2.addItem("year");
        for (int i = 1950; i <= 2024; i++) {
            jcbYear2.addItem(String.valueOf(i));
        }
        p2.add(jcbYear2);
        p2.add(new JLabel("AGE: "));
        p2.add(jtfAge);
        p2.add(new JLabel("YEAR"));

        JPanel p3 = new JPanel();
        p3.setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 5));

        JButton saveButton = new JButton("SAVE");
        saveButton.addActionListener(new SaveBt());  
        p3.add(saveButton);

         JButton showButton = new JButton("SHOW");
        showButton.addActionListener(new ShowBt());  
        p3.add(showButton);
        

        JPanel p4 = new JPanel();
        p4.setLayout(new BorderLayout(5, 5));
        p4.add(p1, BorderLayout.NORTH);
        p4.add(p2, BorderLayout.CENTER);
        p4.add(p3, BorderLayout.SOUTH);

        add(p4);  
    }

    
    class SaveBt implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            
            String idno = jtfID.getText();
            String money = jtfMoney.getText();
            String annualInterestRate = jtfAnnualInterestRate.getText();
            String openAccountDay = (String) jcbDay1.getSelectedItem();
            String openAccountMonth = (String) jcbMonth1.getSelectedItem();
            String openAccountYear = (String) jcbYear1.getSelectedItem();
            String firstName = jtfFN.getText();
            String lastName = jtfLN.getText();
            String birthDay = (String) jcbDay2.getSelectedItem();
            String birthMonth = (String) jcbMonth2.getSelectedItem();
            String birthYear = (String) jcbYear2.getSelectedItem();
            String age = jtfAge.getText();

            
            Connection conn = AccountClient.conn();
            PreparedStatement pst = null;
            
            if (conn != null) {
                try {
                    
                    String sqlquery = "INSERT INTO useraccount (idno, money, annualInterestRate, openAccountDay, openAccountMonth, openAccountYear, firstName, lastName, birthDay, birthMonth, birthYear, age) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

                    
                    pst = conn.prepareStatement(sqlquery);
                    pst.setString(1, idno);
                    pst.setString(2, money);
                    pst.setString(3, annualInterestRate);
                    pst.setString(4, openAccountDay);
                    pst.setString(5, openAccountMonth);
                    pst.setString(6, openAccountYear);
                    pst.setString(7, firstName);
                    pst.setString(8, lastName);
                    pst.setString(9, birthDay);
                    pst.setString(10, birthMonth);
                    pst.setString(11, birthYear);
                    pst.setString(12, age);
                    
                    
                    int rowAffected = pst.executeUpdate();
                    
                    if (rowAffected > 0) {
                        JOptionPane.showMessageDialog(null, "Data saved successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Failed to save data.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "SQL Error", JOptionPane.ERROR_MESSAGE);
                } finally {
                    
                    try {
                        if (pst != null) pst.close();
                        if (conn != null) conn.close();
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, ex.getMessage(), "Error Closing Connection", JOptionPane.ERROR_MESSAGE);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Failed to connect to the database", "Connection Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    

    public static void main(String[] args) {
        Connection conn = AccountClient.conn();
        PreparedStatement pst;
        ResultSet rs;
        try{
        String sqlquery = "SELECT * FROM useraccount";
        pst = conn.prepareStatement(sqlquery);
        rs = pst.executeQuery();
        if(rs.next()){
            String name =rs.getString(4);
            System.out.println(name);
        }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        AccountClient frame = new AccountClient();
        frame.setTitle("Account");
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}