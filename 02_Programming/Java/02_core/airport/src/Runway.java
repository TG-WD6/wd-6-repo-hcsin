public class Runway {
    String airport_ref;//1
    String airport_ident;//2
    String land;

    public Runway(String[] row, String land) {
        airport_ref = row[1];
        airport_ident = row[2];
        this.land = land;
    }

    @Override
    public String toString() {
        return "Runway{" +
                "airport_ref='" + airport_ref + '\'' +
                ", airport_ident='" + airport_ident + '\'' +
                ", land='" + land + '\'' +
                '}';
    }
}
