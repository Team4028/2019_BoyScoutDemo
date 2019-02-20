/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

/**
 * Add your docs here.
 */
public class Motor2 extends Subsystem {

    // define robot controllable objects
    private static VictorSPX _motor2;

    //=====================================================================================
	// Define Singleton Pattern
	//=====================================================================================
	private static Motor2 _instance = new Motor2();
	
	public static Motor2 getInstance() {
    return _instance;
	}
	
	// private constructor for singleton pattern
    private Motor2() {
        // create & configure robot controllable objects
        _motor2 = new VictorSPX(RobotMap.MOTOR_2_CAN_BUSS);
        _motor2.configFactoryDefault();
    }

    // run the motor but cap the speed
    public void run(double motorCmd)
    {
        _motor2.set(ControlMode.PercentOutput, (motorCmd * 0.25));
    }

    @Override
    protected void initDefaultCommand() {

    }

}
