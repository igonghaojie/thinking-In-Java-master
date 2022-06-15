//: polymorphism/RTTI.java
package polymorphism; /* Added by Eclipse.py */
// Downcasting & Runtime type information (RTTI).
// {ThrowsException}
import static net.mindview.util.Print.*;

class Useful {
  public void f() { print("1f"); }
  public void g() { print("1g"); }
}

class MoreUseful extends Useful {
  public void f() { print("2f"); }
  public void g() { print("2f"); }
  public void u() { print("2u"); }
  public void v() { print("2v"); }
  public void w() { print("2w"); }
}	

public class RTTI {
  public static void main(String[] args) {
    Useful[] x = {
      new Useful(),
      new MoreUseful()
    };
    x[0].f();
    x[1].g();
    // Compile time: method not found in Useful:
    //! x[1].u();
    ((MoreUseful)x[1]).u(); // Downcast/RTTI
    ((Useful)x[1]).f();
    //x[1].super.f();
    ((MoreUseful)x[0]).u(); // Exception thrown
  }
} ///:~
