package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.robotcore.hardware.DcMotor;

/**
 * Created by maxyeh on 9/13/18.
 */

public class ScissorLift {
    public DcMotor lift;
    public static final int LIFT_POWER = 0.45;

    public ScissorLift(DcMotor l) {
        lift = l;
        stop();
    }

    public void controls(Gamepad gp) {
        if(gp.a) extend();
        else if(gp.x) contract();
        else stop();
    }

    public void extend() {
        lift.setPower(LIFT_POWER);
    }

    public void contract() {
        lift.setPower(-LIFT_POWER);
    }

    public void stop() {
        lift.setPower(0);
    }
}
