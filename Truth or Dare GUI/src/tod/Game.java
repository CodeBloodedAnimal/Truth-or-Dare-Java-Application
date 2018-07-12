package tod;
import javax.swing.*;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
/* A truth or dare  JAVA Application. The users control the number of dares or questions and also types them. 
 * A null return means the player is skipped. 
 * Feel free to use this application and customize at your own will
 * author: Robert Mutua aka Pope
 */
public class Game extends JFrame implements ActionListener {
  
  
   private JButton btnplay,btnquit,btnhow;
   //set up GUI
public Game() {
	//set layout
	setLayout(new GridLayout(3,1,5,10));
	//initialize the components and add them to the GUI
	
	btnhow = new JButton("How to Play");
	add(btnhow);
	btnplay = new JButton("Play");
	add(btnplay);
	btnquit = new JButton("Quit");
	add(btnquit);
	btnquit.setMnemonic('Q');
	btnplay.setMnemonic('P');
	btnhow.setMnemonic('H');
	btnquit.addActionListener(this);
	btnplay.addActionListener(this);
	btnhow.addActionListener(this);
	}   
   public void actionPerformed(ActionEvent ae) {
	   if(ae.getSource()==btnhow) {
		   String tutorial;
		   tutorial="Welcome to the truth or dare app.\n "
		   		+ "This app is specifically designed to allow users to determine the number of dares and truth questions\n"
		   		+ " and also type their own dare or truth questions.\n"
		   		+ " A player then chooses a random number for which the range is specified.\n"
		   		+ " The app gets a random truth question or dare for the current player.\n"
		   		+ "A null return means that the user has to be skipped!\n";
		   JOptionPane.showMessageDialog(this,tutorial,"Truth or Dare by Pope",JOptionPane.INFORMATION_MESSAGE);
	   }
	   else if (ae.getSource()==btnquit) {
		   JOptionPane.showMessageDialog(this, "Application will exit","Truth or Dare by Pope",JOptionPane.INFORMATION_MESSAGE);
		   System.exit(0);
		   
	   }
	   else if (ae.getSource()==btnplay) {
		   int number,endgame=0,userchoice;
			int userlimit= 0;
			int counter;
			String dialog;
			dialog=JOptionPane.showInputDialog("Enter a limit");
			
			userlimit=Integer.parseInt(dialog);
			String[] choice= new String[userlimit+userlimit/4];
			Random no = new Random();
			counter=userlimit;
		    
			
			
			for(int limit =0;limit<userlimit;limit++) {
				dialog=JOptionPane.showInputDialog("Enter a dare or truth question "+counter--+" times");
					choice[limit] = dialog;
				
			}
			
			
			do{
			
			dialog=JOptionPane.showInputDialog("It is time to play now. Choose a random number between 0 and "+userlimit+"\n 1000 to quit");
				
			 userchoice = Integer.parseInt(dialog);
			 if(userchoice==1000) {
				 endgame=1000;
				 JOptionPane.showMessageDialog(null,"Thank you for playing!","Truth or Dare by Pope",JOptionPane.INFORMATION_MESSAGE);
				 break;
			 }
			
			 number = 1+no.nextInt(userlimit);
			 userchoice = userchoice+number;
			if (userchoice>userlimit) {
				userchoice=userchoice-number;
				userchoice-=1;
			}
			
			
			  JOptionPane.showMessageDialog(null,"Your Choice!  " +choice[userchoice],"Truth or Dare by Pope",JOptionPane.INFORMATION_MESSAGE);
			  System.out.println(choice[userchoice]);
			  }while(endgame!=1000);
		   
	   }
   }
   
   

}

