class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       if (k == nums.length) return nums;

        Map <Integer, Integer> freqMap= new HashMap<>();
        for(int i: nums){
            freqMap.put(i, freqMap.getOrDefault(i,0)+1 );
        }

        Queue <Integer> minHeap= new PriorityQueue<>((a,b)-> freqMap.get(a) - freqMap.get(b));

        for(int num: freqMap.keySet()){
            minHeap.add(num);
            if(minHeap.size() > k){
                minHeap.poll();
            }
        }

        int[] result= new int[minHeap.size()];
        int index=0;
        while(!minHeap.isEmpty()){
            result[index++]=minHeap.poll();
        }

        return result;
    }
}