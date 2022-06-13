package FactoryMethod;

public class EnemyShipFactory {

    public EnemyShip makeEnemyShip(String newShipType){

        EnemyShip newShip = null;

        return switch (newShipType) {
            case "Ufo" -> new UFOEnemyShip();
            case "Rocket" -> new RocketEnemyShip();
            case "Big Ufo" -> new BigUFOEnemyShip();
            default -> throw new IllegalArgumentException("This ship does not exist");
        };
    }
}
