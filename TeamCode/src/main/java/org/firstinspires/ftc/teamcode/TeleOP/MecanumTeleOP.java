package org.firstinspires.ftc.teamcode.TeleOP;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.Drivetrains.Mecanum;

/**
 * Created by JUSTIN on 9/9/18.
 */
@TeleOp(name="MecanumTeleOP", group = "DrivetrainTests")
public class MecanumTeleOP extends OpMode{
    public Mecanum robot;
    @Override
    public void init() {
        robot = new Mecanum(hardwareMap.dcMotor.get("TopRight"), hardwareMap.dcMotor.get("BottomRight"), hardwareMap.dcMotor.get("TopLeft"), hardwareMap.dcMotor.get("BottomLeft"));
    }

    @Override
    public void start() {
        super.start();
    }

    @Override
    public void loop() {

    }
}
