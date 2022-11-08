public class Employee {
    private String name;
    private String vorname;
    private String geburtsdatum;
    private String geschlecht;
    private int alter;
    private String abteilung;
    private int gehalt;
    private int dienstjahre;
    private String besonderheiten;
    private int gewicht;

    public Employee(String a, String b, String c, String d, int e, String f, int g, int h, String i, int j){
        name = a;
        vorname = b;
        geburtsdatum = c;
        geschlecht = d;
        alter = e;
        abteilung = f;
        gehalt = g;
        dienstjahre = h;
        besonderheiten = i;
        gewicht = j;
    }

    public String getName(){
        return name;
    }

    public String getVorname(){
        return vorname;
    }

    public String getGeburtsdatum(){
        return geburtsdatum;
    }

    public String getGeschlecht(){
        return geschlecht;
    }

    public int getAlter(){
        return alter;
    }

    public String getAbteilung(){
        return abteilung;
    }

    public int getGehalt(){
        return gehalt;
    }

    public int getDienstjahre(){
        return dienstjahre;
    }

    public String getBesonderheiten(){
        return besonderheiten;
    }

    public int getGewicht() {
        return gewicht;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public void setGehalt(int gehalt) {
        this.gehalt = gehalt;
    }

    public void setGewicht(int gewicht) {
        this.gewicht = gewicht;
    }
}