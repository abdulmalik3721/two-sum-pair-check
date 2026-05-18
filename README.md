# two-sum-pair-check
Check whether a pair with a given sum exists in an array using Java.

# Two Sum : Check if a Pair with Given Sum Exists in Array

This project contains Java solutions for the classic **Two Sum Problem**.

## Problem Statement

Given an array of integers and a target sum, determine whether there exists a pair of elements whose sum equals the target.

### Example

Input:
```text
Array = [2, 7, 11, 15]
Target = 9
```

Output:
```text
Pair Exists: (2, 7)
```

---

# Approaches Used

## 1. Brute Force Approach

### Logic
Check every possible pair in the array.

### Time Complexity
```text
O(n²)
```

### Space Complexity
```text
O(1)
```

---

## 2. Optimized HashSet Approach

### Logic
Store visited elements in a HashSet and check whether  
`target - currentElement` already exists.

### Time Complexity
```text
O(n)
```

### Space Complexity
```text
O(n)
```

---

# Java Code

```java
import java.util.HashSet;

public class TwoSum {

    public static boolean hasPair(int[] arr, int target) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {

            int complement = target - num;

            if (set.contains(complement)) {
                System.out.println("Pair Found: " + num + ", " + complement);
                return true;
            }

            set.add(num);
        }

        return false;
    }

    public static void main(String[] args) {

        int[] arr = {2, 7, 11, 15};
        int target = 9;

        boolean result = hasPair(arr, target);

        System.out.println("Result: " + result);
    }
}
```

---

# Output

```text
Pair Found: 7, 2
Result: true
```

---

# Concepts Used

- Arrays
- HashSet
- Time Complexity
- Space Complexity
- Problem Solving
- Data Structures and Algorithms

---

# Applications

- Coding Interviews
- Competitive Programming
- DSA Practice
- LeetCode Style Problems

---

# Author

Abdul Malik<img width="1536" height="1024" alt="ChatGPT Image May 18, 2026, 12_42_23 PM" src="https://github.com/user-attachments/assets/d90535c4-3b9a-4de9-aa57-1e85a31623a7" />
