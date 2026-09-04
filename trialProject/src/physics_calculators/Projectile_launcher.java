package physics_calculators;

import java.util.Scanner;

public class Projectile_launcher {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // --- Original Inputs ---
        System.out.println("Input theta (in degrees):");
        double theta_deg = scanner.nextDouble();
        // We must convert to radians for Java's Math functions
        double theta_rad = Math.toRadians(theta_deg);

        System.out.println("Put initial velocity (m/s):");
        double Vi = scanner.nextDouble();

        System.out.println("What is g? (e.g., 9.81)");
        double g = scanner.nextDouble();

        System.out.println("What is the initial height in meters?");
        double yi = scanner.nextDouble();

        // --- NEW Inputs for Air Resistance ---
        System.out.println("What is the mass of the object (kg)?");
        double mass = scanner.nextDouble();

        System.out.println("What is the drag coefficient (e.g., 0.47 for a sphere)?");
        double Cd = scanner.nextDouble();

        System.out.println("What is the cross-sectional area (m^2)?");
        double A = scanner.nextDouble();

        // --- NEW DEBUGGING BLOCK ---
        // Add this to your code to confirm your inputs
        System.out.println("\n--- CHECKING VALUES ---");
        System.out.println("Theta (rad): " + theta_rad);
        System.out.println("Velocity: " + Vi);
        System.out.println("g: " + g);
        System.out.println("Height: " + yi);
        System.out.println("Mass: " + mass);
        System.out.println("Cd: " + Cd);
        System.out.println("Area: " + A);
        System.out.println("-----------------------\n");
        // --- END DEBUGGING BLOCK ---

        // --- Simulation Constants ---
        final double rho = 1.225; // Standard air density at sea level (kg/m^3)
        double dt = 0.0001;        // Time step (in seconds). Smaller = more accurate.

        // --- Initial State Variables (breaking Vi into components) ---
        double x = 0.0;     // Initial horizontal position
        double y = yi;      // Initial vertical position
        double vx = Vi * Math.cos(theta_rad); // Initial x-velocity
        double vy = Vi * Math.sin(theta_rad); // Initial y-velocity

        // ==========================================================
        //  THE SIMULATION LOOP
        //  This replaces your single 'range' formula.
        //  We loop as long as the projectile is above the ground (y > 0).
        // ==========================================================
        while (y >= 0) {

            // 1. Calculate current speed and drag force magnitude
            // v = sqrt(vx^2 + vy^2)
            double v = Math.sqrt(Math.pow(vx, 2) + Math.pow(vy, 2));

            // F_D = 0.5 * rho * v^2 * Cd * A
            double Fd = 0.5 * rho * Math.pow(v, 2) * Cd * A;

            // 2. Resolve drag force into x and y components
            // Fd_x = -Fd * (vx / v)  (acts opposite to x-velocity)
            // Fd_y = -Fd * (vy / v)  (acts opposite to y-velocity)
            double Fdx = -Fd * (vx / v);
            double Fdy = -Fd * (vy / v);

            // 3. Calculate Net Force (Drag + Gravity)
            double Fnet_x = Fdx;
            double Fnet_y = Fdy - (mass * g); // Gravity only acts in y-direction

            // 4. Calculate Acceleration (using F=ma, so a = F/m)
            double ax = Fnet_x / mass;
            double ay = Fnet_y / mass;

            // 5. Update Velocity for the next step (v_new = v_old + a*dt)
            vx += ax * dt;
            vy += ay * dt;

            // 6. Update Position for the next step (p_new = p_old + v*dt)
            x += vx * dt;
            y += vy * dt;
        }

        System.out.println("\n--- SIMULATION COMPLETE ---");
        System.out.printf("Total range with air resistance: %.2f meters%n", x);

        // --- For comparison, let's run your original formula ---
        // Note: Your formula was correct for the no-drag case!
        double Viy_no_drag = Vi * Math.sin(theta_rad);
        double Vix_no_drag = Vi * Math.cos(theta_rad);

        // This is your formula, just using the new variable names
        double time_no_drag = ((-Math.sqrt(Math.pow(Viy_no_drag, 2) + 2 * g * yi) - Viy_no_drag) / -g);
        double range_no_drag = time_no_drag * Vix_no_drag;

        System.out.printf("Original range (NO resistance):  %.2f meters%n", range_no_drag);
    }
}