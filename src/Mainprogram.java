public class Mainprogram {
    public static void main(String[] args) {

        Employee e1 = new Employee("Jannati", "Kiyan", "03.08.2006", "Männlich", 16, "A38", 1500, 0, "Spielt Klavier", 60);
        System.out.println("Name: " + e1.getName() + "\nVorname: " + e1.getVorname() + "\nGeburtsdatum: " + e1.getGeburtsdatum() + "\nGeschlecht: " + e1.getGeschlecht() + "\nAlter: " + e1.getAlter() + "\nAbteilung: " + e1.getAbteilung() + "\nGehalt: " + e1.getGehalt() + "\nDienstjahre: " + e1.getDienstjahre() + "\nBesonderheiten: " + e1.getBesonderheiten() + "\nGewicht: " + e1.getGewicht());
    }
}
