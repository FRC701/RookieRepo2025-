// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;


import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.commands.Nitin_Command;
import com.ctre.phoenix6.hardware.TalonFX;

public class Nitin extends SubsystemBase {
  /** Creates a new Nitin. */  

  private TalonFX InitialMotor;
  private TalonFX Nitin_Command;
  
  public Nitin() {
    InitialMotor = new TalonFX(3);
    Nitin_Command = new TalonFX(4);
  }
  
  public void spinMotor() {
    InitialMotor.setVoltage(6);
    Nitin_Command.setVoltage(2);
  }

  public void endIntake() {
    InitialMotor.setVoltage(1);
    Nitin_Command.setVoltage(0);
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




