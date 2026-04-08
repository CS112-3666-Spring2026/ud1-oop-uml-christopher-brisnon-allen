/********************************************
*	AUTHORS: Christopher Brinson-Allen - CBA
*   COLLABORATORS: Nadia Arani
*	LAST MODIFIED:	04/08/2026
*********************************************
*	Main.java
*********************************************
*   Imported throughout project
*   import java.util.ArrayList;
*   import java.util.List;
*   import java.util.Objects;
*********************************************
*	PROGRAM DESCRIPTION:
* Fleet Commander is a Idle game where the player controls a fleet
* of ships that do objectives on a time basis, and can do some minor
* combat objectives
*********************************************
* Currently main is only used for testing classes
* all passing test, with exception to hash values not matching even when equals is true, 
* which unsure if this will be an issue for the game, will address with further testing
*********************************************/
public class Main {
    public static void main(String[] args) {
        testDefaultConstructor();
        testFullConstructor();
        testCopyConstructor();
        testSettersAndGetters();
        testAddShipAndCapacity();
        testEquals();
        testToString();

        System.out.println("-----------------------------");
    }

    private static void testDefaultConstructor() {
        System.out.println("\nDefault Constructor");
        Fleet fleetDefault = new Fleet();
        System.out.println(fleetDefault);
    }

    private static void testFullConstructor() {
        System.out.println("\nFull Constructor");
        Fleet fleetFull = new Fleet("Fleet Full Constructor", 500, 20);
        System.out.println(fleetFull);
    }

    private static void testCopyConstructor() {
        System.out.println("\nCopy Constructor");
        Fleet original = new Fleet("Original", 300, 3);
        original.addShip(new WorkingShip("Miner-1", 120, 8, 4, 2));

        Fleet copy = new Fleet(original);
        System.out.println("Copy equals original right after copy: " + copy.equals(original));

        original.addShip(new FighterShip("Guard-1", 140, 10));
        System.out.println("Original ship count after adding new ship: " + original.getCurrentShipCount());
        System.out.println("Copy ship count should stay 1: " + copy.getCurrentShipCount());
    }

    private static void testSettersAndGetters() {
        System.out.println("\nSetters and Getters");
        Fleet fleet = new Fleet();
        fleet.setName("Atlas");
        fleet.setHull(450);
        fleet.setFleetCapacity(6);
        System.out.println("Expecting Atlas, 450, 6");
        System.out.println(fleet.getName());
        System.out.println(fleet.getHull());
        System.out.println(fleet.getFleetCapacity());
    }

    private static void testAddShipAndCapacity() {
        System.out.println("\nAdd Ship and Capacity");
        Fleet fleet = new Fleet("Small Fleet", 150, 1);
        System.out.println("addShip(null) should be false: " + fleet.addShip(null));
        System.out.println("add first ship should be true: " +
                fleet.addShip(new WorkingShip("Worker-1", 100, 5, 2, 1)));
        System.out.println("add second ship at capacity should be false: " +
                fleet.addShip(new FighterShip("Fighter-1", 100, 7)));
    }

    //tests hashcode as well
    private static void testEquals() {
        System.out.println("\nEquals");
        Fleet a = new Fleet("EqualFleet", 200, 2);
        Fleet b = new Fleet("EqualFleet", 200, 2);

        a.addShip(new WorkingShip("Ship-A", 110, 4, 3, 2));
        b.addShip(new WorkingShip("Ship-A", 110, 4, 3, 2));
        System.out.println("a.equals(b) with same values should be true: " + a.equals(b));
        System.out.println("a.hashCode(): " + a.hashCode());
        System.out.println("b.hashCode(): " + b.hashCode());
        System.out.println("When equals is true, hash codes should match: " + (a.hashCode() == b.hashCode()));

        b.setHull(199);
        System.out.println("a.equals(b) after hull change should be false: " + a.equals(b));
        System.out.println("b.hashCode() after hull change: " + b.hashCode());
    }

    private static void testToString() {
        System.out.println("\ntoString");
        Fleet fleet = new Fleet("String Test Fleet", 123, 4);
        System.out.println("toString output: " + fleet.toString());
    }
}
