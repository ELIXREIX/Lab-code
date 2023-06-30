package Term2.week3term2.Homework3;

class student {
    private String name ;
    private int age ;
    private char grade ;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = (name != null && !name.isEmpty()) ? name : "Please recorrect";
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = (age >= 5 && age <= 18) ? age : 0 ;
    }
    public char getGrade() {
        return grade;
    }
    /**
     * @param grade
     */
    public void setGrade(char grade) {
        if (grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F') {
        this.grade = grade;
    } else {
        this.grade = 'X';
    }
}
    public void getinfo(){
        System.out.println("Name : "+ name);
        System.out.println("Age : "+ age);
        System.out.println("Grade : "+ grade);
    }

}
    

