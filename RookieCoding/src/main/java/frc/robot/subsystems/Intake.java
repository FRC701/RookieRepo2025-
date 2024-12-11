// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import com.ctre.phoenix6.hardware.TalonFX;

public class Intake extends SubsystemBase {

  private TalonFX IntakeMotor;

  /** Creates a new Intake. */
  public Intake() {
    IntakeMotor = new TalonFX(0);
  }

  public void spinIntakeMotor() {
    IntakeMotor.setVoltage(4);
  }

  public void stopIntake() {
    IntakeMotor.setVoltage(0);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler 
    
  }
}
