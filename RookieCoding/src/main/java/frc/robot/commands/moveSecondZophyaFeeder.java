// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.SecondZophyaFeeder;

public class moveSecondZophyaFeeder extends Command {
  /** Creates a new moveFeeder. */

//mSpeed defines the speed of the motor.
private double mSpeed;
//blah blah this is the motor
private SecondZophyaFeeder mSecondZophyaFeeder;

  public moveSecondZophyaFeeder(SecondZophyaFeeder secondFeeder, double speed) {
    // Use addRequirements() here to declare subsystem dependencies.
    this.mSpeed = speed;
    this.mSecondZophyaFeeder = secondFeeder;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    mSecondZophyaFeeder.SecondSpinFeederMotor(mSpeed);
  }

  //Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    mSecondZophyaFeeder.SecondFeederStopMotor();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
