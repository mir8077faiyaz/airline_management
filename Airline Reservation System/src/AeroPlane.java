//AIRLINE RESERVATION SYSTEM PROJECT. CSE215-SECTION5 LAB
// Mir Faiyaz Hossain 201138042
// Mahirul Alam Chowdhury 2013445042
// Mahamudul Hasan Jiyon 2021964642
public class AeroPlane {
	     private String uniqueID;
	    private String arrival;
	    private String departure;
            private String date;
            private static int seats;
      AeroPlane(){
    	  
      }
         AeroPlane(String id, String arr, String dep, int seats){
        	  this.uniqueID=id; this.arrival=arr; this.departure=dep; this.seats=seats;
         }

         public String getID(){
             return this.uniqueID;
         }
         public String getArrival(){
             return this.arrival;
         }
         public String getDeparture(){
             return this.departure;
         }
         public int getSeats(){
             return this.seats;
         }
         public String getDate(){
             return this.date;
         }
         /////////////////////////////////////////////  
          public void setID(String id){
             this.uniqueID=id;
         }
         public void setArrival(String arr){
             this.arrival=arr;
         }
         public void setDeparture(String dep){
             this.departure=dep;
         }
         public void setSeats(int seats){
             this.seats=seats;
         }

        
         public void setDate(String date){
             this.date=date;
         }


}
