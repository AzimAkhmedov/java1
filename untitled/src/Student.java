import java.util.UUID;

public class Student {
   private String firstName;
   private String lastName;
    private String id;

    Student(){
        this.firstName = "";
        this.lastName = "";
        this.id = UUID.randomUUID().toString();
    }
    Student(String fn, String sn, String id){
        this.firstName = fn;
        this.lastName = sn;
        this.id = id;
    }

    public String getFirstName(){
        return  this.firstName;
    };
    public String getLastName(){
        return  this.lastName;
    };
    public String getId(){
        return  this.id;
    };
    public  void setFirstName(String val){
        this.firstName = val;
    }
    public  void setLastName(String val){
        this.lastName = val;
    }
    public  void setiD(String val){
        this.id = val;
    }
    public String toString(){
     return "Firstname is "+this.firstName+" lastname is "+this.lastName+ " and student's id is: "+this.id;
    }


//+setFirstName(String : fn) : void +getLastName() : String +setLastName(String : ln) : void +getId() : String
//+setId(String : idInput) : void +^toString() : String

}
