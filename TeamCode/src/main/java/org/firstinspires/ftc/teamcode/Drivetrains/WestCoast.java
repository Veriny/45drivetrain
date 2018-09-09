package org.firstinspires.ftc.teamcode.Drivetrains;

import com.qualcomm.robotcore.hardware.DcMotor;

/**
 * Created by your mom on 9/9/18.
 */

public class WestCoast {
    public DcMotor rightMotorOne;
    public DcMotor leftMotorOne;
    public DcMotor rightMotorTwo;
    public DcMotor leftMotorTwo;

    public WestCoast(DcMotor rightOne, DcMotor rightTwo, DcMotor leftOne, DcMotor leftTwo){
        this.rightMotorOne = rightOne;
        this.rightMotorTwo = rightTwo;
        this.leftMotorTwo = leftTwo;
        this.leftMotorOne = leftOne;
    }
}
