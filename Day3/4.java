package Day3;
// 442. Find All Duplicates in an Array

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }

        for(int i : map.keySet()){
            if(map.get(i) > 1 ){
                list.add(i);
            }
        }
      return list;

    }
}
