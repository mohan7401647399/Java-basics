/*

## **1. What is a Thread?**

    A **thread** is the smallest unit of execution in a Java program.

    Think of it like a **worker** in a company:
        * A **single-threaded** program has **one worker** doing all the tasks in order.
        * A **multi-threaded** program has **multiple workers** doing tasks at the same time.

	💡 **Real-world analogy:**
	
	* **Single-threaded:** One chef cooking every dish one by one.
	* **Multi-threaded:** Several chefs cooking different dishes at the same time.


## **2. Single-Threaded in Java**

    * Only **one thread** (usually the `main` thread) runs.
    * Tasks are executed **one after another**.
    * If one task takes too long, everything else **waits**.
    * Easier to write, but **slower** for large or independent tasks.

**Example:**

public class SingleThreadExample {
    public static void main(String[] args) {
        System.out.println("Task 1 started");
        System.out.println("Task 1 finished");

        System.out.println("Task 2 started");
        System.out.println("Task 2 finished");
    }
}

**Output order is fixed** because only one thread works.


## **3. Multi-Threaded in Java**

	* Multiple threads can run **simultaneously**.
	* Tasks can run **in parallel** or interleave execution.
	* Useful for **time-consuming or independent tasks** (e.g., downloading files, handling multiple user requests).
	* Harder to manage because of **thread safety** issues.

**Example:**

public class MultiThreadExample extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running");
    }

    public static void main(String[] args) {
        MultiThreadExample t1 = new MultiThreadExample();
        MultiThreadExample t2 = new MultiThreadExample();

        t1.start(); // starts a new thread
        t2.start(); // starts another thread
    }
}

**Output order is unpredictable** because both threads run independently.


## **4. Comparison Table**

| Feature        | Single-Threaded            | Multi-Threaded                      |
| -------------- | -------------------------- | ----------------------------------- |
| **Threads**    | 1                          | 2 or more                           |
| **Execution**  | Sequential                 | Parallel/Interleaved                |
| **Speed**      | Slower for multiple tasks  | Faster for independent tasks        |
| **Complexity** | Simple to implement        | More complex (need synchronization) |
| **Best for**   | Small, sequential programs | Large tasks, concurrent processes   |




Since you were asking about **StringBuffer vs StringBuilder**,

* **StringBuffer** is **multi-thread safe** → safe for multiple threads editing it at once.
* **StringBuilder** is **single-threaded** → faster but not safe if multiple threads use it at the same time.

---

If you want, I can draw you a **Java thread execution diagram** showing how single-threaded vs multi-threaded programs execute side-by-side in memory. That will make it visual and easier to remember.



 */
