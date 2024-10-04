// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix6.hardware.TalonFX;
import com.ctre.phoenix6.configs.TalonFXConfiguration;


public class ZophyaFeeder extends SubsystemBase {
/** Creates a new Feeder */
private TalonFX feederMotor;

public ZophyaFeeder() {
    feederMotor = new TalonFX(1);
}

public void feederSpinMotor() {
    feederMotor.setVoltage(4);
}

public void feederStopMotor() {
    feederMotor.setVoltage(0);
}

public void reverseFeederMotor(){
    feederMotor.setVoltage(-4);
}

public void spinFeedMotor(double speed) {
    feederMotor.setVoltage(speed);
}

@Override
public void periodic() {
}

}

public class SecondZophyaFeeder extends SubsystemBase {
/** Creates a new Feeder */
private TalonFX secondFeederMotor;

public SecondZophyaFeeder(){
    secondFeederMotor = new TalonFX(2);
}

public void feederSpinMotor() {
    secondFeederMotor.setVoltage(4);
}

public void feederStopMotor() {
    sec
}

public void

public void






}