// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFx;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class jim extends SubsystemBase {
  //Our motor
  private TalonFx jimSecond; 
  /** Creates a new jim. */
  public jim() {
    jimSecond = new TalonFx(4);
  }

  public void setSpeed(){
    jimSecond.setVoltage(3);
  }

  public void stopMotor(){
    jimSecond.setVoltage(0);
  }


  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
