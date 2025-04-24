package reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class MethodInvikeEg {
    void m1() {
        System.out.println("m1");
    }

    static void m2() {
        System.out.println("m2");
    }

    static void m3(String s) {
        System.out.println("m3: " + s);
    }

    void m4(int a, double b) {
        System.out.println("m4: " + a + ", " + b);
    }
}

public class driver4 {
    public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, InvocationTargetException {
        // Create an instance of MethodInvikeEg for non-static methods
        MethodInvikeEg instance = new MethodInvikeEg();
        Class<MethodInvikeEg> obj = MethodInvikeEg.class;

        Method m1Invoke = obj.getDeclaredMethod("m1");
        m1Invoke.invoke(instance); // pass instance for non-static

        Method m2Invoke = obj.getDeclaredMethod("m2");
        m2Invoke.invoke(null); // static, so null

        Method m3Invoke = obj.getDeclaredMethod("m3", String.class);
        m3Invoke.invoke(null, "hi"); // static with argument

        Method m4Invoke = obj.getDeclaredMethod("m4", int.class, double.class);
        m4Invoke.invoke(instance, 10, 10.8); // non-static with arguments
    }
}