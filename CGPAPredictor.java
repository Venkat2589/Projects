import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CGPAPredictor extends JFrame {
    // Declare variables for user interface components
    private JLabel label1, label2, label3, label4, label5;
    private JTextField field1, field2, field3, field4, field5;
    private JButton calculateButton, resetButton;
    private JPanel panel1, panel2;
    
    public CGPAPredictor() {
        // Set up user interface components
        label1 = new JLabel("Enter your marks for subject 1 (out of 100):");
        label2 = new JLabel("Enter your marks for subject 2 (out of 100):");
        label3 = new JLabel("Enter your marks for subject 3 (out of 100):");
        label4 = new JLabel("Enter your marks for subject 4 (out of 100):");
        label5 = new JLabel("Enter your marks for subject 5 (out of 100):");
        field1 = new JTextField(10);
        field2 = new JTextField(10);
        field3 = new JTextField(10);
        field4 = new JTextField(10);
        field5 = new JTextField(10);
        calculateButton = new JButton("Calculate CGPA");
        resetButton = new JButton("Reset");
        panel1 = new JPanel(new GridLayout(5, 2));
        panel2 = new JPanel(new FlowLayout());
        
        // Add components to panels
        panel1.add(label1);
        panel1.add(field1);
        panel1.add(label2);
        panel1.add(field2);
        panel1.add(label3);
        panel1.add(field3);
        panel1.add(label4);
        panel1.add(field4);
        panel1.add(label5);
        panel1.add(field5);
        panel2.add(calculateButton);
        panel2.add(resetButton);
        
        // Add panels to frame
        this.add(panel1, BorderLayout.CENTER);
        this.add(panel2, BorderLayout.SOUTH);
        
        // Set up action listeners for buttons
        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculateCGPA();
            }
        });
        resetButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                resetFields();
            }
        });
        
        // Set up frame
        this.setTitle("CGPA Predictor");
        this.setSize(400, 200);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    
    // Method to calculate CGPA
    private void calculateCGPA() {
        // Get marks from text fields and convert to doubles
        double marks1 = Double.parseDouble(field1.getText());
        double marks2 = Double.parseDouble(field2.getText());
        double marks3 = Double.parseDouble(field3.getText());
        double marks4 = Double.parseDouble(field4.getText());
        double marks5 = Double.parseDouble(field5.getText());
        
        // Calculate total marks and CGPA
        double totalMarks = marks1 + marks2 + marks3 + marks4 + marks5;
        double cgpa = totalMarks / 500 * 4;
        
        // Display result in a message dialog
        JOptionPane.showMessageDialog(this, "Your CGPA is " + cgpa);
    }
    
    // Method to reset text fields
    private void resetFields() {
        field1.setText("");
        field2.setText("");
        field3.setText("");
        field4.setText("");
        field5.setText("");
    }
    
    public static void main(String[] args) {
        new CGPAPredictor();
}
}