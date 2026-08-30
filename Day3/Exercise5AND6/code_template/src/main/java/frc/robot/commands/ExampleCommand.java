package frc.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.Command;

public class ExampleCommand {
    
    @Override
    public boolean isFinished() {
        if (Timer.getFPGATimestamp() > 3){
            //on the line below: tell the isFinished to end the command

        }
        //on the line below: tell the isFinished NOT to end the command
            
    }
}
