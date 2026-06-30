package frc.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.Command;

public class ExampleCommand extends Command {
    public ExampleCommand() {
         System.out.println("The command file was created");
    }
    @Override
    public void initialize() {
        System.out.println("The command file started running");
    }
    @Override
    public void execute() {
        System.out.println("The command file is running");
    }
    @Override
    public boolean isFinished() {
        if (Timer.getFPGATimestamp() > 3){
            return true;
        }
        return false;
    }
    @Override
    public void end(boolean interrupted) {
        System.out.println("The command file has ended running");
    }
}
