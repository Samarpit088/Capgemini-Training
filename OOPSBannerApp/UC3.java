package OOPSBannerApp;

public class UC3 {
    public static String[] getOPattern(){
        return new String[]{
                "   ***   ",
                " **   ** ",
                "**     **",
                "**     **",
                "**     **",
                "**     **",
                "**     **",
                " **   ** ",
                "   ***   "
        };
    }
    public static String[] getPPattern(){
        return new String[]{
                "******   ",
                "**    ** ",
                "**     **",
                "**    ** ",
                "******   ",
                "**       ",
                "**       ",
                "**       ",
                "**       ",
        };
    }

    public static String[] getSPattern(){
        return new String[]{
                "   *****",
                " **     ",
                "**      ",
                " **     ",
                "   ***  ",
                "     ** ",
                "      **",
                "     ** ",
                "*****   "
        };
    }

    public static void main(String[] args) {
        String[] o = getOPattern();
        String[] p = getPPattern();
        String[] s = getSPattern();
        for(int i=0;i<9;i++){
            String line = String.join(" ",o[i],o[i],p[i],s[i]);
            System.out.println(line);
        }
    }
}

