/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

/**
 * Add your docs here.
 */
public class Motor1 extends Subsystem {

    // define robot controllable objects
    private static TalonSRX _motor1;

    //=====================================================================================
	// Define Singleton Pattern
	//=====================================================================================
	private static Motor1 _instance = new Motor1();
	
	public static Motor1 getInstance() {
    return _instance;
	}
	
	// private constructor for singleton pattern
    private Motor1() {
        // create & configure robot controllable objects
        _motor1 = new TalonSRX(RobotMap.MOTOR_1_CAN_BUSS);
        _motor1.configFactoryDefault();
    }

    public void run(double motorCmd)
    {
        _motor1.set(ControlMode.PercentOutput, motorCmd);
    }

    @Override
    protected void initDefaultCommand() {

    }
}
