package java8features.Function;

import java.util.function.Function;

class MathVals{
    private int val;
    private int square;
    private int cube;

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public int getSquare() {
        return square;
    }

    public void setSquare(int square) {
        this.square = square;
    }

    public int getCube() {
        return cube;
    }

    public void setCube(int cube) {
        this.cube = cube;
    }
}
public class IntegerToMathOps {
    public static void main(String[] args) {
        Function<Integer, MathVals> mathVals = val -> {
          MathVals mathVals1 =  new MathVals();
          mathVals1.setVal(val);
          mathVals1.setSquare(val*val);
          mathVals1.setCube(val*val*val);
          return mathVals1;
        };

        System.out.println(mathVals.apply(12));

    }
}
