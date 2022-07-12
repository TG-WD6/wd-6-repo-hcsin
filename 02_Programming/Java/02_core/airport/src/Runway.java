public class Runway {
    String airport_ref;//1
    String airport_ident;//2
    String land;

    public Runway(String[] row) {
        airport_ref = row[1];
        airport_ident = row[2];
//        land = land;
    }
}
