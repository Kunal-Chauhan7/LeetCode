package kunal;

import java.util.ArrayList;

class MyHashMap {
	ArrayList<Integer> keys;
	ArrayList<Integer> values;
	public MyHashMap() {
		keys = new ArrayList<>();
		values = new ArrayList<>();
    }
    
    public void put(int key, int value) {
        if(keys.contains(key)) {
        	int index = keys.indexOf(key);
        	values.set(index, value);
        }
        else {
        	keys.add(key);
        	values.add(value);
        }
    }
    
    public int get(int key) {
        if(keys.contains(key)) {
        	int index = keys.indexOf(key);
        	return values.get(index);
        }
        else
        	return -1;
    }
    
    public void remove(int key) {
        if(keys.contains(key)) {
        	int index = keys.indexOf(key);
        	keys.remove(index);
        	values.remove(index);
        }
    }
}
