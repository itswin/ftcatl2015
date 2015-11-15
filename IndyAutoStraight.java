package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.Range;

/**
 * Created by Winston on 11/14/2015.
 */
public class IndyAutoStraight extends OpMode {

    DcMotor motorRight;
    DcMotor motorLeft;

    public void init() {

        motorRight = hardwareMap.dcMotor.get("motorRight");
        motorLeft = hardwareMap.dcMotor.get("motorLeft");
        motorRight.setDirection(DcMotor.Direction.REVERSE);
    }

    public void loop() {

        double left = 0.0,
                right = 0.0;

        if(this.time <= 5) {
            left = .3;
            right = .3;
        } else {
            left = 0;
            right = 0;
        }


		/*
		 * set the motor power
		 */
        motorRight.setPower(left);
        motorLeft.setPower(right);
    }

    public void stop() {

    }

}
