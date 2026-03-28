package controller;

import model.Event;
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
        String name=view.nameField.getText();
        String date=view.dateField.getText();
        String location=view.locationField.getText();

        if(!name.isEmpty()){
            //2. Creating a Model object
            Event newEvent = new Event(name, date, location);
            eventList.add(newEvent);

            //3. Updating the View
            view.displayArea.append("Added: " + name + " on " + date + " at " + location + "\n");

            //4. Clear fields for next entry
            view.nameField.setText("");
            view.dateField.setText("");
            view.locationField.setText("");

        }
        if(name.isEmpty()||date.isEmpty()){
           JOptionPane.showMessageDialog(view, "Name and Date cannot be empty!", "Input Error", JOptionPane.ERROR_MESSAGE);
    return;
        }
    }
}
    