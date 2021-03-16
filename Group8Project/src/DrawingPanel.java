import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DrawingPanel extends JPanel{
	int questionAnswers[] = new int[20];
	int i, i2, i3, j, averageBeforeCovid, averageAfterCovid, highestScore, lowestScore, range, median, mode;
	
	
	
	public DrawingPanel() {
		super(new BorderLayout());
		this.setBackground(Color.white);
		this.setSize(500, 500);
		
		
		JLabel welcomeLabel = new JLabel("Hello, thank you for participating in this survey! Please answer your questions on a scale from 0 being the worst and 10 being the best.");
		this.add(welcomeLabel, BorderLayout.NORTH);
		
		
		JPanel centerPanel = new JPanel(new GridLayout(11,2));
		
		
		JLabel label1 = new JLabel("Question 1: How would you rate the campus life at Quinnipiac this year?");
		JLabel label2 = new JLabel("Question 2: How would you rate the atmosphere of your school before Covid?");
		JLabel label3 = new JLabel("Question 3: How would you rate your online class experience at Quinnipiac?");
		JLabel label4 = new JLabel("Question 4: How would you rate your in class experience at Quinnipiac?");
		JLabel label5 = new JLabel("Question 5: How would you rate your in class experience before Covid?");
		JLabel label6 = new JLabel("Question 6: How would you rate the food at Quinnipiac?");
		JLabel label7 = new JLabel("Question 7: How would you rate the food from your school before Covid?");
		JLabel label8 = new JLabel("Question 8: How would you rate the clubs that you are in?");
		JLabel label9 = new JLabel("Question 9: How would you rate the clubs that you were in before Covid?");
		JLabel label10 = new JLabel("Question 10: How would you rate the activites offered by Quinnipiac?");
		JLabel label11 = new JLabel("Question 11: How would you rate the activites offered by your school before Covid?");
		
		JLabel label12 = new JLabel("Question 12: How do you feel about freshman now having to live on campus for 3 years (10 being very happy)?");
		JLabel label13 = new JLabel("Question 13: How happy are you with deciding to go to Quinnipiac (10 being very happy)?");
		JLabel label14 = new JLabel("Question 14: How satisfied are you with the professors and their teaching at Quinnipiac (10 being very satisfied)?");
		JLabel label15 = new JLabel("Question 15: How satisfied are you with course registration at Quinnipiac (10 being very satisfied)?");
		JLabel label16 = new JLabel("Question 16: How problematic are the lines at the cafeteria (10 being very problematic)?");
		JLabel label17 = new JLabel("Question 17: How problematic are the lines at the cafeteria (10 being very problematic)?");
		JLabel label18 = new JLabel("Question 18: How satisfied are you with your chosen major (10 being very satisfied)?");
		JLabel label19 = new JLabel("Question 19: What would you rate Quinnipiac to other college students (10 being amazing)?");
		JLabel label20 = new JLabel("Question 20: How busy are you as a Quinnipiac student (10 being very busy)?");
		
		JComboBox comboBox1 = new JComboBox();
		JComboBox comboBox2 = new JComboBox();
		JComboBox comboBox3 = new JComboBox();
		JComboBox comboBox4 = new JComboBox();
		JComboBox comboBox5 = new JComboBox();
		JComboBox comboBox6 = new JComboBox();
		JComboBox comboBox7 = new JComboBox();
		JComboBox comboBox8 = new JComboBox();
		JComboBox comboBox9 = new JComboBox();
		JComboBox comboBox10 = new JComboBox();
		JComboBox comboBox11 = new JComboBox();
		
		JComboBox comboBox12 = new JComboBox();
		JComboBox comboBox13 = new JComboBox();
		JComboBox comboBox14 = new JComboBox();
		JComboBox comboBox15 = new JComboBox();
		JComboBox comboBox16 = new JComboBox();
		JComboBox comboBox17 = new JComboBox();
		JComboBox comboBox18 = new JComboBox();
		JComboBox comboBox19 = new JComboBox();
		JComboBox comboBox20 = new JComboBox();
		
		comboBox1.addItem(new ComboItem("0", 0));
		comboBox1.addItem(new ComboItem("1", 1));
		comboBox1.addItem(new ComboItem("2", 2));
		comboBox1.addItem(new ComboItem("3", 3));
		comboBox1.addItem(new ComboItem("4", 4));
		comboBox1.addItem(new ComboItem("5", 5));
		comboBox1.addItem(new ComboItem("6", 6));
		comboBox1.addItem(new ComboItem("7", 7));
		comboBox1.addItem(new ComboItem("8", 8));
		comboBox1.addItem(new ComboItem("9", 9));
		comboBox1.addItem(new ComboItem("10", 10));
		
		
		comboBox2.addItem(new ComboItem("0", 0));
		comboBox2.addItem(new ComboItem("1", 1));
		comboBox2.addItem(new ComboItem("2", 2));
		comboBox2.addItem(new ComboItem("3", 3));
		comboBox2.addItem(new ComboItem("4", 4));
		comboBox2.addItem(new ComboItem("5", 5));
		comboBox2.addItem(new ComboItem("6", 6));
		comboBox2.addItem(new ComboItem("7", 7));
		comboBox2.addItem(new ComboItem("8", 8));
		comboBox2.addItem(new ComboItem("9", 9));
		comboBox2.addItem(new ComboItem("10", 10));
		
		
		comboBox3.addItem(new ComboItem("0", 0));
		comboBox3.addItem(new ComboItem("1", 1));
		comboBox3.addItem(new ComboItem("2", 2));
		comboBox3.addItem(new ComboItem("3", 3));
		comboBox3.addItem(new ComboItem("4", 4));
		comboBox3.addItem(new ComboItem("5", 5));
		comboBox3.addItem(new ComboItem("6", 6));
		comboBox3.addItem(new ComboItem("7", 7));
		comboBox3.addItem(new ComboItem("8", 8));
		comboBox3.addItem(new ComboItem("9", 9));
		comboBox3.addItem(new ComboItem("10", 10));

		
		comboBox4.addItem(new ComboItem("0", 0));
		comboBox4.addItem(new ComboItem("1", 1));
		comboBox4.addItem(new ComboItem("2", 2));
		comboBox4.addItem(new ComboItem("3", 3));
		comboBox4.addItem(new ComboItem("4", 4));
		comboBox4.addItem(new ComboItem("5", 5));
		comboBox4.addItem(new ComboItem("6", 6));
		comboBox4.addItem(new ComboItem("7", 7));
		comboBox4.addItem(new ComboItem("8", 8));
		comboBox4.addItem(new ComboItem("9", 9));
		comboBox4.addItem(new ComboItem("10", 10));

	
		comboBox5.addItem(new ComboItem("0", 0));
		comboBox5.addItem(new ComboItem("1", 1));
		comboBox5.addItem(new ComboItem("2", 2));
		comboBox5.addItem(new ComboItem("3", 3));
		comboBox5.addItem(new ComboItem("4", 4));
		comboBox5.addItem(new ComboItem("5", 5));
		comboBox5.addItem(new ComboItem("6", 6));
		comboBox5.addItem(new ComboItem("7", 7));
		comboBox5.addItem(new ComboItem("8", 8));
		comboBox5.addItem(new ComboItem("9", 9));
		comboBox5.addItem(new ComboItem("10", 10));
		
		
		comboBox6.addItem(new ComboItem("0", 0));
		comboBox6.addItem(new ComboItem("1", 1));
		comboBox6.addItem(new ComboItem("2", 2));
		comboBox6.addItem(new ComboItem("3", 3));
		comboBox6.addItem(new ComboItem("4", 4));
		comboBox6.addItem(new ComboItem("5", 5));
		comboBox6.addItem(new ComboItem("6", 6));
		comboBox6.addItem(new ComboItem("7", 7));
		comboBox6.addItem(new ComboItem("8", 8));
		comboBox6.addItem(new ComboItem("9", 9));
		comboBox6.addItem(new ComboItem("10", 10));
		
		
		comboBox7.addItem(new ComboItem("0", 0));
		comboBox7.addItem(new ComboItem("1", 1));
		comboBox7.addItem(new ComboItem("2", 2));
		comboBox7.addItem(new ComboItem("3", 3));
		comboBox7.addItem(new ComboItem("4", 4));
		comboBox7.addItem(new ComboItem("5", 5));
		comboBox7.addItem(new ComboItem("6", 6));
		comboBox7.addItem(new ComboItem("7", 7));
		comboBox7.addItem(new ComboItem("8", 8));
		comboBox7.addItem(new ComboItem("9", 9));
		comboBox7.addItem(new ComboItem("10", 10));

		
		comboBox8.addItem(new ComboItem("0", 0));
		comboBox8.addItem(new ComboItem("1", 1));
		comboBox8.addItem(new ComboItem("2", 2));
		comboBox8.addItem(new ComboItem("3", 3));
		comboBox8.addItem(new ComboItem("4", 4));
		comboBox8.addItem(new ComboItem("5", 5));
		comboBox8.addItem(new ComboItem("6", 6));
		comboBox8.addItem(new ComboItem("7", 7));
		comboBox8.addItem(new ComboItem("8", 8));
		comboBox8.addItem(new ComboItem("9", 9));
		comboBox8.addItem(new ComboItem("10", 10));
		
		comboBox9.addItem(new ComboItem("0", 0));
		comboBox9.addItem(new ComboItem("1", 1));
		comboBox9.addItem(new ComboItem("2", 2));
		comboBox9.addItem(new ComboItem("3", 3));
		comboBox9.addItem(new ComboItem("4", 4));
		comboBox9.addItem(new ComboItem("5", 5));
		comboBox9.addItem(new ComboItem("6", 6));
		comboBox9.addItem(new ComboItem("7", 7));
		comboBox9.addItem(new ComboItem("8", 8));
		comboBox9.addItem(new ComboItem("9", 9));
		comboBox9.addItem(new ComboItem("10", 10));
		
		
		comboBox10.addItem(new ComboItem("0", 0));
		comboBox10.addItem(new ComboItem("1", 1));
		comboBox10.addItem(new ComboItem("2", 2));
		comboBox10.addItem(new ComboItem("3", 3));
		comboBox10.addItem(new ComboItem("4", 4));
		comboBox10.addItem(new ComboItem("5", 5));
		comboBox10.addItem(new ComboItem("6", 6));
		comboBox10.addItem(new ComboItem("7", 7));
		comboBox10.addItem(new ComboItem("8", 8));
		comboBox10.addItem(new ComboItem("9", 9));
		comboBox10.addItem(new ComboItem("10", 10));

		
		comboBox11.addItem(new ComboItem("0", 0));
		comboBox11.addItem(new ComboItem("1", 1));
		comboBox11.addItem(new ComboItem("2", 2));
		comboBox11.addItem(new ComboItem("3", 3));
		comboBox11.addItem(new ComboItem("4", 4));
		comboBox11.addItem(new ComboItem("5", 5));
		comboBox11.addItem(new ComboItem("6", 6));
		comboBox11.addItem(new ComboItem("7", 7));
		comboBox11.addItem(new ComboItem("8", 8));
		comboBox11.addItem(new ComboItem("9", 9));
		comboBox11.addItem(new ComboItem("10", 10));
		
		comboBox12.addItem(new ComboItem("0", 0));
		comboBox12.addItem(new ComboItem("1", 1));
		comboBox12.addItem(new ComboItem("2", 2));
		comboBox12.addItem(new ComboItem("3", 3));
		comboBox12.addItem(new ComboItem("4", 4));
		comboBox12.addItem(new ComboItem("5", 5));
		comboBox12.addItem(new ComboItem("6", 6));
		comboBox12.addItem(new ComboItem("7", 7));
		comboBox12.addItem(new ComboItem("8", 8));
		comboBox12.addItem(new ComboItem("9", 9));
		comboBox12.addItem(new ComboItem("10", 10));
		
		comboBox13.addItem(new ComboItem("0", 0));
		comboBox13.addItem(new ComboItem("1", 1));
		comboBox13.addItem(new ComboItem("2", 2));
		comboBox13.addItem(new ComboItem("3", 3));
		comboBox13.addItem(new ComboItem("4", 4));
		comboBox13.addItem(new ComboItem("5", 5));
		comboBox13.addItem(new ComboItem("6", 6));
		comboBox13.addItem(new ComboItem("7", 7));
		comboBox13.addItem(new ComboItem("8", 8));
		comboBox13.addItem(new ComboItem("9", 9));
		comboBox13.addItem(new ComboItem("10", 10));
		
		comboBox14.addItem(new ComboItem("0", 0));
		comboBox14.addItem(new ComboItem("1", 1));
		comboBox14.addItem(new ComboItem("2", 2));
		comboBox14.addItem(new ComboItem("3", 3));
		comboBox14.addItem(new ComboItem("4", 4));
		comboBox14.addItem(new ComboItem("5", 5));
		comboBox14.addItem(new ComboItem("6", 6));
		comboBox14.addItem(new ComboItem("7", 7));
		comboBox14.addItem(new ComboItem("8", 8));
		comboBox14.addItem(new ComboItem("9", 9));
		comboBox14.addItem(new ComboItem("10", 10));
		
		comboBox15.addItem(new ComboItem("0", 0));
		comboBox15.addItem(new ComboItem("1", 1));
		comboBox15.addItem(new ComboItem("2", 2));
		comboBox15.addItem(new ComboItem("3", 3));
		comboBox15.addItem(new ComboItem("4", 4));
		comboBox15.addItem(new ComboItem("5", 5));
		comboBox15.addItem(new ComboItem("6", 6));
		comboBox15.addItem(new ComboItem("7", 7));
		comboBox15.addItem(new ComboItem("8", 8));
		comboBox15.addItem(new ComboItem("9", 9));
		comboBox15.addItem(new ComboItem("10", 10));
		
		comboBox16.addItem(new ComboItem("0", 0));
		comboBox16.addItem(new ComboItem("1", 1));
		comboBox16.addItem(new ComboItem("2", 2));
		comboBox16.addItem(new ComboItem("3", 3));
		comboBox16.addItem(new ComboItem("4", 4));
		comboBox16.addItem(new ComboItem("5", 5));
		comboBox16.addItem(new ComboItem("6", 6));
		comboBox16.addItem(new ComboItem("7", 7));
		comboBox16.addItem(new ComboItem("8", 8));
		comboBox16.addItem(new ComboItem("9", 9));
		comboBox16.addItem(new ComboItem("10", 10));
		
		comboBox17.addItem(new ComboItem("0", 0));
		comboBox17.addItem(new ComboItem("1", 1));
		comboBox17.addItem(new ComboItem("2", 2));
		comboBox17.addItem(new ComboItem("3", 3));
		comboBox17.addItem(new ComboItem("4", 4));
		comboBox17.addItem(new ComboItem("5", 5));
		comboBox17.addItem(new ComboItem("6", 6));
		comboBox17.addItem(new ComboItem("7", 7));
		comboBox17.addItem(new ComboItem("8", 8));
		comboBox17.addItem(new ComboItem("9", 9));
		comboBox17.addItem(new ComboItem("10", 10));
		
		comboBox18.addItem(new ComboItem("0", 0));
		comboBox18.addItem(new ComboItem("1", 1));
		comboBox18.addItem(new ComboItem("2", 2));
		comboBox18.addItem(new ComboItem("3", 3));
		comboBox18.addItem(new ComboItem("4", 4));
		comboBox18.addItem(new ComboItem("5", 5));
		comboBox18.addItem(new ComboItem("6", 6));
		comboBox18.addItem(new ComboItem("7", 7));
		comboBox18.addItem(new ComboItem("8", 8));
		comboBox18.addItem(new ComboItem("9", 9));
		comboBox18.addItem(new ComboItem("10", 10));
		
		comboBox19.addItem(new ComboItem("0", 0));
		comboBox19.addItem(new ComboItem("1", 1));
		comboBox19.addItem(new ComboItem("2", 2));
		comboBox19.addItem(new ComboItem("3", 3));
		comboBox19.addItem(new ComboItem("4", 4));
		comboBox19.addItem(new ComboItem("5", 5));
		comboBox19.addItem(new ComboItem("6", 6));
		comboBox19.addItem(new ComboItem("7", 7));
		comboBox19.addItem(new ComboItem("8", 8));
		comboBox19.addItem(new ComboItem("9", 9));
		comboBox19.addItem(new ComboItem("10", 10));
		
		comboBox20.addItem(new ComboItem("0", 0));
		comboBox20.addItem(new ComboItem("1", 1));
		comboBox20.addItem(new ComboItem("2", 2));
		comboBox20.addItem(new ComboItem("3", 3));
		comboBox20.addItem(new ComboItem("4", 4));
		comboBox20.addItem(new ComboItem("5", 5));
		comboBox20.addItem(new ComboItem("6", 6));
		comboBox20.addItem(new ComboItem("7", 7));
		comboBox20.addItem(new ComboItem("8", 8));
		comboBox20.addItem(new ComboItem("9", 9));
		comboBox20.addItem(new ComboItem("10", 10));
		
		comboBox1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Object item = comboBox1.getSelectedItem();
				int value = ((ComboItem)item).getValue();
				questionAnswers[0] = value;
			}
			
		});
		
		
		comboBox2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Object item = comboBox2.getSelectedItem();
				int value = ((ComboItem)item).getValue();
				questionAnswers[1] = value;
			}
			
		});
		
		comboBox3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Object item = comboBox3.getSelectedItem();
				int value = ((ComboItem)item).getValue();
				questionAnswers[2] = value;
			}
			
		});
		
		comboBox4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Object item = comboBox4.getSelectedItem();
				int value = ((ComboItem)item).getValue();
				questionAnswers[3] = value;
			}
			
		});
		
		comboBox5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Object item = comboBox5.getSelectedItem();
				int value = ((ComboItem)item).getValue();
				questionAnswers[4] = value;
			}
			
		});
		
		comboBox6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Object item = comboBox6.getSelectedItem();
				int value = ((ComboItem)item).getValue();
				questionAnswers[5] = value;
			}
			
		});
		
		comboBox7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Object item = comboBox7.getSelectedItem();
				int value = ((ComboItem)item).getValue();
				questionAnswers[6] = value;
			}
			
		});
		
		comboBox8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Object item = comboBox8.getSelectedItem();
				int value = ((ComboItem)item).getValue();
				questionAnswers[7] = value;
			}
			
		});
		
		comboBox9.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Object item = comboBox9.getSelectedItem();
				int value = ((ComboItem)item).getValue();
				questionAnswers[8] = value;
			}
			
		});
		
		comboBox10.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Object item = comboBox10.getSelectedItem();
				int value = ((ComboItem)item).getValue();
				questionAnswers[9] = value;
			}
			
		});
		
		comboBox11.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Object item = comboBox11.getSelectedItem();
				int value = ((ComboItem)item).getValue();
				questionAnswers[10] = value;
			}
			
		});
		
		comboBox12.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Object item = comboBox12.getSelectedItem();
				int value = ((ComboItem)item).getValue();
				questionAnswers[11] = value;
			}
			
		});
		
		comboBox13.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Object item = comboBox13.getSelectedItem();
				int value = ((ComboItem)item).getValue();
				questionAnswers[12] = value;
			}
			
		});
		
		comboBox14.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Object item = comboBox14.getSelectedItem();
				int value = ((ComboItem)item).getValue();
				questionAnswers[13] = value;
			}
			
		});
		
		comboBox15.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Object item = comboBox15.getSelectedItem();
				int value = ((ComboItem)item).getValue();
				questionAnswers[14] = value;
			}
			
		});
		
		comboBox16.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Object item = comboBox16.getSelectedItem();
				int value = ((ComboItem)item).getValue();
				questionAnswers[15] = value;
			}
			
		});
		
		comboBox17.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Object item = comboBox17.getSelectedItem();
				int value = ((ComboItem)item).getValue();
				questionAnswers[16] = value;
			}
			
		});
		
		comboBox18.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Object item = comboBox18.getSelectedItem();
				int value = ((ComboItem)item).getValue();
				questionAnswers[17] = value;
			}
			
		});
		
		comboBox19.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Object item = comboBox19.getSelectedItem();
				int value = ((ComboItem)item).getValue();
				questionAnswers[18] = value;
			}
			
		});
		
		comboBox20.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Object item = comboBox20.getSelectedItem();
				int value = ((ComboItem)item).getValue();
				questionAnswers[19] = value;
			}
			
		});

		
		centerPanel.add(label1);
		centerPanel.add(comboBox1);
		centerPanel.add(label2);
		centerPanel.add(comboBox2);
		centerPanel.add(label3);
		centerPanel.add(comboBox3);
		centerPanel.add(label4);
		centerPanel.add(comboBox4);
		centerPanel.add(label5);
		centerPanel.add(comboBox5);
		centerPanel.add(label6);
		centerPanel.add(comboBox6);
		centerPanel.add(label7);
		centerPanel.add(comboBox7);
		centerPanel.add(label8);
		centerPanel.add(comboBox8);
		centerPanel.add(label9);
		centerPanel.add(comboBox9);
		centerPanel.add(label10);
		centerPanel.add(comboBox10);
		centerPanel.add(label11);
		centerPanel.add(comboBox11);
		centerPanel.add(label12);
		centerPanel.add(comboBox12);
		centerPanel.add(label13);
		centerPanel.add(comboBox13);
		centerPanel.add(label14);
		centerPanel.add(comboBox14);
		centerPanel.add(label15);
		centerPanel.add(comboBox15);
		centerPanel.add(label16);
		centerPanel.add(comboBox16);
		centerPanel.add(label17);
		centerPanel.add(comboBox17);
		centerPanel.add(label18);
		centerPanel.add(comboBox18);
		centerPanel.add(label19);
		centerPanel.add(comboBox19);
		centerPanel.add(label20);
		centerPanel.add(comboBox20);
		
		
		
		this.add(centerPanel, BorderLayout.CENTER);
		
		JButton button = new JButton("Done");
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				for(int a = 0; a < questionAnswers.length;a++) {
					//System.out.println(questionAnswers[a]);
				}
				
				writeAverageSurvey("SurveyAnswers.txt", questionAnswers, readAverageSurvey("SurveyAnswers.txt"));
				readAverageSurvey("SurveyAnswers.txt");
				calculations();
			
				//for(int a = 0; a < questionAnswers.length; a++) {
					//System.out.println(questionAnswers[a]);
					
				//}
			}
			
		});
		this.add(button, BorderLayout.SOUTH);
		
		
	}
	
	
	public void calculations() {
		int averageBeforeCovid = (questionAnswers[1] + questionAnswers[4] + questionAnswers[6] + questionAnswers[8]
				+ questionAnswers[10]) / 5;
		int averageAfterCovid = (questionAnswers[0] + questionAnswers[2] + questionAnswers[3] + questionAnswers[5]
				+ questionAnswers[7] + questionAnswers[9]) / 6;
		
		System.out.println("Your average score for questions before Covid was " + averageBeforeCovid + ".");
		System.out.println("Your average score for questions after Covid was " + averageAfterCovid + ".");
		
		int highestScore = questionAnswers[0];
		int highestQuestionNumber = 0;
		for (i = 0; i < questionAnswers.length; i++) {
			if (highestScore < questionAnswers[i]) {
				highestScore = questionAnswers[i];
				highestQuestionNumber = i;
			}
		}
		
		System.out.println("The highest score you gave was " + highestScore + " and you gave it for question "
				+ highestQuestionNumber + ".");
		
		int lowestScore = questionAnswers[0];
		int lowestQuestionNumber = 0;
		for (i2 = 0; i2 < questionAnswers.length; i2++) {
			if (lowestScore > questionAnswers[i2]) {
				lowestScore = questionAnswers[i2];
				lowestQuestionNumber = i2;
			}
		}
		
		System.out.println("The lowest score you gave was " + lowestScore + " and you gave it for question "
				+ lowestQuestionNumber + ".");
		
		int range = highestScore - lowestScore;
		
		System.out.println("The range of your scores was " + range + ".");
		
		int median = 0;
		int n = questionAnswers.length;
		if (n % 2 == 1) {
			median = questionAnswers[(n + 1) / 2 - 1];
		} else {
			median = (questionAnswers[n / 2 - 1] + questionAnswers[n / 2]) / 2;
		}
		
		System.out.println("The median of your scores is " + median + ".");
		
		
		int mode = 0;
		for (i3 = 0; i3 < questionAnswers.length; i3++) {
			int count = 0;
			int maxOccured = 0;
			for (j = 0; j < questionAnswers.length; j++) {
				if (questionAnswers[i3] == questionAnswers[j]) {
					count++;
				}

				if (maxOccured < count) {
					maxOccured = count;
					mode = questionAnswers[i3];
				}
			}
		}
		
		System.out.println("The score you gave the most was " + mode + ".");
		System.out.println(" ");
		System.out.println("Thank you again for taking our survey! We hope to see you again! :)");
	}
	
	

	public static int[] readAverageSurvey(String filename) {
		
		String inputLine;
		File inFile = new File(filename); // creates variable for text file name
		ArrayList<String> list = new ArrayList<String>();
		if (inFile.exists()) {
			Scanner fileInput;
			try {
				fileInput = new Scanner(inFile).useDelimiter(",\\s*");
				
				while(fileInput.hasNext()) {
					inputLine = fileInput.next();
					//System.out.println(inputLine);
					list.add(inputLine);
				}
				
				//Collections.sort(list);
				//System.out.println("list size " + list.size());
				int[] array = new int[list.size()];
				for(int k = 0; k < array.length; k++) {
					
					array[k] = (Integer.parseInt(list.get(k)));
				}
				System.out.println("Read Average Answers: " + Arrays.toString(array).replace("[", "").replace("]", ""));  //remove the left and right bracket);
		        /*for(int k = 0; k < array.length; k++) {
					
					System.out.println(array[k]);
				}*/
	
	

				fileInput.close();
				return array;
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
				System.exit(1);
			}	
		} else {
			int[] array = new int[0];
			System.out.println("Read Average Answers: None Exists"); 
			return array;
		}	
		int[] array = new int[0];
		System.out.println("Read Average Answers: None Exists"); 
		return array;
	}
	
	
	public static void writeAverageSurvey(String filename, int[] userAnswers, int[] averageAnswers) {
		
		for(int a = 0; a < userAnswers.length;a++) {
			System.out.println(userAnswers[a]);
		}
		File tempFile = new File(filename); // creates variable for text file name
		boolean createdNewAverage = false;
		//if (tempFile.exists()) { 
		FileWriter PrintWriter;
		try {
			PrintWriter = new FileWriter(tempFile);
			if (averageAnswers.length == 0) {
				averageAnswers = new int[userAnswers.length];
				createdNewAverage = true;
			}
				
			for(int k = 0; k < userAnswers.length; k++) {
				if (createdNewAverage) {
					averageAnswers[k] = userAnswers[k];
				} else {
					averageAnswers[k] = (userAnswers[k] + averageAnswers[k]) / 2;
				}
				//System.out.println("userAnswer: " + userAnswers[k] + "| averageAnswers: " + averageAnswers[k]);
			}
			System.out.println("Writing Average Answers: " + Arrays.toString(averageAnswers).replace("[", "").replace("]", ""));  //remove the left and right bracket);
			
			PrintWriter.write(Arrays.toString(averageAnswers).replace("[", "").replace("]", ""));
			PrintWriter.close();
			//System.out.println("Successfully wrote to the file.");
		} catch (IOException e) {
			System.out.println(e);
			System.exit(1);
			e.printStackTrace();
			//System.out.println("An error occurred.");
		} // creates variable for text file name
		//} else {
		//	System.out.println("ERROR: " + filename + " not found.");
		//}	
	}
	

}