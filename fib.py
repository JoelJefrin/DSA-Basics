def fib(n):
    if n <=1: # Base case
        return n
    else:
        return fib(n-1)+fib(n-2)
    
t = int(input("Enter the number of terms: "))
    
for n in range(t):
    print(fib(n))  