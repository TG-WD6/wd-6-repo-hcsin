import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static ArrayList<Countrie> countries = new ArrayList<Countrie>();
    public static ArrayList<Airport> airports = new ArrayList<Airport>();
    public static ArrayList<String[]> runways = new ArrayList<>();

    public static void main(String[] args) {

        String pathLand = "./resources/countries.csv";
        String pathRun = "./resources/testRunways.txt";//2
        String pathAir = "./resources/testAirports.txt";//1

        try {
//            Runway[] lanes = listRunway(pathRun);
            listCountrie(pathLand);
            listAirport(pathAir);
//            System.out.println(airports.get(1).countryCode);
//            System.out.println(countries.get(0).name);
            System.out.println("-----");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
//        countries.stream().filter(c -> c.code.contains("BM")).map(p -> p.name).forEach(System.out::println);
//        int getIndex = Arrays.asList(countries).indexOf(302789);
//        System.out.println(getIndex);
        String runA = airports.get(10).getIdent();
        System.out.println(runA + " runA");
        for (int i = 0; i < airports.size(); i++) {
            if(airports.get(i).ident.equals(runA)){
                String airA = airports.get(i).getCountryCode();
                System.out.println(airA + " airA");
                String h = findCountrieName(airA);
                System.out.println(h);
            }
        }
    }
    public static String findCountrieName(String nameCode){
        for (int i = 0; i < countries.size(); i++) {
            String x = countries.get(i).getCode();
            if(x.equals(nameCode)){
                nameCode = countries.get(i).getName();
            }
        }
        return nameCode;
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