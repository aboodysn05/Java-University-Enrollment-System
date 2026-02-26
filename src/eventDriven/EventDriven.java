

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

public class EventDriven {

    static int creditHours = 0;
    static int maxCreditHours = 18;
    static double totalFees = 325.5;
    static double creditHoursPrice = 0;
    static ArrayList<String> selectedSubjects = new ArrayList<>();
    static JLabel creditHoursLabel = new JLabel("Total Credit Hours: 0");
    static JLabel totalFeesLabel = new JLabel("Total Price: 0.0");
    static JLabel creditHoursPriceLabel = new JLabel("Credit Hours Price: 0.0");
    static JTextArea selectedSubjectsArea = new JTextArea(10, 40);
    static JTextArea subjectsArea = new JTextArea(10, 40);
    static JLabel keyTyping = new JLabel();
    static JLabel xyAxis = new JLabel();
    static final String[] subjects = {
            "Programming --> 3 Credit Hours",
            "Networking --> 3 Credit Hours",
            "Professional Practice --> 3 Credit Hours",
            "Fundamental Of Computing --> 4 Credit Hours",
            "Professional Skills --> 1 Credit Hour",
            "Math For Computing --> 3 Credit Hours",
            "Remedial Arabic --> 2 Credit Hours",
            "Arabic Level 2 --> 1 Credit Hour",
            "Bootcamp --> 4 Credit Hours",
            "Computer Project Research --> 6 Credit Hours",
            "Database --> 3 Credit Hours"
    };

    public static void main(String[] args) {
        JFrame frame = new JFrame("AY University");
        frame.setSize(500, 720);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        frame.setLayout(new FlowLayout());

        JLabel welcomeLabel = new JLabel("Welcome To AY University \t");
        frame.add(welcomeLabel);

        JLabel nameLabel = new JLabel("Please Enter Your Name");
        frame.add(nameLabel);

        JTextField nameField = new JTextField(20);
        frame.add(nameField);

        JButton submitNameButton = new JButton("Submit Name");
        frame.add(submitNameButton);
        
        frame.add(keyTyping);

        subjectsArea.setEditable(false);
        
        JScrollPane scrollPane = new JScrollPane(subjectsArea);
        frame.add(scrollPane);

        JLabel subjectsLabel = new JLabel("Select a subject:");
        frame.add(subjectsLabel);

        JComboBox<String> subjectsComboBox = new JComboBox<>(subjects);
        frame.add(subjectsComboBox);

        JButton addSubjectButton = new JButton("Add Subject");
        frame.add(addSubjectButton);

        selectedSubjectsArea.setEditable(false);
        JScrollPane selectedSubjectsScrollPane = new JScrollPane(selectedSubjectsArea);
        frame.add(selectedSubjectsScrollPane);
        
        frame.add(creditHoursLabel);
        frame.add(creditHoursPriceLabel);
        frame.add(totalFeesLabel);
        
        JButton getInformation = new JButton("Get Information");
        frame.add(getInformation);
        
        frame.add(xyAxis);
        

        submitNameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                JOptionPane.showMessageDialog(frame, "Welcome " + name + ", This program will help you in registering in this semester!");
                sortSubjectsByCreditHours(subjects);
                displaySubjects(subjects);  
            }
        });

        addSubjectButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedSubject = (String) subjectsComboBox.getSelectedItem();
                addSubject(selectedSubject);
            }
        });
        
        nameField.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
			}

			@Override
			public void keyPressed(KeyEvent e) {
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					keyTyping.setText("Welcome " + nameField.getText() + ", select the subjects you want to take this semester!");
				}
				
			}
        	
        });
        
        getInformation.addMouseListener((MouseListener) new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				if(e.getButton() == MouseEvent.BUTTON3) {
					JOptionPane.showMessageDialog(frame, "You have registered " + creditHours + " Credit Hours, and the cost of the credit hours are " + creditHoursPrice + " JD, and the total fees are " + totalFees + " JD");
				}
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {	
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}
        	
        });
        
        frame.addMouseMotionListener(new MouseMotionListener() {

			@Override
			public void mouseDragged(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseMoved(MouseEvent e) {
				// TODO Auto-generated method stub
				xyAxis.setText("x: " + e.getX() + " y: " + e.getY());
			}
        	
        });
        
        

    }

    public static void addSubject(String subject) {
        int subjectCreditHours = findCreditHour(subject);
        if (creditHours + subjectCreditHours <= maxCreditHours) {
            creditHours += subjectCreditHours;
            creditHoursPrice += subjectCreditHours * 75; // each credit hour costs 75
            totalFees += subjectCreditHours * 75;
            selectedSubjects.add(subject);
            updateSelectedSubjectsArea();
            creditHoursLabel.setText("Total Credit Hours: " + creditHours);
            creditHoursPriceLabel.setText("Credit Hours Price: " + creditHoursPrice);
            totalFeesLabel.setText("Total Fees Price: " + totalFees);
        } else {
            JOptionPane.showMessageDialog(null, "Cannot register this subject. Credit hours will exceed the maximum allowed.");
        }
    }

    public static int findCreditHour(String subject) {
        int position = subject.indexOf(">");
        return Integer.parseInt(subject.substring(position + 2, position + 3).trim());
    }

    public static void updateSelectedSubjectsArea() {
        selectedSubjectsArea.setText("");
        for (String subject : selectedSubjects) {
            selectedSubjectsArea.append(subject + "\n");
        }
    }

    public static void displaySubjects(String[] array) {
        subjectsArea.setText("");
        for (String subject : array) {
            subjectsArea.append(subject + "\n");
        }
    }

    public static void sortSubjectsByCreditHours(String[] array) {
        for (int i = 1; i < array.length; i++) {
            String key = array[i];
            int j = i - 1;
            int keyCreditHour = findCreditHour(key);
            while (j >= 0 && findCreditHour(array[j]) < keyCreditHour) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }
}


