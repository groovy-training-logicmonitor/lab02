/**
 * Created by allan on 5/30/17.
 */

values = [0L: 0L, 1L: 1L]

def fibRecursive(long x) {
    if(x == 1 || x == 0) return x

    return fibRecursive(x - 1) + fibRecursive(x - 2)
}
def fibDyn(long x) {
    if (values.containsKey(x)) return values[x]

    values[x - 1] = fibDyn(x - 1)
    values[x - 2] = fibDyn(x - 2)

    return values[x - 1] + values[x-2]
}

def fibClosed(long x) {
    return (BigInteger)((((1 + Math.sqrt(5)) ** x) - ((1 - Math.sqrt(5)) ** x)) / (2 ** x * Math.sqrt(5)))
}

def n = 40

println(fibRecursive(n))
println(fibDyn(n))
println(fibClosed(n))
println(values)