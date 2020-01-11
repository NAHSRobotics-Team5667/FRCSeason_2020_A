/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ShooterSubsystem extends SubsystemBase {
	/**
	 * Creates a new ShooterSubsystem.
	 */
	private SpeedController m_rightWheel, m_leftWheel, m_angleWheel;
	private Encoder m_rightEncoder, m_leftEncoder, m_angleEncoder;

	public ShooterSubsystem(SpeedController rightWheel, SpeedController leftWheel, SpeedController angleWheel,
			Encoder rightEncoder, Encoder leftEncoder, Encoder angleEncoder) {
		m_rightWheel = rightWheel;
		m_leftWheel = leftWheel;
		m_angleWheel = angleWheel;
		m_rightEncoder = rightEncoder;
		m_leftEncoder = leftEncoder;
		m_angleEncoder = angleEncoder;
	}

	public void calculateSpeeds() {
		// to calculate the different speeds of the right and left motors based on angle
	}

	public void fire(double rightSpeed, double leftSpeed) {
		m_rightWheel.set(rightSpeed);
		m_leftWheel.set(leftSpeed);
	}

	public void stopFire() {
		m_rightWheel.stopMotor();
		m_leftWheel.stopMotor();
	}

	public void goDown(double angleSpeed) {
		m_angleWheel.set(-angleSpeed);
	}

	public void goUp(double angleSpeed) {
		m_angleWheel.set(angleSpeed);
	}

	public void angleStop() {
		m_angleWheel.stopMotor();
	}

	public int getCurrentAngle() {
		// covert experimental values to angles
		return (m_angleEncoder.get());
	}

	public void resetRightEncoder() {
		m_rightEncoder.reset();
	}

	public void resetLeftEncoder() {
		m_leftEncoder.reset();
	}

	public void resetAngleEncoder() {
		m_angleEncoder.reset();
	}

	@Override
	public void periodic() {
		// This method will be called once per scheduler run
	}

}