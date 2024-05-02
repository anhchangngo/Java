The product of the two int values is computed as an int, and then automatically converted to a long. But 65536 * 65536 = 2^32 overflows a 32 bit int before it gets converted.
