from ast import For
from pickletools import int4


print("hello world")
age = 36
	
txt = "My name is John, and I am {}"
	
print(txt.format(age))

quantity = 3
	
itemno = 567
	
price = 49.95
	
myorder = "I want {2} pieces of item {0} for {2} dollars."
	
print(myorder.format(quantity, itemno, price))
name = input( "What is your name: " )
age = int( input( "How old are you: " ) )
year = str( ( 2022 - age ) + 100 )
print( name + " will be 100 years old in the year " + year )
	
example_list = ["apple", "banana", "cherry"]
	
example_list.append("orange")
example_list.add("or")
	
print(example_list)