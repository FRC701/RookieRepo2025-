// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.Nitin;
import edu.wpi.first.wpilibj2.command.Command;
//import edu.wpi.first.wpilibj2.command.Commands;

public class Nitin_Command extends Command {
  /** Creates a new Nitin_Command. */
  
  private Nitin mNitin_Command;
  private double mSpeed;
  
  public Nitin_Command(Nitin mNitin_Command, mSpeed) {   
    this.Nitin_Command = mNitin_Command;
    this.Speed = mSpeed; 

    //Addrequirements(subsystem);
    
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    mNitin_Command.spinMotor();
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    mNitin_Command.stopMotor();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
