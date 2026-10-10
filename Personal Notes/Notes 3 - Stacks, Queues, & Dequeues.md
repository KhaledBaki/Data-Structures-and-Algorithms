# Notes 3 - Stacks, Queues, & Deques.md
## Stacks
- Stacks follow a last-in first-out procedure also known as LIFO.
- They can be implemented using a singly-linked list or with an array-based implementation.
  - Stack.push(): newNode.next = head; head = newNode;
  - Stack.pop(): head = head.next;
- As you can see above, it is very fast and easy to implement a stack with a linked structure.

## Queues
- Queues follow a first-in first-out procedure also known as FIFO.
- They can be implemented using a singly linked list or with an array-based implementation.
  - Queue.enqueue(): tail.next = newNode; tail = newNode;
  - Queue.dequeue(): head = head.next;
- As you can see above, it is very fast and easy to implement a queue with a linked structure.  

## Deques
- Deques have both the properties of a Stack, and a Queue.
- They can be implemented using a doubly-linked list structure or an array-based approach.
