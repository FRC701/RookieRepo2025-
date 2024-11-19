// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix6.hardware.TalonFX;

public class LoganDSubsystem extends SubsystemBase {
  /** Creates a new LoganDSubsystem. */

  private TalonFX CoolMotor;
  private TalonFX AnotherMotor;

  public LoganDSubsystem() 
  {
    CoolMotor = new TalonFX(1);
    AnotherMotor = new TalonFX(2);
  }

  public void forward() {
    CoolMotor.setVoltage(2.0);
  }
  public void backward() {
    AnotherMotor.setVoltage(-2.0);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
