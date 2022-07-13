import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static ArrayList<Countrie> countries = new ArrayList<Countrie>();
    public static ArrayList<Airport> airports = new ArrayList<Airport>();
    public static ArrayList<Runway> runways = new ArrayList<Runway>();
    public static HashMap<String, Integer> topTen = new HashMap<>();
    public static LinkedHashMap<String, Integer> reverseSortedTopten = new LinkedHashMap<>();
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
        calTopTen();
        topTen.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEachOrdered(x -> reverseSortedTopten.put(x.getKey(), x.getValue()));

        Set<String> keys = reverseSortedTopten.keySet();
        int counter = 0;
        for (String key : keys) {
            if(counter == 10){
                break;
            }
            System.out.println(key + " - " + reverseSortedTopten.get(key));
            counter++;
        }
//
//        reverseSortedTopten.forEach((k, v) -> {
//            System.out.format("key: %s, value: %d%n", k, v);
//        });

//        findCountryNameContent("zimb");//Bonus
    }
    public static Void calTopTen(){
//        for (var x : airports) {
//            System.out.println(x.getCountryCode());
//        }
        for (var y : airports) {
            String x = y.getCountryCode();
            if(topTen.containsKey(x)){
                int w = topTen.get(x);
                topTen.replace(x, w + 1);
            }else {
                topTen.put(x, 1);
            }
        }
//        topTen.put("EU", 1);
//        topTen.put("US", 5);
//        topTen.put("NL", 1);
//        String x = "EU";
        return null;
    }
    public static String findCountryNameContent(String name){
        name = name.toLowerCase();
        for (int i = 0; i < countries.size(); i++) {
            String x = countries.get(i).getName().toLowerCase();
            if(x.contains(name)){
                System.out.println(countries.get(i).getName());
            }
        }
        return name;
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