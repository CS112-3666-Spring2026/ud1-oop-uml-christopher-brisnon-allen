/********************************************
*	AUTHORS: Christopher Brinson-Allen - CBA
*   COLLABORATORS: Nadia Arani
*	LAST MODIFIED:	04/08/2026
*********************************************
*	FightingShip.java
*********************************************
*	PROGRAM DESCRIPTION:
* fightingShip extends from Ship class to implement
* fightingShip specific stats and information
*********************************************
*	Calls Ship’s constructor first, setting fields name, type, hull, and default mission status.
*   Set ShipType to fighting
*   Initialize fightingShip Specific Data (with clamp to prevent negative values)
*       - combatPower
*********************************************/
public class FighterShip extends Ship {
	private int combatPower;

	public FighterShip(String name, int hull, int combatPower) {
		super(name, ShipType.FIGHTER, hull);
		this.combatPower = Math.max(0, combatPower);
	}

	public int getCombatPower() {
		return combatPower;
	}
}
