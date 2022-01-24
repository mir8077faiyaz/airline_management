//AIRLINE RESERVATION SYSTEM PROJECT. CSE215-SECTION5 LAB
// Mir Faiyaz Hossain 201138042
// Mahirul Alam Chowdhury 2013445042
// Mahamudul Hasan Jiyon 2021964642
import java.io.IOException;


public class Ticket {
    private String dp;
    private String ar;
    private int seatz;
    private String date;
    private int price=1000;
    
    
    public String getDep(){
        return this.dp;
    }
    public String getArr(){
        return this.ar;
    }
    public int getStz(){
        return this.seatz;
    }
    public String getDat(){
        return this.date;
    }
    public int getPrice(){
        return this.price*seatz;
    }
    
    
    public void setDep(String d){
        this.dp=d;
    }
     public void setArr(String a){
        this.ar=a;
    }
    public void setStz(int s){
        this.seatz=s;
    }
    public void setDat(String d){
        this.date=d;
    }
    public void setPrice(int price){
        this.price=price;
    }
    
    public void addTickets(String d,String a,String id,int seats,String date) throws IOException{
        String mainfile = d+a+".txt";
           String idfile = d+a+"ID_File"+".txt";
           String seatfile =d+a+"Seat_File"+".txt";
           FileHandler handler = new FileHandler();
           int line = handler.SearchLine(idfile, id);
           int seatnum=handler.getSeat(seatfile, line);
           handler.RemoveSeats(mainfile, line, d,a,id,seatnum,seats,date);
           handler.RemoveSeats(seatfile, line,seatnum,seats);
    }
}
