// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.units.Voltage;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix6.hardware.TalonFX;


public class MilesSubsystem extends SubsystemBase {
  /** Creates a new MilesSubsystem. */

public TalonFX MilesMotor;
private boolean MilesVariable;
private TalonFX MilesMotorNegative;
private TalonFX milesmotor;


public MilesSubsystem() {
  MilesMotor = new TalonFX(1);
  MilesMotorNegative = new TalonFX(3); 
  milesmotor = new TalonFX(2);
}



public void MilesVariableLoop(){
  while (MilesVariable = true) {
    MilesMotor.setVoltage(2);
  }
}
public void MilesVariableLoopNegative() {
  while (MilesVariable =! true) { 
    MilesMotorNegative.setVoltage(-2);
  }
}

  @Override
  public void periodic() {    // This method will be called once per scheduler run
}}