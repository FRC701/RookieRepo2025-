// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.ZophyaShooter;

public class ZophyaShooterCommand extends Command {
  /** Creates a new ZophyaShooterCommand. */

private ZophyaShooter mZophyaShooter;
private double mSpeed;

  public ZophyaShooterCommand(ZophyaShooter ZophyaShooter, double speed) {
    // Use addRequirements() here to declare subsystem dependencies.
    this.mZophyaShooter = ZophyaShooter;
    this.mSpeed = speed;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    if(mSpeed >= 6){
      mZophyaShooter.ShootZophyaShooter(8);
    } else if (mSpeed < 8){
      mZophyaShooter.ShootZophyaShooter(mSpeed);
    }
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    mZophyaShooter.StopZophyaShooter();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
