// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import com.ctre.phoenix6.hardware.TalonFX;


/** Add your docs here. */
public class Somthing extends SubsystemBase{

    private TalonFX AmelieMotor;

    public Somthing() {
        AmelieMotor = new TalonFX(0);
    }

    public void spinAmelieMotor() {
        AmelieMotor.setVoltage(4);
    }

    public void stopAmelie() {
        AmelieMotor.setVoltage(0);
    }
    public void MoveAmelie(double speed) {
        AmelieMotor.setVoltage(speed * 12);
    }

    @Override
    public void periodic() {
        // This methid will be called once per schedular run
    }


    
    

    


}