package hust.soict.dsai.aims.media;

import hust.soict.dsai.aims.store.*;
import hust.soict.dsai.aims.*;
import java.util.Scanner;

public class scandata {
    public static Scanner scanner = Aims.scanner;
    private static Store store = Aims.store;

    public static String scanTitle() {
        String title;
        do {
            System.out.println("Title:");
            title = scanner.nextLine().trim(); 
        } while (title.isEmpty()); 
        return title;
    }

    public static String scanCategory() {
        String category;
        do {
            System.out.println("Category:");
            category = scanner.nextLine().trim();
        } while (category.isEmpty());
        return category;
    }

    public static String scanDirector() {
        String director;
        do {
            System.out.println("Director:");
            director = scanner.nextLine().trim();
        } while (director.isEmpty());
        return director;
    }

    public static int scanLength() {
        int length;
        do {
            System.out.println("Length:");
            while (!scanner.hasNextInt()) { 
                System.out.println("Invalid input. Please enter an integer.");
                scanner.nextLine(); 
            }
            length = scanner.nextInt();
            scanner.nextLine(); 
        } while (length < 0);
        return length;
    }

    public static float scanCost() {
        float cost;
        do {
            System.out.println("Cost:");
            while (!scanner.hasNextFloat()) { 
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); 
            }
            cost = scanner.nextFloat();
            scanner.nextLine(); 
        } while (cost < 0);
        return cost;
    }

    public static String scanArtist() {
        String artist;
        do {
            System.out.println("Artist:");
            artist = scanner.nextLine().trim();
        } while (artist.isEmpty());
        return artist;
    }

    public static int scanID() {
        int id;
        do {
            System.out.println("ID:");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.nextLine(); 
            }
            id = scanner.nextInt();
            scanner.nextLine(); 
        } while (id < 0);
        return id;
    }

    public static void play(Media media) {
        if (media instanceof Book) {
            System.out.println("Media is Book cannot play");
        }
        if (media instanceof DigitalVideoDisc) {
            DigitalVideoDisc disc = (DigitalVideoDisc) media;
            if (disc.getLength() < 0) {
                System.out.println("Cannot play this DVD");
            } else {
                disc.play();
            }
        }
        if (media instanceof CompactDisc) {
            CompactDisc cd = (CompactDisc) media;
            if (cd.getLength() < 0) {
                System.out.println("Cannot play this CD");
            } else {
                cd.play();
            }
        }
    }

    public static Media scanTitleFindMedia() {
        String title;
        Media media;
        do {
            title = scanTitle();
            media = store.FindMediatitle(title);

        } while (media == null);

        return media;
    }
}