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

/*Higher Order Functions*/

def sum(f:Int => Int, a:Int, b:Int): Int =
  if a > b then 0
  else f(a) + sum (f, a+1, b)

//we can then write
def sumInt(a:Int, b:Int) = sum(id, a, b) // =sum(x=> x, a,b)
def sumCubes(a:Int, b:Int) = sum(cube,a,b)
def factorials(a:Int, b:Int) =sum(fac, a,b)

//where
def id(x:Int):Int = x
def cube(x:Int):Int = x*x*x
def fac(x:Int):Int = if x==0 then 1 else x*fact(x-1)

