package basic;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class TestStatic{
    static int instancesCount;
    int num;
    String name;
    TestStatic(int num, String name){
        this.num=num;
        this.name=name;
        instancesCount++;
    }

    @Override
    public String toString() {
        return num+" "+name;
    }
}
public class StaticMethod {
    public static void main(String[] args) {
        TestStatic testStatic1 = new TestStatic(12,"Purushottam");
        TestStatic testStatic2 = new TestStatic(13,"Purushottam");
        TestStatic testStatic3 = new TestStatic(12,"Purushottam");
        TestStatic testStatic4 = testStatic1;
        System.out.println("Output of the toString(): "+testStatic1.toString());

        List<TestStatic> testStaticList = Arrays.asList(testStatic1, testStatic2, testStatic3, testStatic1);
        List<TestStatic> sortedRes = testStaticList.stream().sorted(Comparator.comparing((TestStatic t) -> t.num).thenComparing((TestStatic t) -> t.name)).collect(Collectors.toList());
        System.out.println("Sorting the elements");
        sortedRes.forEach(System.out::println);
        System.out.println("Total instances are: "+TestStatic.instancesCount);
    }
}
