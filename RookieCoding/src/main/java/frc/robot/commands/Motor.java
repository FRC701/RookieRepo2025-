// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Somthing;


public class Motor extends Command {
  /** Creates a new Motor. */
  private Somthing mMotor;
  private double mSpeed;

  public Motor(Somthing AmelieMotor, double speed) {
    // Use addRequirements() here to declare subsystem dependencies.
    // My motor and speed
  this.mMotor = AmelieMotor;
  this.mSpeed = speed;
  }
 

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  // THIS IS MY ELSE IF STATEMENT
  @Override
  public void execute() {
        if(mSpeed==8){
    mMotor.spinAmelieMotor();

    }else if(mSpeed==12){
    mMotor.stopAmelieMotor();
    } 
  }
  
  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    mMotor.stopAmelieMotor();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}

