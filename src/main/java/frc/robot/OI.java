/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import frc.robot.commands.MoveLinearServoIn;
import frc.robot.commands.MoveLinearServoOut;
import frc.robot.commands.RunMotor1;
import frc.robot.commands.RunMotor2;
import frc.robot.commands.TurnRotaryServoCCW;
import frc.robot.commands.TurnRotaryServoCW;
import frc.robot.util.BeakXboxController;

/**
 * This class interfaces with the Driver/Operator Station 
 * 	Lead Student:
 */
public class OI {
    private BeakXboxController _driverController;
    private BeakXboxController _operatorController;
    
	// Drivers Station Gamepad USB Ports
	private static final int DRIVER_GAMEPAD_USB_PORT = 0;
	private static final int OPERATOR_GAMEPAD_USB_PORT = 1;

    //=====================================================================================
	// Define Singleton Pattern
	//=====================================================================================
	private static OI _instance = new OI();
	
	public static OI getInstance() {
		return _instance;
	}
	
	// private constructor for singleton pattern
	private OI() 
	{	
		// =========== Driver ======================================
		_driverController = new BeakXboxController(DRIVER_GAMEPAD_USB_PORT);
        //==========================================================

		// Driver Controller -> Command Mapping
		_driverController.leftStick.whileActive(new RunMotor1(_driverController.leftStick));
        _driverController.leftStick.whenReleased(new RunMotor1(_driverController.leftStick));
        
        _driverController.rightStick.whileActive(new RunMotor2(_driverController.rightStick));
		_driverController.rightStick.whenReleased(new RunMotor2(_driverController.rightStick));

        // =========== Operator ======================================
		_operatorController = new BeakXboxController(OPERATOR_GAMEPAD_USB_PORT);
		//==========================================================
		_operatorController.a.whenPressed(new MoveLinearServoIn());
		_operatorController.y.whenPressed(new MoveLinearServoOut());

		_operatorController.x.whenPressed(new TurnRotaryServoCCW());
		_operatorController.b.whenPressed(new TurnRotaryServoCW());
	}
}
