package Itmo.lessons9Collections.task3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GameScore {

    Scanner scanner = new Scanner(System.in);
    public String readName(){
        System.out.println("Input name");
        return scanner.nextLine();
    }
    public int findUserScore(Map map){
        return (int) map.get(readName());
    }
    public void fillUserMap ( Map map, User user){
        map.put(user.getName(), (int)(Math.random()*100));
    }

    public static void main(String[] args) {
        GameScore gameScore = new GameScore();
        Map<User, Integer> userScore = new HashMap<>();
        User u1 = new User("Mary");
        User u2 = new User("Garry");
        User u3 = new User("Kate");
        User u4 = new User("Ronnie");
        User u5 = new User("Ann");
        User u6 = new User("Harry");
        User u7 = new User("Ron");
        User u8 = new User("Fred");
        User u9 = new User("George");
        gameScore.fillUserMap(userScore,u1);
        gameScore.fillUserMap(userScore,u2);
        gameScore.fillUserMap(userScore,u3);
        gameScore.fillUserMap(userScore,u4);
        gameScore.fillUserMap(userScore,u5);
        gameScore.fillUserMap(userScore,u6);
        gameScore.fillUserMap(userScore,u7);
        gameScore.fillUserMap(userScore,u8);
        gameScore.fillUserMap(userScore,u9);
        System.out.println(userScore);
        System.out.println(gameScore.findUserScore(userScore));

    }
}
