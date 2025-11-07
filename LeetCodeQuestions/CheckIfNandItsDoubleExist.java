package kunal;

import java.util.HashMap;
import java.util.Map;

public class CheckIfNandItsDoubleExist {
    public boolean checkIfExist(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : arr) {
            if(!map.containsKey(i))map.put(i,1);
            else map.put(i,map.get(i)+1);
        }
        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            if(e.getKey() == 0){
                if(e.getValue()>=2){
                    return true;
                }
                else{
                    continue;
                }
            }
            if(map.containsKey(e.getKey()*2))return true;
        }
        return false;
    }
}
