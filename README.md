# Place Holder

## Boy-Scout Rule
### Description
The boy-scout rule state that we should always leave the code cleaner than we found it.  

Always check a module is cleaner than when you checked it out as it'll make your systems better and better.  

If we all followed that simple rule, we'd see the end of the relentless deterioration of our software systems. Instead, our systems would gradually get better and better as they evolved. We'd also see teams caring for the system as a whole, rather than just individuals caring for their own small little part.
> Frankly, this just sounds like common decency to me — like washing your hands after you use the restroom, or putting your trash in the bin instead of dropping it on the floor. Indeed the act of leaving a mess in the code should be as socially unacceptable as littering. It should be something that just isn't done.

### Example
```
public boolean isReal(int value) {
  if (value == 1 || value == 2 || value == 5 || value == 10) {
      return true;
  }
  return false;
}
```
can be change into
```
public boolean isReal(int value) {
  int[] checkValue = {1, 2, 5, 10};
  for (int check : checkValue) return true;
  return false;
}
```
as you can see, both method has the same logic but the letter method look better and cleaner and while it doesn't change a program logic, it'll be easier to modify code later should you actually need to change its logic.

### Exercise
[BoyScoutRule Exercise](https://github.com/napnie/codeguide/blob/master/src/codeguide/BoyScoutRule_exercise.java)

### Reference
[The Boy Scout Rule - Programer 97-things](http://programmer.97things.oreilly.com/wiki/index.php/The_Boy_Scout_Rule)

---
## Do The Simplest Thing That Could Possibly Work or DTSTTCPW
### Description
Can also be called Make The Simplest Thing That Could Possibly Work, which is pretty self-explanation.
> Ask yourself: “What is the simplest thing that could possibly work?”

To do this, you have to know at least two ways to do the thing. That way, you can at least pick the simpler, if not the simplest.  

Simplest does, however, mean a minimal solution. Don't build a giant super-efficient object, sorted and hashed and linked together, if an Array will do the job.

Simplest might mean "just use a Dictionary". It might mean "create a little object". It might mean "refactor the part hierarchy so that entitlements and deductions both have positive balance when they are normal".

What it does mean, however, is to pick something you can do and do quickly, so that you can get on with the other things you really need to do. Then do that thing professionally and well, complete with all appropriate refactoring.
### Example
Say, for example, that you have Integer variable `a` and `b` and you want to know which one is the greatest value then you may do **this**:
```
int max;
if ( a >= b ) max = a;
else max = b;
```
It is a first thing that come to mind and it work!  
however, java already had a method that solve this problem.
```
max = Math.max(a, b);
```
This way you won't have to solve the problem which already solved!  
This example may look like it make no difference whatsoever but in the larger and more complicated program, this principle could save you from meaninglessly tried to fix a issue which, uh, already fixed.

### Exercise
[DTSTTCPW Exercise](https://github.com/napnie/codeguide/blob/master/src/codeguide/DoTheSimplestThingThatCouldPossiblyWork_exercise.java)

### Referance
[Do The Simplest Thing That Could Possibly Work](http://c2.com/xp/DoTheSimplestThingThatCouldPossiblyWork.html)

[principle Reference]: https://webpro.github.io/programming-principles/
