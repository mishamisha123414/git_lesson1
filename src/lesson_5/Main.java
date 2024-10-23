package lesson_5;

import java.util.Random;

 class RugbyTeams {
    public static void main(String[] args) {
        Random random = new Random();

        int[] team1 = new int[5];
        for (int i = 0; i < team1.length; i++) {
            team1[i] = 18 + random.nextInt(23);
        }

        int[] team2 = {18 + random.nextInt(23), 18 + random.nextInt(23),
                18 + random.nextInt(23), 18 + random.nextInt(23),
                18 + random.nextInt(23)};

        System.out.println("Вік гравців першої команди:");
        for (int age : team1) {
            System.out.print(age + " ");
        }
        System.out.println();

        System.out.println("Вік гравців другої команди:");
        for (int age : team2) {
            System.out.print(age + " ");
        }
        System.out.println();

        double averageAgeTeam1 = calculateAverage(team1);
        System.out.println("Середній вік гравців першої команди: " + averageAgeTeam1);

        double averageAgeTeam2 = calculateAverage(team2);
        System.out.println("Середній вік гравців другої команди: " + averageAgeTeam2);
    }

    public static double calculateAverage(int[] team) {
        double sum = 0;
        for (int age : team) {
            sum += age;;
        }
        return (double) sum / team.length;
    }
}

