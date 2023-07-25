
public class Employee {

    private DegreeType degree;
    private String firstName;
    private String lastName;
    private int experience;
    public enum DegreeType { NONE, ASSOCIATE, BACHELORS, MASTERS, DOCTORATE}


    public Employee( DegreeType degree, String firstName, String lastName, int experience) {
        this.degree = degree;
        this.firstName = firstName;
        this.lastName = lastName;
        this.experience = experience;


    }

    public DegreeType getDegree() {
        return degree;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getExperience() {
        return experience;
    }

    public void setDegree(DegreeType degree) {
        this.degree = degree;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    private int getValuePoints(int degreeValue, int experience){
        return this.experience * degreeValue;
    }
    // Overriding toString() method of String class
    @Override
    public String toString() {
        return this.firstName + " " + this.lastName + " has been with the company for " + this.experience + " years and has a degree level of " + this.degree;
    }

    @Override
    public boolean equals(Employee employee){

        int thisValuePoints =  getValuePoints((int)this.degree, this.experience);
        int employeeValuePoints =  getValuePoints((int)employee.degree, employee.experience);
        if ( thisValuePoints == employeeValuePoints) {
            return true;
        }

        return false;
    }

    @Override
    public int compareTo(Object otherEmployee) {
        return 0;
    }
}





