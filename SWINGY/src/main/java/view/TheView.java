/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   TheView.java                                       :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: pvan-ren <pvan-ren@student.42.fr>          +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2019/08/21 11:47:31 by pvan-ren          #+#    #+#             */
/*   Updated: 2019/09/03 14:58:17 by pvan-ren         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

package view;

import java.io.IOException;
import java.util.Scanner;
import controller.Controller;

public class TheView {

    Scanner sc = new Scanner(System.in);

    public void MainMenu() {

        int choice;
        // Scanner sc = new Scanner(System.in);

        System.out.println("\033[H\033[2J");
        System.out.println("\u001B[32m" + "     SWINGY" + "\u001B[0m");
        System.out.println("");
        System.out.println("-----------------");
        System.out.println("");
        System.out.println("1: Create HERO");
        System.out.println("2: Load HERO");
        System.out.println("");

        while (true) {
            try {
                choice = sc.nextInt();
                if (choice != 1 && choice != 2) {
                    System.out.println("\033[H\033[2J"); // Clears Screen
                    System.out.println("\033[H\033[2J");
                    System.out.println("\u001B[32m" + "     SWINGY" + "\u001B[0m");
                    System.out.println("");
                    System.out.println("-----------------");
                    System.out.println("");
                    System.out.println("1: Create HERO");
                    System.out.println("2: Load HERO");
                    System.out.println("");
                    System.out.println("\u001B[31m" + "Invalid entry: " + "\u001B[0m" + "Please choose between Creating a hero and Loading a hero.");
                } else if (choice == 1) {
                    System.out.println("\033[H\033[2J"); // Clears Screen
                    System.out.println("\u001B[34m" + "Enter hero name: " + "\u001B[0m");
                    Controller.setPlayerName();
                    System.out.print("\033[H\033[2J"); // Clears the screen, only works with a linux based OS.
                    System.out.println("\u001B[34m" + "Select hero type: " + "\u001B[0m");
                    System.out.println("1: Sentinel");
                    System.out.println("2: Champion");
                    System.out.println("3: Strategist");
                    Controller.setPlayerType();
                    // System.out.print("\033[H\033[2J"); // Clears the screen, only works with a linux based OS.
                    // System.out.println("Welcome " + Controller.heroGetInfo()[0] + ", ready to start your adventure!?");
                    System.out.println("");
                    break;
                } else if (choice == 2) {
                    System.out.println("\033[H\033[2J");
                    System.out.println("I mean i'm good, but not that good.");
                    System.out.println("Just shush up and create a new player.");
                    System.out.println("\u001B[34m" + "Enter hero name: " + "\u001B[0m");
                    Controller.setPlayerName();
                    System.out.print("\033[H\033[2J"); // Clears the screen, only works with a linux based OS.
                    System.out.println("\u001B[34m" + "Select hero type: " + "\u001B[0m");
                    System.out.println("1: Sentinel");
                    System.out.println("2: Champion");
                    System.out.println("3: Strategist");
                    Controller.setPlayerType();
                    // System.out.print("\033[H\033[2J"); // Clears the screen, only works with a linux based OS.
                    // System.out.println("Welcome " + Controller.heroGetInfo()[0] + ", ready to start your adventure!?");
                    System.out.println("");
                    break;
                    // File file = new File("PlayerSave.txt");
                    // try {
                    // BufferedReader br = new BufferedReader(new FileReader(file));

                    // if ((heroInfo = br.readLine()) != null) {
                    // while ((heroInfo = br.readLine()) != null) {
                    // // hero.setName(heroInfo);
                    // // System.out.println(hero.getName());
                    // System.out.println(heroInfo);
                    // }
                    // br.close();
                    // } else if (heroInfo == null) {
                    // System.out.println("\033[H\033[2J");
                    // System.out.println("\u001B[31m" + "It appears that you don't have any
                    // characters to load at this time. Go ahead and create one." + "\u001B[0m");

                    // // heroSetup();
                    // System.out.println("\033[H\033[2J");
                    // System.out.println("Welcome " + hero.getName() + ", ready to start your
                    // adventure!?");
                    // System.out.println("");
                    // // heroStats();
                    // System.out.println("");
                    // }
                    // } catch (FileNotFoundException e) {
                    // e.printStackTrace();
                    // System.out.println("File can't be found");
                    // }
                }
            } catch (Exception e) {
                System.out.println("Please choose a number");
                sc.nextLine();
            }
        }
        // System.out.println("Welcome " + Controller.heroGetInfo()[0] + ", ready to start your adventure!?");
        while (true) {
            heroStats();
            Controller.createMap();
            instruction();
            try {
                Controller.moveHero();
            } catch (IOException e) {
                e.printStackTrace();
                System.out.print("\033[H\033[2J"); // Clears the screen, only works with a linux based OS.
            }
        }
    }
    public void heroStats() {
        System.out.println("");
        System.out.println("\u001B[36m" + "Your name is: " + "\u001B[0m" + "\u001B[32m" + Controller.heroGetInfo()[0] + "\u001B[0m");
        System.out.println("\u001B[36m" + "You are of type: " + "\u001B[0m" + "\u001B[32m" + Controller.heroGetInfo()[1] + "\u001B[0m");
        System.out.println("\u001B[36m" + "You are level: " + "\u001B[0m" + "\u001B[32m" + Controller.heroGetInfo()[2] + "\u001B[0m");
        System.out.println("\u001B[36m" + "Your experience is: " + "\u001B[0m" + "\u001B[32m" + Controller.heroGetInfo()[3] + "\u001B[0m");
        System.out.println("\u001B[36m" + "Your attack is: " + "\u001B[0m" + "\u001B[32m" + Controller.heroGetInfo()[4] + "\u001B[0m");
        System.out.println("\u001B[36m" + "Your defence is: " + "\u001B[0m" + "\u001B[32m" + Controller.heroGetInfo()[5] + "\u001B[0m");
        System.out.println("\u001B[36m" + "Your health is: " + "\u001B[0m" + "\u001B[32m" + Controller.heroGetInfo()[6] + "\u001B[0m");
        System.out.println("");
    }

    public void instruction() {
        System.out.println("");
        System.out.println("\u001B[35m" + "MAKE A MOVE" + "\u001B[0m");
        System.out.println("\u001B[36m" + "Up: " + "\u001B[0m" + "\u001B[32m" + "w" + "\u001B[0m");
        System.out.println("\u001B[36m" + "Right: " + "\u001B[0m" + "\u001B[32m" + "d" + "\u001B[0m");
        System.out.println("\u001B[36m" + "Down: " + "\u001B[0m" + "\u001B[32m" + "s" + "\u001B[0m");
        System.out.println("\u001B[36m" + "Left: " + "\u001B[0m" + "\u001B[32m" + "a" + "\u001B[0m");
        System.out.println("");
        System.out.println("q: to quit, progress will be saved.");
        System.out.println("----------------------------------");
    }
    public void closeScanner() {
        sc.close();
        sc.close();
    }
}