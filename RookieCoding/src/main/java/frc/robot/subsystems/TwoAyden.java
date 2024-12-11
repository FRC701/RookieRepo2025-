// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix6.hardware.TalonFX;

public class TwoAyden extends SubsystemBase {

  private TalonFX TwoAydenRightMotor;
  private TalonFX TwoAydenLeftMotor;

  /** Creates a new TwoAyden. */
  public TwoAyden() {
    TwoAydenRightMotor=new TalonFX(2);
    TwoAydenLeftMotor=new TalonFX(1);
  }

  public void spinTwoAydenRightMotor(double speed){
    TwoAydenRightMotor.setVoltage(speed);
  }

  public void spinTwoAydenLeftMotor(double speed){
    TwoAydenLeftMotor.setVoltage(speed);
  }

  public void stopTwoAydenRightMotor(){
    TwoAydenRightMotor.setVoltage(0);
  }

 public void stopTwoAydenLeftMotor(){
  TwoAydenLeftMotor.setVoltage(0);
}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run

  }
}
