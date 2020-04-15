public class day3_Arrays {
    public static void main(String[] args) {

        //                0          1           2        3        4
        int[][] iArr = {{1,2,3}, {4, 5, 6}, {7, 8, 9}, {22,23}, {44, 67}};
        System.out.println(iArr[0][0]);
        System.out.println(iArr[1][1]);
        System.out.println(iArr[0][2]);
        System.out.println(iArr[4][1]);

        System.out.println(iArr.length);
        System.out.println(iArr[1].length);
    }
}
