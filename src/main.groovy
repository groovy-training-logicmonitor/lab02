/**
 * Created by allan on 5/30/17.
 */

// Below are three different versions of Fibonacci functions to compute a number in the sequence.
values = [0L: 0L, 1L: 1L]

// Recursively, computes a number in the sequence.
def fibRecursive(long x) {
    if(x == 1 || x == 0) return x

    return fibRecursive(x - 1) + fibRecursive(x - 2)
}

// This version computes a number in the sequence much faster than above using dynamic programming
def fibDyn(long x) {
    if (values.containsKey(x)) return values[x]

    values[x - 1] = fibDyn(x - 1)
    values[x - 2] = fibDyn(x - 2)

    return values[x - 1] + values[x-2]
}

// This version computes the number in the sequence using the closed form formula. It's the fastest
def fibClosed(long x) {
    return (BigInteger)((((1 + Math.sqrt(5)) ** x) - ((1 - Math.sqrt(5)) ** x)) / (2 ** x * Math.sqrt(5)))
}

def repeat(n, c) {
    c.multiply(n)
}
println repeat(4, 'c')
println fibRecursive(4)
println fibDyn(4)
println fibClosed(4)