// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.ZophyaFeeder;

public class moveZophyaFeeder extends Command {
  /** Creates a new moveFeeder. */

private double mSpeed;
private ZophyaFeeder mZophyaFeeder;

  public moveZophyaFeeder(double speed, ZophyaFeeder feeder) {
    // Use addRequirements() here to declare subsystem dependencies.
    this.mSpeed = speed;
    this.mZophyaFeeder = feeder;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    mZophyaFeeder.spinFeedMotor(mSpeed);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    mZophyaFeeder.feederStopMotor();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
