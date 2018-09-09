package org.firstinspires.ftc.teamcode.TeleOP;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.Drivetrains.WestCoast;

/**
 * Created by JUSTIN on 9/9/18.
 */
@TeleOp(name="WestCoastTeleOP", group = "DrivetrainTests")
public class WestCoastTeleOP extends OpMode{
    public WestCoast robot;
    @Override
    public void init() {
        robot = new WestCoast(hardwareMap.dcMotor.get("rightMotorOne"), hardwareMap.dcMotor.get("rightMotorTwo"), hardwareMap.dcMotor.get("leftMotorOne"), hardwareMap.dcMotor.get("leftMotorTwo"));
    }

    @Override
    public void start() {
        super.start();
    }

    @Override
    public void loop() {
        robot.rightMotorOne.setPower(-gamepad1.left_stick_y - gamepad1.right_stick_x);
        robot.leftMotorOne.setPower(gamepad1.left_stick_y - gamepad1.right_stick_x);
        robot.rightMotorTwo.setPower(-gamepad1.left_stick_y - gamepad1.right_stick_x);
        robot.leftMotorTwo.setPower(gamepad1.left_stick_y - gamepad1.right_stick_x);
    }
}
