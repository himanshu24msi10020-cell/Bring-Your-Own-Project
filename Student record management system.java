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

