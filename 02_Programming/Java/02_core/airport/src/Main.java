import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static ArrayList<Countrie> countries = new ArrayList<Countrie>();
    public static ArrayList<Airport> airports = new ArrayList<Airport>();
    public static ArrayList<Runway> runways = new ArrayList<Runway>();

    public static void main(String[] args) {

        String pathLand = "./resources/countries.csv";
        String pathRun = "./resources/testRunways.txt";//2
        String pathAir = "./resources/airports.csv";//1

        try {
            listCountrie(pathLand);
            listAirport(pathAir);
            listRunway(pathRun);
            System.out.println(runways.size());

            System.out.println("-----");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < runways.size(); i++) {
            System.out.println(runways.get(i).toString());
//            System.out.println(Arrays.deepToString(new Runway[]{runways.get(i)}));
        }
    }
    public static String findAirportCountryName(String airportIdent){
        for (int i = 0; i < airports.size(); i++) {
            if(airports.get(i).ident.equals(airportIdent)){
                airportIdent = airports.get(i).getCountryCode();
            }
        }
        return airportIdent;
    }
    public static String findCountrieNameWithCode(String nameCode){
        for (int i = 0; i < countries.size(); i++) {
            String x = countries.get(i).getCode();
            if(x.equals(nameCode)){
                nameCode = countries.get(i).getName();
            }
        }
        return nameCode;
    }
    public static void listRunway(String path) throws IOException {
        ArrayList<String[]> list = createList(path);
        for (int i = 0; i < list.size(); i++) {
//            System.out.println(Arrays.deepToString(list.get(i)));
            String[] a = list.get(i);
        String h = findCountrieNameWithCode(findAirportCountryName(a[2]));
            runways.add(new Runway(list.get(i), h));
        }
    }
    public static void listAirport(String path) throws IOException {
        ArrayList<String[]> list = createList(path);
        for (var x : list) {
            airports.add(new Airport(x));
        }
    }
    public static void listCountrie(String path) throws IOException {
        ArrayList<String[]> list = createList(path);
        for (var x : list) {
            countries.add(new Countrie(x));
        }
    }
    public static ArrayList<String[]> createList(String path) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));
        String line = "";
        ArrayList<String[]> result = new ArrayList<String[]>();
        while ((line = br.readLine()) != null){
            String[] valueA = line.split(",");
            result.add(valueA);
        }
        br.close();
        return result;
    }

}
//Runways for each airport given a country code or country name.
//Top 10 countries with highest number of airports.

//        Schrijf een programma dat de volgende informatie ophaalt, gegeven de aangeleverde bestanden:
//
//        Start- en landingsbanen voor elke luchthaven met een landcode of landnaam.
//        Top 10 landen met het hoogste aantal luchthavens.
//        Bonus: ondersteuning voor het ophalen van de informatie met een gedeeltelijke/vage landcode/naam als invoerparameter, b.v. het invoeren van 'zimb' resulteert in 'Zimbabwe'.