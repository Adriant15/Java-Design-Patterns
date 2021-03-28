package Structural_Design_Composite;

import java.util.ArrayList;
import java.util.List;

public class Supervisor implements Faculty{
    private String name;
    private String deptName;

    private List<Faculty> myFacultyList;

    public Supervisor(String name, String deptName) {
        this.name = name;
        this.deptName = deptName;
        myFacultyList = new ArrayList<>();
    }

    public void add(Faculty professor){
        myFacultyList.add(professor);
    }

    public void remove(Faculty professor){
        myFacultyList.remove(professor);
    }

    public List<Faculty> getMyFacultyList(){
        return myFacultyList;
    }

    @Override
    public String getDetails() {
        return (name + " is the " + deptName);
    }
}