public class Patient {
    private String name;
    private String famName;
    private String numHSE;
    private int age;

    public Patient(String name, String famName, String numHSE, int age) {

        if(name.length() < 3){
            throw new IllegalArgumentException("Invalid");
        }
        if(famName.length() < 3){
            throw new IllegalArgumentException("Invalid");
        }
        if(numHSE.length() < 10 || numHSE.length() > 10){
            throw new IllegalArgumentException("Invalid");
        }
        if(age < 0 || age > 120){
            throw new IllegalArgumentException("Invalid");
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
