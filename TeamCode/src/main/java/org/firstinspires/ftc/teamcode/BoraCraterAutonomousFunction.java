package org.firstinspires.ftc.teamcode;

/**
 * Created by aliva on 10/4/18.
 */

public class BoraCraterAutonomousFunction extends BoraCraterPrototype {
    // crater autonomous procedure
    public static void CraterAutonomousProcedure() {

        // drive forward to sampling area
        BoraCraterUtilityFunctions.driveStraight(.5,3000);

        // turn left towards depot
        BoraCraterUtilityFunctions.turnLeft(.5,1000);

        // drive forward to depot
        BoraCraterUtilityFunctions.driveStraight(.5,3000);

        // turn more left towards depot
        BoraCraterUtilityFunctions.turnLeft(.5,1000);

        // drive towards depot
        BoraCraterUtilityFunctions.driveStraight(.5,2000);

        // turn right towards crater
        BoraCraterUtilityFunctions.turnRight(.5,1000);

        // drive forward towards crater
        BoraCraterUtilityFunctions.driveStraight(.5,5000);
    }
}
