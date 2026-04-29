def factorial(n):
    if n == 0: # Base case
        return 1
    else:
         n * factorial(n - 1) #recurive call

n = int(input("Enter a number: "))
print(factorial(n))  # Output: 120