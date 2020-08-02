#Arrays

Creating array implies that you must specify the length (arrays have  static length) because JVM will create a contiguous space in memory and for that reason, the arrays cannot be resized because there'd be no guarantee after that

###Get memory address

```textmate
 X + i * Y
```
| X | Y | i |
|---|---|---| 
| address memory start  | element size  | index element|
``` java
 int[] intArray = new int[3];
 intArray[0] = 1;
 intArray[1] = 2;
 intArray[2] = 3;
```
If the array starts in 8 address memory and element size is 4 bytes
```
Address memory of  intArray[0] =  8
Address memory of  intArray[1] =  8 + (1*4) = 12
Address memory of  intArray[2] =  8 + (2*4) = 16
```
####keep in mind
* Arrays is a static data structure
* If you'll use data in array you should know the index of the data to avoid a searching algorithm
 