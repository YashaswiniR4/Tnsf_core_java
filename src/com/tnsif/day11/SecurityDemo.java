//Final Keyword

package com.tnsif.day11;

class SecuritySystem {

    final int PIN_CODE = 1234;

    final void displayWarning() {
        System.out.println("Alert: High Security Area!");
    }

    // Uncommenting the below code gives an error
    /*
    void changePin() {
        PIN_CODE = 5678;
    }
    */
}

class SuperSecurity extends SecuritySystem {

    /*
    // Error: Cannot override final method
    void displayWarning() {
        System.out.println("Another Warning");
    }
    */
}

// Error: Cannot inherit final class
/*
final class SecuritySystem {

}

class Child extends SecuritySystem {

}
*/

public class SecurityDemo {

    public static void main(String[] args) {

        SecuritySystem obj = new SecuritySystem();

        System.out.println("PIN : " + obj.PIN_CODE);

        obj.displayWarning();
    }
}