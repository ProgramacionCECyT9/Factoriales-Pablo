factorial_of = raw_input("Hey man! Give me a number and I'll return you the factorial.\n")
try:
    factorial_of = int(factorial_of)
    result = 1
    for i in range(1, factorial_of + 1):
        result *= i
    print "The factorial of", factorial_of, "is =", result
except:
    print "I asked you for a number..."
