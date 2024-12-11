// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import javax.management.RuntimeErrorException;

import edu.wpi.first.wpilibj2.command.InstantCommand;
import frc.robot.subsystems.Somthing;
// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/stable/docs/software/commandbased/convenience-features.html
public class RunMotor extends InstantCommand {
  private Somthing mSomthing;
  private double mSpeed;
  public RunMotor(Somthing AmelieMotor, double speed) {
    this.mSomthing = AmelieMotor;
    this.mSpeed = speed;
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    mSomthing.spinAmelieMotor();
    
    
    
  }
}
