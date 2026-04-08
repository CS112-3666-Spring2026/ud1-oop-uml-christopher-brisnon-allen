/********************************************
*	AUTHORS: Christopher Brinson-Allen - CBA
*   COLLABORATORS: Nadia Arani
*	LAST MODIFIED:	04/08/2026
*********************************************
*	WorkingShip.java
*********************************************
*	PROGRAM DESCRIPTION:
* workingShip extends from Ship class to implement
* workingship specific stats and information
*********************************************
*	Calls Ship’s constructor first, setting fields name, type, hull, and default mission status.
*   Set ShipType to working
*   Initialize workingShip Specific Data (with clamp to prevent negative values)
*       - miningPower
*       - salvagePower
*       - ScoutPower
*********************************************/
public class WorkingShip extends Ship {
	private int miningPower;
	private int salvagePower;
	private int scoutPower;

	public WorkingShip(String name, int hull, int miningPower, int salvagePower, int scoutPower) {
		super(name, ShipType.WORKING, hull);
		this.miningPower = Math.max(0, miningPower);
		this.salvagePower = Math.max(0, salvagePower);
		this.scoutPower = Math.max(0, scoutPower);
	}

	public int getMiningPower() {
		return miningPower;
	}

	public int getSalvagePower() {
		return salvagePower;
	}

	public int getScoutPower() {
		return scoutPower;
	}
}
