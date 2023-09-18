a=10
if not a:
    print("boolean value of a is true")
    if not(a%3 ==0 or a%5 ==0):
        print("10 is not divisible by either 3or5")
    else:
        print("10 is divisible by either 3or5")