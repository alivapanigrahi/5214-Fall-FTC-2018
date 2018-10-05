package org.firstinspires.ftc.teamcode;

/**
 * Created by aliva on 10/5/18.
 */

public class WestCoastCraterAutonomousFunction {
    // west coast crater autonomous procedure
    public static void WestCoastCraterAutonomousProcedure() {

        // drive forward to sampling area
        WestCoastCraterUtilityFunctions.driveStraight(.5,3000);

        // turn left towards depot
        WestCoastCraterUtilityFunctions.turnLeft(.5,1000);

        // drive forward to depot
        WestCoastCraterUtilityFunctions.driveStraight(.5,3000);

        // turn more left towards depot
        WestCoastCraterUtilityFunctions.turnLeft(.5,1000);

        // drive towards depot
        WestCoastCraterUtilityFunctions.driveStraight(.5,2000);

        // turn right towards crater
        WestCoastCraterUtilityFunctions.turnRight(.5,1000);

        // drive forward towards crater
        WestCoastCraterUtilityFunctions.driveStraight(.5,5000);
    }
}
