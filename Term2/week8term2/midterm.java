package Term2.week8term2;
public class midterm {
    public static void main (String [] args) { 
    Animal S = new Animal();
    S.setname("Saddleback Caterpillar");
    S.setkingdom("Animalia");
    S.setphylum("Arthropoda");
    S.setclassanimal("Insecta");
    System.out.println(S);
}
}
    

class Animal { 
    private String name;
    private String kingdom;
    private String phylum;
    private String classanimal;
    
    public void setname(String name){
        this.name = name;
    }
    public String getname(){
        return name;
    }
    public void setkingdom(String kingdom){
        this.kingdom = kingdom;
    }
    public String getkingdom(){
        return kingdom;
    }
    public void setphylum(String phylum){
        this.phylum = phylum;
    }
    public String getphylum(){
        return phylum;
    }
    public void setclassanimal(String classanimal){
        this.classanimal = classanimal;
    }
    public String getclassanimal(){
        return classanimal;
    }
    public String toString(){
        return "Animal: " + name + "| Kingdom: " + kingdom + "| Phylum: " + phylum + "| Class: " + "" + classanimal ;
    }
}