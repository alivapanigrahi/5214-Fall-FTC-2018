package org.firstinspires.ftc.teamcode;

/**
 * Created by aliva on 10/4/18.
 */

public class DepotAutonomousFunction extends BoraDepotPrototype {
    // depot autonomous procedure
    public static void DepotAutonomousProcedure() {

        // drive forward to depot
        DepotUtilityFunctions.driveStraight(.5,4000);

        // reverse to exit depot
        DepotUtilityFunctions.driveReverse(.5,1000);

        // turn left to face crater
        DepotUtilityFunctions.turnLeft(.5, 1000);

        // drive forward to crater
        DepotUtilityFunctions.driveStraight(.5, 5000);
    }
}
