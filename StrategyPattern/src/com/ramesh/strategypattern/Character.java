package com.ramesh.strategypattern;

public abstract class Character {

	private WeaponBehaviour behaviour;

	/**
	 * Define the fight {@link WeaponBehaviour#useWeapon()}
	 */
	public void fight() {
		//
		behaviour.useWeapon();
	}

	/**
	 * 
	 * @param w
	 */
	public void setWeaponBehavior(WeaponBehaviour w) {
		this.behaviour = w;
	}

}
