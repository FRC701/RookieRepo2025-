// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.MilesSubsystem; //THIS IS AN IMPORT

public class MilesCommand extends Command {

private MilesSubsystem mMilesMotor;
private MilesSubsystem mMilesMotorNegative;
  /** Creates a new MilesCommand. */
  public MilesCommand(MilesSubsystem MilesMotor, MilesSubsystem MilesMotorNegative) {
   this.mMilesMotor = MilesMotor;
   this.mMilesMotorNegative = MilesMotorNegative; 
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {mMilesMotor.MilesVariableLoop(); mMilesMotorNegative.MilesVariableLoopNegative();}

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
