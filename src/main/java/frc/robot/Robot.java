/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.command.Scheduler;
import frc.robot.subsystems.LinearServo;
import frc.robot.subsystems.Motor1;
import frc.robot.subsystems.Motor2;
import frc.robot.subsystems.RotaryServo;
import edu.wpi.first.wpilibj.TimedRobot;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the TimedRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the build.gradle file in the
 * project.
 */
public class Robot extends TimedRobot {

  // subsystems
  private LinearServo _linearServo = LinearServo.getInstance();
  private Motor1 _motor1 = Motor1.getInstance();
  private Motor2 _motor2 = Motor2.getInstance();
  private RotaryServo _rotaryServo = RotaryServo.getInstance();

  //ux
  private OI _oi = OI.getInstance();

  /**
   * This function is run when the robot is first started up and should be used
   * for any initialization code.
   */
  @Override
  public void robotInit() {
  }

  // run 1x at the start of autonomous mode
  @Override
  public void autonomousInit() {
  }

  // run every scan cycle (20ms or 50x / sec) autonomous mode
  @Override
  public void autonomousPeriodic() {
    Scheduler.getInstance().run();
  }

  // run 1x at the start of telop mode
  @Override
  public void teleopInit() {
  }

  // run every scan cycle (20ms or 50x / sec) telop mode
  @Override
  public void teleopPeriodic() {
    Scheduler.getInstance().run();
  }

}
