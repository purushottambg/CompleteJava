package reflections;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/*
* Reflections in Java is the functionality that enables us to target the specific member in the
* Class that is already defined inside the java. it's popular when you don't want to create actula
* object of the class and still use the functionalities
 */

public class ReflectionClass {
    public static void main(String[] args) throws ClassNotFoundException {
        Class reflector = Class.forName("reflections.TargetClass");
        Constructor[] constructors = reflector.getConstructors();
        Method[] functions = reflector.getMethods();

        for (Constructor constructor: constructors){
            System.out.println("constructors are: "+constructor);
            Parameter[] parameters = constructor.getParameters();
            for (Parameter parameter: parameters){
                System.out.println("this constructor has parameter: "+parameter);
            }
            System.out.println();
        }

        for (Method function: functions){
            System.out.println("Methods in target class: "+function);
        }

        System.out.println("Now get declared methods");

        Constructor[] declaredConstructors = reflector.getDeclaredConstructors();
        Method[] declaredFunctions = reflector.getDeclaredMethods();

        for (Constructor constructor: constructors){
            System.out.println("constructors are: "+constructor);
            Parameter[] parameters = constructor.getParameters();
            for (Parameter parameter: parameters){
                System.out.println("this constructor has parameter: "+parameter);
            }
            System.out.println();
        }

        for (Method function: functions){
            System.out.println("Methods in target class: "+function);
        }
    }
}
