//AIRLINE RESERVATION SYSTEM PROJECT. CSE215-SECTION5 LAB
// Mir Faiyaz Hossain 201138042
// Mahirul Alam Chowdhury 2013445042
// Mahamudul Hasan Jiyon 2021964642
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Admin  {
        private String adminID="Newton"; 
        private String password="0101d8d8";
  
   Admin(){
	   
   }

      public String getID() {
    	  return this.adminID;
      }
/////////////////////////////////////////////

       public String getPass() {
    	   return this.password;
       }
/////////////////////////////////////////////
       public void addPlanes(String id,String arr,String dep,int seats,String date){
           AeroPlane e = new AeroPlane();
           e.setID(id);
           e.setArrival(arr);
           e.setDeparture(dep);
           e.setSeats(seats);
           e.setDate(date);
           // These will be stored in seperate files
           String maincontent = e.getDeparture()+" "+e.getArrival()+" "+e.getID()+" "+e.getSeats()+" "+e.getDate();
           String idcontent = e.getID();
           int seatcontent = e.getSeats();
           // File name generic
           String mainfile = e.getDeparture()+e.getArrival()+".txt";
           String idfile = e.getDeparture()+e.getArrival()+"ID_File"+".txt";
           String seatfile = e.getDeparture()+e.getArrival()+"Seat_File"+".txt";
           // Creating and appending file

           FileHandler handler = new FileHandler();
           handler.CreateAppend(mainfile, maincontent);
           handler.CreateAppend(idfile, idcontent);
           handler.CreateAppend(seatfile, seatcontent);
       }
       public void removePlanes(String id,String depp,String arr) throws IOException{
           String mainfile = depp+arr+".txt";
           String idfile = depp+arr+"ID_File"+".txt";
           String seatfile =depp+arr+"Seat_File"+".txt";
           FileHandler handler = new FileHandler();
           int line = handler.SearchLine(idfile, id);
           int seatnum=handler.getSeat(seatfile, line);
          handler.deleteLine(idfile,line);
          handler.deleteLine(mainfile,line);
          handler.deleteLine(seatfile,line);

       }
  	
  
       }
       
       
       
       
       


