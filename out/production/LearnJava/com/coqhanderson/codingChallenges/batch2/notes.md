### String
    - If we create a string with the same value, the same reference will be stored to the variable instead of creating new memory.
    - If we change any the value of the string, the entire string is rewritten and new reference is created.

### StringBuffer
    - mutable strings that are stored in heap memory
    - methods are thread-safe and synchronized
### StringBuilder
    - also mutable
    - methods are non-synchronized
    - performance is faster than StringBuffer

### .next() vs .nextLine()
    - next() will consider the spaces as separation between each inputs. 
    - nextLine() will consider the line itself as a input with spaces.

### .substring(startIndex, endIndex)
    - when using substring(startIndex, endIndex), 
    - make sure to add 1 to the endIndex since you need it to traverse your
    - end point in order for your it to be considered

### String.format()
    - String.format("%02d", int)
    - return 0 + the number
    - example: String.format("%02d", 7)
    - returns 07

### .subString(index)
    - return a substring from the string starting from the indicated index
    - example:
        - String s1 = "12:01:00AM";
        - s1.substring(8);
    - will return AM
    - USE substring(startIndex, endIndex) to extract starting letters