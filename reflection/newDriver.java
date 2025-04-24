package reflection;

import java.util.Scanner;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;

public class newDriver {
    public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, InvocationTargetException {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter role");
        String role = sc.next();
        System.out.println("Enter the method that u want to call");
        String method_name = sc.next();
        task task = new task();
        sc.close();

        userValidCheck(role, method_name, task);
    }

    public static void userValidCheck(String role_by_user, String method_name, task t) throws NoSuchMethodException, SecurityException, IllegalAccessException, InvocationTargetException {
        Class<task> c = task.class;
        Method m = c.getMethod(method_name);
        if (m.isAnnotationPresent(Role.class)) {
            Role role = m.getAnnotation(Role.class);
            if (role.value().equals(role_by_user)) {
                m.invoke(t);
            } else {
                System.out.println("Role not valid.. Don't have access");
            }
        }
    }
}
