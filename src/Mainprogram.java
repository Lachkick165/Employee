public class Mainprogram {
    public static void main(String[] args) {

        Employee e1 = new Employee("Jannati", "Kiyan", "03.08.0", "Männlich", 66, "A38", 1500, 0, "Klavier", 60);
        Employee e2 = new Employee("Smajilbasic", "Muris", "15.03.1000", "Männlich", 50, "A38", 1500, 0, "Fussball", 60);
        Employee e3 = new Employee("Jiang", "Alex", "40.09.1200", "Männlich", 1000, "A38", 1500, 0, "Klavier", 60);
        Employee e4 = new Employee("Eulberg", "Samuel", "5.04.5689", "Männlich", 13, "A38", 1500, 0, "Tennis", 60);
        Employee e5 = new Employee("Kolhoff", "Julius", "20.02.146", "Männlich", 47, "A38", 1500, 0, "Mathe", 60);
        Employee e6 = new Employee("Ukrainer", "Maksym", "31.10.2022", "Männlich", 0, "A38", 1500, 0, "Ukrainer", 60);

        if(e1.getAlter()>=40){
            if(e1.getAlter()<50) {
                e1.setGehalt(3000);
            }
        }
        if(e1.getAlter()>=50){
            e1.setGehalt((int) (Math.random() * 1000) + 4000);

            if(e1.getAlter()>=60){
                e1.setGehalt(e1.getGehalt() + 500);
            }
        }

        System.out.println("Name: " + e1.getName() + "\nVorname: " + e1.getVorname() + "\nGeburtsdatum: " + e1.getGeburtsdatum() + "\nGeschlecht: " + e1.getGeschlecht() + "\nAlter: " + e1.getAlter() + "\nAbteilung: " + e1.getAbteilung() + "\nGehalt: " + e1.getGehalt() + "\nDienstjahre: " + e1.getDienstjahre() + "\nBesonderheiten: " + e1.getBesonderheiten() + "\nGewicht: " + e1.getGewicht());

        if(e2.getAlter()>=40){
            if(e2.getAlter()<50) {
                e2.setGehalt(3000);
            }
        }
        if(e2.getAlter()>=50){
            e2.setGehalt((int) (Math.random() * 1000) + 4000);

            if(e2.getAlter()>=60){
                e2.setGehalt(e2.getGehalt() + 500);
            }
        }

        System.out.println("\nName: " + e2.getName() + "\nVorname: " + e2.getVorname() + "\nGeburtsdatum: " + e2.getGeburtsdatum() + "\nGeschlecht: " + e2.getGeschlecht() + "\nAlter: " + e2.getAlter() + "\nAbteilung: " + e2.getAbteilung() + "\nGehalt: " + e2.getGehalt() + "\nDienstjahre: " + e2.getDienstjahre() + "\nBesonderheiten: " + e2.getBesonderheiten() + "\nGewicht: " + e2.getGewicht());

        if(e3.getAlter()>=40){
            if(e3.getAlter()<50) {
                e3.setGehalt(3000);
            }
        }
        if(e3.getAlter()>=50){
            e3.setGehalt((int) (Math.random() * 1000) + 4000);

            if(e3.getAlter()>=60){
                e3.setGehalt(e3.getGehalt() + 500);
            }
        }

        System.out.println("\nName: " + e3.getName() + "\nVorname: " + e3.getVorname() + "\nGeburtsdatum: " + e3.getGeburtsdatum() + "\nGeschlecht: " + e3.getGeschlecht() + "\nAlter: " + e3.getAlter() + "\nAbteilung: " + e3.getAbteilung() + "\nGehalt: " + e3.getGehalt() + "\nDienstjahre: " + e3.getDienstjahre() + "\nBesonderheiten: " + e3.getBesonderheiten() + "\nGewicht: " + e3.getGewicht());

        if(e4.getAlter()>=40){
            if(e4.getAlter()<50) {
                e4.setGehalt(3000);
            }
        }
        if(e4.getAlter()>=50){
            e4.setGehalt((int) (Math.random() * 1000) + 4000);

            if(e4.getAlter()>=60){
                e4.setGehalt(e4.getGehalt() + 500);
            }
        }

        System.out.println("\nName: " + e4.getName() + "\nVorname: " + e4.getVorname() + "\nGeburtsdatum: " + e4.getGeburtsdatum() + "\nGeschlecht: " + e4.getGeschlecht() + "\nAlter: " + e4.getAlter() + "\nAbteilung: " + e4.getAbteilung() + "\nGehalt: " + e4.getGehalt() + "\nDienstjahre: " + e4.getDienstjahre() + "\nBesonderheiten: " + e4.getBesonderheiten() + "\nGewicht: " + e4.getGewicht());

        if(e5.getAlter()>=40){
            if(e5.getAlter()<50) {
                e5.setGehalt(3000);
            }
        }
        if(e5.getAlter()>=50){
            e5.setGehalt((int) (Math.random() * 1000) + 4000);

            if(e5.getAlter()>=60){
                e5.setGehalt(e5.getGehalt() + 500);
            }
        }

        System.out.println("\nName: " + e5.getName() + "\nVorname: " + e5.getVorname() + "\nGeburtsdatum: " + e5.getGeburtsdatum() + "\nGeschlecht: " + e5.getGeschlecht() + "\nAlter: " + e5.getAlter() + "\nAbteilung: " + e5.getAbteilung() + "\nGehalt: " + e5.getGehalt() + "\nDienstjahre: " + e5.getDienstjahre() + "\nBesonderheiten: " + e5.getBesonderheiten() + "\nGewicht: " + e5.getGewicht());

        if(e6.getAlter()>=40){
            if(e6.getAlter()<50) {
                e6.setGehalt(3000);
            }
        }
        if(e6.getAlter()>=50){
            e6.setGehalt((int) (Math.random() * 1000) + 4000);

            if(e6.getAlter()>=60){
                e6.setGehalt(e6.getGehalt() + 500);
            }
        }

        System.out.println("\nName: " + e6.getName() + "\nVorname: " + e6.getVorname() + "\nGeburtsdatum: " + e6.getGeburtsdatum() + "\nGeschlecht: " + e6.getGeschlecht() + "\nAlter: " + e6.getAlter() + "\nAbteilung: " + e6.getAbteilung() + "\nGehalt: " + e6.getGehalt() + "\nDienstjahre: " + e6.getDienstjahre() + "\nBesonderheiten: " + e6.getBesonderheiten() + "\nGewicht: " + e6.getGewicht());
    }
}
