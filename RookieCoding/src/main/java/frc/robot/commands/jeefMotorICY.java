// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Ryan;

public class jeefMotorICY extends Command {
  /** Creates a new jeefMotorICY. */
  private double mSpeedy;
  private Ryan mJeef;

    // Use addRequirements() here to declare subsystem dependencies.
  public jeefMotorICY(double jeefSpeed, Ryan jeefMover) {
    this.mSpeedy = jeefSpeed; this.mJeef = jeefMover;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    mJeef.spinJeefMotor(mSpeedy);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    mJeef.stopJeefMotor();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
