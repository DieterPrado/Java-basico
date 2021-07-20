# Java Basic
### Table of contents
- General info
- Technologies
- Setup
- Things learned
>- Types of data and their weight.
>- Variable declaration.
>- Access modifiers.
>- Creation of classes and objects.
>- Main method.
>- Control sentences: If/Else, switch statement, while loop, for loop.
>- Arrays.
>- Scope of elements.
>- Documentation.


------------

### General info
This repository contains files and information created and obtained from the Java Basic course. The java basic course was a great introduction to the basics of the java language. It taught about variables, the naming conventions, loops, encapsulation, if statements, arrays and the importance of documentate the code. 

------------

### Technologies
- OpenJDK8 (requieres installation)
- OpenJDK11 (requires installation)
- IntelliJ IDEA (requieres installation)

------------

### Setup
The vast majority of the files are made in Java 8, so it only requieresat at least java 8 to work with the files.

------------
### Things learned
- Types of data and their wieght. **boolean**, default value= false and it's weight is 1 bit. **char** stores a single character, it's weight is 2 bytes. **short** stores numeric values, 2 times smaller than an int, it'w wight is 2 bytes. **int** stores numeric values, 4 bytes. **long** stores numeric values, 8 bytes. **float** stores numeric values with decimals, 4 bytes. **long** stores numeric values with decimals, 8 bytes.

- Naming conventions: UpperCamelCase for class names and lowerCamelCase for non class names. Constants are declared all on mayus e.g. (CONSTANT).

- How to declare variables by firstly specifyng the variable type e.g. (String name = "hola";)

- Access modifiers. Restrict access to data depending the modifier. private: data only accesible from the class itself. public: data accesible from all the project. protected: Visible to the package and all subclasses.

- Creation of classes and objects: An example of object creation is Class objectName = new Class(); An example of class delcaration is public class ClassName{}

- Main method. It's the entry point of any java program and where execution starts. **public void main(String[] args){}**

- Creation of functions: Using the next structure **public void nameMethod(){instructions}**

- Import classes. This allow us to use classes methods and variables in other classes.

- If and Else use: Evaluate if a conditiones is true and executes structions if so. If there are more than 1 conditions to be evaluated you can use **else if** to add more conditions. Example if(numExample < 10){return System.out.println("failed");}. The previous example evaluates if the variable is less than 10, if so, it prints "failed".

- Switch statement. The switch statement can have a number of possible execution paths.

- While loops (while and do while). Executes instructions while the conditions are still true. If we don't update the value that is evaluated we can create an infinite loop.

- For loops (Fori and Foreach): The for loop executes instructions a certain number of times. 

- Arrays it is an object which contains elements of a similar data type. You can declare an array using **String[] name = {"Object1"}** and even declare de size of an array using **String[] name = new String[4]**, being 4 the size of the array.

- Scope of elements. A variable can be directly accesible if is in the same pair {}. If that's  not the case we can access the variable in other ways, for example, through getters and setters.

- Documentatios with java docs: Helps the programmer and other programmers to know how the code works. 
