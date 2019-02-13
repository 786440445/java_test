class A{
    final int i = 2;
    final void f()
    {
        System.out.println("A类静态方法f()");
    }
}

class B extends A{
    B(){
        super();
    }
}

public class Interface_Test {
    public static void main(String[] args){
        B b = new B();
        b.f();
        System.out.println(b.i);
    }
}

