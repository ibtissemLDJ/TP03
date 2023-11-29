package exercice01;

import java.util.Scanner;

public class CompteBoncaire {
    //Attributes
  int numCompt;
    String nomClient ;
    String prenomClient;
    double sold ;
   static String nomBanque ;
   static String codeAgence ;
   private  String typeDeCompte;
   static int nombreCompte=0;
   Scanner scanner= new Scanner(System.in);
   //constructor

   public  CompteBoncaire(){
       nombreCompte++;
       numCompt=nombreCompte;
       nomClient=null;
       prenomClient=null;
       sold=0;
       typeDeCompte="compteEpagne";
   }
    public CompteBoncaire(String nomClient, String prenomClient,double sold ,String typeDeCompte){
       nombreCompte++;
        this.numCompt=nombreCompte;
        this.nomClient=nomClient;
        this.prenomClient=prenomClient;
        this.sold=sold;
        this.typeDeCompte=typeDeCompte;
    }

  //getters setters




    //methods
     public void afficher(){
         System.out.println("le nom de cilent :"+nomClient+ "\nle prenom de client : "+ prenomClient+
                 " \nle numero de compte "+numCompt+"\nle solde :"+sold +"\nle type de compte : "+typeDeCompte);
     }

     static void afficherLeNbDeCompteCree(){
         System.out.println("le nombre de comptes crees est : "+ nombreCompte);
     }
     public void lectureCopmte (){
         System.out.println("entere les information de nouveau compte ");
         System.out.print("le nom : ");
         nomClient= scanner.nextLine ();
         System.out.print("le prenom : ");
         prenomClient= scanner.nextLine();
         System.out.print("le sold : ");
         sold = scanner.nextDouble();
         System.out.print("Type de compte (active / empagne ) : ");
         typeDeCompte= scanner.next();
     }
}
