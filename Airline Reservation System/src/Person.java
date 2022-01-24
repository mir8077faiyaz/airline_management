//AIRLINE RESERVATION SYSTEM PROJECT. CSE215-SECTION5 LAB
// Mir Faiyaz Hossain 201138042
// Mahirul Alam Chowdhury 2013445042
// Mahamudul Hasan Jiyon 2021964642

public class Person{
  private   String name;private  int age;private  String contact;
  private String email;private  String address;
     
       Person(){
    	   
       }
    
       Person(String name, int age, String contact, String email, String address ){
    	   this.name=name; this.age=age; this.contact=contact; this.email=email;this.address=address;
    	   
       }
       /////////////////////////////
       public void setName(String name) {
    	   this.name=name; 
       }
      public String getName() {
    	  return name;
      }

     /////////////////////////////////// 
      public void setAge(int age) {
   	   this.age=age; 
      }
     public int getAge() {
   	  return age;
     }
/////////////////////////////////////
      public void setContact(String contact) {
  	   this.contact=contact; 
     }
    public String getContact() {
  	  return contact;
    }

/////////////////////////////////////////
    public void setEmail(String email) {
 	   this.email=email; 
    }
   public String getEmail() {
 	  return email;
   }

/////////////////////////////////////////////////
   public void setAddress(String address) {
	   this.address=address; 
   }
  public String getAddress() {
	  return address;
  }










}
