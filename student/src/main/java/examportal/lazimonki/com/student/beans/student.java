package examportal.lazimonki.com.student.beans;

/**
 * student
 */
public class student {

    private Integer Id;
    private String name;

    public student(Integer id, String name) {
        Id = id;
        this.name = name;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    


}