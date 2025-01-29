package oops;

public class ClassToBeInherited {
    private boolean flag;

    public boolean updateFlag(){
        if (flag){
            flag=false;
            return true;
        }
        flag=true;
        return flag;
    }
}
