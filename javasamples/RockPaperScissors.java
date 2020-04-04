/* Rock Paper Scissors Game

   This is my first GUI game! The user chooses either
   rock, paper, or scissors. The player chooses rock, paper, or scissors
   and when they press the button, the program makes a choice as well.
   If the player wins, the window turns green and the player's score increments.
   If the player loses, the window turns red and the player's score decrements.
   If there is a tie, the window turns yellow and the score stays the same.
   
   Alexander Sproul June 20th, 2019
*/


//These are the required imported classes.
import javax.swing.*;
import java.awt.*; 
import java.awt.event.*;
import java.util.Random;

//Inherits methods from the JFrame class so we don't have to make
//an object.
public class RockPaperScissors extends JFrame
{
   //Specifies the height and width of the window
   private final int WINDOW_WIDTH = 600;
   private final int WINDOW_HEIGHT = 200;
   
   //This will keep track of the score.
   private int score;
   
   //These are the labels that will be put into containers.
   private JLabel instructions, scoreLabel;
   
   //These are the containers that will hold the labels and contents of
   //the game.
   private JPanel buttonPanel, instructionsPanel, scorePanel;
   
   //Declares buttons
   private JButton rockButton, paperButton, scissorsButton;
   
   
   //Constructor Method:
   public RockPaperScissors()
   {
      setTitle("Rock Paper Scissors Game!"); //Sets title of the window
      setSize(WINDOW_WIDTH, WINDOW_HEIGHT); //Sets the window size
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Ends the program when closed
      setLayout(new BorderLayout()); //Border Layout made the most sense
      score = 0; //Initializes the score to 0.
      
      //Initializes the text that will be put in the containers.
      instructions = new JLabel("Click a button to play.");
      scoreLabel = new JLabel("Score: " + score); //"" added to turn it to turn score to String
      
      //Initializes the containers
      buttonPanel = new JPanel();
      instructionsPanel = new JPanel();
      scorePanel = new JPanel();
      
      //Creates the button options
      rockButton = new JButton("Rock");
      paperButton = new JButton("Paper");
      scissorsButton = new JButton("Scissors");
      
      //Adds all components to their respective containers
      buttonPanel.add(rockButton);
      buttonPanel.add(paperButton);
      buttonPanel.add(scissorsButton);
      instructionsPanel.add(instructions);
      scorePanel.add(scoreLabel);
      
      //Adds the containers to their positions on the layout
      //of the current JFrame
      add(instructionsPanel, BorderLayout.NORTH);
      add(buttonPanel, BorderLayout.CENTER);
      add(scorePanel, BorderLayout.SOUTH);
      
      //Pairs buttons to action event
      rockButton.addActionListener(new ButtonListener());
      paperButton.addActionListener(new ButtonListener());
      scissorsButton.addActionListener(new ButtonListener());
      
      //Lets the user see the screen when the JFrame is created.
      setVisible(true);
   }
   
   //Getter and Setter for the score variable.
   public int getScore(){return score;}
   public void setScore(int score){this.score = score;}
   
   /*
      Event Handler: This is determines what happens when the user
      chooses a button. This is written as an anonymous inner class.
   */
   private class ButtonListener implements ActionListener
   {
      //Listens for an action.
      public void actionPerformed(ActionEvent e)
      {
         //Declares Strings to store user's choice and the computer's choice.
         String playerChoice, computerChoice;
         
         //If the Rock button was pressed
         if (e.getSource() == rockButton)
            //Store the player's choice as "Rock"
            playerChoice = "Rock";
         //If the Paper button was pressed
         else if (e.getSource() == paperButton)
            //Stores the player's choice as "Paper"
            playerChoice = "Paper";
         //Otherwise, if the Scissors button was pressed
         else
            //Stores the player's choice as "Scissors".
            playerChoice = "Scissors";
        
         //Initializes an array to store possible choices for the computer.
         String [] choices = {"Rock", "Paper", "Scissors"}; 
         //Initializes a random integer between 0 and 2 (the array indices above)
         int random = new Random().nextInt(3);
         //Stores the computer's choice as the String corresponding to the randomly
         //generated array index.
         computerChoice = choices[random];
         
         //If the player's choice is the same as the computer's choice
         if (playerChoice.equals(computerChoice))
            //Tie! Set the background colour to yellow.
            buttonPanel.setBackground(Color.YELLOW);
            
         //If they did not choose the same and the player's choice is Rock
         else if(playerChoice.equals("Rock"))
         {
            //If the computer chose Scissors
            if(computerChoice.equals("Scissors"))
            {
               //Player wins! Set the background colour to green.
               buttonPanel.setBackground(Color.GREEN);
               //Increment the player's score.
               score++;
            }
            //If the computer chose Paper
            else
            {
               //Player loses! Set the background colour to red.
               buttonPanel.setBackground(Color.RED);
               //Decrement player's score.
               score--;
            }
         }
         
         //If the choices were not the same and the player chose Paper
         else if(playerChoice.equals("Paper"))
         {
            //If the computer chose Rock
            if(computerChoice.equals("Rock"))
            {
               //Player wins! Set background colour to green.
               buttonPanel.setBackground(Color.GREEN);
               //Increment score.
               score++;
            }
            
            //Otherwise, if the computer chose Scissors
            else
            {
               //Player loses! Set background colour to red.
               buttonPanel.setBackground(Color.RED);
               //Decrement score.
               score--;
            }
         }
         
         //Otherwise, if the player chose Scissors
         else
         {
            //If the computer chose Paper
            if(computerChoice.equals("Paper"))
            {
               //Player wins! Set background colour to green.
               buttonPanel.setBackground(Color.GREEN);
               //Increment score.
               score++;
            }
            
            //If the computer chose Rock
            else
            {
               //Player loses! Set background colour to red.
               buttonPanel.setBackground(Color.RED);
               //Decrement score.
               score--;
            }
         }
         //Updates the label with the player's current score.
         scoreLabel.setText("Score: " + score);
         
      }
   }
   
   //Main Method: Runs the program.
   public static void main(String [] args)
   {
      new RockPaperScissors();
   }
   
}