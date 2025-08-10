/*
	
	In Java, **looping statements** allow you to execute a block of code repeatedly until a specific condition is met.

---

## **1. `for` Loop**

Used when the number of iterations is **known**.

```java
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
```

**Flow:** Initialization → Condition check → Statement → Increment/Decrement → Condition check → Repeat.

---

## **2. `while` Loop**

Used when the number of iterations is **unknown** (condition checked **before** execution).

```java
int i = 1;
while (i <= 5) {
    System.out.println(i);
    i++;
}
```

---

## **3. `do-while` Loop**

Similar to `while`, but condition is checked **after** execution (runs at least once).

```java
int i = 1;
do {
    System.out.println(i);
    i++;
} while (i <= 5);
```

---

## **4. Enhanced `for` Loop** (For-each)

Used for iterating over arrays/collections.

```java
int[] nums = {1, 2, 3};
for (int num : nums) {
    System.out.println(num);
}
```

---

## **5. Loop Control Statements**

* **`break`** → Exits the loop immediately.
* **`continue`** → Skips the current iteration and continues with the next.
* **`return`** → Exits from the method (also ends the loop if inside it).

```java
for (int i = 1; i <= 5; i++) {
    if (i == 3) continue; // skip 3
    if (i == 5) break;    // stop loop
    System.out.println(i);
}
```

---

If you want, I can create a **Java looping statements flowchart** showing how `for`, `while`, and `do-while` work visually.
Do you want me to make that?

	
 */

package my_java_package_name;

public class Looping {

}
