// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.InstantCommand;
import frc.robot.subsystems.AydenShooter;

// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/stable/docs/software/commandbased/convenience-features.html
public class AydenShoot extends InstantCommand {
  private AydenShooter mAydenShooter;
  private double mSpeed;

  public AydenShoot(AydenShooter AydenShooter, double speed) {
    this.mAydenShooter = AydenShooter;
    this.mSpeed = speed;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(AydenShooter);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    if(mSpeed >= 15)
   mAydenShooter.AydenShooterShootSpeed(15);
   else if(mSpeed < 15){
    mAydenShooter.AydenShooterShootSpeed(mSpeed);
   }else if(mSpeed == 0){
    mAydenShooter.StopAydenShooter();
   }
  }
}
