package kunal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

class RandomizedSet {
	HashMap<Integer, Integer> map;
	Random random;
    public RandomizedSet() {
        map = new HashMap<>();
        random = new Random();
    }
    
    public boolean insert(int val) {
        if(map.containsKey(val))
        	return false;
        else {
        	map.put(val, 1);
        	return true;
        }
    }
    
    public boolean remove(int val) {
        if(map.containsKey(val)) {
        	map.remove(val);
        	return true;
        }
        else {
        	return false;
        }
    }
    
    public int getRandom() {
    	ArrayList<Integer> values = new ArrayList<>();
    	for(Map.Entry<Integer, Integer> e : map.entrySet()) {
    		values.add(e.getKey());
    	}
    	int index = random.nextInt(values.size());
    	return values.get(index);
    }
}