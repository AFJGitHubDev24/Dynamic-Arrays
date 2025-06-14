# DYNAMIC ARRAYS
A dynamic array, also known as a resizable array or growable array, is a data structure that allows you to add or remove elements at runtime, unlike static arrays that have a fixed size determined at declaration. They overcome the limitations of static arrays by providing the ability to dynamically resize their capacity as needed during program execution.

# Featureas of Dynamic Arrays
1. Resizable: Dynamic arrays can automatically increase or decrease their size as elements are added or removed.
2. Variable Size: They do not have a fixed size like static arrays, allowing for flexibility in handling data of unknown or changing sizes.
3. Random Access: Elements can be accessed directly using their index, similar to static arrays.
4. Common in Programming Languages: Many programming languages provide built-in implementations of dynamic arrays, such as ArrayList in Java, vector in C++ or list in C#.

# How Dynamic Arrays Work?
1. Initial Allocation: A dynamic array is typically initialized with an initial capacity, which determines the size of the underlying array.
2. Adding Elements: When adding new elements, the array first tries to utilize the existing space. If the capacity is full, the array is resized (usually by doubling the capacity) to accommodate new elements.
3. Resizing: Resizing involves creating a new, larger array, copying the existing elements into the new array, and then updating the array's capacity and size.
4. Removing Elements: Removing elements can also trigger resizing if the size of the array significantly decreases, potentially freeing up memory.

# Advantages
1. Flexibility: They handle data of unknown or changing sizes without the need to pre-specify the array's size.
2. Efficiency: Adding or removing elements can be done efficiently, especially at the end of the array.
3. Easy Management: Dynamic arrays are generally easier to manage than linked lists or hash tables.

# Common Use Cases
1. Storing data of unknown size: For example, keeping track of items added to a shopping cart.
2. Implementing other data structures: Dynamic arrays can be used as the underlying structure for other data structures like stacks, queues, or hash tables.
3. General-purpose data storage: They are widely used for storing collections of data in various applications. 
