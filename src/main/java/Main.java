public class Main {

    public static void main(String[] args) {
        passwordControl("Ha5llo8");
        passwordCount("Hallo");
        letterControl("Hal$lo");

    }

    public static String passwordControl(String pw) {

        int i = 0;

        while (i < 10) {
            if (pw.contains("" + i)) {
                String message = "Das Passwort enthält die Zahl " + i;
                System.out.println("Das Passwort enthält die Zahl " + i);
                int a = 10 - i;
                i = i + a;

                return message;
            }


            i++;

        }

        return "Das Passwort enthält keine Zahl";
    }


    public static int passwordCount(String pw2) {


        int passwordLength = pw2.length();
        System.out.println("Das Passwort ist " + passwordLength + " Zeichen lang");
        return passwordLength;

    }

    public static boolean letterControl(String word) {

        for (int i = 0; i < word.length(); i++) {
            char b = word.charAt(i);


            if (Character.isUpperCase(b)) {

                return true;
            } else if ((Character.isLowerCase(b))) {

                return true;

            }
        }



return false;
    }


}



