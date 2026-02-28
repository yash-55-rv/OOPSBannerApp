public class OopsBannerApp {
    public static String[] getOpattern(){
        return new String[] {
            "  *****  ",
            " *     * ",
            "*       *",
            "*       *",
            "*       *",
            " *     * ",
            "  *****  "

        };
    }
    public static String[] getPPattern() {
        return new String[] {
            " ******  ",
            " *     * ",
            " *     * ",
            " ******  ",
            " *       ",
            " *       ",
            " *       "
        };
    }
    public static String[] getSPattern() {
        return new String[] {
            "  ****** ",
            "  *      ",
            "  *      ",
            "  ****** ",
            "       * ",
            "       * ",
            "  ****** "
        };
    }
    public static void main(String[] args)  {
        String[] opattern = getOpattern();
        String[] ppattern = getPPattern();
        String[] spattern = getSPattern();
        
        for (int i = 0; i < opattern.length; i++) {
            System.out.println(opattern[i] + "  " + opattern[i] + "  " + ppattern[i] + "  " + spattern[i]);
        }
    }
}
