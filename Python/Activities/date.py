from datetime import datetime

x = datetime.now()
print(x) 

# Output: 2020-05-01 12:11:17.902820
	
print(x.year) # Output: 2020
	
print(x.strftime("%A")) # Output: Friday