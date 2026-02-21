class Parent {

    public void meth2() {
        System.out.println("I am method 2 of parent class");
    }
}

class Child extends Parent {

   @Override
    public void meth2() {
        System.out.println("I am method 2 of child class");
    }
}

 class MethodOverriding {

    public static void main(String[] args) {

        Parent obj = new Child();   
        obj.meth2();               
    }
}
