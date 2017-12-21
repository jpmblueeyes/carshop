/*
 * jonpaul millan   18231
 * pr.2
 * Mr.larrubia
 */


package carshop;

import java.util.Scanner;

public class CarShop {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int totalCost = 0;
        totalCost += base();
        totalCost += automaticWindows();
        totalCost += RemotekeylessEntry();
        totalCost += OnStarSystem();
        totalCost += AntilockBrakes();
        totalCost += TelescopingsteeringWheelAdjustablePedals();
        totalCost += sunroof();
        totalCost += ColdWeatherPackage();
        totalCost += Gps();
        totalCost += Turbo();
        totalCost += leather();
        totalCost += camera();
        System.out.println("$" + totalCost + " would be the Final Price.");
        //TODO: call methods that you write for each feature
        //TODO: print the total cost of the vehicle
    }

    public static int base() {
        System.out.println("Our inventory:");
        System.out.println("Model 1 - $15,000");
        System.out.println("Model 2 - $24,000");
        System.out.println("Model 3 - $40,000");
        System.out.println("Which base model did the customer choose? "
                + "(enter full model name) > ");
        String model = in.nextLine();
        if (model.equalsIgnoreCase("Model 1")) {

            return 15000;
        } else if (model.equalsIgnoreCase("Model 2")) {
            return 24000;
        } else if (model.equalsIgnoreCase("Model 3")) {
            return 40000;
        }
        return base();

    }

    public static int automaticWindows() {
        System.out.print("Do you want Automatic Windows for $500? (y/n) > ");
        String automaticWindows;
        automaticWindows = in.next();

        if (automaticWindows.equals("y")) {
            return 500;
        } else if (automaticWindows.equals("n")) {
            return 0;
        }
        return automaticWindows();
    }

    public static int RemotekeylessEntry() {
        System.out.print("Do you want Remote keyless entry for $1000? (y/n) >");
        String RemotekeylessEntry;
        RemotekeylessEntry = in.next();

        if (RemotekeylessEntry.equals("y")) {
            return 1000;
        } else if (RemotekeylessEntry.equals("n")) {
            return 0;
        }
        return RemotekeylessEntry();
    }

    public static int OnStarSystem() {
        System.out.print("Do you want OnStar System for $1000? (y/n) >");
        String OnStarSystem;
        OnStarSystem = in.next();

        if (OnStarSystem.equals("y")) {
            return 1000;
        } else if (OnStarSystem.equals("n")) {
            return 0;
        }
        return OnStarSystem();
    }

    public static int AntilockBrakes() {
        System.out.print("Do you want Anti-lock Brakes for $500? (y/n) >");
        String AntilockBrakes;
        AntilockBrakes = in.next();

        if (AntilockBrakes.equals("y")) {
            return 500;
        } else if (AntilockBrakes.equals("n")) {
            return 0;
        }
        return AntilockBrakes();
    }

    public static int TelescopingsteeringWheelAdjustablePedals() {
        System.out.print("Do you want Telescoping steering wheel/adjustable pedals for $1000 (y/n) >");
        String TelescopingsteeringWheelAdjustablePedals;
        TelescopingsteeringWheelAdjustablePedals = in.next();

        if (TelescopingsteeringWheelAdjustablePedals.equals("y")) {
            return 1000;
        } else if (TelescopingsteeringWheelAdjustablePedals.equals("n")) {
            return 0;
        }
        return TelescopingsteeringWheelAdjustablePedals();
    }

    public static int sunroof() {
        System.out.print("Do you want a Sunroof for $800? (y/n) >");
        String sunroof;
        sunroof = in.next();

        if (sunroof.equals("y")) {
            return 800;
        } else if (sunroof.equals("n")) {
            return 0;
        }
        return sunroof();
    }

    public static int ColdWeatherPackage() {
        System.out.print("Do you want a Cold Weather Package (Heated seats/windshield heater) for $1500? (y/n) >");
        String ColdWeatherPackage;
        ColdWeatherPackage = in.next();

        if (ColdWeatherPackage.equals("y")) {
            return 1500;
        } else if (ColdWeatherPackage.equals("n")) {
            return 0;
        }
        return ColdWeatherPackage();
    }

    public static int Gps() {
        System.out.print("Do you want GPS Navigation System for $750? (y/n) >");
        String Gps;
        Gps = in.next();

        if (Gps.equals("y")) {
            return 750;
        } else if (Gps.equals("n")) {
            return 0;
        }
        return Gps();
    }

    public static int Turbo() {
        System.out.print("Do you want Turbo for $2100? (y/n) >");
        String Turbo;
        Turbo = in.next();

        if (Turbo.equals("y")) {
            return 2100;
        } else if (Turbo.equals("n")) {
            return 0;
        }
        return Turbo();
    }

    public static int leather() {
        System.out.print("Do you want to add leather for $300? (y/n) >");
        String Leather;
        Leather = in.next();

        if (Leather.equals("y")) {
            return 300;
        } else if (Leather.equals("n")) {
            return 0;
        }
        return leather();
    }

    public static int camera() {
        System.out.print("Do you want to add Cameras for $999? (y/n) >");
        String Camera;
        Camera = in.next();

        if (Camera.equals("y")) {
            return 999;
        } else if (Camera.equals("n")) {
            return 0;
        }
        return camera();
    }
}
