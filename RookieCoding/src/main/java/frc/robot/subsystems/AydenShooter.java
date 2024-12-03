// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix6.hardware.TalonFX;

public class AydenShooter extends SubsystemBase {

  private TalonFX AydenShooter;

  /** Creates a new AydenShooter. */
  public AydenShooter() {
    AydenShooter=new TalonFX(3);
  }
 
  //Sets shoot speed for AydenShooter
  public void AydenShooterShootSpeed(double speed) {
    AydenShooter.setVoltage(speed);
  }

  //Stops AydenShooter
  public void StopAydenShooter(){
    AydenShooter.setVoltage(0);
  }

  @Override
  public void periodic(){
    //This method will be called once scheduler run
  }
}
