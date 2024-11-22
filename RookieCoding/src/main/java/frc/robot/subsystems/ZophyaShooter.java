// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix6.hardware.TalonFX;


public class ZophyaShooter extends SubsystemBase {

  /** Creates a new ZophyaShooter. */
  private TalonFX ZophyaShooter;

  public ZophyaShooter() {
    ZophyaShooter = new TalonFX(4);
  }

  public void ShootZophyaShooter(double speed) {
    ZophyaShooter.setVoltage(speed);
  }

  public void StopZophyaShooter() {
    ZophyaShooter.setVoltage(0);
  }


  
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
