package pkg;

public class Horse{
    
    boolean trained;
    String name;
    int age;
    
    public Horse(boolean t){
        
        this("Zues", 5, t)
    }
    
    public Horse(tring name, int age, boolean trained) {
        
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
        
        System.out.println(this.name + " neigh");
    }
    
    public void trick() {
        
        if(this.trained) {
            System.out.println("Horse Kick");
        }
        
        else{
            System.out.println(this.name + " neigh")
        }
    }
}
