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

[Back Home](../../README.md)

