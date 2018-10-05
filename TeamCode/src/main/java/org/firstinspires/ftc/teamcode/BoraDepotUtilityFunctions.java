/* Copyright (c) 2017 FIRST. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification,
 * are permitted (subject to the limitations in the disclaimer below) provided that
 * the following conditions are met:
 *
 * Redistributions of source code must retain the above copyright notice, this list
 * of conditions and the following disclaimer.
 *
 * Redistributions in binary form must reproduce the above copyright notice, this
 * list of conditions and the following disclaimer in the documentation and/or
 * other materials provided with the distribution.
 *
 * Neither the name of FIRST nor the names of its contributors may be used to endorse or
 * promote products derived from this software without specific prior written permission.
 *
 * NO EXPRESS OR IMPLIED LICENSES TO ANY PARTY'S PATENT RIGHTS ARE GRANTED BY THIS
 * LICENSE. THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package org.firstinspires.ftc.teamcode;

/**
 * Created by aliva on 9/28/18.
 */

public class BoraDepotUtilityFunctions extends BoraDepotPrototype {
    // drive forward function
    public static void driveStraight(double power, int time) {

        // set power on all motors
        leftFront.setPower(power);
        rightFront.setPower(power);
        leftBack.setPower(power);
        rightBack.setPower(power);
    }
    // drive reverse function
    public static void driveReverse(double power, int time) {

        // set reverse power on all motors
        leftFront.setPower(-power);
        rightFront.setPower(-power);
        leftBack.setPower(-power);
        rightBack.setPower(-power);
    }
    // turn right function
    public static void turnRight(double power, int time) {

        // set power on all motors (forward on right, backward on left)
        leftFront.setPower(power);
        rightFront.setPower(-power);
        leftBack.setPower(power);
        rightBack.setPower(-power);
    }
    // turn right function
    public static void turnLeft(double power, int time) {

        // set power on all motors (forward on right, backward on left)
        leftFront.setPower(-power);
        rightFront.setPower(power);
        leftBack.setPower(-power);
        rightBack.setPower(power);
    }
    // strafe right function
    public static void strafeRight(double power) {

        // set power on left motors
        leftFront.setPower(power);
        leftBack.setPower(-power);

        // set power on right motors
        rightFront.setPower(power);
        rightBack.setPower(-power);
    }
    // strafe left function
    public static void strafeLeft(double power) {

        // set power on left motors
        leftFront.setPower(-power);
        leftBack.setPower(power);

        // set power on right motors
        rightFront.setPower(-power);
        rightBack.setPower(power);
    }
}