### 1. **Factorial of a Number**

```java
public class Factorial {
    static int factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println("Factorial of 5 = " + factorial(5));
    }
}
```

**Output:**

```
Factorial of 5 = 120
```