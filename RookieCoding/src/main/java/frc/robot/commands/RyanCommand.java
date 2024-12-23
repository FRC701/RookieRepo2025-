// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Ryan;

public class RyanCommand extends Command {
  private double mSpeed;
  private Ryan mJeefMotorJr;
  private Ryan mUmbraMotor;

  /** Creates a new RyanCommand. */
  public RyanCommand(Ryan JeefMotorJr, Ryan UmbraMotor, double speed) {
    // Use addRequirements() here to declare subsystem dependencies.
  this.mJeefMotorJr = JeefMotorJr;
  this.mUmbraMotor = UmbraMotor;
  this.mSpeed = speed; 
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {

  mUmbraMotor.spinMotor();
  mJeefMotorJr.spinMotor();
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {

    mUmbraMotor.stopMotor();
    mJeefMotorJr.stopMotor();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
