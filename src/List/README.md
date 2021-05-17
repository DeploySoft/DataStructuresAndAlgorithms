# List
It's an [abstract data types](https://en.wikipedia.org/wiki/Abstract_data_type) <br>
List or Sequence represents a countable number of ordered values

## Array list

Resizable array implementation of the List interface.
 * O(1) because you know there exists an index.
 * O(n) when you want to get all the elements.
 * O(n) when you want to remove an element because the list have to  reorder the elements

Arrays list you have to define its capacity <br>
*Capacity*  = Maximun number of items that the list can hold <br>
*Size* = Number of items currently into the list.


## Vectors
TODO

## Singly Linked Lists

Similar to Arrays list just that here doesn't exist the index so manipulate of data have to do through  points
This points are related with the next element in the list E.g:
![LinkedList](https://upload.wikimedia.org/wikipedia/commons/thumb/6/6d/Singly-linked-list.svg/408px-Singly-linked-list.svg.png "SinglyLinkedList")
* O(n) to add or remove and element in a specific point since we have to traverse the list

