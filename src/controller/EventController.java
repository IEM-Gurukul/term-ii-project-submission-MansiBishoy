package controller;

import model.Event;
import model.Workshop;
import view.EventView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class EventController {
    private EventView view;
    private ArrayList<Event> eventList;


    public EventController(EventView view){
        this.view=view;
        this.eventList=new ArrayList<>();

        this.view.addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addEvent();
            }
        });
    }
    private void addEvent(){
        //Getting Data from View
        String name=view.nameField.getText().trim();
        String date=view.dateField.getText().trim();
        String location=view.locationField.getText().trim();

        
        if(name.isEmpty()||date.isEmpty()){
           JOptionPane.showMessageDialog(view, "Name and Date cannot be empty!", "Input Error", JOptionPane.ERROR_MESSAGE);
    return;
        }
        Event newEntry;
        if(name.toLowerCase().contains("workshop")){
            newEntry = new Workshop(name, date, location, "Industry Expert");
        
        } else {
            newEntry = new Event(name, date, location);
        }
        eventList.add(newEntry);
        view.displayArea.append(newEntry.toString() + "\n");
        //Clear Input Fields
        view.nameField.setText("");
        view.dateField.setText(""); 
        view.locationField.setText("");
    }
}
    