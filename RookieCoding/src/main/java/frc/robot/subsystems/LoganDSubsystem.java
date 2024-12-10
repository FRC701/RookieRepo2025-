// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix6.hardware.TalonFX;

public class LoganDSubsystem extends SubsystemBase {
  /** Creates a new LoganDSubsystem. */

  private TalonFX LoganMotor;
  private TalonFX Stop;
  private TalonFX SubsystemLogan;
  private TalonFX Shoot;

  public LoganDSubsystem() {
    LoganMotor = new TalonFX(1);
    Stop = new TalonFX(2);
    SubsystemLogan = new TalonFX(3);
    Shoot = new TalonFX(4);
  }
  public void forward() {
    LoganMotor.setVoltage(2.0);
  }
  public void stop() {
    Stop.setVoltage(0.0);
  }
  public void fireindahole() {
    Shoot.setVoltage(4.0);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}