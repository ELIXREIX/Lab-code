package Term2.week5term2;

public class User {
    private long id;
    private String name;
    protected boolean enabled;
    protected String emailaddress;
    protected String password;
    public User(long ID, String NAME){
        this.id=ID;
        this.name=NAME;
        this.enabled = true;
    }

    public void changePassword(String newPassword){
        this.password=newPassword;
    }
    public boolean isEanbled(){
    return(enabled);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
        
    @Override
    public String toString(){
        return String.format("User[ID=%d Name=%s]", id,name);
    }
   
    public static void main(String[] args) {
       User admin = new User(1234,"Suphachote");
                   System.out.println(admin);

    }
    
}

