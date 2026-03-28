import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

class Student {
    int id;
    String name;
    int age;

    Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}

public class StudentGUI extends JFrame {
    private JTextField idField, nameField, ageField;
    private JTextArea displayArea;
    private ArrayList<Student> students;

    public StudentGUI() {
        students = new ArrayList<>();

        setTitle("Student Record Management System");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Input fields
        add(new JLabel("ID:"));
        idField = new JTextField(10);
        add(idField);

        add(new JLabel("Name:"));
        nameField = new JTextField(10);
        add(nameField);

        add(new JLabel("Age:"));
        ageField = new JTextField(10);
        add(ageField);

        // Buttons
        JButton addButton = new JButton("Add Student");
        JButton viewButton = new JButton("View Students");
        JButton deleteButton = new JButton("Delete Student");

        add(addButton);
        add(viewButton);
        add(deleteButton);

        // Display area
        displayArea = new JTextArea(15, 40);
        displayArea.setEditable(false);
        add(new JScrollPane(displayArea));

        // Add Student
        addButton.addActionListener(e -> {
            try {
                int id = Integer.parseInt(idField.getText());
                String name = nameField.getText();
                int age = Integer.parseInt(ageField.getText());

                students.add(new Student(id, name, age));
                displayArea.setText("Student Added Successfully!\n");

                idField.setText("");
                nameField.setText("");
                ageField.setText("");
            } catch (Exception ex) {
                displayArea.setText("Invalid Input!\n");
            }
        });

        

