package org.firstinspires.ftc.teamcode.TeleOP;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.Drivetrains.JacobDrive;

/**
 * Created by JUSTIN on 9/9/18.
 */
@TeleOp(name = "JDriveTeleOp", group = "DrivetrainTests")
public class jDriveTeleOp extends OpMode{
    public JacobDrive robot;
    @Override
    public void init() {
        robot = new JacobDrive(hardwareMap.dcMotor.get("right_motor"), hardwareMap.dcMotor.get("left_motor"));
    }

    @Override
    public void start() {
        super.start();
        telemetry.addLine("JacobDrive is ready");
    }

    @Override
    public void loop() {
        robot.rightMotor.setPower(-gamepad1.left_stick_y - gamepad1.right_stick_x);
        robot.leftMotor.setPower(gamepad1.left_stick_y - gamepad1.right_stick_x);
    }
}
