package org.firstinspires.ftc.teamcode;

/**
 * Created by aliva on 10/4/18.
 */

public class WestCoastDepotAutonomousFunction extends WestCoastDepotPrototype {
    // depot autonomous procedure
    public static void WestCoastDepotAutonomousProcedure() {

        // drive forward to depot
        WestCoastDepotUtilityFunctions.driveStraight(.5,4000);

        // reverse to exit depot
        WestCoastDepotUtilityFunctions.driveReverse(.5,1000);

        // turn left to face crater
        WestCoastDepotUtilityFunctions.turnLeft(.5, 1000);

        // drive forward to crater
        WestCoastDepotUtilityFunctions.driveStraight(.5, 5000);
    }
}
