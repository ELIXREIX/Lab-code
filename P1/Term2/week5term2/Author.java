package P1.Term2.week5term2;

public class Author {
   private String name;
   private String email;      
   private char gender;
      public Author(String Name , String Email ,char Gender){
          name = Name;
          email = Email;
          gender=Gender;
          
      } 
    public String getName() {
        return name;
    }  
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public char getGender() {
        return gender;
    }
    public String toString() {
    
        return String.format("Author[name=%s email=%s gender=%s]", name, email, gender);
    }
}
