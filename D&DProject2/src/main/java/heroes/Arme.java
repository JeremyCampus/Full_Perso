package main.java.heroes;

import java.util.Scanner;


class Arme{

	protected String nameWeapon = "None";
	protected int weaponAttackLevel = 1;

	public Arme() {

	}


	public String getNameWeapon(){
		return nameWeapon;
	}

	public int getWeaponAttackLevel(){
		return weaponAttackLevel;
	}

	

	public void setNameWeapon(String newNom){
		nameWeapon = newNom;
	}

	public void setWeaponAttackLevel(int newWeaponAttackLevel){
		weaponAttackLevel = newWeaponAttackLevel;
	}


	public static void main(String[] args) {

	}
}