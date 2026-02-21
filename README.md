# A2 Linked Lists

## Basic Information

Your name: Abigail Lei

Other students you worked with, including TAs: Esther

If anyone was particularly helpful, please give them a shout-out here: 


## References

Any references or resources used besides JavaDoc and course materials:
https://www.youtube.com/watch?v=936wHLIR4UY - how to set up JUnit because it wasn't working at first.

If you used generative AI, how did you use it? What role did it play in your learning?


## Questions to Answer

What did you observe when comparing the benchmark results for index-based operations vs. node-based operations? Why do those results make sense for a linked list?

When comparing benchmark results, the node-based operations are considerably faster for addAfter and removeAfter. The node-based operations take around 300 nanoseconds for all and the time does not increase for more operations. The index-based operations take from more than 10,000 to more than 100,000 nanoseconds, or a magnitude of 100x to 1000x slower. This makes sense because addAfter and removeAfter take in a specific node, not an index which is better for linked lists. It additionally doesn't need to push down each element in the list like index-based operations while a node-based operation can just add in a node.


## Reflection 

Please provide a brief reflection about your experience with this assignment. What was easiest? What was hardest? How did your understanding of linked lists evolve?

It was hard to start because it was hard to visualize in my mind how the linked list should work and how each method should interact with the Node class methods. However, after writing the helper method of getNode, it got a lot faster and easier to write. My understanding of linked lists improved, and I didn't expect the node-based methods to be so much faster than the index-based methods.
