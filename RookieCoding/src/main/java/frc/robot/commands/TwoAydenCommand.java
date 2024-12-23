// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.TwoAyden;

public class TwoAydenCommand extends Command {
 //This is the motor
  private TwoAyden mTwoAyden;
  //MSpeed defines speed
  private double mSpeed;
  public TwoAydenCommand(TwoAyden TwoAyden, double speed) {
    // Use addRequirements() here to declare subsystem dependencies.
    this.mTwoAyden = TwoAyden;
    this.mSpeed = speed;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    // if else if else if statement for the speed for leftmotor and rightmotor
    if(mSpeed >= 10){
    mTwoAyden.spinTwoAydenLeftMotor(mSpeed);
    mTwoAyden.spinTwoAydenRightMotor(mSpeed);
  }else if(mSpeed < 10){
    mTwoAyden.spinTwoAydenLeftMotor(1);
    mTwoAyden.spinTwoAydenRightMotor(1);
  }else if(mSpeed < 1){
    mTwoAyden.stopTwoAydenLeftMotor();
    mTwoAyden.stopTwoAydenRightMotor();
  }
    
  
}

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    //stops left and right motor
    mTwoAyden.stopTwoAydenLeftMotor();
    mTwoAyden.stopTwoAydenRightMotor();
  }


  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
