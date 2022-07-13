import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Airport {
    String ident; //1
    String countryCode; //8
    String name;//3

    public String getIdent() {
        return ident;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getName() {
        return name;
    }

    public Airport(String[] row) {
        ident = row[1];
        countryCode = row[8];
        name = row[3];
    }
}
