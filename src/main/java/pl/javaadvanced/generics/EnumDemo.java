package pl.javaadvanced.generics;

public class EnumDemo {
    public static void main(String[] args) {
        FootballTeam footballTeam = new FootballTeam("Real Madrid", TeamLevel.AMATEUR);

        if (footballTeam.getTeamLevel() == TeamLevel.PROFESSIONAL) {
            System.out.println("Real full profeska");
        } else {
            System.out.println("Amatorzy");
        }
    }
}
