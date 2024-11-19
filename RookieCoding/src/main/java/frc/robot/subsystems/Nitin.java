// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;


import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import com.ctre.phoenix6.hardware.TalonFX;

public class Nitin extends SubsystemBase {
  /** Creates a new Nitin. */
  public Nitin() {
    InitialMotor = new TalonFX(3);
  }

  
  public void spinMotor() {
    InitialMotor.setVoltage(6);
  }

  public void endIntake() {
    InitialMotor.setVoltage(1);
  }

  @Override
  public void periodic () {
  }

  @Override
  public void condition () {
    if (Nitin_Command != null) {
      Nitin_Command.cancel();
    }
  
  }

}




