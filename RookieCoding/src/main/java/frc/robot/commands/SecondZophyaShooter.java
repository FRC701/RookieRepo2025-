// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;
import frc.robot.subsystems.ZophyaShooterSubsystem;
import edu.wpi.first.wpilibj2.command.InstantCommand;

// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/stable/docs/software/commandbased/convenience-features.html
public class SecondZophyaShooter extends InstantCommand {
  private ZophyaShooterSubsystem mZophyaShooterSubsystem = new ZophyaShooterSubsystem();
  private double zspeed;

  public SecondZophyaShooter(ZophyaShooterSubsystem zophyaShooterSubsystem, double zspeed) {
    this.mZophyaShooterSubsystem = zophyaShooterSubsystem;
    this.zspeed = zspeed;

    // Use addRequirements() here to declare subsystem dependencies.
    
    addRequirements(zophyaShooterSubsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
 mZophyaShooterSubsystem.ShootZophyaShooter(2);
    
  }
}
