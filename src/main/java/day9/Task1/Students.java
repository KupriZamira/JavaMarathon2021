package day9.Task1;

public class Students extends Human {
    private String groupName;

    public Students (String name, String groupName){
        super(name);
        this.groupName = groupName;
    }
    public String getGroupName(){
        return groupName;
    }
    public void printInfo(){
        super.printInfo();
        System.out.println("Этот студент с именем " + getName());
    }
}


