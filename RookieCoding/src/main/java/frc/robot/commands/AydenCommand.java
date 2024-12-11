// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Ayden;

public class AydenCommand extends Command {
  /** Creates a new AydenCommand. */
  private Ayden mAyden;
  private double mSpeed;
  public AydenCommand(Ayden ayden, double speed) {
    // Use addRequirements() here to declare subsystem dependencies.
    this.mAyden = ayden;
    this.mSpeed = speed;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    mAyden.MoveAydenMotor(mSpeed);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    mAyden.stopAyden();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
