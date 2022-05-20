
package fizzbuzz;


public final class Par<T,S> {
private final T a;
private final S b;
public Par(T a, S b)
{
this.a = a;
this.b = b;
}
public T getA() {
return a;
}
public S getB() {
return b;
}
@Override
public String toString()
{
return String.format( "(%s, %s)", getA(), getB() );
}
}
