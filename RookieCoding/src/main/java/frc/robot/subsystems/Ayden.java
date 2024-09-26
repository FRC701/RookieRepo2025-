// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import com.ctre.phoenix6.hardware.TalonFX;

public class Ayden extends SubsystemBase {

private TalonFX AydenMotor;

  /** Creates a new AydenMotor. */
  public Ayden() {
    AydenMotor=new TalonFX(0);
  }

  public void spinAydenMotor(){
    AydenMotor.setVoltage(4);
  }

  public void stopAyden(){
    AydenMotor.setVoltage(0);
  }

  public void MoveAydenMotor(double speed){
    AydenMotor.setVoltage(speed * 12);
  }
  
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
