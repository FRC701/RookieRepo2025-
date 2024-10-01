// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix6.hardware.TalonFX;

public class Ryan extends SubsystemBase {
  /** Creates a new Ryan. */

private TalonFX jeefMotor;

//keep voltage between -12 ~ 12 Volts

public Ryan() {
  jeefMotor = new TalonFX(0);
}

public void spinJeefMotor() {
  jeefMotor.setVoltage(5);
}

public void reverseJeefMotor () {
  jeefMotor.setVoltage(-5);
}

public void stopJeefMotor () {
  jeefMotor.setVoltage(0);
}

public void spinJeefMotor(double speed) {
  //"JESUS! DuDE! gOoOD!"-Ryan Bauer 10/03/2024 16:50:07




  jeefMotor.setVoltage(speed);
}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
