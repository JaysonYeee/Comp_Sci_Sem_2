package pkg;

public class Ferret{
    
    boolean trained;
    String name;
    int age;
    
    public Ferret(boolean t){
        
        this("Sicario", 2, t)
    }
    
    public Ferret(tring name, int age, boolean trained) {
        
        this.name = name;
        this.age = age;
        this.trained = trained;
    
    public void setName(String name){
        
        this.name = name;
    }
    
    public void setAge(int age){
        
        this.age = age;
    }
    
    public String getName(){
        
        return this.name;
    }
    
    public int getAge(){
        
        return this.age;
    }
    
    public void setIsTrained(boolean trained){
        
        this.trained = trained;
    }
    
    public boolean getIsTrained(){
        
        return this.trained;
    }
    
    public void Interact(){
        
        System.out.println(this.name + " hiss");
    }
    
    public void Trick() {
        
        if(this.trained) {
            System.out.println("Ferret Backflip");
        }
        
        else{
            System.out.println(this.name + " hiss")
        }
    }
}

