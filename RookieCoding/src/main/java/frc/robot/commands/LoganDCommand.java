// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.LoganDSubsystem;

public class LoganDCommand extends Command {
  /** Creates a new LoganDCommand. */

  private LoganDSubsystem mFrontWheelMotor;
  private LoganDSubsystem mBackWheelMotor;
  private LoganDSubsystem mShooterMotor;

  public LoganDCommand(LoganDSubsystem FrontWheelMotor, LoganDSubsystem BackWheelMotor, LoganDSubsystem ShooterMotor) {
    this.mFrontWheelMotor = FrontWheelMotor;
    this.mBackWheelMotor = BackWheelMotor;
    this.mShooterMotor = ShooterMotor;

    // Use addRequirements() here to declare subsystem dependencies.
    
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {

  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    mFrontWheelMotor.forward();
    mBackWheelMotor.backward();
    mShooterMotor.shooter();
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    mFrontWheelMotor.stop();
    mFrontWheelMotor.stop();
    mShooterMotor.stop();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
