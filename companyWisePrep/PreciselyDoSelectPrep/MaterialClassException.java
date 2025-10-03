package companyWisePrep.PreciselyDoSelectPrep;

class Material{
    int mass;
    int temperature;

    public Material(int mass, int temperature){
        this.temperature=temperature;
        this.mass=mass;
    }

    public String checkMaterial() throws MaterialExceptions{
        if(mass<0) throw new MaterialExceptions("Mass can not be negative");
        else if (mass==0) throw new MaterialExceptions("Mass should not be Zero");
        else return "Mass is "+mass;
    }

    public String flowOfHeat() throws MaterialExceptions{
        if(mass!=temperature) throw new MaterialExceptions("Not equilibrium");
        else return "Equilibrium";
    }

}

class MaterialExceptions extends Exception{
    public MaterialExceptions(String message){
        super(message);
    }
}

public class MaterialClassException {
    public static void main(String[] args) throws MaterialExceptions {
        Material m1 = new Material(-12,-30);
        try {
            System.out.println(m1.checkMaterial());
        } catch (MaterialExceptions e) {
            throw new MaterialExceptions(e.getMessage());
        }

        try {
            System.out.println(m1.flowOfHeat()) ;
        }catch (MaterialExceptions e){
            throw new MaterialExceptions(e.getMessage());
        }

        System.out.println("Execution complete");
    }
}
