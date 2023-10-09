# Project Title: E-Commerce

A program that allows the user to add products into shopping cart virtually, simulating an in-person shopping experience. 

## Description

The program allows users to create product objects and to add it dynamically into an ArrayList of product objects named cart. The users can find how many items are in the cart, names of each item, whether or not they have a certain product in the cart, price of all items in the cart, and to checkout/empty all items in the cart. 

## Getting Started

### Dependencies
Install a compiler and assembler to interpret the high-level java code



### Executing program
- Make sure your present working directory is at TaskTwo
- Use command "gradle build"
- Use command "gradle echo" and choose one of two methods to execute the program
- Type one of two methods into the terminal and execute the program
```
gradle build
```
```
gradle echo
```
```
java -cp build/classes/java/main ecommerce.Runner
```
```
java -jar build/libs/Shopping.jar
```

Expected outputs are listed as comments in Runner.java

## Limitations

What isn't done? What things cause errors?  
Using extreme/unrealistic cases such as negative numbers as prices or forgeting to assign a name to the product object would cause awkward confusion amongst the user when reading the terminal outputs since products always have a price above $0 an a name assigned to said product. In summary, there are no checks for human errors.

## Author Information

Richard Cui - cuir@uoguelph.ca

## Development History

- Sep 30, 2023
    "Finalized"
    "Finished TaskTwo"
- Sep 29, 2023
    "updating rough TaskOne & TaskTwo"
- Sep 27, 2023
    "Hi I'm going to start my project now"

## Acknowledgments

Shoutout to the SCIOER textbook for helping me out


