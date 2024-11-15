package Classes.Inheritance;

public class GraduateStudent extends Student implements Teachable {
    private String thesis;
    
    public GraduateStudent(String name, int id, String thesis) {
        super(name, id); 
        this.thesis = thesis;
    }
    
    public String getThesis() {
        return thesis;
    }
    
    public void setThesis(String thesis) {
        this.thesis = thesis;
    }
    
    @Override
    public void study() {
        super.study();
        System.out.println("Working on thesis: " + thesis);
    }
    
    @Override
    public void learn() {
        System.out.println(getName() + " is learning advanced concepts");
    }
}