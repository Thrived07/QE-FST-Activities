
def fib(n):
    if n<=1:
        return n
    else:
        return (fib(n-1)+fib(n-2))
u=int(input("Enter How many values:"))
for i in range(u):
    print(fib(i), end=" ")