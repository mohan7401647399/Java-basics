/*
	
	In Java, **looping statements** allow you to execute a block of code repeatedly until a specific condition is met.


## **1. `for` Loop**

Used when the number of iterations is **known**.

**Flow:** Initialization → Condition check → Statement → Increment/Decrement → Condition check → Repeat.

for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}



## **2. `while` Loop**

Used when the number of iterations is **unknown** (condition checked **before** execution).

int i = 1;
while (i <= 5) {
    System.out.println(i);
    i++;
}


## **3. `do-while` Loop**

Similar to `while`, but condition is checked **after** execution (runs at least once).

int i = 1;
do {
    System.out.println(i);
    i++;
} while (i <= 5);


## **4. Enhanced `for` Loop** (For-each)

Used for iterating over arrays/collections.

int[] nums = {1, 2, 3};
for (int num : nums) {
    System.out.println(num);
}


## **5. Loop Control Statements**

* **`break`** → Exits the loop immediately.
* **`continue`** → Skips the current iteration and continues with the next.
* **`return`** → Exits from the method (also ends the loop if inside it).

for (int i = 1; i <= 5; i++) {
    if (i == 3) continue; // skip 3
    if (i == 5) break;    // stop loop
    System.out.println(i);
}

	
 */

// package my_java_package_name;

public class Looping {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            // if (i == 3)
            //     break;
            if (i == 2)
                continue;
            System.out.println(i);
        }
        ;
    };
};