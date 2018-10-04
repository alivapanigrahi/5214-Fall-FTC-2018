package org.firstinspires.ftc.teamcode;

/**
 * Created by aliva on 10/4/18.
 */

public class CraterAutonomousFunction extends BoraCraterPrototype {
    // crater autonomous procedure
    public static void CraterAutonomousProcedure() {

        // drive forward to sampling area
        CraterUtilityFunctions.driveStraight(.5,3000);

        // turn left towards depot
        CraterUtilityFunctions.turnLeft(.5,1000);

        // drive forward to depot
        CraterUtilityFunctions.driveStraight(.5,3000);

        // turn more left towards depot
        CraterUtilityFunctions.turnLeft(.5,1000);

        // drive towards depot
        CraterUtilityFunctions.driveStraight(.5,2000);

        // turn right towards crater
        CraterUtilityFunctions.turnRight(.5,1000);

        // drive forward towards crater
        CraterUtilityFunctions.driveStraight(.5,5000);
    }
}
