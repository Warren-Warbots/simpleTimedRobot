// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import com.ctre.phoenix6.controls.DutyCycleOut;
import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.XboxController;


public class Robot extends TimedRobot {
  public TalonFX intakeMotor = new TalonFX(0,"rio");
  public XboxController xbox = new XboxController(0);
  public DutyCycleOut intakeMotorRequest = new DutyCycleOut(0.0);
  @Override
  public void robotInit() {
    
  }

  @Override
  public void robotPeriodic() {
  
    
    intakeMotor.setControl(intakeMotorRequest.withOutput(xbox.getLeftY()));

  }

  @Override
  public void disabledInit() {}

  @Override
  public void disabledPeriodic() {}

  @Override
  public void disabledExit() {}

  @Override
  public void autonomousInit() {
    
  }

  @Override
  public void autonomousPeriodic() {}

  @Override
  public void autonomousExit() {}

  @Override
  public void teleopInit() {
    
  }

  @Override
  public void teleopPeriodic() {}

  @Override
  public void teleopExit() {}

  @Override
  public void testInit() {
    
  }

  @Override
  public void testPeriodic() {}

  @Override
  public void testExit() {}
}
