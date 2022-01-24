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

public class FileHandler{
    int linecount;
    public FileHandler(){
        
    }
    
    public void CreateAppend(String filename,String fileContent){
        try{
            File f1 = new File(filename);
            if (f1.createNewFile()){
            FileWriter writer = new FileWriter(filename,true);
            writer.write(fileContent);
            writer.close();
            }else {
                FileWriter writer2 = new FileWriter(filename,true);
                writer2.write(System.lineSeparator());

                writer2.write(fileContent);
                writer2.close();
            }
            
        }catch(IOException x){
            System.out.println("An error occurred.");
            x.printStackTrace();
        }
    }
    // overloaded method for integer input
    public void CreateAppend(String filename,int fileContent){
        try{
            File f1 = new File(filename);
            if (f1.createNewFile()){
            FileWriter writer = new FileWriter(filename,true);
            writer.write(new Integer(fileContent).toString());
            writer.close();
            }else {
                FileWriter writer2 = new FileWriter(filename,true);
                writer2.write(System.lineSeparator());
                writer2.write(new Integer(fileContent).toString());
                writer2.close();
            }
            
        }catch(IOException x){
            System.out.println("An error occurred.");
            x.printStackTrace();
        }
    }
    
    public void deleteLine(String filename,int lineNum) throws FileNotFoundException, IOException{
        String tempname="temp"+filename;    
        File tempFile = new File(tempname);
        File rename = new File(filename);
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

        String currentLine;

        int newCounter=1;
        while((currentLine = reader.readLine()) != null) {
            if(newCounter==lineNum)
            {  newCounter++;
            continue;
            }
            else{
                newCounter++;
            }
            writer.write(currentLine + System.getProperty("line.separator"));
        }
       
       // System.out.println(renamecheck);
        writer.close(); 
        reader.close();
        rename.delete();
        boolean renamecheck = tempFile.renameTo(rename);

        
    }
    
    
    public int SearchLine(String filename,String id) throws FileNotFoundException, IOException{
    FileReader fr = new FileReader(filename);    
    BufferedReader br=new BufferedReader(fr);  
    String line;  
    int count = 1;
    while((line=br.readLine())!=null)  
    {
        if(line.equals(id)){
            break;
        }
        else{
            count++;
        }
    }
    fr.close(); 
    this.linecount=count;
    System.out.println(linecount);
    return this.linecount;
        
    }
    public int getSeat(String filename,int lineNum)throws FileNotFoundException, IOException{
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String currentLine;
        int seatqty=0;
        int newCounter=1;
        while((currentLine = reader.readLine()) != null) {
            if(newCounter==lineNum)
            {  newCounter++;
                seatqty=Integer.parseInt(currentLine);  
            }
            else{
                newCounter++;
            }
        }
        reader.close();  
        System.out.println(seatqty);
        return seatqty;
        
    }

    public void AddSeats(String filename,int lineNum,String depp,String arr,String id,int qty,int newqty,String date)throws FileNotFoundException, IOException{
        String tempname="temp"+filename;    
        File tempFile = new File(tempname);
        File rename = new File(filename);
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));
        String currentLine;
        int finalseats = qty+newqty;
        int newCounter=1;
        while((currentLine = reader.readLine()) != null) {
            if(newCounter==lineNum)
            {  
                newCounter++;
                continue;
            }
            if(newCounter==lineNum+1){
                String fin =new Integer(finalseats).toString();
                writer.write(depp+" "+arr+" "+id+" "+fin+" "+date+ System.getProperty("line.separator"));       
            }
            newCounter++;
            
            writer.write(currentLine + System.getProperty("line.separator"));
        }
        writer.close(); 
        reader.close();  
        rename.delete();
        boolean renamecheck = tempFile.renameTo(rename);

    }
    // overload add seats
    //changes seat file only {DONE}
    public void AddSeats(String filename,int lineNum,int qty,int newqty)throws FileNotFoundException, IOException{
        String tempname="temp"+filename;    
        File tempFile = new File(tempname);
        File rename = new File(filename);
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));
        int finalseats = qty+newqty;
        String currentLine;

        int newCounter=1;
        while((currentLine = reader.readLine()) != null) {
            if(newCounter==lineNum)
            {  
                newCounter++;
                writer.write(new Integer(finalseats).toString()+ System.getProperty("line.separator"));
                continue;
            }
            writer.write(currentLine + System.getProperty("line.separator"));
            newCounter++;
        }
        writer.close(); 
        reader.close(); 
        rename.delete();
        boolean renamecheck = tempFile.renameTo(rename);

    }
    public void RemoveSeats(String filename,int lineNum,String depp,String arr,String id,int qty,int newqty,String date)throws FileNotFoundException, IOException{
        String tempname="temp"+filename;    
        File tempFile = new File(tempname);
        File rename = new File(filename);
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));
        String currentLine;
        int finalseats = qty;
        if(qty-newqty>=0){
            finalseats = qty-newqty;
        }
        else{
            System.out.println("No seats available");
            finalseats = qty;
        }
        
        int newCounter=1;
        while((currentLine = reader.readLine()) != null) {
            if(newCounter==lineNum)
            {  
                newCounter++;
                continue;
            }
            if(newCounter==lineNum+1){
                String fin =new Integer(finalseats).toString();
                writer.write(depp+" "+arr+" "+id+" "+fin+" "+date+ System.getProperty("line.separator"));       
            }
            newCounter++;
            
            writer.write(currentLine + System.getProperty("line.separator"));
        }
        writer.close(); 
        reader.close();  
        rename.delete();
        boolean renamecheck = tempFile.renameTo(rename);

    }
    // overload add seats
    //changes seat file only {DONE}
    public void RemoveSeats(String filename,int lineNum,int qty,int newqty)throws FileNotFoundException, IOException{
        String tempname="temp"+filename;    
        File tempFile = new File(tempname);
        File rename = new File(filename);
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));
        String currentLine;
        int finalseats = qty;
        if(qty-newqty>=0){
            finalseats = qty-newqty;
        }
        else{
            System.out.println("No seats available");
            finalseats = qty;
        }

        int newCounter=1;
        while((currentLine = reader.readLine()) != null) {
            if(newCounter==lineNum)
            {  
                newCounter++;
                writer.write(new Integer(finalseats).toString()+ System.getProperty("line.separator")); 
                continue;
            }
            writer.write(currentLine + System.getProperty("line.separator"));
            newCounter++;
        }
        writer.close(); 
        reader.close(); 
        rename.delete();
        boolean renamecheck = tempFile.renameTo(rename);

    }
    
}
