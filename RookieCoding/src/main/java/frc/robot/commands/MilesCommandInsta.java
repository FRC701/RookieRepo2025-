package frc.robot.commands;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.InstantCommand;
import frc.robot.subsystems.MilesSubsystem;

public class MilesCommandInsta extends InstantCommand {
  public MilesSubsystem xmilesSubsystem;
  public Boolean xmilesvariable;

  public MilesCommandInsta(MilesSubsystem milesSubsystem, Boolean milesvariable) {
  this.xmilesSubsystem = milesSubsystem;
  this.xmilesvariable = milesvariable;

  }

  @Override
  public void initialize() {
   if(xmilesvariable = true) {
   xmilesSubsystem.MilesMotor.setVoltage(12);

   }





  }
}
