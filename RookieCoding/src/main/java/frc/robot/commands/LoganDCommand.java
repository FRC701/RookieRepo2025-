// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.LoganDSubsystem;

public class LoganDCommand extends Command {
  /** Creates a new LoganDCommand. */

  private LoganDSubsystem mLoganMotor;
  private LoganDSubsystem mStop;

  public LoganDCommand(LoganDSubsystem LoganMotor, LoganDSubsystem Stop) {
    this.mLoganMotor = LoganMotor;
    this.mStop = Stop;

    // Use addRequirements() here to declare subsystem dependencies.
    
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {

  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    mLoganMotor.forward();
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    mLoganMotor.stop();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
