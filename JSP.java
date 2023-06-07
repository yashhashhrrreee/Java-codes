import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class JSP extends JFrame implements ActionListener 
{
    JLabel nameLabel, ageLabel, genderLabel, courseLabel;
    JTextField nameField, ageField;
    JComboBox<String> genderComboBox, courseComboBox;
    JButton registerButton;

    Connection conn;

    JSP() {
        setTitle("Student Registration");

        // Initialize components
        nameLabel = new JLabel("Name:");
        ageLabel = new JLabel("Age:");
        genderLabel = new JLabel("Gender:");
        courseLabel = new JLabel("Course:");

        nameField = new JTextField();
        ageField = new JTextField();

        genderComboBox = new JComboBox<>(new String[] { "Male", "Female" });
        courseComboBox = new JComboBox<>(new String[] { "Mathematics", "Science", "English", "History" });

        registerButton = new JButton("Register");

        // Set component positions and sizes
        nameLabel.setBounds(50, 50, 100, 30);
        ageLabel.setBounds(50, 100, 100, 30);
        genderLabel.setBounds(50, 150, 100, 30);
        courseLabel.setBounds(50, 200, 100, 30);

        nameField.setBounds(150, 50, 200, 30);
        ageField.setBounds(150, 100, 200, 30);

        genderComboBox.setBounds(150, 150, 200, 30);
        courseComboBox.setBounds(150, 200, 200, 30);

        registerButton.setBounds(150, 250, 100, 30);

        // Add components to the frame
        add(nameLabel);
        add(ageLabel);
        add(genderLabel);
        add(courseLabel);
        add(nameField);
        add(ageField);
        add(genderComboBox);
        add(courseComboBox);
        add(registerButton);

        // Set frame properties
        setLayout(null);
        setSize(400, 350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        // Add action listener to register button
        registerButton.addActionListener(this);

        // Create database connection
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vu", "root", "7611");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == registerButton) {
            String name = nameField.getText();
            int age = Integer.parseInt(ageField.getText());
            String gender = genderComboBox.getSelectedItem().toString();
            String course = courseComboBox.getSelectedItem().toString();

            try {
                Statement stmt = conn.createStatement();
                String query = "INSERT INTO students (name, age, gender, course) VALUES ('" + name + "', " + age + ", '"
                        + gender + "', '" + course + "')";
                stmt.executeUpdate(query);

                JOptionPane.showMessageDialog(this, "Registration successful!");

                // Clear input fields after registration
                nameField.setText("");
                ageField.setText("");
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new JSP();
    }
}
