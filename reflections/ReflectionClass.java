package reflections;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.function.Function;

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
    }
}
