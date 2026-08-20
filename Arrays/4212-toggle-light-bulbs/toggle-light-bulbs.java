class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        HashSet<Integer> set = new HashSet<>();
        for(int num:bulbs){
            if(!set.remove(num)){
                set.add(num);
            }
        }
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        return list;
    }
}