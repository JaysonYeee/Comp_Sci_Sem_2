import java.util.*;
import java.util.ArrayList;


public class OnlinePurchaseManager
{
   //declared
   private ArrayList<Gizmo> purchases;
   
   //check if electronic and by maker (.equals)
   //.isElectronic() and .getMaker()  m = maker / input
   public Gizmo countElectronicsByMaker(String m){
      
      int counter = 0;
      //use purchases^^
      for(int i = 0; i < purchases.size(); i++){
         //?.get(i); need something for i so that i is = ? / both conditions true
            //if(?.isElectronic() && ?.getMaker().equals(m){
               counter = counter + 1;
            //}
         return counter;
      }
      
   }
   
   public Gizmo hasAdjacentEqualPair(){
      
      //start at i = 1 or purchases.size() - 1, reads the ones shited up / next
      for(int i = 0; i < purchases.size() - 1; i++){
         // if current = next
         if(purchases.get(i).equals(purchases.get(i + 1))){
            return true;
         }
         //else / fewer than 2
         return false;
      }
      
   }
   
   public Gizmo getCheapestGizmoByMaker(String mkr){
   	
   }
   
   
   public String toString()
   {
   	return "" + purchases;
   }
}
