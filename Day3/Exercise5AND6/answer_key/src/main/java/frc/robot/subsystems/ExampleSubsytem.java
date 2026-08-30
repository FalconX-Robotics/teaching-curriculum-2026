package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ExampleSubsytem extends SubsystemBase {
    private int value;

    public ExampleSubsytem() {
        value = 1;
    }

    @Override
    public void periodic() {
        value = value + 1;
        System.out.println(value);
    }
}
