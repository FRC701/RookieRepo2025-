// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix6.hardware.TalonFX;
import com.ctre.phoenix6.configs.TalonFXConfiguration;

public class SecondZophyaFeeder extends SubsystemBase {
  /** Creates a new SecondZophyaFeeder. */
  private TalonFX secondFeederMotor;

  
public SecondZophyaFeeder(){
  secondFeederMotor = new TalonFX(1);
}

public void feederSpinMotor() {
  secondFeederMotor.setVoltage(4);
}

public void feederStopMotor() {
  secondFeederMotor.setVoltage(0);
}

public void reverseFeederMotor(){
  secondFeederMotor.setVoltage(-4);
}
 
public void spinFeederMotor(double speed) {
  secondFeederMotor.setVoltage(speed);
}

@Override
public void periodic() {
}
}
