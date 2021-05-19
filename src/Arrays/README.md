# Arrays

Creating array implies that you must specify the length (arrays have  static length) because JVM will create a contiguous space in memory and for that reason, the arrays cannot be resized because there'd be no guarantee after that

## Get memory address

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


## Actions in Arrays

| Operation | Complexity |
| ------ | ------ |
| Retrieve with index| O(1) |
| Retrieve without index | O(n) |
| Add an element to a full index array | O(n) |
| Add an element to the end of an array | O(1) |
| Insert or update an element at a specific index | O(1)
| Delete an element by setting it to null | O(1) |
| Delete an element by shifting elements | O(n) |

![image](https://user-images.githubusercontent.com/31944043/118740753-3dc25480-b812-11eb-8b67-52d5418836b7.png)
Source: [http://bigocheatsheet.com/]()


![Notation](https://upload.wikimedia.org/wikipedia/commons/thumb/7/7e/Comparison_computational_complexity.svg/250px-Comparison_computational_complexity.svg.png "Graphic")

#### Keep in mind

* Arrays is a static data structure
* If you'll use data in array you should know the index of the data to avoid a searching algorithm

[Back Home](../../README.md)
 