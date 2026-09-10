package frc.robot.commands;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.RobotContainer;
import frc.robot.subsystems.Climber;

public class ClimbDown extends Command {
  final Climber climberSubsystem;
  final TalonFX motor;

  //arm up
  public ClimbDown(RobotContainer robotContainer) {
    this.climberSubsystem = robotContainer.subsystems.climber;
    this.motor = this.climberSubsystem.motor;
    addRequirements(this.climberSubsystem);
    motor.setPosition(0);
  }

  @Override
  public void execute() {
    this.climberSubsystem.motor.set(0.6);
  }
  
  @Override
  public void end(boolean interrupted) {
    this.climberSubsystem.motor.set(0.0);
  }

  @Override
  public boolean isFinished() {
    final boolean result = Math.abs(motor.getPosition().getValueAsDouble()) >= 115.0;

    return result;
  }
}
