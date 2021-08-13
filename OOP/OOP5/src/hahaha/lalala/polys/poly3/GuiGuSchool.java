package hahaha.lalala.polys.poly3;

public class GuiGuSchool {


    public static Programmer createProgrammer(String mess) {

        if(mess.equals("中国")){
            return new China();
        }
        if(mess.equals("日本")){
            return new Japan();
        }
        return null;

    }
}
