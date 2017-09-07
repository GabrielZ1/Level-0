import javax.swing.JOptionPane;

public class QuizGame {
public static void main(String[] args) {
	int score = 0;
	String answer1=JOptionPane.showInputDialog("What is 1815+634"); 
	if(answer1.equals("2449")) {
	
		
		score+=1;
		JOptionPane.showMessageDialog(null, "Correct");
	
	}
	JOptionPane.showMessageDialog(null, "Score: "+score);
	
	
	String answer2=JOptionPane.showInputDialog("What is the opposite of red");
	if(answer2.equals("blue")) {
		
		score+=1;
		JOptionPane.showMessageDialog(null, "Correct");
		
		
		
		
	}
	JOptionPane.showMessageDialog(null, "Score: "+score);
	String answer3=JOptionPane.showInputDialog("What is 15x15");
	if (answer3.equals("225"));{
		
		score+=1;
		
		JOptionPane.showMessageDialog(null, "Correct");
		
	
	}
	JOptionPane.showMessageDialog(null, "Score: "+score);
	
	
	
	
}
}



