package P1.Term2.week1term2.Term2.week1term2.oopweek1 ;
class students {
    public String message = " ยากฉิบหาย "  ;
    private String StudentID ;
    private String Name ;
    private String Major ;
    //constrictor
    public students(String StudentID){

        this.StudentID = StudentID;
    }

    public students(int i) {
    }
    //Method
    public void setName (String stundentName){
        Name = stundentName;
    }
    public String getName() {
        return Name;
    }
    public String getstudentID() {
        return StudentID ;
    }
    public void setMajor(String majorname) {
        Major = majorname;
    }
    public String getmajor () {
        return Major ;
    }
    public void sayhello (){
        System.out.println("สวัสดี " + Name + " มาจากสาขา " + Major + " อยากบอกว่า " + message);
    }
}

