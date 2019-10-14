public class Representation {

    public static int daysRepresented(int[][] trips) {

        int res = 0;
        for (int i = 0; i < trips.length; i++) {
            res = res + trips[i][1] - trips[i][0];
        }

        return  res;
    }

}
}
