package frc.robot.util;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

import org.dyn4j.geometry.Vector2;

import edu.wpi.first.math.geometry.Pose3d;
import edu.wpi.first.math.geometry.Transform3d;
import edu.wpi.first.util.datalog.BooleanLogEntry;
import edu.wpi.first.util.datalog.DoubleLogEntry;
import edu.wpi.first.util.datalog.IntegerLogEntry;
import edu.wpi.first.wpilibj.DataLogManager;
import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.DriverStation.Alliance;
import frc.robot.Robot;

public class Util {
  private static LocalDateTime startTime;

  public static String getLogFilename() {
    final DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss").withZone(ZoneId.of("UTC"));
    final String prefix = Robot.isSimulation() ? "sim_" : "robot_";
    final String suffix = DriverStation.isFMSAttached() ? "_match" + DriverStation.getMatchNumber() : "_test" + (DriverStation.isAutonomous() ? "Auto" : "Teleop");
    
    return prefix + timeFormatter.format(Util.startTime) + suffix + ".wpilog";
  }

  public static void setStartTime(LocalDateTime time) {
    Util.startTime = time;
  }

  public static DoubleLogEntry createDoubleLog(String name) {
    return new DoubleLogEntry(DataLogManager.getLog(), name);
  }

  public static IntegerLogEntry createIntLog(String name) {
    return new IntegerLogEntry(DataLogManager.getLog(), name);
  }

  public static BooleanLogEntry createBooleanLog(String name) {
    return new BooleanLogEntry(DataLogManager.getLog(), name);
  }

}