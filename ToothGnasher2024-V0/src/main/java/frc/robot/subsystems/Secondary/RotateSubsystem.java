package frc.robot.subsystems.Secondary;

// import com.revrobotics.CANEncoder;
import com.revrobotics.CANSparkMax;
//import com.revrobotics.SparkMaxAbsoluteEncoder; //Changed to SparkAbsoluteEncoder
//import com.revrobotics.CANSparkMaxLowLevel.MotorType; //Changed to CanSparkLowLevel.MotorType
import com.revrobotics.SparkAbsoluteEncoder;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class RotateSubsystem extends SubsystemBase {
    // public CANSparkMax leftArmSlider;
    // public CANSparkMax rightArmSlider;

    // public CANSparkMax suck;

    // public RelativeEncoder sliderEncoder;
    // public RelativeEncoder grabberEncoder;

    // public CANSparkMax grabberMotor;

    public CANSparkMax armRotateMotor;
    // public CANSparkMax wristRotateMotor;
    // public CANSparkMax intakeMotor;

    // public static SparkMaxAbsoluteEncoder armRotateEncoder;
    public SparkAbsoluteEncoder armRotateEncoder; //Changed from SparkAbsoluteEncoder
    // public RelativeEncoder wristRotateEncoder;


    public RotateSubsystem() {
        // leftArmSlider = new CANSparkMax(Constants.ArmConstants.kLeftSliderMotor, MotorType.kBrushless);
        // rightArmSlider = new CANSparkMax(Constants.ArmConstants.kRightSliderMotor, MotorType.kBrushless);

        // wristRotateMotor =  new CANSparkMax(Constants.ArmConstants.kManipulatorWristMotor, MotorType.kBrushless);
        // intakeMotor =  new CANSparkMax(Constants.ArmConstants.kManipulatorIntakeMotor, MotorType.kBrushless);
        armRotateMotor = new CANSparkMax(Constants.ArmConstants.kArmRotateMotor,MotorType.kBrushless); //Changed MotorType from SparkMax to Spark
        armRotateMotor.setInverted(false);
        

        // sliderEncoder = leftArmSlider.getEncoder();

        // armRotateEncoder = armRotateMotor.getAlternateEncoder(SparkMaxAlternateEncoder.Type.kQuadrature, 8192);
        armRotateEncoder = armRotateMotor.	getAbsoluteEncoder(SparkAbsoluteEncoder.Type.kDutyCycle); //changed SparkMaxAbsoluteEncoder from SparkMax to Spark
        armRotateEncoder.setPositionConversionFactor(360);
        armRotateEncoder.setZeroOffset(25   );

        // grabberEncoder = grabberMotor.getEncoder();

        // wristRotateEncoder = wristRotateMotor.getEncoder();

        armRotateEncoder.setPositionConversionFactor(0);
        // sliderEncoder.setPositionConversionFactor(0.5855165417); // 1.31741221882
        // grabberEncoder.setPositionConversionFactor(2.666);
    }
}