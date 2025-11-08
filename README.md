# 🚀 DSA in Java

![Problems Solved](https://img.shields.io/badge/Solved-Auto_Updating-brightgreen?style=for-the-badge)

<!-- 🟠 LeetCode Stats -->
![LeetCode Total](https://img.shields.io/badge/dynamic/json?url=https://leetcode-stats-api.herokuapp.com/Abhinav_Vengala8&query=totalSolved&label=LeetCode%20Solved&color=orange&logo=leetcode&style=for-the-badge)
![LeetCode Easy](https://img.shields.io/badge/dynamic/json?url=https://leetcode-stats-api.herokuapp.com/Abhinav_Vengala8&query=easySolved&label=Easy&color=brightgreen)
![LeetCode Medium](https://img.shields.io/badge/dynamic/json?url=https://leetcode-stats-api.herokuapp.com/Abhinav_Vengala8&query=mediumSolved&label=Medium&color=orange)
![LeetCode Hard](https://img.shields.io/badge/dynamic/json?url=https://leetcode-stats-api.herokuapp.com/Abhinav_Vengala8&query=hardSolved&label=Hard&color=red)

<!-- 🟢 GeeksforGeeks Stats -->
![GfG Solved](https://img.shields.io/badge/dynamic/json?url=https://gfg-stats-api.vercel.app/abhinavvengala8&query=total_problems_solved&label=GfG%20Solved&color=darkgreen&logo=geeksforgeeks)

<!-- 🟩 HackerRank (Static for now) -->
[![HackerRank](https://img.shields.io/badge/HackerRank-Profile-brightgreen?style=for-the-badge&logo=hackerrank)](https://www.hackerrank.com/profile/abhinav_vengala8)

---

### 🌍 Profiles

- [🔸 LeetCode](https://leetcode.com/u/Abhinav_Vengala8/)
- [🟢 GeeksforGeeks](https://www.geeksforgeeks.org/user/abhinavvengala8/)
- [🟩 HackerRank](https://www.hackerrank.com/profile/abhinav_vengala8)

---

## 📊 Problem Statistics (Auto-Updating)

| Platform | Easy | Medium | Hard | Total |
|-----------|------|--------|------|--------|
| **LeetCode** | ![Easy](https://img.shields.io/badge/dynamic/json?url=https://leetcode-stats-api.herokuapp.com/Abhinav_Vengala8&query=easySolved&label=&color=brightgreen) | ![Medium](https://img.shields.io/badge/dynamic/json?url=https://leetcode-stats-api.herokuapp.com/Abhinav_Vengala8&query=mediumSolved&label=&color=orange) | ![Hard](https://img.shields.io/badge/dynamic/json?url=https://leetcode-stats-api.herokuapp.com/Abhinav_Vengala8&query=hardSolved&label=&color=red) | ![Total](https://img.shields.io/badge/dynamic/json?url=https://leetcode-stats-api.herokuapp.com/Abhinav_Vengala8&query=totalSolved&label=&color=blue) |
| **GeeksforGeeks** | - | - | - | ![GfG](https://img.shields.io/badge/dynamic/json?url=https://gfg-stats-api.onrender.com/user/abhinavvengala8&query=total_problems_solved&label=&color=darkgreen) |
| **HackerRank** | - | - | - | 🔹 [Profile](https://www.hackerrank.com/profile/abhinav_vengala8) |

---

## 📘 Topics Covered

- Arrays & Strings  
- Hashing  
- Two Pointers / Sliding Window  
- Stack & Queue  
- Linked List  
- Binary Search  
- Recursion & Backtracking  
- Trees & BST  
- Graphs  
- Heap & Priority Queue  
- Dynamic Programming  
- Advanced (Trie, Segment Tree, Union-Find)

---

## 🧩 Example File Format

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
