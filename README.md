# Kotlin Programming Assignments

## Assignment 1
- Use the `readline()` to read inputs from the user. User should input their name, if user enters empty string, store a default value. Use an if expression to define greeting message based on whether the user entered a name
- create an Array of integer. Use `java.util.Random` to fill the Array with 100 random number between 1 and 100. Go through collection and print values less than or equal to 10
- Calculator: ADD, SUB, MUL, DIV Labs
- Write a program to print the following patterns:
  ```
    *              *
    **            * *
    ***          * * *
    ****        * * * * 
    *****      * * * * * 
    ******    * * * * * * 
  ```
- Receive the first name and last name from user using `readLine()` then print the full name

## Assignment 2
- Create a program that has a Picture class that contains 3 Shapes in addition it contains a method sumAreas( ) that returns the summation of any 3 shapes areas
- ````
                      ┌─────────────────────────┐
                      │       Shape             │
                      ├─────────────────────────┤
                      │ dim                     │
                      │ Shape()                 │
                      │ setDim()                │
                      │ getDim()                │
                      │ abstract calcArea():    │
                      │          Double         │
                      └───────────┬─────────────┘
                                  │
                                  △
                                  │
              ┌───────────────────┼───────────────────┐
              │                   │                   │
  ┌───────────┴──────────┐ ┌──────┴─────────┐ ┌──────┴──────────┐
  │    Rectangle         │ │    Circle      │ │    Triangle     │
  ├──────────────────────┤ ├────────────────┤ ├─────────────────┤
  │ height               │ │                │ │ Height          │
  │ Rectangle(W, H)      │ │ Circle(R)      │ │ Triangle(B, H)  │
  │ Rectangle()          │ │ Circle()       │ │ Triangle()      │
  │ setHeight()          │ │ calcArea():    │ │ setHeight()     │
  │ getHeight()          │ │   Double       │ │ getHeight()     │
  │ calcArea():Double    │ │                │ │ calcArea():     │
  │                      │ │                │ │   Double        │
  └──────────────────────┘ └────────────────┘ └─────────────────┘


  ┌─────────────────────────────────────┐
  │           Picture                   │
  ├─────────────────────────────────────┤
  │ sumAreas(Shape, Shape, Shape):      │
  │          Double                     │
  └─────────────────────────────────────┘
