

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.asdfghjkl;



public class zxcvbnm extends Command {
  private double mSpeed;
  private double mMotor;
  public zxcvbnm(double MMOTOR,double SSPEED) {
    this.mSpeed = SSPEED; this.mMotor = MMOTOR; 
  }

  @Override
  public void initialize() {}

  @Override
  public void execute () {mMotor.spinMotor(mSpeed);}

  @Override
  public void end(boolean interrupted) {}

  @Override
  public boolean isFinished() {
    return false;
  }
}
