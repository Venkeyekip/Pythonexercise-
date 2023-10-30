'''def func(a,b,c):
print("this is function",a,b,c)
func(1,3,5)'''
def outer():
    print("outer function")
    def inner():
        print("inner function")
    inner()
outer()    