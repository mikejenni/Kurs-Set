public class Kontakt {

    // Attribute
    private String name;
    private String telefonNummer;


    // Getter und Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelefonNummer() {
        return telefonNummer;
    }

    public void setTelefonNummer(String telefonNummer) {
        this.telefonNummer = telefonNummer;
    }


    // Konstruktor
    public Kontakt(String name, String telefonNummer) {
        this.name = name;
        this.telefonNummer= telefonNummer;
    }


    // Methode
    public static Kontakt erstelleKontakt(String name, String telefonNummer){
        return new Kontakt(name, telefonNummer);

    }


}
