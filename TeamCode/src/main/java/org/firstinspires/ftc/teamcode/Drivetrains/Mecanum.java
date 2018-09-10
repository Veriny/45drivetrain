package org.firstinspires.ftc.teamcode.Drivetrains;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

/**
 * Created by your mom on 9/9/18.
 */

public class Mecanum {
    public DcMotor rightTop;
    public DcMotor rightBottom;
    public DcMotor leftTop;
    public DcMotor leftBottom;
    public Mecanum(DcMotor TR, DcMotor BR, DcMotor TL, DcMotor BL){
        this.rightBottom = BR;
        this.leftBottom = BL;
        this.rightTop = TR;
        this.leftTop = TL;
        leftTop.setDirection(DcMotorSimple.Direction.REVERSE);
        leftBottom.setDirection(DcMotorSimple.Direction.REVERSE);
    }
    public void rightDrive(Double power){

    }
    public void leftDrive(Double power){

    }
    public void arcadeDrive(Double power){

    }

}
