import java.util.HashMap;
import java.util.Map;

class A{
    public Map<Integer, Integer> map = new HashMap<>();

    public int get(int key){
        return map.get(key);
    }

    public void set(int key, Object value){
        map.put(key, value);
    }
}