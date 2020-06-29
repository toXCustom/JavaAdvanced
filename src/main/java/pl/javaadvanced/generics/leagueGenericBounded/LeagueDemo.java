package pl.javaadvanced.generics.leagueGenericBounded;

import pl.javaadvanced.generics.FootballTeam;
import pl.javaadvanced.generics.Team;
import pl.javaadvanced.generics.VolleyballTeam;

public class LeagueDemo {
    public static void main(String[] args) {
        FootballTeam footballTeam1 = new FootballTeam("Wisła Kraków");
        FootballTeam footballTeam2 = new FootballTeam("Legia Warszawa");
        Team footballTeam3 = new FootballTeam("Lech Poznań");
        FootballTeam footballTeam4 = new FootballTeam("Zagłębie Sosnowiec");

        footballTeam1.setPoints(10);
        footballTeam2.setPoints(15);
        footballTeam3.setPoints(12);
        footballTeam4.setPoints(8);

        VolleyballTeam volleyballTeam1 = new VolleyballTeam("Assecco Resovia");
        VolleyballTeam volleyballTeam2 = new VolleyballTeam("Arka Bełchatów");
        VolleyballTeam volleyballTeam3 = new VolleyballTeam("Zaksa");
        VolleyballTeam volleyballTeam4 = new VolleyballTeam("Jastrzębski Węgiel");

        volleyballTeam1.setPoints(10);
        volleyballTeam2.setPoints(15);
        volleyballTeam3.setPoints(12);
        volleyballTeam4.setPoints(8);

        League<FootballTeam> footballLeague = new League("PKO Ekstraklasa");
        League<VolleyballTeam> volleyballLeague = new League("Plus Liga");

        footballLeague.addTeam(footballTeam1);
        footballLeague.addTeam(footballTeam2);
        footballLeague.addTeam((FootballTeam)footballTeam3);
        footballLeague.addTeam(footballTeam4);
        footballLeague.addTeam(footballTeam2);

        volleyballLeague.addTeam(volleyballTeam1);
        volleyballLeague.addTeam(volleyballTeam2);
        volleyballLeague.addTeam(volleyballTeam3);
        volleyballLeague.addTeam(volleyballTeam3);
        volleyballLeague.addTeam(volleyballTeam4);

        //volleyballLeague.addTeam(footballTeam4);

        System.out.println("=============================================");
        volleyballLeague.printTable();
        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");
        footballLeague.printTable();
        System.out.println("=============================================");
    }
}
