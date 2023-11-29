package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import com.revrobotics.RelativeEncoder;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.motorcontrol.MotorController;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.DriveConstants;
import java.util.function.DoubleSupplier;
import frc.robot.Constants.ArmConstants;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;


public class Arm extends SubsystemBase {
    private WPI_VictorSPX m_armMotor = new WPI_VictorSPX(ArmConstants.KArmCanId);

    public Arm() {
    }

    public void setSpeed(double speed) {
        m_armMotor.set(speed);
    }

    public void turnOn(boolean activation) {
        if(activation) {
            m_armMotor.set(ArmConstants.armSpeed);
        } else {
            m_armMotor.set(0);
        }
    }
    @Override
    public void periodic() {
      // This method will be called once per scheduler run
    }

}
