// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.ZophyaFeeder;

public class ZophyaCommand extends Command {
  /** Creates a new ZophyaCommand. */
  private ZophyaFeeder mZophya;
  private double mSpeed;
  public ZophyaCommand(ZophyaFeeder zophya, double speed) {
    // Use addRequirements() here to declare subsystem dependencies.
    this.mZophya = zophya;
    this.mSpeed = speed;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    mZophya.feederSpinMotor();
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    mZophya.feederStopMotor();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }

}
