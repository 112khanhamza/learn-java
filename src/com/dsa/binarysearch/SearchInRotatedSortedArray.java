package com.dsa.binarysearch;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {7, 9, 11, 12, 5};
        search(arr, 12);

        // if array contains duplicate values
        int[] arrDup = {4,5,6,6,7,0,1,2};
    }

    static int search(int[] nums, int target) {
        int indexOfPivot = indexOfPivot(nums);
        System.out.println("Pivot Index = "+ indexOfPivot);
        // if you did not find a pivot that means that the array is not rotated.
        if (indexOfPivot == -1) {
            return binarySearch(nums, 0, nums.length-1, target);
        }
        // 3 cases can happen
        if (nums[indexOfPivot] == target) {
            return indexOfPivot;

        } else if (target >= nums[0]) {
            return binarySearch(nums, 0, indexOfPivot-1, target);

        } else {
            return binarySearch(nums, indexOfPivot+1, nums.length-1, target);
        }
    }

    static int binarySearch(int[] arr, int s, int e, int target) {
        int m;

        while (s<=e) {
            m = s + (e - s) / 2;
            if (target < arr[m]) {
                e = m-1;
            } else if (target > arr[m]) {
                s = m+1;
            } else {
                return m;
            }
        }
        return -1;
    }

    // this will not work for duplicate values
    static int indexOfPivot(int[] nums) {
        int s = 0;
        int e = nums.length-1;
        int m;

        while (s<=e) {
            m = s+(e-s)/2;

            if (m < e && nums[m] > nums[m+1]) {
                return m;

            }
            if (m > s && nums[m] < nums[m-1]) {
                return m-1;

            }
            if (nums[s] >= nums[m]) {
                e = m-1;
            } else {
                s = m+1;
            }
        }
        return -1;
    }

    static int indexOfPivotWithDuplicates(int[] nums) {
        int s = 0;
        int e = nums.length-1;
        int m;

        while (s<=e) {
            m = s+(e-s)/2;

            if (m < e && nums[m] > nums[m+1]) {
                return m;

            }
            if (m > s && nums[m] < nums[m-1]) {
                return m-1;

            }
            // if elements at s, e, m are equal then skip the duplicates
            if (nums[m] == nums[s] && nums[m] == nums[e]) {
                // skip the duplicates
                // NOTE: what if the elements at s & e were the pivot
                // check if start is pivot
                if (nums[s] > nums[s+1]) {
                    return s;
                }
                s++;

                // check weather end is pivot or not
                if (nums[e] < nums[e-1]) {
                    return e-1;
                }
                e--;
            }

            // left side is sorted so pivot should be in right
            else if (nums[s] < nums[m] || (nums[s] == nums[m] && nums[m] > nums[e])){
                s = m + 1;
            } else {
                e = m - 1;
            }
        }
        return -1;
    }
}
