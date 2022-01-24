//AIRLINE RESERVATION SYSTEM PROJECT. CSE215-SECTION5 LAB
// Mir Faiyaz Hossain 201138042 
// Mahirul Alam Chowdhury 2013445042
// Mahamudul Hasan Jiyon 2021964642
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class GUICLASS {
    
    static String deppobtained;
    static String arrobtained;
    static int seatsobtained;
    static String idobtained;
    static String dateobtained;
    static String currentuser;
    public static void main(String[] args) throws FileNotFoundException, InterruptedException {
        JFrame frame = new JFrame("AirLine Reservation System");
        frame.setSize(700, 700);
        
        JPanel home = new JPanel();
        home.setLayout(null);
        home.setVisible(true);
        JLabel xyz = new JLabel("XYZ-AIRLINES");
        xyz.setBounds(150,0,400,100);
        xyz.setFont(new Font("Comic Sans MS",Font.BOLD,48));
        home.add(xyz);
        JButton admin = new JButton("ADMIN");
        admin.setFocusable(false);
        admin.setFont(new Font("Comic Sans MS",Font.BOLD,20));
        admin.setBounds(150, 220, 120, 50);
        admin.setBackground(new Color(255,240,211));
        JButton user = new JButton("USER");
        user.setBounds(350, 220, 120, 50);
        user.setFont(new Font("Comic Sans MS",Font.BOLD,20));
        user.setBackground(new Color(255,240,211));
        user.setFocusable(false);
        home.setBackground(new Color(202, 252, 3));
        home.add(admin);
        home.add(user);
        //panel-1 ends here
        //__________________________________________________________________________________
       
          //ADMIN PANEL STARTS HERE
    JPanel adset = new JPanel();
        adset.setLayout(null);
        JLabel adsetlab = new JLabel();
        adsetlab.setText("ADMIN SETTINGS");
        adsetlab.setBounds(100,0,500,100);
        adsetlab.setFont(new Font("Comic Sans MS",Font.BOLD,48));
        JButton adpln = new JButton("ADD-PLANE");
        JButton rvpln = new JButton("REMOVE-PLANE");
        adpln.setFocusable(false);
        rvpln.setFocusable(false);
        adpln.setBounds(30,200,200,80);
        rvpln.setBounds(450,200,200,80);
        adset.add(adsetlab);
        adset.add(adpln);
        adset.add(rvpln);
        adset.setBackground(new Color(3, 194, 252));
        frame.add(adset);
        
        JPanel removeplane = new JPanel();
                removeplane.setLayout(null);
               removeplane.setBackground(new Color(255, 219, 179));
               JLabel removeplaneTitle = new JLabel("Plane Removal Module");
               removeplaneTitle.setBounds(150,0,550,100);
               removeplaneTitle.setFont(new Font("Comic Sans MS",Font.BOLD,40));
              
	           
	         JLabel removeplaneTitle2 = new JLabel("___________________");
	         removeplaneTitle2.setBounds(190,10,250,100);
	         removeplaneTitle2.setFont(new Font("Comic Sans MS",Font.BOLD,15));
	         removeplane.add(removeplaneTitle2);
	         removeplane.setVisible(true);
	           ///////////////////////////////////////////////
	           /////////////// Text Fields and Labels for Sign Up Form.
	           JLabel removeplaneIdlabel = new JLabel("Enter Id: ");
	           removeplaneIdlabel.setBounds(200, 130, 80, 35);
	                removeplane.add(removeplaneIdlabel);
	                removeplaneIdlabel.setFont(new Font("Comic Sans MS",Font.BOLD,12));
	                JTextField removeplaneIdfield = new JTextField();
	                removeplaneIdfield.setBounds(280, 140, 200, 20);
	                removeplane.add(removeplaneIdfield);    
	                ///////////////////////////////////////////////
	 	           
	 	           JLabel removeplaneDeparturelabel = new JLabel("Enter Departure: ");
	 	          removeplaneDeparturelabel.setBounds(150, 180, 150, 35);
	 	         removeplaneDeparturelabel.setFont(new Font("Comic Sans MS",Font.BOLD,12));     
	 	          removeplane.add(removeplaneDeparturelabel);
	 	                
	 	                JTextField removeplaneDeparturefield = new JTextField();
	 	               removeplaneDeparturefield.setBounds(280, 190, 200, 20);
	 	                removeplane.add(removeplaneDeparturefield);    
	 	           ////////////////////////////////////////////////  ///////////////////////////////////////////////
	 		      JLabel removeplaneArrivallabel = new JLabel("Enter Arrival: ");
	 	          removeplaneArrivallabel.setBounds(150, 220, 200, 35);
	 	         removeplaneArrivallabel.setFont(new Font("Comic Sans MS",Font.BOLD,12));     
	 	          removeplane.add(removeplaneArrivallabel);
	 	                
	 	                JTextField removeplaneArrivalfield = new JTextField();
	 	               removeplaneArrivalfield.setBounds(280, 230, 200, 20);
	 	                removeplane.add(removeplaneArrivalfield);    
	           ////////////////////////////////////  Sign up button/////////////
	                           JButton removeplaneButton = new JButton("Confirm");
                                   removeplaneButton.setFocusable(false);
	                           removeplaneButton.setBounds(355,490,160,30);
	                            removeplaneButton.setFont(new Font("Comic Sans MS",Font.BOLD,16));      
	                             removeplaneButton.setBackground(new Color(255,0,43));
	                            
	                             removeplane.add(removeplaneButton);
	                       ///////////////////////////////////////////// 
	                             removeplane.add(removeplaneTitle);
	              	           
	                   	   removeplane.add(removeplaneTitle2);
	       	              
                            
        JPanel AddPlane = new JPanel();
	               AddPlane.setLayout(null);
	               
	               AddPlane.setBackground(new Color(134, 45, 89));
	                  
	                  JLabel AddPlaneTitle = new JLabel("Add Planes");
	                  AddPlaneTitle.setBounds(200,0,250,100);
	                  AddPlaneTitle.setFont(new Font("Comic Sans MS",Font.BOLD,35));
	                  JLabel AddPlaneTitle2 = new JLabel("______________________");
	                  AddPlaneTitle2.setBounds(190,10,250,100);
	                  AddPlaneTitle2.setFont(new Font("Comic Sans MS",Font.BOLD,15));
	
	                  ///////////////////////// TEXT Fields and labels for Add Plane panels////////////////////////
	                  
	                  JLabel AddPlaneIDlabel = new JLabel("Enter ID: ");
	                  AddPlaneIDlabel.setBounds(200, 130, 200, 35);
	   	                AddPlane.add(AddPlaneIDlabel);
	   	             AddPlaneIDlabel.setFont(new Font("Comic Sans MS",Font.BOLD,18));
	   	                JTextField AddPlaneIDfield = new JTextField();
	   	             AddPlaneIDfield.setBounds(333, 140, 200, 20);
	   	             AddPlane.add(AddPlaneIDfield);    
	   	                ///////////////////////////////////////////////
	   	 	           
	   	 	         JLabel AddPlaneDeplabel = new JLabel("Enter Departure:");
	   	 	          AddPlaneDeplabel.setBounds(200, 180, 200, 35);
	   	 	         AddPlaneDeplabel.setFont(new Font("Comic Sans MS",Font.BOLD,18));     
	   	 	     AddPlane.add(AddPlaneDeplabel);
	   	 	                
	   	 	                JTextField  AddPlaneDepfield = new JTextField();
	   	 	               AddPlaneDepfield.setBounds(361, 190, 200, 20);
	   	 	           AddPlane.add( AddPlaneDepfield);    
	   	 	           ////////////////////////////////////////////////  ///////////////////////////////////////////////
	   	 		           
	   	 		            JLabel AddPlaneArrlabel = new JLabel("Enter Arrival:");
	   	 		        AddPlaneArrlabel.setBounds(200, 230, 150, 35);
	   	 		    AddPlaneArrlabel.setFont(new Font("Comic Sans MS",Font.BOLD,18));     
	   	 		           AddPlane.add(AddPlaneArrlabel);
	   	 		              
	   	 		               JTextField AddPlaneArrfield = new JTextField();
	   	 		           AddPlaneArrfield.setBounds(339, 240, 200, 20);
	   	 		          AddPlane.add(AddPlaneArrfield);    
	   	 		           ////////////////////////////////////////////////  ///////////////////////////////////////////////
	   	 			           
	   	 			             JLabel AddPlaneSeatslabel = new JLabel("No. of Seats:");
	   	 			         AddPlaneSeatslabel.setBounds(200, 280, 200, 35);
	   	 			     AddPlaneSeatslabel.setFont(new Font("Comic Sans MS",Font.BOLD,18));    
	   	 			       AddPlane.add(AddPlaneSeatslabel);
	   	 			                
	   	 			                JTextField AddPlaneSeatsfield = new JTextField();
	   	 			            AddPlaneSeatsfield.setBounds (340, 287, 200, 20);
	   	 			           AddPlane.add(AddPlaneSeatsfield);    
	   	 			           ////////////////////////////////////////////////  ///////////////////////////////////////////////
	   	 				           
	   	 			             JLabel AddPlaneDatelabel = new JLabel("Enter Date:");
	   	 			         AddPlaneDatelabel.setBounds(200, 330, 200, 35); 
	   	 			     AddPlaneDatelabel.setFont(new Font("Comic Sans MS",Font.BOLD,18));        
	   	 				   AddPlane.add(AddPlaneDatelabel);
	   	 				                
	   	 				                
	   	 				                JTextField AddPlaneDatefield = new JTextField();
	   	 				            AddPlaneDatefield.setBounds(325, 338, 200, 20);
	   	 				           AddPlane.add(AddPlaneDatefield);    
	                  
	                  /////////////Adding Buttons/////////////////
	   	 				           JButton AddPlaneConfirmButton = new JButton("CONFIRM");
	   	 				       AddPlaneConfirmButton.setBounds(260,433,160,30);
	   	 				   AddPlaneConfirmButton.setFont(new Font("Comic Sans MS",Font.BOLD,16));      
	   	 				AddPlaneConfirmButton.setBackground(new Color(115, 38, 77));
	   	 			AddPlaneConfirmButton.setFocusable(false);
		                             AddPlane.add(AddPlaneConfirmButton);
	                  
	                  
	                  
	                  
	                  
	                  //////////////////////////////// adding frames panels/////////////////////
	                  AddPlane.add(AddPlaneTitle);
	                  AddPlane.add(AddPlaneTitle2);
                          JPanel Adminlogin = new JPanel();
	                  Adminlogin.setLayout(null);
	                  Adminlogin.setBackground(new Color(38, 115, 106));
	                  
	                  JLabel AdminloginTitle = new JLabel("Admin Login");
	                  AdminloginTitle.setBounds(200,0,250,100);
	                  AdminloginTitle.setFont(new Font("Comic Sans MS",Font.BOLD,35));
	                  JLabel AdminloginTitle2 = new JLabel("______________________");
	                  AdminloginTitle2.setBounds(190,10,250,100);
	                  AdminloginTitle2.setFont(new Font("Comic Sans MS",Font.BOLD,15));
	                  
	                  ///////////////////////// TEXT Fields and labels for Admin Login////////////////////////

	                  JLabel AdminNamelabel = new JLabel("Admin Username:");
	                  AdminNamelabel.setBounds(130, 130, 200, 35);
	                  AdminNamelabel.setFont(new Font("Comic Sans MS",Font.BOLD,21));
	                  Adminlogin.add(AdminNamelabel);
	                  
	                  
	                  JTextField AdminNamefield = new JTextField();
	                  AdminNamefield.setBounds(310, 140, 200, 25);
		                Adminlogin.add(AdminNamefield); 
	                  
	         ///////////////       ///////////////////////////////////////////// /////////////// 
		                JLabel AdminPasslabel = new JLabel("Enter Password :");
		                AdminPasslabel.setBounds(130, 230, 200, 35);
		                AdminPasslabel.setFont(new Font("Comic Sans MS",Font.BOLD,21));
		                  Adminlogin.add(AdminPasslabel);
		                  
		                  
		                  JTextField AdminPassfield = new JTextField();
		                  AdminPassfield.setBounds(310, 240, 200, 25);
			                Adminlogin.add(AdminPassfield); 
	                  
	                  ///////////////////// LOG IN Button //////////////////////////////
			                
			                JButton AdminLoginButton = new JButton("LOG IN");
			                  AdminLoginButton.setBounds(260,400,160,30);
			                  AdminLoginButton.setFont(new Font("Comic Sans MS",Font.BOLD,16));      
			               AdminLoginButton.setBackground(new Color(102, 0, 255));
	                            AdminLoginButton.setFocusable(false);
	                             Adminlogin.add(AdminLoginButton);
	                  
	              
	                /////////////////Adding frames and panels////////////////////////  
	                  Adminlogin.add(AdminloginTitle);
	                  Adminlogin.add(AdminloginTitle2);
        
        
        admin.addActionListener(e->{
            
            home.setVisible(false);
            frame.add(Adminlogin);
        });
        AdminLoginButton.addActionListener(
        e->{
            Admin a = new Admin();
            System.out.println(AdminNamefield.getText());
            System.out.println(a.getID());
            System.out.println(AdminPassfield.getText());
            System.out.println(a.getPass());
            int countA=1;
            int countB=1;
            
            if(a.getID().equals(AdminNamefield.getText())){
                countA=2;
            }
            if(AdminPassfield.getText().equals(a.getPass()))
            {
                countB=2;
            }
            System.out.println("count A "+countA);
            System.out.println("count B "+countB);
            if(countA==2 && countB==2)
            {
                Adminlogin.setVisible(false);
                frame.add(adset);
            }
            else{
                  JOptionPane.showMessageDialog(null,"Incorrect Username or Password","warning",JOptionPane.PLAIN_MESSAGE);
            }
        }

        );
        adpln.addActionListener(e->{
            
            adset.setVisible(false);
            frame.add(AddPlane);
            
        });
        
        rvpln.addActionListener(e->{
            
            adset.setVisible(false);
            frame.add(removeplane);
          });
        
        AddPlaneConfirmButton.addActionListener(e->{
            Admin b= new Admin();
            b.addPlanes(AddPlaneIDfield.getText(), AddPlaneArrfield.getText(),AddPlaneDepfield.getText(),new Integer(AddPlaneSeatsfield.getText()),AddPlaneDatefield.getText());
            frame.dispose();
        });
        
        
        removeplaneButton.addActionListener(e->{
            try {
                Admin c = new Admin();
                c.removePlanes(removeplaneIdfield.getText(), removeplaneDeparturefield.getText(), removeplaneArrivalfield.getText());
                frame.dispose();
            } catch (IOException ex) {
                Logger.getLogger(GUICLASS.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        });
        
        
        
        
        
        
        
        
        
        
        
        
        
        //-------------------------------PANEL3 STARTS HERE--------------------------------
        //////////////////////SIGN UP FORM PANEL//////////////////////
               JPanel signup = new JPanel();
               signup.setLayout(null);
               signup.setBackground(new Color(179,0,59));
               JLabel signupTitle = new JLabel("Sign Up");
               signupTitle.setBounds(200,0,250,100);
               signupTitle.setFont(new Font("Comic Sans MS",Font.BOLD,48));
              
	           
	           JLabel signupTitle2 = new JLabel("___________________");
	           signupTitle2.setBounds(190,10,250,100);
	           signupTitle2.setFont(new Font("Comic Sans MS",Font.BOLD,15));
	           signup.add(signupTitle2);
	            signup.setVisible(true);
	           ///////////////////////////////////////////////
	           /////////////// Text Fields and Labels for Sign Up Form.
	           JLabel signupNamelabel = new JLabel("Enter Name: ");
	           signupNamelabel.setBounds(200, 130, 90, 35);
	                signup.add(signupNamelabel);
	                signupNamelabel.setFont(new Font("Comic Sans MS",Font.BOLD,12));
	                JTextField signupNamefield = new JTextField();
	                signupNamefield.setBounds(280, 140, 200, 20);
	                signup.add(signupNamefield);    
	                ///////////////////////////////////////////////
	 	           
	 	           JLabel signupAgelabel = new JLabel("Enter Age: ");
	 	          signupAgelabel.setBounds(200, 180, 80, 35);
	 	         signupAgelabel.setFont(new Font("Comic Sans MS",Font.BOLD,12));     
	 	          signup.add(signupAgelabel);
	 	                
	 	                JTextField signupAgefield = new JTextField();
	 	               signupAgefield.setBounds(280, 190, 200, 20);
	 	                signup.add(signupAgefield);    
	 	           ////////////////////////////////////////////////  ///////////////////////////////////////////////
	 		           
	 		           JLabel signupContactlabel = new JLabel("Enter Contact Number: ");
	 		          signupContactlabel.setBounds(200, 230, 150, 35);
	 		               signupContactlabel.setFont(new Font("Comic Sans MS",Font.BOLD,12));     
	 		              signup.add(signupContactlabel);
	 		              
	 		               JTextField signupContactfield = new JTextField();
	 		              signupContactfield.setBounds(339, 240, 200, 20);
	 		               signup.add(signupContactfield);    
	 		           ////////////////////////////////////////////////  ///////////////////////////////////////////////
	 			           
	 			             JLabel signupEmaillabel = new JLabel("Enter E-mail: ");
	 			            signupEmaillabel.setBounds(200, 350, 100, 35);
	 			           signupEmaillabel.setFont(new Font("Comic Sans MS",Font.BOLD,12));    
	 			            signup.add(signupEmaillabel);
	 			                
	 			                JTextField signupEmailfield = new JTextField();
	 			               signupEmailfield.setBounds (282, 360, 200, 20);
	 			                signup.add(signupEmailfield);    
	 			           ////////////////////////////////////////////////  ///////////////////////////////////////////////
	 				           
	 				         JLabel signupAddresslabel = new JLabel("Enter Address: ");
	 				        signupAddresslabel.setBounds(200, 300, 110, 35); 
	 				       signupAddresslabel.setFont(new Font("Comic Sans MS",Font.BOLD,12));        
	 				        signup.add(signupAddresslabel);
	 				                
	 				                
	 				                JTextField signupAddressfield = new JTextField();
	 				               signupAddressfield.setBounds(291, 310, 200, 20);
	 				                signup.add(signupAddressfield);    
	 				           ////////////////////////////////////////////////***/
	                         
	 				        JLabel signupPasswordlabel = new JLabel("Enter Password:");
	 				       signupPasswordlabel.setBounds(200,400,120,35);
	 				      signupPasswordlabel.setFont(new Font("Comic Sans MS",Font.BOLD,12)); 
	 				       signup.add(signupPasswordlabel);

	                       JTextField signupPasswordfield = new JTextField();
	                       signupPasswordfield.setBounds(300,410,150,20);
	                       signup.add(signupPasswordfield);
	                        
	           ////////////////////////////////////  Sign up button/////////////
	                           JButton signupButton = new JButton("Create Account");
	                           signupButton.setBounds(355,490,160,30);
	                            signupButton.setFont(new Font("Comic Sans MS",Font.BOLD,16));      
	                             signupButton.setBackground(new Color(255,0,43));
	                            
	                             signup.add(signupButton);
	                       ///////////////////////////////////////////// 
	                             signup.add(signupTitle);

        //-------------------------------PANEL3 ENDS HERE--------------------------------
        //-------------------------------PANEL4 STARTS HERE--------------------------------
        JPanel dashboard = new JPanel();	       
		       
        //-------------------------------PANEL4 ENDS HERE--------------------------------
        //jiyon
         //-------------------------------PANEL5 STARTS HERE--------------------------------
         
	    JPanel LoginPanel = new JPanel();
            
	    LoginPanel.setLayout(null);
	    JLabel jjj = new JLabel("Login Panel");
	    jjj.setBounds(180,50,350,70);
	    jjj.setFont(new Font("Comic Sans MS",Font.BOLD,50));
        LoginPanel.add(jjj);
	    
	    JLabel UserName = new JLabel("UserName");
	    UserName.setBounds(50,250,200,25);
	    UserName.setFont(new Font("Comic Sans MS",Font.BOLD,20));
        LoginPanel.add(UserName);
	    
        JTextField UserNameField=new JTextField(30);
        UserNameField.setBounds(160,250,200,25);
        LoginPanel.add(UserNameField);
	    
        JLabel Password = new JLabel("Password");
        Password.setBounds(50,290,200,25);
        Password.setFont(new Font("Comic Sans MS",Font.BOLD,20));
        LoginPanel.add(Password);
        
        JPasswordField PasswordField=new JPasswordField();
        PasswordField.setEchoChar('*');
        PasswordField.setBounds(160,290,200,25);
    	LoginPanel.add(PasswordField);
        
    	JButton Loging =new JButton("Login");
    	Loging.setBounds(100,370,150,30);
    	Loging.setFont(new Font("Comic Sans MS",Font.BOLD,20));
    	Loging.setFocusable(false);
    	LoginPanel.add(Loging);
    	
    	
    	LoginPanel.setBackground(new Color(202, 252, 3));

        //-------------------------------PANEL5 ENDS HERE--------------------------------
         //-------------------------------PANEL6 STARTS HERE--------------------------------
          JPanel UserDetails = new JPanel();
          
	    UserDetails.setLayout(null);
	    JLabel title = new JLabel("HOMEPAGE");
            title.setFont(new Font("Comic Sans MS",Font.BOLD,50));
            title.setBounds(150,0,300,100);
            UserDetails.add(title);
	    JButton Dashboard =new JButton("My Dashboard");
	    Dashboard.setBounds(50,250,200,35);
	    Dashboard.setFont(new Font("Comic Sans MS",Font.BOLD,20));
	    Dashboard.setFocusable(false);
	    Dashboard.setBackground(new Color(187, 184, 222));
	    UserDetails.add(Dashboard);
	    
	    JButton Confirm =new JButton("Confirm Ticket");
	    Confirm.setBounds(300,250,200,35);
	    Confirm.setFont(new Font("Comic Sans MS",Font.BOLD,20));
	    Confirm.setFocusable(false);
	    Confirm.setBackground(new Color(187, 184, 222));
	    UserDetails.add(Confirm);
	    
	    UserDetails.setBackground(new Color(227, 93, 162));
         
         
         
          //-------------------------------PANEL6 ENDS HERE--------------------------------
           //-------------------------------PANEL7 STARTS HERE--------------------------------
           JPanel UserPanel = new JPanel();
  
        UserPanel.setLayout(null);
        
        JLabel UserLabel = new JLabel("User Panel");
        UserLabel.setBounds(180,50,250,80);
        UserLabel.setOpaque(true);
        UserLabel.setBackground(new Color(198, 207, 178));
        UserLabel.setForeground(new Color(240, 24, 24));
        
        UserLabel.setFont(new Font("Comic Sans MS",Font.BOLD,48));
        UserPanel.add(UserLabel);
        JButton Existing = new JButton("Existing");
        Existing.setFocusable(false);
        Existing.setFont(new Font("Comic Sans MS",Font.BOLD,20));
        Existing.setBounds(150, 320, 120, 50);
        Existing.setBackground(new Color(247, 129, 74));
        
        JButton New = new JButton("New");
        New.setBounds(350, 320, 120, 50);
        New.setFont(new Font("Comic Sans MS",Font.BOLD,20));
        New.setBackground(new Color(247, 129, 74));
        New.setFocusable(false);
        
        
        

        
        UserPanel.setBackground(new Color(39, 242, 181));
        UserPanel.add(Existing);
        UserPanel.add(New);
           
           //-------------------------------PANEL7 ENDS HERE--------------------------------
           
           //-------------------------------PANEL8 STARTS HERE--------------------------------
           JPanel destinsel = new JPanel();

           destinsel.setLayout(null);
           
           JLabel where = new JLabel("Enter Departure and Arrival Destination");
           where.setBounds(25,0,600,100);
           where.setFont(new Font("Comic Sans MS",Font.BOLD,30));
           where.setForeground(Color.cyan);
           destinsel.add(where);
       
           
           String[] d = {"Dhaka","Sylhet","Chittagong"};
           String[] a =  {"Dhaka","Sylhet","Chittagong"};
           JComboBox d1 = new JComboBox(d);
           d1.setFont(new Font("Comic Sans MS",Font.BOLD,30));
           d1.setBounds(40,120,200,200);
            JComboBox a1 = new JComboBox(a);
           a1.setBounds(400,120,200,200);
           a1.setFont(new Font("Comic Sans MS",Font.BOLD,30));

           //labelgetset
           
           JLabel dget = new JLabel();
           JLabel aget = new JLabel();
           d1.addActionListener(e -> {
            if(d1.getSelectedItem()=="Dhaka"){
                dget.setText("Dhaka");              
            }else if(d1.getSelectedItem()=="Sylhet"){
                dget.setText("Sylhet");
                //System.out.println("sylhet kaj kore");
            }else{
                dget.setText("Chittagong");
            }               
           }
           );
           
           a1.addActionListener(e -> {
            if(a1.getSelectedItem()=="Dhaka"){
                aget.setText("Dhaka");
            }else if(a1.getSelectedItem()=="Sylhet"){
                aget.setText("Sylhet");
            }else{
                aget.setText("Chittagong");
            }               
           });

           destinsel.add(a1);
           destinsel.add(d1);
           String nam = dget.getText()+aget.getText()+".txt";
           JButton fndflgt = new JButton("FIND FLIGHTS");
           fndflgt.setBounds(170,400,300,50);
           fndflgt.setFocusable(false);
           fndflgt.setFont(new Font("Comic Sans MS",Font.BOLD,30));
           destinsel.add(fndflgt);
           JPanel airinfo = new JPanel();
          
           destinsel.setBackground(Color.red);
           //-------------------------------PANEL8 ENDS HERE--------------------------------

           //________________________________BUTTON FUNCTIONS________________________________
         
           user.addActionListener(e->{ 
           home.setVisible(false);
           frame.add(destinsel);
           
           });
           

//           //PANEL 2
//          
        JPanel airinfosub1 = new JPanel(); // flow layout
        airinfosub1.setLayout(new FlowLayout(FlowLayout.LEFT,30,15));
        airinfosub1.setBackground(new Color(52, 161, 235));
        JPanel airinfosub2 = new JPanel();// box layout
        airinfosub2.setBackground(new Color(31, 126, 191));
        airinfosub2.setLayout(new BoxLayout(airinfosub2,BoxLayout.Y_AXIS));
        JPanel airinfosub3 = new JPanel();
        airinfosub3.setLayout(new FlowLayout(FlowLayout.LEFT,80,15));
        airinfosub3.setBackground(new Color(52, 161, 235));
        JPanel airinfosub4 = new JPanel();
        airinfosub4.setLayout(new FlowLayout(FlowLayout.LEFT,40,15));
        airinfosub4.setBackground(new Color(52, 161, 235));
        JPanel airinfosub5 = new JPanel();
        airinfosub5.setLayout(new FlowLayout(FlowLayout.CENTER));

        
        //subpanel 1
        
        JLabel depart = new JLabel("Departure");
        depart.setFont(new Font("Comic Sans MS",Font.BOLD,25));
        JLabel arriv = new JLabel("Arrival");
        arriv.setFont(new Font("Comic Sans MS",Font.BOLD,25));
        JLabel uid = new JLabel("Unique-ID");
        uid.setFont(new Font("Comic Sans MS",Font.BOLD,25));
        JLabel seat = new JLabel("Seats");
        seat.setFont(new Font("Comic Sans MS",Font.BOLD,25));
        JLabel date = new JLabel("Date");
        date.setFont(new Font("Comic Sans MS",Font.BOLD,25));
        
        airinfosub1.add(depart);
        airinfosub1.add(arriv);
        airinfosub1.add(uid);
        airinfosub1.add(seat);
        airinfosub1.add(date);
        //sub panel 2
        JTextArea airlinefile = new JTextArea();    
    String tkn = "";
 
  
    Scanner input2 = new Scanner(System.in);
        frame.add(home);
        frame.setVisible(true);
        frame.setResizable(false);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        System.out.println("Enter confirm on console");
        String p = input2.next();
       fndflgt.addActionListener(e ->{
            destinsel.setVisible(false);
            frame.add(airinfo);
        });
     String filername = dget.getText()+aget.getText()+".txt";
    Scanner input = new Scanner(new File(filername)).useDelimiter(",\\s*");

    ArrayList<String> temps = new ArrayList<String>();
    System.out.println(tkn);
    // while loop
    while (input.hasNext()) {
      // find next line
      tkn = input.next();
      //adding string to arraylist
      temps.add(tkn);
    }
    input.close();

    String[] tA = temps.toArray(new String[0]);


    airlinefile.setText(tA[0]);
    airlinefile.setBackground(new Color(52, 161, 235));

//////////////
        airlinefile.setFont(new Font("Comic Sans MS",Font.BOLD,23));
        airlinefile.setEditable(false);
        airinfosub2.add(airlinefile);
        airinfo.add(airinfosub1);
        airinfo.add(airinfosub2);
        
        
        JLabel depart1 = new JLabel("Departure");
        depart1.setFont(new Font("Comic Sans MS",Font.BOLD,15));
        JLabel arriv1 = new JLabel("Arrival");
        arriv1.setFont(new Font("Comic Sans MS",Font.BOLD,15));
        JLabel uid1 = new JLabel("Unique-ID");
        uid1.setFont(new Font("Comic Sans MS",Font.BOLD,15));
        JLabel seat1 = new JLabel("Purchase QTY");
        seat1.setFont(new Font("Comic Sans MS",Font.BOLD,15));
        JLabel date1 = new JLabel("Date");
        date1.setFont(new Font("Comic Sans MS",Font.BOLD,15));
        //------------------------------------TEXTFIELDS------------------------------
        JTextField depptxt = new JTextField();
        depptxt.setPreferredSize( new Dimension( 100, 24 ) );
        JTextField arrtxt = new JTextField();
        arrtxt.setPreferredSize( new Dimension( 100, 24 ) );
        JTextField uidtxt = new JTextField();
        uidtxt.setPreferredSize( new Dimension( 100, 24 ) );
        JTextField seattxt = new JTextField();
        seattxt.setPreferredSize( new Dimension( 100, 24 ) );
        JTextField dattxt = new JTextField();
        dattxt.setPreferredSize( new Dimension( 100, 24 ) );

        
        //------------------------------------TEXTFIELDS------------------------------
        JButton book = new JButton("BOOK A FLIGHT!");
        book.setPreferredSize(new Dimension( 200, 50 ));
        book.setFont(new Font("Comic Sans MS",Font.BOLD,16));
        book.setBackground(new Color(191, 31, 154));
        book.setFocusable(false);
        airinfo.setBackground(new Color(31, 126, 191));
        airinfosub3.add(depart1);
        airinfosub4.add(depptxt);
        airinfosub3.add(arriv1);
        airinfosub4.add(arrtxt);
        airinfosub3.add(uid1);
        airinfosub4.add(uidtxt);
        airinfosub3.add(seat1);
        airinfosub4.add(seattxt);
        airinfosub3.add(date1);
        airinfosub4.add(dattxt);
        airinfosub5.add(book);
        airinfo.add(airinfosub3);
        airinfo.add(airinfosub4);
        airinfo.add(airinfosub5);
        
        
        
        //__________________________________________________________________________________
        //panel2 ends here      
        
        book.addActionListener( e-> {
            deppobtained = depptxt.getText();
            arrobtained = arrtxt.getText();
            seatsobtained = new Integer(seattxt.getText());
            idobtained= uidtxt.getText();
            dateobtained = dattxt.getText();
            
            airinfo.setVisible(false);
            frame.add(UserPanel);
            
        });
        
        New.addActionListener( e-> {
            UserPanel.setVisible(false);
            frame.add(signup);
        }
             
    );
    
        signupButton.addActionListener(
        e->{
            try {
                User u = new User();
                u.setName(signupNamefield.getText());
                u.setAge(new Integer(signupAgefield.getText()));
                u.setContact(signupContactfield.getText());
                u.setAddress(signupAddressfield.getText());
                u.setEmail(signupEmailfield.getText());
                u.setPass(signupPasswordfield.getText());
                
                FileHandler chandler = new FileHandler();
                String f1 = u.getName()+".txt";
                String f1content = u.getName();
                
                chandler.CreateAppend(f1, f1content);
                String f2 = u.getName()+"pass"+".txt";
                String f2content = u.getPass();
                chandler.CreateAppend(f2, f2content);
                
                String ticketfile = u.getName()+"ticket"+".txt";
                Ticket tk = new Ticket();
                tk.setDep(deppobtained);
                tk.setArr(arrobtained);
                tk.setStz(seatsobtained);
                tk.setDat(dateobtained);
                String ticketinfo = deppobtained+" "+arrobtained+" "+String.valueOf(tk.getPrice())+" "+String.valueOf(seatsobtained)+" "+dateobtained;
                try {
                    tk.addTickets(deppobtained, arrobtained, idobtained, seatsobtained, dateobtained);
                } catch (IOException ex) {
                    Logger.getLogger(GUICLASS.class.getName()).log(Level.SEVERE, null, ex);
                }
                chandler.CreateAppend(ticketfile, ticketinfo);
                signup.setVisible(false);
                /// making subpanels 0, 1,2,3
                JPanel dashboardsub0 = new JPanel();
                dashboardsub0.setLayout(new FlowLayout(FlowLayout.LEADING,700,5));
                dashboardsub0.setBackground(new Color(153, 0, 77));
                JPanel dashboardsub1 = new JPanel(); // flow layout
                dashboardsub1.setLayout(new FlowLayout(FlowLayout.LEFT,20,15));
                dashboardsub1.setBackground(new Color(153, 51, 102));
                JPanel dashboardsub2 = new JPanel();// box layout
                dashboardsub2.setBackground(new Color(153, 51, 102));
                dashboardsub2.setLayout(new BoxLayout(dashboardsub2,BoxLayout.Y_AXIS));
                JPanel dashboardsub3 = new JPanel();
                dashboardsub3.setLayout(new FlowLayout(FlowLayout.CENTER));
                
                // subpanel 0
                JLabel dashboardLabel = new JLabel("My Dashboard");
                dashboardLabel.setBounds(100, 0, 100, 70);
                dashboardLabel.setFont(new Font("Comic Sans MS",Font.BOLD,48));
                dashboardsub0.add(dashboardLabel);
                
                //subpanel 1
                
                JLabel depart2 = new JLabel("Departure");
                depart2.setFont(new Font("Comic Sans MS",Font.BOLD,25));
                JLabel arriv2 = new JLabel("Arrival");
                arriv2.setFont(new Font("Comic Sans MS",Font.BOLD,25));
                JLabel uid2 = new JLabel("Price");
                uid2.setFont(new Font("Comic Sans MS",Font.BOLD,25));
                JLabel seat2 = new JLabel("TicketQty");
                seat2.setFont(new Font("Comic Sans MS",Font.BOLD,25));
                JLabel date2 = new JLabel("Date");
                date2.setFont(new Font("Comic Sans MS",Font.BOLD,25));
                JLabel price = new JLabel("Price");
                price.setFont(new Font("Comic Sans MS",Font.BOLD,25));
                dashboardsub1.add(depart2);
                dashboardsub1.add(arriv2);
                dashboardsub1.add(uid2);
                dashboardsub1.add(seat2);
                dashboardsub1.add(date2);
                dashboardsub1.add(price);
                //sub panel 2
                JTextArea dashboardfile = new JTextArea();
                String tkn1 = "";
                Scanner input1 = new Scanner(new File(ticketfile)).useDelimiter(",\\s*");
                
                
                ArrayList<String> temps1 = new ArrayList<String>();
                
                // while loop
                while (input1.hasNext()) {
                    // find next line
                    tkn1 = input1.next();
                    //adding string to arraylist
                    temps1.add(tkn1);
                }
                input1.close();
                
                String[] tA1 = temps1.toArray(new String[0]);
                
                dashboardfile.setText(tA1[0]);
                
                dashboardfile.setFont(new Font("Comic Sans MS",Font.BOLD,35));
                dashboardfile.setEditable(false);
                dashboardsub2.add(dashboardfile);
                
                
                // Subpanel 3 : Button
                JButton dashboardButton = new JButton("Sign Out");
                dashboardButton.setPreferredSize(new Dimension( 200, 50 ));
                dashboardButton.setFont(new Font("Comic Sans MS",Font.BOLD,16));
                dashboardButton.setBackground(new Color(179, 0, 89));
                dashboardButton.setFocusable(false);
                
                dashboard.setBackground(new Color(96, 32, 64));
                
                // adding frames, subpanels
                dashboard.add(dashboardsub0);
                dashboard.add(dashboardsub1);
                dashboard.add(dashboardsub2);
                dashboardsub3.add(dashboardButton);
                dashboard.add(dashboardsub3);
                frame.add(dashboard);
                dashboardButton.addActionListener(
                e2->{
                frame.dispose();
            
                }
        
                );
                
            } catch (FileNotFoundException ex) {
                Logger.getLogger(GUICLASS.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }
        );
           
        Existing.addActionListener(
        e-> {
        
        UserPanel.setVisible(false);
        frame.add(LoginPanel);
        }
        );
           
        Loging.addActionListener(
        e->{
            int count1 = 1;
            int count2=1;
            FileReader fr = null;
            
                // UserNameField
                // PasswordField
                
                String f1 = UserNameField.getText()+".txt";
                String f2 = UserNameField.getText()+"pass"+".txt";
                try{
                fr = new FileReader(f1);
                BufferedReader br=new BufferedReader(fr);
                String line;
                
                while((line=br.readLine())!=null)
                {
                    if(line.equals(UserNameField.getText())){
                        count1=5;
                        break;
                    } else{
                        
                    }
                }   
                fr.close();
                }
                catch(FileNotFoundException ex){
                    System.out.println(" file paitese na ");
                }
                catch(IOException e1){
                    System.out.println(" ki jani error dicche ");
                }
                try{
                FileReader fr1 = new FileReader(f2);
                BufferedReader br1=new BufferedReader(fr1);
                String line1;
                while((line1=br1.readLine())!=null)
                {
                    if(line1.equals(PasswordField.getText())){
                        count2=5;
                        break;
                    } else{
                        
                    }
                } 
                fr1.close();
                }
                catch(FileNotFoundException ex){
                    System.out.println(" file paitese na abar ");
                }
                catch(IOException e1){
                    System.out.println(" ki jani error dicche abar ");
                }
                
            
         
            if(count1==5 &&  count2==5){
                LoginPanel.setVisible(false);
                frame.add(UserDetails);
                currentuser =UserNameField.getText();
            }
            else{
                JOptionPane.showMessageDialog(null,"Incorrect Username or Password","warning",JOptionPane.PLAIN_MESSAGE);
            }
            
        }
        );
        
        Dashboard.addActionListener(
        e-> {
            try {
                UserDetails.setVisible(false);
                String ticketfile = currentuser+"ticket"+".txt";
                
                /// making subpanels 0, 1,2,3
                JPanel dashboardsub0 = new JPanel();
                dashboardsub0.setLayout(new FlowLayout(FlowLayout.LEADING,700,5));
                dashboardsub0.setBackground(new Color(153, 0, 77));
                JPanel dashboardsub1 = new JPanel(); // flow layout
                dashboardsub1.setLayout(new FlowLayout(FlowLayout.LEFT,20,15));
                dashboardsub1.setBackground(new Color(153, 51, 102));
                JPanel dashboardsub2 = new JPanel();// box layout
                dashboardsub2.setBackground(new Color(153, 51, 102));
                dashboardsub2.setLayout(new BoxLayout(dashboardsub2,BoxLayout.Y_AXIS));
                JPanel dashboardsub3 = new JPanel();
                dashboardsub3.setLayout(new FlowLayout(FlowLayout.CENTER));
                
                // subpanel 0
                JLabel dashboardLabel = new JLabel("My Dashboard");
                dashboardLabel.setBounds(100, 0, 100, 70);
                dashboardLabel.setFont(new Font("Comic Sans MS",Font.BOLD,48));
                dashboardsub0.add(dashboardLabel);
                
                //subpanel 1
                
                JLabel depart2 = new JLabel("Departure");
                depart2.setFont(new Font("Comic Sans MS",Font.BOLD,25));
                JLabel arriv2 = new JLabel("Arrival");
                arriv2.setFont(new Font("Comic Sans MS",Font.BOLD,25));
                JLabel uid2 = new JLabel("Price");
                uid2.setFont(new Font("Comic Sans MS",Font.BOLD,25));
                JLabel seat2 = new JLabel("TicketQty");
                seat2.setFont(new Font("Comic Sans MS",Font.BOLD,25));
                JLabel date2 = new JLabel("Date");
                date2.setFont(new Font("Comic Sans MS",Font.BOLD,25));
                JLabel price = new JLabel("Price");
                price.setFont(new Font("Comic Sans MS",Font.BOLD,25));
                dashboardsub1.add(depart2);
                dashboardsub1.add(arriv2);
                dashboardsub1.add(uid2);
                dashboardsub1.add(seat2);
                dashboardsub1.add(date2);
                dashboardsub1.add(price);
                //sub panel 2
                JTextArea dashboardfile = new JTextArea();
                String tkn1 = "";
                Scanner input1 = new Scanner(new File(ticketfile)).useDelimiter(",\\s*");
                
                
                ArrayList<String> temps1 = new ArrayList<String>();
                
                // while loop
                while (input1.hasNext()) {
                    // find next line
                    tkn1 = input1.next();
                    //adding string to arraylist
                    temps1.add(tkn1);
                }
                input1.close();
                
                String[] tA1 = temps1.toArray(new String[0]);
                
                dashboardfile.setText(tA1[0]);
                
                dashboardfile.setFont(new Font("Comic Sans MS",Font.BOLD,35));
                dashboardfile.setEditable(false);
                dashboardsub2.add(dashboardfile);
                
                
                // Subpanel 3 : Button
                JButton dashboardButton = new JButton("Sign Out");
                dashboardButton.setPreferredSize(new Dimension( 200, 50 ));
                dashboardButton.setFont(new Font("Comic Sans MS",Font.BOLD,16));
                dashboardButton.setBackground(new Color(179, 0, 89));
                dashboardButton.setFocusable(false);
                
                dashboard.setBackground(new Color(96, 32, 64));
                
                // adding frames, subpanels
                dashboard.add(dashboardsub0);
                dashboard.add(dashboardsub1);
                dashboard.add(dashboardsub2);
                dashboardsub3.add(dashboardButton);
                dashboard.add(dashboardsub3);
                
                frame.add(dashboard);
                dashboardButton.addActionListener(
                e2->{
                frame.dispose();
            
                }
        
                );
            } catch (FileNotFoundException ex) {
                Logger.getLogger(GUICLASS.class.getName()).log(Level.SEVERE, null, ex);
            }
                
        
        }
        );
        Confirm.addActionListener(
        e->{
            UserDetails.setVisible(false);
            try {
                FileHandler chandler = new FileHandler();
                String ticketfile = currentuser+"ticket"+".txt";
                Ticket tk = new Ticket();
                tk.setDep(deppobtained);
                tk.setArr(arrobtained);
                tk.setStz(seatsobtained);
                tk.setDat(dateobtained);
                String ticketinfo = deppobtained+" "+arrobtained+" "+String.valueOf(tk.getPrice())+" "+String.valueOf(seatsobtained)+" "+dateobtained;
                try {
                    tk.addTickets(deppobtained, arrobtained, idobtained, seatsobtained, dateobtained);
                } catch (IOException ex) {
                    Logger.getLogger(GUICLASS.class.getName()).log(Level.SEVERE, null, ex);
                }
                chandler.CreateAppend(ticketfile, ticketinfo);
                signup.setVisible(false);
                /// making subpanels 0, 1,2,3
                JPanel dashboardsub0 = new JPanel();
                dashboardsub0.setLayout(new FlowLayout(FlowLayout.LEADING,700,5));
                dashboardsub0.setBackground(new Color(153, 0, 77));
                JPanel dashboardsub1 = new JPanel(); // flow layout
                dashboardsub1.setLayout(new FlowLayout(FlowLayout.LEFT,20,15));
                dashboardsub1.setBackground(new Color(153, 51, 102));
                JPanel dashboardsub2 = new JPanel();// box layout
                dashboardsub2.setBackground(new Color(153, 51, 102));
                dashboardsub2.setLayout(new BoxLayout(dashboardsub2,BoxLayout.Y_AXIS));
                JPanel dashboardsub3 = new JPanel();
                dashboardsub3.setLayout(new FlowLayout(FlowLayout.CENTER));
                
                // subpanel 0
                JLabel dashboardLabel = new JLabel("My Dashboard");
                dashboardLabel.setBounds(100, 0, 100, 70);
                dashboardLabel.setFont(new Font("Comic Sans MS",Font.BOLD,48));
                dashboardsub0.add(dashboardLabel);
                
                //subpanel 1
                
                JLabel depart2 = new JLabel("Departure");
                depart2.setFont(new Font("Comic Sans MS",Font.BOLD,25));
                JLabel arriv2 = new JLabel("Arrival");
                arriv2.setFont(new Font("Comic Sans MS",Font.BOLD,25));
                JLabel uid2 = new JLabel("Price");
                uid2.setFont(new Font("Comic Sans MS",Font.BOLD,25));
                JLabel seat2 = new JLabel("TicketQty");
                seat2.setFont(new Font("Comic Sans MS",Font.BOLD,25));
                JLabel date2 = new JLabel("Date");
                date2.setFont(new Font("Comic Sans MS",Font.BOLD,25));
                JLabel price = new JLabel("Price");
                price.setFont(new Font("Comic Sans MS",Font.BOLD,25));
                dashboardsub1.add(depart2);
                dashboardsub1.add(arriv2);
                dashboardsub1.add(uid2);
                dashboardsub1.add(seat2);
                dashboardsub1.add(date2);
                dashboardsub1.add(price);
                //sub panel 2
                JTextArea dashboardfile = new JTextArea();
                String tkn1 = "";
                Scanner input1 = new Scanner(new File(ticketfile)).useDelimiter(",\\s*");
                
                
                ArrayList<String> temps1 = new ArrayList<String>();
                
                // while loop
                while (input1.hasNext()) {
                    // find next line
                    tkn1 = input1.next();
                    //adding string to arraylist
                    temps1.add(tkn1);
                }
                input1.close();
                
                String[] tA1 = temps1.toArray(new String[0]);
                
                dashboardfile.setText(tA1[0]);
                
                dashboardfile.setFont(new Font("Comic Sans MS",Font.BOLD,35));
                dashboardfile.setEditable(false);
                dashboardsub2.add(dashboardfile);
                
                
                // Subpanel 3 : Button
                JButton dashboardButton = new JButton("Sign Out");
                dashboardButton.setPreferredSize(new Dimension( 200, 50 ));
                dashboardButton.setFont(new Font("Comic Sans MS",Font.BOLD,16));
                dashboardButton.setBackground(new Color(179, 0, 89));
                dashboardButton.setFocusable(false);
                
                dashboard.setBackground(new Color(96, 32, 64));
                
                // adding frames, subpanels
                dashboard.add(dashboardsub0);
                dashboard.add(dashboardsub1);
                dashboard.add(dashboardsub2);
                dashboardsub3.add(dashboardButton);
                dashboard.add(dashboardsub3);
                frame.add(dashboard);
                dashboardButton.addActionListener(
                e2->{
                frame.dispose();
            
                }
        
                );
           
                
            } catch (FileNotFoundException ex) {
                Logger.getLogger(GUICLASS.class.getName()).log(Level.SEVERE, null, ex);
            }

        }     
        );
  
	                  
                          
                         
      
        
}
       
}