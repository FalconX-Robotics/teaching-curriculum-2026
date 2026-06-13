// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import java.time.LocalDateTime;

import org.photonvision.PhotonCamera;

import com.ctre.phoenix.Util;
import com.pathplanner.lib.auto.AutoBuilder;
import com.pathplanner.lib.auto.NamedCommands;

import edu.wpi.first.util.datalog.DataLog;
import edu.wpi.first.wpilibj.DataLogManager;
import edu.wpi.first.wpilibj.Filesystem;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.ParallelCommandGroup;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.Trigger;
 
/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and trigger mappings) should be declared here.
 */
public class RobotContainer {
  public SendableChooser<Command> autoChooser = new SendableChooser<Command>();

  public static final boolean atRecEvent = true;
  
  public static class Controllers {
    /**
     * Driver controller object. The driver controller is connected on port 0.
     * 
     * <p>Use to drive the swerve drive.
     */
    public final CommandXboxController driver = new CommandXboxController(0);

    /**
     * Operator controller object. The operator controller is connected on port 1.
     * 
     * <p>Use to control all robot functions that don't involve swerve.
     */
    public final CommandXboxController operator = new CommandXboxController(1);
  }

  public static class Subsystems {
    //where subsystems go un-initialized

  }

  public static class Commands {
    //where commands go un-initialized
  }

  public final Controllers controllers = new Controllers();
  public final Subsystems subsystems = new Subsystems();
  public final Commands commands = new Commands();

  public final PhotonCamera visionCamera = new PhotonCamera("Limelight"); 

  /**
   * The container for the robot. Contains subsystems, OI devices, and commands.
   */
  public RobotContainer() {
    // Initialize the logging module
    frc.robot.util.Util.setStartTime(LocalDateTime.now());
    DataLogManager.start(Filesystem.getOperatingDirectory() + "/logs", frc.robot.util.Util.getLogFilename());
    // DataLogManager.stop();

    // Initialize subsystems

    // Initialize commands

    //pathplanner


    // Configure trigger bindings
    this.configureBindings();
  }

  /**
   * Robot periodic method. Runs at 50Hz (once every 20ms).
   */
  public void robotPeriodic() {

  }
  
  /**
   * Use this method to define your trigger->command mappings. Triggers can be created via the
   * {@link Trigger#Trigger(java.util.function.BooleanSupplier)} constructor with an arbitrary
   * predicate, or via the named factories in {@link
   * edu.wpi.first.wpilibj2.command.button.CommandGenericHID}'s subclasses for {@link
   * CommandXboxController Xbox}/{@link edu.wpi.first.wpilibj2.command.button.CommandPS4Controller
   * PS4} controllers or {@link edu.wpi.first.wpilibj2.command.button.CommandJoystick Flight
   * joysticks}.
   */
  private void configureBindings() {
    // Bind buttons below
    
  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    return this.autoChooser.getSelected();
  }

  public void setDriveMode() {
    this.configureBindings();
  }
}
