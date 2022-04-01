Programiz
PRO
Tutorials
Examples

Search tutorials and examples

Kotlin Introduction
Kotlin Flow Control
Kotlin if expression
Kotlin when Expression
Kotlin while Loop
Kotlin for Loop
Kotlin break
Kotlin continue
Kotlin Functions
Kotlin OOP


Related Topics
Print an Array
Kotlin String and String Templates
Kotlin while and do...while Loop
Sort Elements in Lexicographical Order (Dictionary Order)
Kotlin Expression, Statements and Blocks
Kotlin if Expression



Kotlin for Loop
The for loop in Kotlin iterates through anything that provides an iterator. In this article, you learn to create for loop (with the help of examples).

There is no traditional for loop in Kotlin unlike Java and other languages.

In Kotlin, for loop is used to iterate through ranges, arrays, maps and so on (anything that provides an iterator).

The syntax of for loop in Kotlin is:

for (item in collection) {
    // body of loop
}
Example: Iterate Through a Range
fun main(args: Array<String>) {

    for (i in 1..5) {
        println(i)
    }
}
Here, the loop iterates through the range and prints individual item.

Output

1
2
3
4
5
If the body of the loop contains only one statement (like above example), it's not necessary to use curly braces { }.

fun main(args: Array<String>) {
    for (i in 1..5) println(i)
}
It's possible to iterate through a range using for loop because ranges provides an iterator. To learn more, visit Kotlin iterators.

Example: Different Ways to Iterate Through a Range
fun main(args: Array<String>) {

    print("for (i in 1..5) print(i) = ")
    for (i in 1..5) print(i)

    println()

    print("for (i in 5..1) print(i) = ")
    for (i in 5..1) print(i)             // prints nothing

    println()

    print("for (i in 5 downTo 1) print(i) = ")
    for (i in 5 downTo 1) print(i)

    println()

    print("for (i in 1..5 step 2) print(i) = ")
    for (i in 1..5 step 2) print(i)

    println()

    print("for (i in 5 downTo 1 step 2) print(i) = ")
    for (i in 5 downTo 1 step 2) print(i)
}
Output

for (i in 1..5) print(i) = 12345
for (i in 5..1) print(i) = 
for (i in 5 downTo 1) print(i) = 54321
for (i in 1..5 step 2) print(i) = 135
for (i in 5 downTo 1 step 2) print(i) = 531
Iterating Through an Array
Here's an example to iterate through a String array.

fun main(args: Array<String>) {

    var language = arrayOf("Ruby", "Kotlin", "Python" "Java")

    for (item in language)
        println(item)
}
Output

Ruby
Kotlin
Python
Java
It's possible to iterate through an array with an index. For example,

fun main(args: Array<String>) {

    var language = arrayOf("Ruby", "Kotlin", "Python", "Java")

    for (item in language.indices) {

        // printing array elements having even index only
        if (item%2 == 0)
            println(language[item])
    }
}
Output

Ruby
Python
Note: Here, language.indices returns all all indices of each array elements.

If you want to learn more about arrays, visit Kotlin arrays.

Iterating Through a String
fun main(args: Array<String>) {

    var text= "Kotlin"

    for (letter in text) {
        println(letter)
    }
}
Output

K
o
t
l
i
n
Similar like arrays, you can iterate through a String with an index. For example,

fun main(args: Array<String>) {

    var text= "Kotlin"

    for (item in text.indices) {
        println(text[item])
    }
}
Output

K
o
t
l
i
n
You will learn to iterate over a map using for loop in Kotin map article.

Previous Tutorial:
Kotlin while Loop
Next Tutorial:
Kotlin break
Share on:
Did you find this article helpful?
Related Tutorials
Kotlin Tutorial

Kotlin String and String Templates

Kotlin Tutorial

Kotlin while and do...while Loop

Kotlin Tutorial

Kotlin Expression, Statements and Blocks

Kotlin Tutorial

Kotlin if Expression


Join our newsletter for the latest updates.
Enter Email Address*
Join


Tutorials
Python 3 Tutorial
JavaScript Tutorial
C Tutorial
Java Tutorial
Kotlin Tutorial
C++ Tutorial
Swift Tutorial
C# Tutorial
DSA Tutorial
Examples
Python Examples
JavaScript Examples
C Examples
Java Examples
Kotlin Examples
C++ Examples
Company
About
Advertising
Privacy Policy
Terms & Conditions
Contact
Blog
Youtube
Apps
Learn Python
Learn C Programming
Learn Java
© Parewa Labs Pvt. Ltd. All rights reserved.

   