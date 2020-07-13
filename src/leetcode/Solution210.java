package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/**
 * @description:
 * @version: 1.0
 * @author: hongyang.cheng@hand-china.com
 * @date: 2020/6；/13
 */
public class Solution210 {
    public static int[] findOrder(int numCourses, int[][] prerequisites) {
        if (prerequisites==null||prerequisites.length==0){
            int[] res=new int[numCourses];
              for (int i=0;i<numCourses;i++){
                  res[i]=i;
              }
              return res;
        }
        HashMap<Integer, ArrayList<Integer>> tuopu = new HashMap<Integer, ArrayList<Integer>>();
        ArrayList<Integer> rudu = null;
        ArrayList asde=new ArrayList();
        //构造拓扑结构
        HashSet<Integer> cnt = new HashSet<>();
        for (int i = 0; i < prerequisites.length; i++) {
            cnt.add(prerequisites[i][1]);
            cnt.remove(prerequisites[i][0]);
            asde.add(prerequisites[i][1]);
            asde.add(prerequisites[i][0]);

            if (tuopu.containsKey(prerequisites[i][1]) && tuopu.get(prerequisites[i][1]) != null) {
                rudu = tuopu.get(prerequisites[i][1]);
            } else {
                rudu = new ArrayList<Integer>();
            }
            rudu.add(prerequisites[i][0]);
            tuopu.put(prerequisites[i][1], rudu);
        }
        for(int i=0;i<numCourses;i++){
            if (!asde.contains(i)){
                tuopu.put(i,null);
                cnt.add(i);
            }
        }

        ArrayList<Integer> course = new ArrayList<>();
        for (Integer c : cnt) {
            tupDg(c,tuopu, course, c, tuopu.get(c));
        }
        int[] d = new int[course.size()];
        if (d.length < numCourses) {
            return new int[0];
        } else {
            for (int i = 0; i < course.size(); i++) {
                d[i] = course.get(i);
            }
        }
        return d;
     // return null;

    }

    public static void tupDg(int number,HashMap<Integer, ArrayList<Integer>> tuopu, ArrayList<Integer> course, Integer currentNode, ArrayList<Integer> cousNodes) {
        if (cousNodes != null&&cousNodes.contains(number)){
            return;
        }
        if (!course.contains(currentNode)) {
            course.add(currentNode);
        }

        if (cousNodes == null) {
            return;
        } else {
            for (Integer i : cousNodes) {
                cousNodes = tuopu.get(i);
                currentNode = i;
                tupDg(number,tuopu, course, currentNode, cousNodes);
            }
        }
    }

    public static void main(String[] args) {
        //int ac[][] = {{1, 0}, {2, 0}, {3, 1}, {3, 2}};
       // int ac[][] = {{1, 0}, {1, 2}, {1, 3}, {1, 4}};
int ac[][]={{0,1}};
      int result[]= findOrder(2, ac);
    }
}
