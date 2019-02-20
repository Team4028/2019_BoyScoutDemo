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
public class RotaryServo extends Subsystem {

    // define robot controllable objects
    private static Servo _rotaryServo;

    //=====================================================================================
	// Define Singleton Pattern
	//=====================================================================================
	private static RotaryServo _instance = new RotaryServo();
	
	public static RotaryServo getInstance() {
        return _instance;
	}
	
	// private constructor for singleton pattern
    private RotaryServo() {
        // create & configure robot controllable objects
        _rotaryServo = new Servo(RobotMap.ROTARY_SERVO_PWM_PORT);

        turnCCW();
    }

    public void turnCW()
    {
        _rotaryServo.set(0.75);
    }

    public void turnCCW()
    {
        _rotaryServo.set(0.25);   
    }

    @Override
    protected void initDefaultCommand() {

    }
}
