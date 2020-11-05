/*
Input:
3
Zenit;3;Spartak;1
Spartak;1;CSKA;1
CSKA;0;Zenit;2

Output:
CSKA:2 0 1 1 1
Zenit:2 2 0 0 6
Spartak:2 0 1 1 1

Process finished with exit code 0

 */

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class Task_1_138 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        String[] input;
        Team teamA;
        Team teamB;
        Play play;
        Table table = new Table();
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++){
            input = scanner.next().split(";");
            teamA = new Team(input[0]);
            teamB = new Team(input[2]);
            play = new Play(Integer.valueOf(input[1]), Integer.valueOf(input[3]), teamA, teamB);
            table.addPlay(play);
        }
        table.printScoreTable();
    }

    static class Team{
        private String name;

        public Team(String name){this.name = name;}

        public String getName() {
            return name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Team team = (Team) o;
            return Objects.equals(name, team.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }

    static class Play{

        private int goalsA;
        private int goalsB;
        private Team teamA;
        private Team teamB;
        public Play(int goalsA, int goalsB, Team teamA, Team teamB){
            this.goalsA = goalsA;
            this.goalsB = goalsB;
            this.teamA = teamA;
            this.teamB = teamB;
        }

        public int getGoalsA() {
            return goalsA;
        }

        public int getGoalsB() {
            return goalsB;
        }

        public Team getTeamA() {
            return teamA;
        }

        public Team getTeamB() {
            return teamB;
        }
    }

    static class Table{

        private Map<Team, int[]> scoreTable = new HashMap<Team, int[]>();

        public Table(){}

        public void printScoreTable() {
            for (Map.Entry<Team, int[]> entry: scoreTable.entrySet()){
                System.out.print(entry.getKey().getName() + ":");
                printArray(entry.getValue());
            }
        }

        private void printArray(int[] arr){
            for (int a: arr){
                System.out.print(a + " ");
            }
            System.out.println();
        }

        public void addPlay(Play play){

            Team teamA = play.getTeamA();
            Team teamB = play.getTeamB();

            if (!scoreTable.containsKey(teamA)){
                scoreTable.put(teamA, new int[]{0, 0, 0, 0, 0});
            }

            if (!scoreTable.containsKey(teamB)){
                scoreTable.put(teamB, new int[]{0, 0, 0, 0, 0});
            }

            scoreTable.get(teamA)[0] += 1;
            scoreTable.get(teamB)[0] += 1;

            if (play.getGoalsA() > play.getGoalsB()){
                scoreTable.get(teamA)[1] += 1;
                scoreTable.get(teamA)[4] += 3;
                scoreTable.get(teamB)[3] += 1;
            }
            else if (play.getGoalsB() > play.getGoalsA()){
                scoreTable.get(teamB)[1] += 1;
                scoreTable.get(teamB)[4] += 3;
                scoreTable.get(teamA)[3] += 1;
            }
            else{
                scoreTable.get(teamA)[2] += 1;
                scoreTable.get(teamB)[2] += 1;
                scoreTable.get(teamA)[4] += 1;
                scoreTable.get(teamB)[4] += 1;
            }
        }
    }
}
