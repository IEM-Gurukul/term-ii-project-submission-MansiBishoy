package view;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class EventView extends JFrame{
    public JTextField nameField=new JTextField(15);
    public JTextField dateField=new JTextField(15);
    public JTextField locationField=new JTextField(15);
    public JButton addButton=new JButton("Add Event");
    public JButton deleteButton=new JButton("Delete All");

    public DefaultTableModel tableModel;
    public JTable eventTable;
    
    public EventView(){
        //Setup Window
        this.setTitle("Event Management System");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600,500);
        this.setLayout(new BorderLayout(10,10));

        //Input Table
        JPanel inputPanel=new JPanel(new GridLayout(4,2,10,10));
        inputPanel.setBorder(new EmptyBorder(20,20,20,20));
        inputPanel.setBackground(new Color(240,240,240));


        //Add Components
        
        inputPanel.add(new JLabel("Event Name:"));
        inputPanel.add(nameField);
        inputPanel.add(new JLabel("Date (DD/MM/YYYY):"));
        inputPanel.add(dateField);
        inputPanel.add(new JLabel("Location:"));
        inputPanel.add(locationField);
        inputPanel.add(addButton);
        inputPanel.add(deleteButton);

        //Setting Up Table
        String columnNames[]={"Type","Event Name","Date","Location"};
        tableModel = new DefaultTableModel(columnNames, 0);
        eventTable = new JTable(tableModel);
        eventTable.setFillsViewportHeight(true);
        eventTable.setRowHeight(25);

        //Assemble View
        this.add(inputPanel,BorderLayout.NORTH);
        this.add( new JScrollPane(eventTable),BorderLayout.CENTER);


        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

}
    