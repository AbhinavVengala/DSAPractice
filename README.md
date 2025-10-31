# 🚀 DSA in Java

![Problems Solved](https://img.shields.io/badge/Solved-3-brightgreen?style=for-the-badge)  
![LeetCode Badge](https://img.shields.io/badge/dynamic/json?style=for-the-badge&logo=leetcode&label=LeetCode&query=totalSolved&url=https://leetcode-stats-api.herokuapp.com/Code_with_Abhinav)
[![HackerRank Badge](https://img.shields.io/badge/HackerRank-Profile-brightgreen?style=for-the-badge&logo=hackerrank)](https://www.hackerrank.com/<your-username>)
[![GfG Badge](https://img.shields.io/badge/GeeksforGeeks-Profile-darkgreen?style=for-the-badge&logo=geeksforgeeks)](https://auth.geeksforgeeks.org/user/<your-username>/practice/)

This repository contains my solutions to **Data Structures & Algorithms (DSA)** problems in **Java** from LeetCode, GeeksforGeeks, InterviewBit, and other platforms.

---

## 📌 Progress Tracker (Topics)

-   [ ] Arrays & Strings
-   [ ] Hashing
-   [ ] Two Pointers / Sliding Window
-   [ ] Stack & Queue
-   [ ] Linked List
-   [ ] Binary Search
-   [ ] Recursion & Backtracking
-   [ ] Trees & BST
-   [ ] Graphs
-   [ ] Heap & Priority Queue
-   [ ] Dynamic Programming
-   [ ] Advanced (Trie, Segment Tree, Union-Find)

---

## 📊 Solved Problems Table

| #   | Problem                                           | Topic  | Difficulty | Platform | Status  |
| --- | ------------------------------------------------- | ------ | ---------- | -------- | ------- |
| 1   | [Two Sum](https://leetcode.com/problems/two-sum/) | Arrays | Easy       | LeetCode | ✅ Done |
| 2   |                                                   |        |            |          |         |
| 3   |                                                   |        |            |          |         |

> ✅ = Solved, ⏳ = In Progress, 🔁 = To Revisit

---

## 🌍 Platforms Covered

-   [LeetCode](https://leetcode.com)
-   [GeeksforGeeks](https://www.geeksforgeeks.org/)
-   [HackerRank](https://www.hackerrank.com/)
-   [Udemy Courses](https://www.udemy.com/)

---

## ⚡ Notes

-   Each solution is written in **Java 17**.
-   File naming: `ProblemName.java`
-   Each file contains problem metadata in comments at the top.

---

### Example File Format

```java
// Problem: Two Sum
// Platform: LeetCode
// Difficulty: Easy
// Link: https://leetcode.com/problems/two-sum/

import java.util.*;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
```

---

## 🏆 Goals

-   Solve **150+ DSA problems** across Easy/Medium/Hard.
-   Master **core DSA concepts** in Java.
-   Be fully prepared for **FAANG-level interviews**.
