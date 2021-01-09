# AP Computer Science Final Project
Java final project for AP Computer Science Spring 2019. Completed programming assignments from Princeton's Introduction to Computer Science and Data Structures &amp; Algorithms classes (https://introcs.cs.princeton.edu/java/assignments/). 

## Stock Market: StockMarket.java (Difficulty: 2)
To run the program, simply enter "i" or "m" when prompted in order to either
submit an input of floats through a file or manual entry respectively. Then,
the program will print out the data, a plot of all the values with one star
representing 1, an analysis of the pattern in the data using Dilbert's rule,
and a table representing the price, cash, shares, and value after each time
period while investing with Dilbert's rule beginning with $10,000.



## Linear Congruential Random Number Generator: Trace.java and Cycle.java (Difficulty: 2)
To run Trace.java run Trace with four integer argument e.g. java Trace 11 37
1 100. The program prints a formatted table with m values produced by a linear
congruential random number generator with 16 entries in each row. To run
Cycle.java, run Cycle with four integer arguments as well e.g. java Cycle 22 1
0 72. The program will then print out the cycle length of the linear
congruential random number generator produced by those numbers since it produces
a sequence of values that eventually repeats itself.



## Natural Language Modeling (First one on the website): Markov.java,
FrequencyCounter.java, LanguageModeler.java, and TextGenerator.java (Difficulty: 6)
Markov.java creates a Markov object for a k-character substring with a variable
representing its frequency and a LinkedList representing its suffixes. To run
FrequencyCounter.java run it with an integer argument k. Like the other
two programs as well, it will then prompt the user to enter a piece of text
either by entering a file name or the text itself. It will then print out each
of the distinct k-character sequences within the inputted text along with their
frequency by creating a Markov object for each distinct sequence and updating
its frequency along the way in a TreeMap.

To run LanguageModeler.java run it with an integer argument k as well. It will
then print out a table with the frequency of each distinct k-character sequences
along with the frequency with each of its suffixes. Similarly to FrequencyCounter,
it uses a TreeMap to store the Markov objects created for each distinct sequence
and updates the frequency and suffixes along the way in a LinkedList. To run
TextGenerator.java run it with two integer arguments k and m. Note that in order
for this to work, m must be less than the total length of the inputted text.
Additionally, the greater k is, the longer the program will take to run. The
program then outputs pseudo-random text with m characters using the Markov
model in which the next character is determined by the frequencies of the last
k-character sequence before it.



## Mozart Waltz Generator: Mozart.java (Difficulty: 3)
To run Mozart.java, simply run: java Mozart. Make sure that StdAudio.java and
all the minuet and trio wav files are downloaded. The program will then play 16
measures of minuet followed by 16 measures of trio. A file is chosen at random
from the minuet and trio matrix by rolling two dices and a rice respectively for
each measure. Each wav file's amplitudes are then extracted and played.



## Root Finding: Bisect.java, Bisect2.java, Newton2.java (Difficulty: 2)
For each of these files, simply run the program e.g. java Bisect or java Bisect2
or java Newton2. Bisect uses the bisect method to find the root of f(x) = 6 - x - x^3
in the interval [1.0, 2.0] with an epsilon of 0.000001: 1.634366, while printing
out the interval after each bisect operation. Bisect2 and Newton2 print out
a table of the integers between 2 and 20 with their square roots with an epsilon
of 0.000001 as well using the bisect and Newton method respectively, while also
printing out the total number of function calls used.



## Loops and Conditionals: Ordered.java, RGBtoCMYK.java, Checkerboard.java, RandomWalker.java and RandomWalkers.java (Difficulty: 1)
Run Ordered.java with three integer arguments to check if they are ordered.
Run RGBtoCMYK.java with three integer arguments between 0 and 255 representing
the values of red, green, and blue respectively to obtain the values of the other
colors (cyan, magenta, yellow, and black). Run Checkerboard.java with an integer
argument n to print a "n x n" checkerboard. Run RandomWalker with an integer n
to print out the coordinates of a random walker beginning at the origin after
each step and then the squared distance by the end. RandomWalkers takes two
integer arguments, n and t to run t trials of random walkers walking n steps.
It then calculates the average mean squared distance.



## Redundancy Detector: RedundancyDetector.java (Difficulty: 4)
To run RedundancyDetector.java, run the file and then input either the name of a
text file or manually input the text. The program will then find the largest
sequence of characters that is repeated. It does so by iterating through the
first half of the text looking for a j-length sequence that is also contained
to the right with a j value beginning at the highest possible value, half the
size of the string. If such a value is found, it is returned but if not, j is
decremented and the process repeats. Analysis of the runtime is included at the
bottom of the file.
