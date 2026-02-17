package Recursion.Array;

import java.util.ArrayList;
import java.util.Arrays;

public class LinearSearchRec {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 4, 4, 5};
//        System.out.println(find(arr, 4, 0));
//        System.out.println(findIndex(arr, 4, 0));
//        System.out.println(findIndexLast(arr, 4, arr.length-1));
//
//        findAllIndex(arr, 4, 0);
//        System.out.println(list);

//        ArrayList<Integer> list = new ArrayList<>();
//        ArrayList<Integer> ans = findAllIndex(arr, 4, 0, new ArrayList<>());
//        System.out.println(ans);
//        System.out.println(list);
        //OR
//        ArrayList<Integer> list = new ArrayList<>();
//        ArrayList<Integer> ans = findAllIndex(arr, 4, 0, list);
//        System.out.println(ans);
//        System.out.println(list);

        System.out.println(findAllIndex2(arr, 4, 0));


    }

    static boolean find(int[] arr, int target, int index) {
        if (index == arr.length) {
            return false;
        }
        if(arr[index] == target) return true;
        return find(arr, target, index+1);
//        return arr[index] == target || find(arr, target, index + 1);
    }

    static int findIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return findIndex(arr, target, index + 1);
        }
    }

    static int findIndexLast(int[] arr, int target, int index) {
        if (index == -1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return findIndexLast(arr, target, index - 1);
        }
    }

    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        findAllIndex(arr, target, index + 1);
    }

    //returning the list
    //way1: pass as arg as ref, no new obj being created in each call
    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }

        //diff func calls have different ref var, but obj is same = list
        //all list in calls point to same obj,
        //adding val in list in diff function calls, value is being added in original obj
        return findAllIndex(arr, target, index + 1, list);
    }

    //Returning the list
    //way2
    static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index) {

        //diff obj for each call
        ArrayList<Integer> list = new ArrayList<>();

        if (index == arr.length) {
            return list;
        }

        // this will contain answer for that func call only
        if (arr[index] == target) {
            list.add(index);
        }

        //without this, it will return empty list
        ArrayList<Integer> ansFromBelowCalls = findAllIndex2(arr, target, index + 1);
        list.addAll(ansFromBelowCalls);

        return list;
    }

}
