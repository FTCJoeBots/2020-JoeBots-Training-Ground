package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;

import org.firstinspires.ftc.robotcore.external.navigation.AngleUnit;

@TeleOp(name = "mechanum driving opmode", group = "ftc16072")
public class MecanumDrivingOpMode extends OpMode {
    private Robot robot = new Robot();
    private double[] distances;

    // Code to run ONCE when the driver hits INIT
    @Override
    public void init() {
        robot.init(hardwareMap);
    }

    // Code to run REPEATEDLY after the driver hits PLAY but before they hit STOP
    @Override
    public void loop() {
        double forward = gamepad1.left_stick_y * -1; //The y direction on the gamepad is reversed idk why
        double strafe = gamepad1.left_stick_x;
        double rotate = gamepad1.right_stick_x;

        robot.nav.mecanumDrive.driveMecanum(forward, strafe, rotate);
        distances = robot.nav.mecanumDrive.getDistanceCm();
        telemetry.addData("distance fwd", distances[0]);
        telemetry.addData("distance right", distances[1]);
        telemetry.addData("Current Heading: ", robot.nav.getHeading(AngleUnit.DEGREES));

    }
}
