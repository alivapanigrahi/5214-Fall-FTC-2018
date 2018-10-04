package org.firstinspires.ftc.teamcode;

/**
 * Created by aliva on 10/3/18.
 */

public class ArcadeManualUtilityFunctions extends ArcadeManualPrototype {

    // drive forward function
    public static void driveStraight(double power){

        // set power on all motors
        leftFront.setPower(-power);
        rightFront.setPower(power);
        leftBack.setPower(-power);
        rightBack.setPower(power);
    }
    public static void setLeftPower(double leftPower){

        // set power on left motors
        leftFront.setPower(-leftPower);
        leftBack.setPower(-leftPower);
    }
    public static void setRightPower(double rightPower) {

        // set power on right motors
        rightFront.setPower(rightPower);
        rightBack.setPower(rightPower);
    }
    public static void setRightPowerReverse(double rightPower) {

       // reverse power on right motors
       rightFront.setPower(-rightPower);
       rightBack.setPower(-rightPower);
    }
    public static void setLeftPowerReverse(double leftPower) {

        // reverse power on left motors
        leftFront.setPower(leftPower);
        leftBack.setPower(leftPower);
    }
}
