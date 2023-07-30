# LinkedList Project

This repository contains the source code of my custom implementation of the Linked List data structure, written in Java. The project was developed as part of ITIS 1213 Intro to Computer Science II class.

## Features

- **peek()**: Retrieves the first element of the list without removing it.
- **push(E n)**: Adds an element to the end of the list.
- **pop()**: Removes the first element of the list and returns it.
- **insert(int index, E n)**: Inserts an element at a specified index.
- **contains(E n)**: Checks if an element is in the list.
- **remove(int index)**: Removes the element at the specified index from the list and returns the value.
- **get(int index)**: Returns the element at the specified index from the list.
- **toString()**: Returns a String that displays the list in a readable format.
- **toArray()**: Returns an array containing the values of the elements.

## Usage

Simply instantiate a new object and use its methods as per requirement. 

HunterLinkedList<Integer> list = new HunterLinkedList<>();
list.push(1);
list.push(2);
list.push(3);
System.out.println(list.peek());

This will output `1`, which is the first element of the list. Other methods can be used in a similar fashion.

## Contribution

This is an academic project and contributions are not open. 

## License

This project is licensed under the MIT License. See the `LICENSE` file for more details.
