import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DrawingPanel extends JPanel{
	
	
	public DrawingPanel() {
		super(new GridLayout(11,2));
		this.setBackground(Color.white);
		this.setSize(500, 500);
		int questionAnswers[] = new int[19];
		
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
		
		
		

		
		this.add(label1);
		this.add(comboBox1);
		this.add(label2);
		this.add(comboBox2);
		this.add(label3);
		this.add(comboBox3);
		this.add(label4);
		this.add(comboBox4);
		this.add(label5);
		this.add(comboBox5);
		this.add(label6);
		this.add(comboBox6);
		this.add(label7);
		this.add(comboBox7);
		this.add(label8);
		this.add(comboBox8);
		this.add(label9);
		this.add(comboBox9);
		this.add(label10);
		this.add(comboBox10);
		this.add(label11);
		this.add(comboBox11);
		
	}

}
