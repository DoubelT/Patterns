package StatePattern;

import java.io.IOException;
import java.util.Scanner;

public class Demo {


    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) throws IOException {

        Player player = new Player(false);

        boolean loop = true;

        while(loop){
            System.out.println(player.getStatus());
            String input = sc.nextLine();

            switch (input){

                case "an" -> player.getStatus().an();
                case "aus" -> player.getStatus().aus();
                case "weiter" -> player.getStatus().weiter();
                case "zurück" -> player.getStatus().zurueck();
                default -> loop = false;

            }



        }

        System.out.println("Unexpected Input for the Player. Shutting down.");








    }





}
