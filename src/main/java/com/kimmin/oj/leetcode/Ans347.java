package com.kimmin.oj.leetcode;
import java.util.*;
/**
 * Created by kimmin on 5/2/16.
 */
public class Ans347 {
    public class Solution {
        public List<Integer> topKFrequent(int[] nums, int k) {
            HashMap<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
            //Deque<Integer> deque = new ArrayDeque<Integer>();
            for(int i=nums.length - 1; i>=0; i--){
                if(!map.containsKey(nums[i])){
                    /** New Val **/
                    map.put(nums[i], 1);
                }else{
                    Integer val = map.get(nums[i]);
                    map.put(nums[i], val + 1);
                }
            }

            Comparator<FreqNum> comp = new Comparator<FreqNum>(){
                public int compare(FreqNum n1, FreqNum n2){
                    if(n1.freq < n2.freq) return 1;
                    else if(n1.freq > n2.freq) return -1;
                    else return 0;
                }
            };
            PriorityQueue<FreqNum> pq = new PriorityQueue<FreqNum>(comp);

            for(Map.Entry<Integer, Integer> entry: map.entrySet()){

            }

            for(Integer key: map.keySet()){
                pq.offer(new FreqNum(key, map.get(key)));
            }
            List<Integer> list = new LinkedList<Integer>();
            for(int i=0; i<k; i++){
                list.add(pq.poll().num);
            }
            return list;
        }

        public class FreqNum {
            public FreqNum(int num, int freq){
                this.num = num;
                this.freq = freq;
            }
            public int num = -1;
            public int freq = 0;
        }


    }
}
