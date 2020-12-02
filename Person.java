public class Person {
    private String firstName;
    private String lastName;
    private int age;
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getAge(){
        return age;
    }
    public void setFirstName(String h){
        this.firstName=h;
    }
    public void setLastName(String i){
        this.lastName=i;
    }
    public void setAge(int a){
        if(a<0 || a>100){
            this.age=0;
        }
        else{
            this.age=a;
        }
    }
    public boolean isTeen(){
        if(age>12&&age<20){
            return true;
        }
        else
            return false;
    }

    public String getFullName(){
       if(firstName==null&&lastName==null){
           return null;
       }
       else if(firstName.isEmpty()){
            return lastName;
        }
        else if (lastName.isEmpty()){
            return firstName;
        }
else return firstName+" "+lastName;
    }
    
}
