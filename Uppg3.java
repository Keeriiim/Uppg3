import java.util.ArrayList;
import java.util.Scanner;

public class Uppg3{
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        boolean loop = true;
        

        while(loop){
            System.out.println("\n"+"Meny val:" + "\n" + "Skapa:" + "\n" + "Radera:" + "\n" + "Uppdatera:" + "\n" + "Lista:" + "\n" + "Avsluta:");
            String menyVal = scan.nextLine().toLowerCase();

            switch(menyVal)
            {
                case "skapa":
                {
                    System.out.println("Vilket namn vill du lägga till?");
                    String namn = scan.nextLine();
                    list.add(namn);
                    break;
                }

                case "radera": 
                {    
                        if(list.isEmpty()){
                            System.out.println("Din lista är tom, du kan inte radera något.");
                            break;
                        }
                        else
                        {
                            System.out.println("\n" + "Vilket namn vill du radera?");
                            String radera = scan.nextLine();

                            
                            if(list.contains(radera))
                            {
                              System.out.println("Yeey Hittade namnet, nu raderas det!");
                              list.remove(radera);
                             break;
                            }
                            else
                            {
                                System.out.println("Hittade inte namnet");
                                break;
                            }
                        }
                    }
                
                case "uppdatera": 
                {
                    System.out.println("Vilket namn vill du uppdatera?");
                    String update = scan.nextLine();

                    if(list.contains(update))
                    {
                        System.out.println("Hittade namnet!, Vad vill du skriva istället?" + "\n");
                       String update2 = scan.nextLine();
                       list.set(list.indexOf(update), update2);
                    break;
                    }
                else
                System.out.println("Namnet finns tyvärr inte.");
                break;
                } 

                case "lista": 
                {
                    if(list.isEmpty()){
                        System.out.println("Finns ingen lista!");
                        break;
                    }
                    else {
                        System.out.println(list);
                        break;
                    }           
                }

                case "avsluta":
                {
                    scan.close();
                    loop = false;
                    break;
                }
                default : 
                {
                    System.out.println("Ogiltigt alternativ, försök igen.");
                    break;
                }
                
            }
        }

    }
}