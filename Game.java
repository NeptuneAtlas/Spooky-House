
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.util.Scanner;
public class Game {

    public static void main(String[] args) {
   	 //private static String Name;
   	 int end = 0;
   	 //String Name;
   	 String Direction, newDirection;
   	 String Chest = "Chest", Refrigerator = "Refrigerator", Broom = "Broom", Dusty_recipe_box = "Dusty recipe box", Cabinet = "Cabinet", Mirror = "Mirror",
   	 Shower = "Shower", Candelabra = "Candelabra", Rocking_Chair = "Rocking Chair", Window = "Window", Doll_House = "Doll House", Dresser = "Dresser",
    	Jewelry_Box = "Jewelry Box", Intricate_Oil_Lamp = "Intricate Oil Lamp";
   	 
   	 // bookbag can hold total of 5 items
     	Scanner scnr = new Scanner(System.in);
     	String hmm = new String("yes or no");// not super useful at the moment
     	Logic greet = new Logic();
    	greet.mapHouse();
Name = JOptionPane.showInputDialog("Hello, what is your name?");    	 
JOptionPane.showMessageDialog(null, "Welcome to the spooky haunted house " + Name + "!");
greet.greeting();
direction = JOptionPane.showInputDialog(Name + ", would you like to go to the living room, dinning room, or up the stairs?");
//direction = scnr.nextLine();
switch(direction) { //switch statement used here because "nested if statements" are tricky...
case "upstairs":
greet.choice5();
direction = JOptionPane.showInputDialog("Would you like to search room, enter the Master Bathroom, bedroom 1, or bedroom2?");

//direction = OptionPane.showConfirmDialog("ok pal");

//direction = scnr.nextLine(); THIS IS IMPORTANT



    if(direction.compareTo("bedroom 1") == 0) {
   	 greet.mapBedroom1();
   	 JOptionPane.showMessageDialog(null,"Chair starts rocking by itself with no one in it\nSee a child outside on a swing who suddenly disappears");    
    //System.out.println("See a child outside on a swing who suddenly disappears");    
    bookbag[0] = Window;
    bookbag[1] = Rocking_Chair;
    break;
    }
    if(direction.compareTo("bedroom 2") == 0) {
   	 greet.mapBedroom2();
   	 JOptionPane.showMessageDialog(null,"The dolls start dancing on their own\nA ghost flies out of the dresser as soon as you open it and goes right though");
   	 //System.out.println("A ghost flies out of the dresser as soon as you open it and goes right though ");
   	 bookbag[0] = Doll_House;
   	 bookbag[1] = Dresser;
   	 break;
    }
    

if(direction.compareTo("master bathroom") == 0) {
    greet.outcome7();
    bookbag[0] = Intricate_Oil_Lamp;
    bookbag[1] = Shower;
    break;
    
    
}
else {
JOptionPane.showMessageDialog(null,"You find the cursed Hope Diamond and feel your doom");    
bookbag[0] = Jewelry_Box;
break;
}
//return;
}
if(direction.compareTo("living room") == 0) {  //first choice
    greet.choice();
    direction = JOptionPane.showInputDialog("Would you like to search room or go to bathroom?");
    //direction = scnr.nextLine();
    //had to use this to allow input to work might need to use get and set method
if(direction.compareTo("bathroom") == 0) {
greet.outcome1();
greet.mapBath();
bookbag[0] = Mirror;
bookbag[1] = Shower;

}else if(direction.compareTo("idk") == 0) {//ignore this
    greet.choice5();}
    //direction = scnr.nextLine();


else {
    greet.mapLiving();
    greet.outcome();
    bookbag[0] = Chest;
    
}
}
else if(direction.compareTo("dinning room") == 0) {  //second choice
    greet.choice1();
    direction = JOptionPane.showInputDialog("Would you like to search the room or enter the kitchen?");

    //direction = scnr.nextLine();    	//had to use this to allow input to work might need to use get and set method
    if((direction.compareTo("kitchen") == 0)){
    greet.choice2();
    direction = JOptionPane.showInputDialog("");
    if(direction.compareTo("pantry") == 0){
   	 greet.mapPantry();
   	 greet.outcome4();
   	 bookbag[0] = Broom;
   	 bookbag[1] = Dusty_recipe_box;
   	 items();
    }
    else {
   	 greet.choice3();
   	 greet.mapKitchen();
   	 bookbag[0] = Cabinet;
   	 bookbag[1] = Refrigerator;    
   	 items();
   	 return;
    }
    //System.out.println(hmm);
    }
    
    if((direction.compareTo("yes") == 0)) {// this if statement can use some work...
    bookbag[0] = Candelabra;
    greet.outcome2();
    items();
return;
    }
    
    
    if(direction.compareTo("upstairs") == 0){
    greet.choice5();
    direction = JOptionPane.showInputDialog("Would you like to search room, enter the Master Bathroom, bedroom 1, or bedroom2?");
    //direction = scnr.nextLine();
    if(direction.compareTo("yes") == 0) {
    greet.mapMasterBedroom();
    greet.outcome3();
    bookbag[0] = Jewelry_Box;
    }else {
    greet.outcome4();
    bookbag[0] = Intricate_Oil_Lamp;
    bookbag[1] = Shower;
    
    }
    }
    }

    if(bookbag[0].contains(Cabinet) && bookbag[1].contains(Refrigerator)) {//shows you what items you have collected
   	 items();
    }
   	 else if(bookbag[0].contains(Window) && bookbag[1].contains(Rocking_Chair)) {
   		 items();}// this one doesnt work idk why yet...
   		 
   		 else if(bookbag[0].contains(Broom) && bookbag[1].contains(Dusty_recipe_box)) {
   			 items();}
   			 
   			 else if(bookbag[0].contains(Doll_House) && bookbag[1].contains(Dresser)) {
   				 items();}
   				 
   				 else if(bookbag[0].contains(Intricate_Oil_Lamp) && bookbag[1].contains(Shower)) {//not working
   					 items();}
   					 
   					 else if(bookbag[0].contains(Jewelry_Box)) {
   						 items();}
   						 
   						 else if(bookbag[0].contains(Mirror) && bookbag[1].contains(Shower)) {
   							 items();}
   							 
   							 else if(bookbag[0].contains(Chest)) {
   								 items();}
   								 
   								 else if(bookbag[0].contains(Candelabra)) {
   									 items();
   	 }    
    
    }
    private static String direction, Direction, Name;
    static String bookbag[] = new String[5];


    public void setName(String newDirection){  
   	 direction = newDirection;
   	 }
    public String getName(){   
   	 return direction;
   	 }
    public void grabItem() {
   	 // bookbag = item;
    }
    
    public static void items(){
   	 JOptionPane.showMessageDialog(null,"You looked into you book bag and find these items\n[" + bookbag[0] + " " + bookbag[1] + "]" + "\nGood job!" + Name);
   	 //System.out.println("[" + bookbag[0] + " " + bookbag[1] + "]" );
   	 //System.out.print("Good job! " + Name);
    

    }
    }


