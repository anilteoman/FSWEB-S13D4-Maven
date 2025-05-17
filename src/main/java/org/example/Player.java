package org.example;

public class Player {

    private String name;
    private int healthPercentage;
    private Weapon weapon;

    public Player(String name, int healthPercentage, Weapon weapon) {


        this.name = name;
        this.weapon = weapon;


        if (healthPercentage > 100) {
            this.healthPercentage = 100;
        } else {
            this.healthPercentage = healthPercentage;
        }

    }

    private void checkAndSetHealth(int healthPercentage) {
        if (healthPercentage < 0) {
            this.healthPercentage = 0;
        }
        if (healthPercentage > 100) {
            this.healthPercentage = 100;
        }
    }


    public int healthRemaining() {
        return healthPercentage;

    }

    public void loseHealth(int damage) {

        int healthRemain = healthPercentage - damage;
        if (healthPercentage == 0) {
            System.out.println(name + " player has been knocked out of the game");
        }
        healthPercentage = healthRemain;
        checkAndSetHealth(healthRemain);
    }

    public void restoreHealth(int healthPotion) {

        this.healthPercentage += healthPotion;
        checkAndSetHealth(this.healthPercentage);

    }


}
