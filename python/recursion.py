def factorial(n):
    if n == 0: # Base case
        return 1
    else:
        return n * factorial(n - 1) # recursive call

n = int(input("Enter a number: "))
print(factorial(n))  # Output: 120