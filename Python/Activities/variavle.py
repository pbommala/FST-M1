myVariable = 5
print(myVariable)
myVariable = "Bob"
print(myVariable)
x = 1    # int
y = 2.8  # float
z = 1j   # complex

print(type(x)) # Output: <class 'int'>
print(type(y)) # Output: <class 'float'>
print(type(z)) # Output: <class 'complex'>

a = "Hello, World!"
	
print(a[7]) #W
print(a[2:5]) #llo
print(a[1:4])	# ell
print(len(a)) # Output: 13
	
print(a.lower()) # Output: "hello, world!"
print(a.upper()) # Output: "HELLO, WORLD!"
print(a.replace("H", "J")) # Output: "Jello, World!"
print(a.split(",")) # returns ['Hello', ' World!']

txt = "The rain in Spain stays mainly in the plain"
x = "ain" in txt
y = "ain" not in txt
print(x) # True
print(y) # False
	
a = "Hello"
b = " World"
c = a + b
print(c) # "Hello World"

	
age = 36
txt = "My name is John, and I am {}"
print(txt.format(age))

quantity = 3
itemno = 567
price = 49.95
myorder = "I want {} pieces of item {} for {} dollars."
print(myorder.format(quantity, itemno, price))
# Output: I want 3 pieces of item 567 for 49.95 dollars.

myorder = "I want to pay {2} dollars for {0} pieces of item {1}."
print(myorder.format(quantity, itemno, price))
# Output: I want to pay 49.95 dollars for 3 pieces of item 567.