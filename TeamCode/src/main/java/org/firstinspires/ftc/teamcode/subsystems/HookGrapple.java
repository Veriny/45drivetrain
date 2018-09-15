package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.robotcore.hardware.DcMotor;

/**
 * Created by maxyeh on 9/15/18.
 */

public class HookGrapple {
    public DcMotor grapple;
    public static final int GRAPPLE_POWER = 0.45;

    HookGrapple(DcMotor g) {
        grapple = g;
        stop();
    }

    public void controls(Gamepad gp) {
        if(gp.left_bumper) ascend();
        else if(gp.left_trigger) descend();
        else stop();
    }

    public void ascend() {
        grapple.setPower(GRAPPLE_POWER);
    }

    public void descent() {
        grapple.setPower(-GRAPPLE_POWER);
    }

    public void stop() {
        grapple.setPower(0);
    }
}
