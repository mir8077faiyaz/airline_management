//AIRLINE RESERVATION SYSTEM PROJECT. CSE215-SECTION5 LAB
// Mir Faiyaz Hossain 201138042
// Mahirul Alam Chowdhury 2013445042
// Mahamudul Hasan Jiyon 2021964642

public class User extends Person {
      private String userID; private String password;

      User(){
    	  super();
      }
           
        User(String ID, String pass){
            super();
        	this.userID=ID;
        	this.password=pass;
        }
       
          public void setID(String ID){
              this.userID=ID;
              }

         public String getID() {
        	 return this.userID;
         }
//////////////////////////////////////////////
       public void setPass(String pass) {
    	   this.password=pass;
       }
     public String getPass() {
    	 return this.password;
     }
   
}
