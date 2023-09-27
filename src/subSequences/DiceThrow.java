package subSequences;

import java.util.ArrayList;
import java.util.List;

public class DiceThrow {

	public static void main(String[] args) {

        System.out.println(sub("", 4));

    }


    static List <String> sub(String p , int target){
        if(target == 0){
            ArrayList<String> list = new ArrayList<String>();
            list.add(p);
            return list;
        }

        List<String> comb = new ArrayList<String>();
        for(int i = 1; i <= 6 && i <= target; i++){
            comb.addAll(sub(p + i , target - i));
        }

        return comb;
    }
}
