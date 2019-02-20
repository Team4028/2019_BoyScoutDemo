/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.subsystems.Motor1;
import frc.robot.util.BeakXboxController.Thumbstick;

public class RunMotor1 extends Command {

  private Motor1 _motor1 = Motor1.getInstance();
  private Thumbstick _thumbstick;

  public RunMotor1(Thumbstick thumbstick) {
    // Use requires() here to declare subsystem dependencies
    requires(_motor1);

    _thumbstick = thumbstick;

    setInterruptible(true);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    _motor1.run(_thumbstick.getY() * 0.15 );
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
