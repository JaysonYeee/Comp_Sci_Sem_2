package pkg;

public class Robot{
	
	public int [] hall;
	public int pos;
	public boolean facingRight;
	
	//return true if blocked, else false
	public boolean fowardMovedBlocked(){
	    
	    //must have both
	    if(pos && facingRight >= hall.length){
	        return true;
	    }
	    else{
	        return false;
	    }
	}
	
	public void move(){
	    
	    //if(hall[pos] == 0){} ???
	    
	}
	
	public int clearHall(){
	    
	    int counter = 0;
	    //use hallisClear.
	    while(hallIsClear = true){
	    	
	    	//move method?
	    	
	    	counter = counter + 1;
	    }
	    return counter;
	}
	
}
