/*

	In Java, **control flow statements** determine the order in which instructions are executed in a program.
They are divided into **three main categories**:

---

## **1. Decision-making statements** (Branching)

Used to decide which block of code should run based on conditions.

* **`if` statement**
* **`if-else` statement**
* **`if-else-if` ladder**
* **Nested if**
* **`switch` statement**

Example:

```java
if (score >= 50) {
    System.out.println("Pass");
} else {
    System.out.println("Fail");
}


## **1. `if` Statement**

Executes a block of code if a condition is `true`.

```java
int age = 18;

if (age >= 18) {
    System.out.println("You are an adult.");
}
```

---

## **2. `if-else` Statement**

Executes one block if the condition is `true`, otherwise executes another block.

```java
if (age >= 18) {
    System.out.println("Adult");
} else {
    System.out.println("Minor");
}
```

---

## **3. `if-else-if` Ladder**

Tests multiple conditions in sequence.

```java
int marks = 85;

if (marks >= 90) {
    System.out.println("Grade A");
} else if (marks >= 75) {
    System.out.println("Grade B");
} else if (marks >= 50) {
    System.out.println("Grade C");
} else {
    System.out.println("Fail");
}
```

---

## **4. Nested `if` Statement**

`if` statement inside another `if`.

```java
if (age >= 18) {
    if (age >= 60) {
        System.out.println("Senior Citizen");
    } else {
        System.out.println("Adult");
    }
}
```

---

## **5. `switch` Statement**

Selects one block of code from multiple options.
Best for discrete values (e.g., integers, characters, enums, strings).

```java
int day = 3;

switch (day) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    case 3:
        System.out.println("Wednesday");
        break;
    default:
        System.out.println("Invalid day");
}
```

---

### **Key Notes**

* In `if` statements, conditions must be **boolean expressions** (`true` or `false`).
* In `switch`, each `case` must be followed by `break` (unless you want *fall-through* behavior).
* You can use the **ternary operator** (`?:`) for short one-line conditions.



## **2. Looping statements** (Iteration)

Used to execute a block of code repeatedly.

* **`for` loop**
* **`while` loop**
* **`do-while` loop**
* **Enhanced for loop** (for-each)

Example:

```java
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
```

---

## **3. Jump statements** (Branch control)

Used to change the normal sequence of execution.

* **`break`** → Exit from a loop or switch.
* **`continue`** → Skip the current loop iteration.
* **`return`** → Exit from the current method.

Example:

```java
for (int i = 1; i <= 5; i++) {
    if (i == 3) continue; // skips printing 3
    if (i == 5) break;    // stops loop
    System.out.println(i);
}
```

---

If you want, I can prepare a **single diagram** that shows **all Java control flow statements** grouped together for quick revision.
Do you want me to prepare that?


 */

package my_java_package_name;

public class ControlFlow_Statements {

}
