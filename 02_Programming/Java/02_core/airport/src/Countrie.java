public class Countrie {
    String id;
    String code;
    String name;
    String continent;
    String wikipedia_link;
    String keywords;

    public String getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getContinent() {
        return continent;
    }

    public String getWikipedia_link() {
        return wikipedia_link;
    }

    public String getKeywords() {
        return keywords;
    }

    public Countrie(String[] row) {
        this.id = row[0];
        this.code = row[1];
        this.name = row[2];
        this.continent = row[3];
        this.wikipedia_link = row[4];
//        this.keywords = row[5];
    }

    @Override
    public String toString() {
        return "Countrie{}";
    }
}
