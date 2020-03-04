# Java Programming Samples
## RockPaperScissors.java
Over the summer of 2019, I decided to do a self-directed study of Java Swing. I had already taken courses in OOP but never had exposure to programming any applications using a GUI. This is my first exposure to GUI projects.
### About the Application:
RockPaperScissors is a "game" where a user is presented with three buttons: Rock, Paper, and Scissors. The user clicks a button and the computer automatically makes a selection at random. If the user "wins" the game, the screen background colour changes to green and their score increments, which is displayed at the bottom of the screen. In the case of tie, the screen turns yellow and the score remains the same. In the case of a loss, the background colour turns red and the score decrements.

The application is quite simple but demonstrates the use of Swing layouts, anonymmous inner classes, modifying attributes of GUI components. In the future, I would love to use Swing to develop more sophisticated applications, but I am very happy with what I was able to teach myself from a book.

### Images:
When the program runs, this is the screen displayed.
![Starting Screen](https://github.com/alexsproul/projects/blob/master/javasamples/images/RockPaperScissorsStart.PNG)

In this example, the user clicks one of the buttons and the computer chooses the same option. After a tie, the screen colour changes to yellow and the score remains the same.

![Tie Screen](https://github.com/alexsproul/projects/blob/master/javasamples/images/RockPaperScissorsTie.PNG)

In the second image, the user selects a button and loses the match. The background colour turns red and their score decreases to -1.

![Loss Image](https://github.com/alexsproul/projects/blob/master/javasamples/images/RockPaperScissorsLoss.PNG)

Finally, the user selects a button and wins the match. The background changes to green and their score increments.

![Win Image](https://github.com/alexsproul/projects/blob/master/javasamples/images/RockPaperScissorsWin.PNG)
