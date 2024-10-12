/*
class Pair<K, V> {
    private final K key;
    private final V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}

Java users need to return result in Pair class
For Example -> return new Pair(minimum,maximum)
*/

class Solution {
    public Pair<Long, Long> getMinMax(int[] arr) {
        // Code Here
        int min=Integer.MAX_VALUE, max=Integer.MIN_VALUE;
        for(int i: arr){
            min=Math.min(min,i);
            max=Math.max(max,i);
        }
        return new Pair(min,max);
    }
}
