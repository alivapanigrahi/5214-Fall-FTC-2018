package org.firstinspires.ftc.teamcode;

/**
 * Created by aliva on 10/3/18.
 */

public class WestCoastManualUtilityFunctions extends WestCoastManualPrototype {
    // drive forward right function
    public static void setRightPower(double rightPower){

        // set power on right motors
        rightMain.setPower(rightPower);

    }
    // drive forward left function
    public static void setLeftPower(double leftPower) {

        // set power on left motors
        leftMain.setPower(leftPower);
    }
}
