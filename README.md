# Postfix evaluations

**Author:** Manuel Espinoza

**Date:** October 21st, 2022

---

## Summary

This program uses a `Stack ADT` to process a
`String` as a postfix mathematical expression
with single digit operations. It takes input through `STDIN` and outputs it to `STDOUT`.

It evaluates the expression by pushing digits
to the stack. When it finds a valid operator
`(+, -, * or /)`, it pops the last 2 digits entered and performs the given operation.
