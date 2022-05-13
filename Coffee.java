package machine;

import java.util.Scanner;

public class Coffee {
    private int water;
    private int milk;
    private int beans;
    private int cups;
    private int cash;

    int espressoCash = 4;
    int espressoWater = 250;
    int espressoBeans = 16;
    int espressoCups = 1;

    int latteCash = 7;
    int latteWater = 350;
    int latteMilk = 75;
    int latteBeans = 20;
    int latteCups = 1;

    int cappuccinoCash = 6;
    int cappuccinoWater = 200;
    int cappuccinoMilk = 100;
    int cappuccinoBeans = 12;
    int cappuccinoCups = 1;

    public Coffee() {
        this.water = 400;
        this.milk = 540;
        this.beans = 120;
        this.cash = 550;
        this.cups = 9;
    }

    public void fill() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water you want to add: ");
        this.water += scanner.nextInt();

        System.out.println("Write how many ml of milk you want to add: ");
        this.milk += scanner.nextInt();

        System.out.println("Write how many grams of coffee beans you want to add: ");
        this.beans += scanner.nextInt();

        System.out.println("Write how many disposable cups of coffee you want to add: ");
        this.cups += scanner.nextInt();
    }

    public void remaining() {
        System.out.println("The coffee machine has: ");

        System.out.printf("%d ml of water\n", this.water);
        System.out.printf("%d ml of milk\n", this.milk);
        System.out.printf("%d g of coffee beans\n", this.beans);
        System.out.printf("%d disposable cups\n", this.cups);
        System.out.printf("$%d of money\n", this.cash);

    }

    public void take() {
        System.out.printf("I gave you $%d of money\n", this.cash);
        this.cash = 0;
    }

    public void makeEspresso() {

        if (this.water >= espressoWater && this.beans >= espressoBeans && this.cups >= espressoCups) {

            this.water -= espressoWater;
            this.beans -= espressoBeans;
            this.cups -= espressoCups;
            this.cash += espressoCash;
            System.out.println("I have enough resources, making you a coffee!");

        } else if (this.water < espressoWater) {
            System.out.println("Sorry, not enough water!");

        } else if (this.beans < espressoBeans) {
            System.out.println("Sorry, not enough coffee beans!");

        } else if (this.cups < espressoCups) {
            System.out.println("Sorry, not enough disposable cups!");
        }
    }

    public void makeLatte() {

        if (this.water >= latteWater && this.beans >= latteBeans && this.cups >= latteCups && this.milk >= latteMilk) {

            this.water -= latteWater;
            this.milk -= latteMilk;
            this.beans -= latteBeans;
            this.cups -= latteCups;
            this.cash += latteCash;
            System.out.println("I have enough resources, making you a coffee!");

        } else if (this.water < latteWater) {
            System.out.println("Sorry, not enough water!");

        } else if (this.milk < latteMilk) {
            System.out.println("Sorry, not enough milk!");

        } else if (this.beans < latteBeans) {
            System.out.println("Sorry, not enough coffee beans!");

        } else if (this.cups < latteCups) {
            System.out.println("Sorry, not enough disposable cups!");
        }
    }

    public void makeCappuccino() {

        if (this.water >= cappuccinoWater && this.beans >= cappuccinoBeans && this.cups >= cappuccinoCups && this.milk >= cappuccinoMilk) {

            this.water -= cappuccinoWater;
            this.milk -= cappuccinoMilk;
            this.beans -= cappuccinoBeans;
            this.cups -= cappuccinoCups;
            this.cash += cappuccinoCash;
            System.out.println("I have enough resources, making you a coffee!");

        } else if (this.water < cappuccinoWater) {
            System.out.println("Sorry, not enough water!");

        } else if (this.milk < cappuccinoMilk) {
            System.out.println("Sorry, not enough milk!");

        } else if (this.beans < cappuccinoBeans) {
            System.out.println("Sorry, not enough coffee beans!");

        } else if (this.cups < cappuccinoCups) {
            System.out.println("Sorry, not enough disposable cups!");
        }
    }
}