// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;
import frc.robot.Constants;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Ryan extends SubsystemBase {
  /** Creates a new Ryan. */

 private TalonFx JeefMotorJr;

  public Ryan() {
    JeefMotorJr = new TalonFX(2);
  }

 public void spinMotor () {
 JeefMotorJr.setVoltage(22);
 }

 public void endIntake () {
  JeefMotorJr.setVoltage(0);
 }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
