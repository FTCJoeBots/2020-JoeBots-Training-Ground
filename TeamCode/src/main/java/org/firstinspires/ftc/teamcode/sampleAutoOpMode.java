package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.robotcore.external.navigation.AngleUnit;
import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;

@Autonomous(name = "Sample Auto OpMode", group = "JoeBots")
@Disabled
public class sampleAutoOpMode extends OpMode {
    private Robot robot = new Robot();
    int state = 0;

    // Code to run ONCE when the driver hits INIT
    @Override
    public void init() {
        robot.init(hardwareMap);
    }


    // Code to run REPEATEDLY after the driver hits PLAY but before they hit STOP
    @Override
    public void loop() {
        telemetry.addData("X", robot.nav.getEstimatedPosition().getX(DistanceUnit.INCH));
        telemetry.addData("Y", robot.nav.getEstimatedPosition().getY(DistanceUnit.INCH));
        telemetry.addData("Current Heading: ", robot.nav.getHeading(AngleUnit.DEGREES));
        telemetry.addData("state", state);
    }
}
