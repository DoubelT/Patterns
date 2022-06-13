package FactoryMethod;
import java.util.Scanner;


public class EnemyShipTesting {

    public static void main(String[] args) {

        EnemyShipFactory shipFactory = new EnemyShipFactory();
        EnemyShip enemy = null;

        Scanner user = new Scanner(System.in);

        System.out.println("What type of enemy should be created? (Ufo / Rocket / Big Ufo)");
        System.out.println("To End the program type: End");

        while (user.hasNextLine()){
            String input = user.nextLine();

            if(input.equals("End")) break;

            enemy = shipFactory.makeEnemyShip(input);

            doStuffEnemy(enemy);

        }


    }

    private static void doStuffEnemy(EnemyShip enemyShip) {
        enemyShip.displayEnemyShip();
        enemyShip.followHeroShip();
        enemyShip.enemyShipShoots();

    }
}
