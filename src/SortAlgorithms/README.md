## Sort Algorithms
#### In-Place algorithm
_"Transforms input using no auxiliary data structure. It updates input sequence only through replacement or swapping"
. In-place means that the algorithm doesn't use extra space for manipulating the input but may requires a small though non-costant extra space for its operations._

### Bubble sort

- In-Place Algorithm
- O(n²) **Quadratic**
- 10 items will take 100 steps, **n** items will take **n²**
- Non constant extra space O(n) sometime O(logn)
- Stable Sort

### Unstable Sort vs Stable Sort (Theory)

Stable is when the algorithm  if it maintains the relative order but if the algorithm swap them then it becomes unstable. 
![vs](https://qph.fs.quoracdn.net/main-qimg-68f8693fb296255feb9d8c457ca73c9d "Comparison")

### Selection sort

- O(n²) **Quadratic**
- 10 items will take 100 steps, **n** items will take **n²**
- Unstable Sort

### Insertion Sort

- In-Place Algorithm
- O(n²) **Quadratic**
- Stable Sort (It uses shifting)

### Shell Sort

- Variation of insertion sort
- Less shifting
- [Knuth Sequence](https://en.wikipedia.org/wiki/Shellsort#Gap_sequences) 
- Big gap (K) to validate
- K = n/2 if K is equals to  1 will convert in Insertion Sort ( n length of array)
- In-Place Algorithm
- O(n²) **Quadratic**
- Unstable Sort

### Recursive
- A lower performance   
- Your call will be stack
- It's more formal than other ways of coding
- You'll need to use a breaking condition
![recursive](http://www.algolist.net/img/recursion.png)

### Merge Sort
- Recursive Algorithm
- Splitting and Merging
- Not In-Place Algorithm
- Stable Sort
- O(n log n)

### Quick Sort
- Recursive Algorithm
- Use Pivot
- In-Place Algorithm
- O(n log n) in the worst case, it makes O(n²)
- Unstable Algorithm
- Recursive Algorithm

![QuickSort](https://upload.wikimedia.org/wikipedia/commons/6/6a/Sorting_quicksort_anim.gif)


## More
### Pivot
Or pivot element is the element of a matrix, or an array, which is selected first by an algorithm, to do certain calculations.
### In-Place
an in-place algorithm is an algorithm which transforms input using no auxiliary data structure and algorithm which is not in-place is sometimes called **not-in-place** or **out-of-place**
### Recursion
Is a method of solving a problem where the solution depends on solutions to smaller instances of the same problem.
### Unstable Algorithm
TODO

[Back Home](../../README.md)

