// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import frc.robot.Constants.OperatorConstants;
import frc.robot.commands.Autos;
import frc.robot.commands.ExampleCommand;
import frc.robot.commands.ZophyaCommand;
import frc.robot.commands.ZophyaShooterCommand;
import frc.robot.commands.moveSecondZophyaFeeder;
import frc.robot.subsystems.ExampleSubsystem;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.Trigger;
import frc.robot.subsystems.Somthing;
import frc.robot.commands.Motor;

import frc.robot.subsystems.SecondZophyaFeeder;
import frc.robot.subsystems.ZophyaFeeder;
import frc.robot.subsystems.ZophyaShooterSubsystem;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.Trigger;
import frc.robot.subsystems.Nitin;


private Nitin mNitin = new Nitin();

private final CommandXboxController Driver =
  new CommandXboxController(Constants.OperatorConstants.kDriverControllerPort);

private void configureBindings() {

  smartDashboard.setDefaultNumber(key: "Input Angle", defaultValue:0);

  Driver.x().onTrue(new Nitin_Command(mNitin));


}





import frc.robot.commands.AydenShooterCommand;
import frc.robot.subsystems.AydenShooter;
import frc.robot.subsystems.Ryan;

private Ryan mRyan = new Ryan();

private final CommandXboxController Driver = new CommandXboxController(Constants.OperatorConstants.kDriverControllerPort);

private void configureBindings() {
  smartDashboard.setDefaultNumber(key: "input angle", defaultValue:0);

  Driver.x().onTrue(new RyanCommand(mRyan));
}



/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and trigger mappings) should be declared here.
 */

public class RobotContainer {

  private SecondZophyaFeeder mSecondZophyaFeeder = new SecondZophyaFeeder();




  private AydenShooter mAydenShooter = new AydenShooter();

  // The robot's subsystems and commands are defined here...
  private final ExampleSubsystem m_exampleSubsystem = new ExampleSubsystem();
  private  Somthing mSomthing2 = new Somthing();

 private final CommandXboxController driver =
 new CommandXboxController(OperatorConstants.kDriverControllerPort);


  private final CommandXboxController Driver =
  new CommandXboxController(OperatorConstants.kDriverControllerPort);
 
  // Replace with CommandPS4Controller or CommandJoystick if needed
  private final CommandXboxController m_driverController =
      new CommandXboxController(OperatorConstants.kDriverControllerPort);
  
  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    // Configure the trigger bindings
    configureBindings();

  }

  /**
   * Use this method to define your trigger->command mappings. Triggers can be created via the
   * {@link Trigger#Trigger(java.util.function.BooleanSupplier)} constructor with an arbitrary
   * predicate, or via the named factories in {@link
   * edu.wpi.first.wpilibj2.command.button.CommandGenericHID}'s subclasses for {@link
   * CommandXboxController Xbox}/{@link edu.wpi.first.wpilibj2.command.button.CommandPS4Controller
   * PS4} controllers or {@link edu.wpi.first.wpilibj2.command.button.CommandJoystick Flight
   * joysticks}.
   */
  private void configureBindings() {
    driver.y().onTrue(new Motor(mSomthing2, 0.3));

    // Schedule `ExampleCommand` when `exampleCondition` changes to `true`
    new Trigger(m_exampleSubsystem::exampleCondition)
        .onTrue(new ExampleCommand(m_exampleSubsystem));


    

Driver.x().onTrue(new moveSecondZophyaFeeder(mSecondZophyaFeeder,1));
Driver.y().onTrue(new moveSecondZophyaFeeder(mSecondZophyaFeeder,1));



    // Schedule `exampleMethodCommand` when the Xbox controller's B button is pressed,
    // cancelling on release.
    m_driverController.b().whileTrue(m_exampleSubsystem.exampleMethodCommand());
    m_driverController.x().onTrue(new AydenShooterCommand(mAydenShooter, 11));
    m_driverController.a().onTrue(new AydenShooterCommand(mAydenShooter, 5));
  }
   
  
  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An example command will be run in autonomous
    return Autos.exampleAuto(m_exampleSubsystem);
  }
}
