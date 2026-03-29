package controller;

import model.Event;
import model.Workshop;
import view.EventView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import javax.swing.JOptionPane;

public class EventController {
    private EventView view;
    private ArrayList<Event> eventList;

    public EventController(EventView view) {
        this.view = view;
        this.eventList = new ArrayList<>();

        // Add Button Listener
        this.view.addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addEvent();
            }
        });

        // Delete Button Listener
        this.view.deleteButton.addActionListener(e -> {
            int selectedRow = view.eventTable.getSelectedRow();
            if (selectedRow != -1) {
                view.tableModel.removeRow(selectedRow);
                eventList.remove(selectedRow);
            } else {
                int confirm = JOptionPane.showConfirmDialog(view, "No row selected. Clear all events?", "Confirm", JOptionPane.YES_NO_OPTION);
                if (confirm == JOptionPane.YES_OPTION) {
                    view.tableModel.setRowCount(0);
                    eventList.clear();
                }
            }
        });
    }

    private void addEvent() {
        // Getting Data from View
        String name = view.nameField.getText().trim();
        String date = view.dateField.getText().trim();
        String location = view.locationField.getText().trim();

        // 1. Proactive Validation (Empty fields & Regex)
        if (name.isEmpty() || date.isEmpty() || location.isEmpty()) {
            JOptionPane.showMessageDialog(view, "Please fill in all fields.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String datePattern = "^\\d{2}/\\d{2}/\\d{4}$";
        if (!date.matches(datePattern)) {
            JOptionPane.showMessageDialog(view, "Please enter the date in the format DD/MM/YYYY.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (location.length() < 3) {
            JOptionPane.showMessageDialog(view, "Please enter a valid location (at least 3 characters).", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // 2. Exception Handling (Calendar Logic Check)
        try {
            // Change yyyy to uuuu for STRICT mode compatibility
            DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/uuuu").withResolverStyle(java.time.format.ResolverStyle.STRICT);
            java.time.LocalDate.parse(date, df); 

            Event newEntry;
            String typeLabel;

            if (name.toLowerCase().contains("workshop")) {
                newEntry = new Workshop(name, date, location, "Industry Expert");
                typeLabel = "WORKSHOP";
            } else {
                newEntry = new Event(name, date, location);
                typeLabel = "GENERAL EVENT";
            }

            eventList.add(newEntry);
            view.tableModel.addRow(new Object[]{
                typeLabel,
                newEntry.getName(),
                newEntry.getDate(),
                newEntry.getLocation()
            });

            clearFields();

        } catch (DateTimeParseException e) {
            JOptionPane.showMessageDialog(view, "That date does not exist!", "Calendar Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Helper Method to Clear Input Fields
    private void clearFields() {
        view.nameField.setText("");
        view.dateField.setText("");
        view.locationField.setText("");
    }
}