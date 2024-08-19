/* Recursion*/

def fac (n:Int):Int =
  if n == 0 then 1 else n*fac(n-1)

def gcd(a:Int, b:Int):Int =
    if b == 0 then a else gcd(b, a%b)


/*Tail Recursion*/
@tailrec
def tail_fac(n:Int, acc:Int):Int =
  if (n <=1) acc
  else fac(n-1, n*acc)

