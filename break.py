my_list = [1, 2, 3, 4]  
count = 0 
for item in my_list:  
    if item == 4:  
        print("Item matched")  
        count += 1  
        break  
print("Found at location", count)  