import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BaseballGame {
    public int random(){
        Random random = new Random();
        return random.nextInt(9) + 1;
    }

    public List<Integer> create(){
        List<Integer> computerNumber = new ArrayList<>();
        while (computerNumber.size() < 3){
            int randomNumber = random();
            if(computerNumber.contains(randomNumber)){
                continue;
            }else {
                computerNumber.add(randomNumber);
            }
        }
        return computerNumber;
    }

    public int total(List<Integer> computer, List<Integer> player){
        int total = 0;
        for(int i = 0; i < player.size(); i++){
            if(computer.contains(player.get(i))){
                total += 1;
            }
        }
        return total;
    }


    public int strike(List<Integer> computer, List<Integer> player){
        int strike = 0;
        for(int i = 0; i < player.size(); i++){
            if(computer.get(i).equals(player.get(i))){
                strike += 1;
            }
        }
        return strike;
    }
}
