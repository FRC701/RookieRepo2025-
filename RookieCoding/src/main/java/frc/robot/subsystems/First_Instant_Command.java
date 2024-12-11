// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.InstantCommand;
import frc.robot.subsystems.Nitin;

// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/stable/docs/software/commandbased/convenience-features.html
public class First_Instant_Command extends InstantCommand {
  private Nitin mNitin = new Nitin();
  private double mSpeed;

  
  public First_Instant_Command (Nitin Nitin, double speed) {
    this.mNitin = Nitin;
    this.mSpeed = speed;
    
    //this.mSmartSpeed = Smartspeed
    // Use addRequirements() here to declare subsystem dependencies.
  
  addRequirements(Nitin);
  }

  
  
  
  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    mNitin.spinMotor;
    

  }

}
