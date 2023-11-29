package exercice02;

import exercice01.CompteBoncaire;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lire la taille du tableau à partir du clavier
        System.out.print("Entrez la taille du tableau de CompteBancaire : ");
        int taille = scanner.nextInt();

        // Créer un tableau de CompteBancaire
        CompteBancaire[] tableauComptes = new78uaqCompteBancaire[taille];

        // Lire le tableau de CompteBancaire (remplissage à partir du clavier)
        for (int i = 0; i < taille; i++) {
            System.out.println("Entrez les détails du compte n°" + (i + 1));
            System.out.print("Nom du titulaire : ");
            String nomTitulaire = scanner.next();
            System.out.print("Solde du compte : ");
            double solde = scanner.nextDouble();

            // Créer un objet CompteBancaire et l'ajouter au tableau
            tableauComptes[i] = new CompteBancaire(nomTitulaire, solde);
        }

        // Affichage du tableau de CompteBancaire avec un for classique
        System.out.println("Affichage du tableau de CompteBancaire avec un for classique :");
        for (int i = 0; i < taille; i++) {
            System.out.println(tableauComptes[i]);
        }

        // Affichage du tableau de CompteBancaire avec un for étendu
        System.out.println("Affichage du tableau de CompteBancaire avec un for étendu :");
        for (CompteBancaire compte : tableauComptes) {
            System.out.println(compte);
        }

        // Fermer le scanner
        scanner.close();
}
