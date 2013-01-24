package com.ramesh.strategypattern;

public class Test {

	public static void main(String[] args) {
		//
		Character c = new King();
		c.setWeaponBehavior(new SwordBehaviour());
		//
		

	}

}
