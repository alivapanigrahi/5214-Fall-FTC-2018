package org.firstinspires.ftc.teamcode;

/**
 * Created by aliva on 10/4/18.
 */

public class WestCoastCraterUtilityFunctions extends WestCoastCraterPrototype {
    // drive forward function
    public static void driveStraight(double power, int time) {

        // drive straight
        leftMain.setPower(power);
        rightMain.setPower(power);
    }
    public static void driveReverse(double power, int time) {

        // drive reverse
        leftMain.setPower(-power);
        rightMain.setPower(-power);
    }
    public static void turnRight(double power, int time) {

        // turn right
        leftMain.setPower(power);
        rightMain.setPower(-power);
    }
    public static void turnLeft(double power, int time) {

        // turn left
        leftMain.setPower(-power);
        rightMain.setPower(power);
    }
}
