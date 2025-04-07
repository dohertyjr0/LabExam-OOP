public class Patient {
    private String name;
    private String famName;
    private String numHSE;
    private int age;

    public Patient(String name, String famName, String numHSE, int age) {

        if(!name.equals("John")){
            throw new IllegalArgumentException("Invalid name");
        }
        this.name = name;
        this.famName = famName;
        this.numHSE = numHSE;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamName() {
        return famName;
    }

    public void setFamName(String famName) {
        this.famName = famName;
    }

    public String getNumHSE() {
        return numHSE;
    }

    public void setNumHSE(String numHSE) {
        this.numHSE = numHSE;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
