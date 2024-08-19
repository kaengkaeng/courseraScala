/* Recursion*/

def fac (n:Int):Int =
  if n == 0 then 1 else n*fac(n-1)
def gcd(a:Int, b:Int):Int =
    if b == 0 then a else gcd(b, a%b)

