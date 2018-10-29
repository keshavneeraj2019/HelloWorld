import java.lang.Math;

public class Main {

    public static double R = 6371;

    public static void main(String[] args) {

        double Distance, day1_2, day2_3, day3_4, day4_5, day5_6, day6_7,day7_8, day8_9, day9_10, day10_11, day11_12, day12_13, D;

        day1_2 = calcDist("Day 1 ", " Day 2",25, 15, 23, 20);
        day2_3 = calcDist("Day 2 "," Day 3",23, 20, 21, 24);
        day3_4 = calcDist("Day 3 "," Day 4",21, 24, 20, 27);
        day4_5 = calcDist("Day 4 "," Day 5",20, 27, 19, 35);
        day5_6 = calcDist("Day 5 "," Day 6",19, 35, 21, 46);
        day6_7 = calcDist("Day 6 "," Day 7",21, 46, 23, 56);
        day7_8 = calcDist("Day 7 "," Day 8",23, 56, 25, 65);
        day8_9 = calcDist("Day 8 "," Day 9",25, 65, 28, 70);
        day9_10 = calcDist("Day 9 "," Day 10",28, 70, 32, 73);
        day10_11 = calcDist("Day 10 "," Day 11",32, 73, 34, 74);
        day11_12 = calcDist("Day 11 "," Day 12",34, 74, 36, 74);
        day12_13 = calcDist("Day 12 "," Day 13",36, 74, 39, 74);
        Distance = calcDist("Paris "," San Francisco", 48.8567, 2.3508, 37.783333, -122.41667);

        D = day1_2 + day2_3 + day3_4 + day4_5 + day5_6+ day6_7+ day7_8+ day8_9+ day9_10+ day10_11+ day11_12+ day12_13;

        System.out.printf("\nThe Total distance traveled by Hurricane Gloria is %.1f km", D);
    }

    public static double calcDist(String daya, String dayb, double dlata, double dlonga, double dlatb, double dlongb){
        double rlata, rlatb, rlonga, rlongb, a, c, d;
        rlata = Math.toRadians(dlata);
        rlonga = Math.toRadians(dlonga);
        rlatb = Math.toRadians(dlatb);
        rlongb = Math.toRadians(dlongb);
        a = Math.pow(Math.sin((rlata-rlatb)/2),2) + Math.cos(rlata)*Math.cos(rlatb)*Math.pow(Math.sin((rlonga-rlongb)/2),2);
        c= 2*Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
        d = R*c;
        System.out.printf("\nThe Distance traveled from " +daya+ "to" +dayb+ " is  %.1f km",d);
        return d;
    }
}
