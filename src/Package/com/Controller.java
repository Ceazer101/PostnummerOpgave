package Package.com;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {

    private ArrayList<PostInfo> postInfos;

    public Controller() {
        FileHandler fileH = new FileHandler();
        postInfos = fileH.addFileToList();
    }

    public PostInfo cityFinder(int zipCode){
        for (PostInfo p : postInfos) {
            if(p.getZipCode() == zipCode){
                return p;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Controller c = new Controller();
        Scanner scan = new Scanner(System.in);

        boolean isRunning = true;

        while (isRunning){
            System.out.println("Indtast postnummer: \nTast 0 for at afslutte");
            int zipNum = scan.nextInt();
            if (zipNum == 0){
                isRunning = false;
            } else {
                System.out.println(c.cityFinder(zipNum));
            }
        }
    }
}
