package OOPSBannerApp;

public class UC4 {
    static class CharacterPatternMap{
        Character character;
        String[] pattern;

        public CharacterPatternMap(Character character , String[] pattern){
            this.character = character;
            this.pattern = pattern;
        }
        public Character getCharacter(){
            return this.character;
        }
        public String[] getPattern() {
            return this.pattern;
        }
    }

    public static CharacterPatternMap[] createCharacterPatternMaps(){
        return new CharacterPatternMap[]{
                new CharacterPatternMap('O',
                        new String[]{
                                "   ***   ",
                                " **   ** ",
                                "**     **",
                                "**     **",
                                "**     **",
                                "**     **",
                                "**     **",
                                " **   ** ",
                                "   ***   "
                        }),
                new CharacterPatternMap('P',
                        new String[]{
                                "******   ",
                                "**    ** ",
                                "**     **",
                                "**    ** ",
                                "******   ",
                                "**       ",
                                "**       ",
                                "**       ",
                                "**       ",
                        }),
                new CharacterPatternMap('S',
                        new String[]{
                                "   ***** ",
                                " **      ",
                                "**       ",
                                " **      ",
                                "   ***   ",
                                "     **  ",
                                "      ** ",
                                "     **  ",
                                "*****    "
                        }),
                new CharacterPatternMap(' ',
                        new String[]{
                                "         ",
                                "         ",
                                "         ",
                                "         ",
                                "         ",
                                "         ",
                                "         ",
                                "         ",
                                "         "
                        })
        };
    }

    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps){
        for(CharacterPatternMap map :charMaps){
            if(map.getCharacter() ==ch){
                return map.getPattern();
            }
        }
        return getCharacterPattern(' ',charMaps);
    }
    public static void printMessage(String message, CharacterPatternMap[] charMap){
        int height = charMap[0].getPattern().length;
        for(int i = 0;i<height;i++){
            for(int j=0;j<message.length();j++){
                char ch = message.charAt(j);
                String[] pattern = getCharacterPattern(ch,charMap);
                System.out.print(pattern[i]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        CharacterPatternMap[] charMaps = createCharacterPatternMaps();
        String message = "OOPS";
        printMessage(message,charMaps);
    }
}

