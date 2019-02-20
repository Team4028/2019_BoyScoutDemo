/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

/**
 * Add your docs here.
 */
public class LinearServo extends Subsystem {

    // define robot controllable objects
    private static Servo _linearServo;


    //=====================================================================================
	// Define Singleton Pattern
	//=====================================================================================
	private static LinearServo _instance = new LinearServo();
	
	public static LinearServo getInstance() {
    return _instance;
	}
	
	// private constructor for singleton pattern
    private LinearServo() {
        // create & configure robot controllable objects
        _linearServo = new Servo(RobotMap.LINEAR_SERVO_PWM_PORT);

        moveIn();

    }

    public void moveOut()
    {
        _linearServo.set(0.75);
    }

    public void moveIn()
    {
        _linearServo.set(0.25);   
    }

    @Override
    protected void initDefaultCommand() {

    }
}
