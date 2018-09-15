package org.firstinspires.ftc.teamcode.Drivetrains;

import com.qualcomm.robotcore.hardware.DcMotor;

/**
 * Created by JUSTIN on 9/9/18.
 */

public class JacobDrive {
    public DcMotor leftMotor;
    public  DcMotor rightMotor;
    public static final int TICKS_PER_ROTATION = 1120; //TETRIX
    public static final double WHEEL_DIAMETER     = 4;

    public JacobDrive(DcMotor right, DcMotor left){
        this.leftMotor = left;
        this.rightMotor = right;
    }
    public void jDrive(double power){
        rightMotor.setPower(power);
        leftMotor.setPower(-power);
    }

}
