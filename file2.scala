/* Recursion*/

def fac (n:Int):Int =
  if n == 0 then 1 else n*fac(n-1)

def gcd(a:Int, b:Int):Int =
    if b == 0 then a else gcd(b, a%b)


/*Tail Recursion*/
@tailrec // vermeiden for stackoverflow
def tail_fac(n:Int, acc:Int):Int =
  if (n <=1) acc
  else fac(n-1, n*acc)

def sum (f:Int =>Int, a:Int, b:Int):Int = {
  def loop(a:Int, acc:Int):Int =
    if a > b then acc
    else loop(a+1, acc+f(a))
  loop(a,0)
}

// f:Int => Int wenn Funktion aufrutf, dann expression

