package org.firstinspires.ftc.teamcode;

/**
 * Created by aliva on 10/4/18.
 */

public class BoraDepotAutonomousFunction extends BoraDepotPrototype {
    // depot autonomous procedure
    public static void DepotAutonomousProcedure() {

        // drive forward to depot
        BoraDepotUtilityFunctions.driveStraight(.5,4000);

        // reverse to exit depot
        BoraDepotUtilityFunctions.driveReverse(.5,1000);

        // turn left to face crater
        BoraDepotUtilityFunctions.turnLeft(.5, 1000);

        // drive forward to crater
        BoraDepotUtilityFunctions.driveStraight(.5, 5000);
    }
}
