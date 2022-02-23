package Package.com;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler {

    public ArrayList<PostInfo> addFileToList() {
        ArrayList<PostInfo> cities = new ArrayList<>();
        File cityData = new File("data/danske-postnumre-byer-ny.csv");
        try {
            Scanner scan = new Scanner(cityData);
            scan.nextLine();
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                String[] stringArray = line.split(";");
                int zipCode = Integer.parseInt(stringArray[0]);
                String city = stringArray[1];

                PostInfo currentCity = new PostInfo(zipCode, city);
                cities.add(currentCity);

            }
        } catch (
                FileNotFoundException e) {
            System.out.println("Error: Could not find file.");
            e.printStackTrace();
        }
        return cities;
    }
}
