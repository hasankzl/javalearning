// if I make a class final, that makes no other class can't inherits that class
// all permitted classes should inherit sealed class
sealed class A permits B,C{

}
// B should be final, sealed or non-sealed
sealed class B extends A permits D{

}
non-sealed class C extends A {

}

final class D  extends B{

}

sealed interface X permits Y{

}

non-sealed interface Y extends X{

}
public class SealedClassExample {


    public static void main(String[] args) {

    }
}
