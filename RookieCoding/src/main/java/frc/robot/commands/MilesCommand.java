// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.MilesSubsystem; //THIS IS AN IMPORT

public class MilesCommand extends Command {


private TalonFX xMilesMotor;
private TalonFX xMilesMotorNegative;
private Boolean xMilesVariable;
private MilesSubsystem xMilesSubsystem;

  public MilesCommand(MilesSubsystem MilesSubsytem, TalonFX MilesMotor, TalonFX MilesMotorNegative, Boolean MilesVariable) {
   this.xMilesMotor = MilesMotor;
   this.xMilesMotorNegative = MilesMotorNegative; 
   this.xMilesVariable = MilesVariable;
  }

  @Override
  public void initialize() {}

  @Override
  public void execute() {
    xMilesSubsystem.MilesVariableLoop(); 
    xMilesSubsystem.MilesVariableLoopNegative();
  }

  @Override
  public void end(boolean interrupted) {
    xMilesSubsystem.MilesVariableLoop();
    xMilesSubsystem.MilesVariableLoopNegative();
  }

  @Override
  public boolean isFinished() {
    return false;
  }
}
