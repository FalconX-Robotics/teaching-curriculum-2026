# Introduction to WPILIB code and lifecycles - Part 2 (Commands)

For this exercise, continue writing in your code from the last exercise.

NOTE: ignore the IsFinished() and that it is erroring for now

Your tasks are the following:

1. Find the ExampleCommand.java file

2. make it into a WPILIB "Command" (the "IsFinished()" should STOP erroring if done correctly)

3. go to Robot.java and go to line 68 in disabledInit (a method which runs when disabled mode initilizes) and un-comment it, allowing the command to run on start of simulation

4. print in the terminal (using System.out.println) something that would show you that the following has happened (when it happens):
 - when the command file gets created
 - when the command file starts running
 - the command is currently running
 - the command stopped running

 5. Remember the IsFinished()? It should have stopped erroring by now because you have made it a WPILIB command in step 2. Now, fill in what the comments in the file tell you.

 6. Simulate the code and test! (You can comment out the line from ExampleSubsystem that prints out the numbers into the terminal to help you see if you did THIS exercise correctly)

 GOOD JOB! You are done! HURRAY!!!!!