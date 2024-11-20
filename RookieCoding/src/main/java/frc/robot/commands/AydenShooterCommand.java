// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.AydenShooter;

public class AydenShooterCommand extends Command {
  //Defines AydenShooter
  private AydenShooter mAydenShooter;
  //mSpeed defines speed
  private double mSpeed;
  /** Creates a new AydenShooterCommand. */
  public AydenShooterCommand(AydenShooter AydenShooter, double speed) {
    // Use addRequirements() here to declare subsystem dependencies.
    this.mAydenShooter = AydenShooter;
    this.mSpeed = speed;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    if(mSpeed>=10){
    mAydenShooter.AydenShooterShoot(10);
    }else if(mSpeed<10){
      mAydenShooter.AydenShooterShoot(mSpeed);
    }
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    mAydenShooter.StopAydenShooter();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
