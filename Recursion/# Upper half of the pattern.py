import math
import random
def swapNumbers(a,b):
    print(f"Before Swapping {a,b}")
    temp=a
    a=b
    b=temp
    print(f"after Swapping {a,b}")
    
def arithmetic_function(a,b):
    operator=['+','-','*','/']
    print("Enter the postion of operation you want to perform")
    posi=int(input())
    if(posi==0):
        print(a+b)
    elif(posi==1):
        print(a-b)
    elif(posi==2):
        print(a*b)
    elif(posi==3):
        print(a/b)
    else:
        print("Invalid Position,try again, first position is 0")

def calculateArea(r):
    diameter=2*r
    area=(math.pi)*(r**2)
    print(f"Diameter of circle with radius {r} is {diameter}")
    print(f"Area of circle with radius {r} is {area}")


def printMedian(a,b,c):
    num=[a,b,c]
    sorted_num=sorted(num)
    return sorted_num[1]
if'__name__'=="__main__":
    a=int(input("Enter first number"))
    b=int(input("Enter second number"))
    c=int(input("Enter third number"))
    print(printMedian(a,b,c))
