public class Student {

    private Integer id;
    private String name;
    private Double averageGrades;

    public Student(Integer id, String name, Double averageGrades) {
        this.id = id;
        this.name = name;
        this.averageGrades = averageGrades;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", averageGrades=" + averageGrades +
                '}';
    }
    //El toString permite no estar
    // viendo el espacio de memoria
    // y en cambio permite ver los
    // datos especificos
}
