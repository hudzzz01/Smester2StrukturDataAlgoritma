'''

Creator : M.Hudzaifah Assyahid
date : Saturday 25 April 2020 Im waiting doraemon in this year
note : gym the assignment exam (UTS) Data sructure
contac : hdzzzzzz01@gmail.com



!!!! USE PYTHON 3 !!!!! 
!!!! USE PYTHON 3 !!!!!
!!!! USE PYTHON 3 !!!!!
!!!! USE PYTHON 3 !!!!! 
!!!! USE PYTHON 3 !!!!!
!!!! USE PYTHON 3 !!!!!
!!!! USE PYTHON 3 !!!!!

'''

#First question

'''
Scenario

Using one of the comparison operators in Python, write a simple two-line program that takes the parameter n as input, which is an integer, and prints False if n is less than 100, and True if n is greater than or equal to 100.

Don't create any if blocks (we're going to talk about them very soon). Test your code using the data we've provided for you.
Test Data

Answer :
'''

x = int(input("1. Masukan nilai x jika x kurang dari sama degan 100 maka salah :" ))
print(x>=100)



#second question

'''
Scenario

Your task is to complete the code in order to evaluate the results of four basic arithmetic operations.

The results have to be printed to the console.

You may not be able to protect the code from a user who wants to divide by zero. That's okay, don't worry about it for now.

Test your code - does it produce the results you expect?

We won't show you any test data - that would be too simple.

Console:
# input a float value for variable a here
# input a float value for variable b here

# output the result of addition here
# output the result of subtraction here
# output the result of multiplication here
# output the result of division here

'''

a = float(input("2 \ninput a float value for variable a here : "))
b = float(input("input b float value for variable b here : "))

print("output the result of addition here : ", a+b)
print("output the result of subtraction here : ", a-b)
print("output the result of multiplication here : ", a*b)
print("output the result of division here : ", a/b)



#third question

'''

Scenario

Spathiphyllum, more commonly known as a peace lily or white sail plant, is one of the most popular indoor houseplants that filters out harmful toxins from the air. Some of the toxins that it neutralizes include benzene, formaldehyde, and ammonia.

Imagine that your computer program loves these plants. Whenever it receives an input in the form of the word Spathiphyllum, it involuntarily shouts to the console the following string: "Spathiphyllum is the best plant ever!"

Write a program that utilizes the concept of conditional execution, takes a string as input, and:

    prints the sentence "Yes - Spathiphyllum is the best plant ever!" to the screen if the inputted string is "Spathiphyllum" (upper-case)
    prints "No, I want a big Spathiphyllum!" if the inputted string is "spathiphyllum" (lower-case)
    prints "Spathiphyllum! Not [input]!" otherwise. Note: [input] is the string taken as input.


Test your code using the data we've provided for you. And get yourself a Spathiphyllum, too!

'''

plant = input("input plant here : ")
if plant == "Spathiphyllum":
	print("Yes - Spathiphyllum is the best plant ever!")
	
elif plant == "spathiphyllum":
	print("No, I want a big Spathiphyllum!")

else :
	print("Spathiphyllum! Not ", plant)


#Fourth Question

'''
Scenario

In 1937, a German mathematician named Lothar Collatz formulated an intriguing hypothesis (it still remains unproven) which can be described in the following way:

    take any non-negative and non-zero integer number and name it c0;
    if it's even, evaluate a new c0 as c0 ˜ 2;
    otherwise, if it's odd, evaluate a new c0 as 3 ◊ c0 + 1;
    if c0 ? 1, skip to point 2.

The hypothesis says that regardless of the initial value of c0, it will always go to 1.

Of course, it's an extremely complex task to use a computer in order to prove the hypothesis for any natural number (it may even require artificial intelligence), but you can use Python to check some individual numbers. Maybe you'll even find the one which would disprove the hypothesis.

Write a program which reads one natural number and executes the above steps as long as c0 remains different from 1. We also want you to count the steps needed to achieve the goal. Your code should output all the intermediate values of c0, too.

Hint: the most important part of the problem is how to transform Collatz's idea into a while loop - this is the key to success.

Test your code using the data we've provided.
Test Data


steps = 62

'''

hudz = int(input("Input number : "))
s = int(0)

while hudz > 1:

	if hudz%2 == 0 and hudz != 1:

		hudz /=2
		
	elif hudz%2 !=0 and hudz != 1:

		hudz = (hudz * 3) + 1

	s +=1
	print(hudz)


print("steps = ", s)
	
