# Introduction to WPILIB code and lifecycles - Part 1 (Subsytems)

Now that you have gone through the general java basics, we can get into WPILIB libraries/apis.

You are give pre-written very bare-bones code and were now introduced to SubsystemBase and Command lifecycle methods. 

## Note:
Remember: "simulationperiodic()" is like a normal periodic method but ran only during simulation. This exercise doesn't include it as it is less important than others but useful to remember for the future :))

## Your task is the following:

1. Find the ExampleSubsystem.java file
2. make it into a subsystem using what you know so far (hint: it should inherit something)
3. make a variable that holds integers inside the class to be used across the class
4. assign the value to that variable ONLY INSIDE the constructor
4. use a lifecycle method that runs repeatedly and make it add 1 to the variable 
5. on a new line, in the same method, print the variable in the terminal (make the variable print on a new line each time)
5. simulate the robot code and the numbers should start getting spit out in the terminal!!!

REMEMBER: ctrl + c in the terminal to terminate and stop the numbers
