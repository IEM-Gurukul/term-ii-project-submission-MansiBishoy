package view;
import javax.swing.*;
import java.awt.*;
public class EventView extends JFrame{
    public JTextField nameField=new JTextField(15);
    public JTextField dateField=new JTextField(15);
    public JTextField locationField=new JTextField(15);
    public JButton addButton=new JButton("Add Event");
    public JTextArea displayArea=new JTextArea(10,30);

    public EventView(){
        //Setup Window
        this.setTitle("Event Management System");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400,400);
        this.setLayout(new BorderLayout());
        //Add Components
        JPanel inputPanel=new JPanel(new GridLayout(4,2));
        inputPanel.add(new JLabel("Event Name"));
        inputPanel.add(nameField);
        inputPanel.add(new JLabel("Date:"));
        inputPanel.add(dateField);
        inputPanel.add(new JLabel("Location:"));
        inputPanel.add(locationField);
        inputPanel.add(new JLabel("Action:"));
        inputPanel.add(addButton);

        this.add(inputPanel, BorderLayout.NORTH);
        this.add(new JScrollPane(displayArea), BorderLayout.CENTER);
        
        this.setVisible(true);
    }

}
    