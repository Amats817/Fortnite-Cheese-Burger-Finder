import java.util.*;
public class test {
    public static void main(String[] args){

        ArrayList<String> cheeseburger = new ArrayList<String>();
        for(int i = 0; i < 100; i++){
            cheeseburger.add("Cheeseburger");
        }

        Random rand = new Random();

        cheeseburger.set(rand.nextInt(100), "Fortnite Cheeseburger");

        for(String burger : cheeseburger){
            System.out.println(burger);
        }

        for(int i = 0; i < 100; i++){
            if(cheeseburger.get(i).equals("Fortnite Cheeseburger")){
                System.out.println("Found Fortnite Cheeseburger at index " + (i+1));
            }
        }

    }
}
