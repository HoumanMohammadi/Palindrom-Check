package de.iav;

public class PalindromCheck {

    public static boolean isPalindrom(String stringToCheck) {
        boolean isPalin=false;

        switch (stringToCheck.length()) {
            case 0, 1 :{
                isPalin=true;
                break;
            }
            default : {
                for (int i=0; i<stringToCheck.length()/2;i++){
                    if (stringToCheck.charAt(i)==stringToCheck.charAt(stringToCheck.length()-i-1)){
                        isPalin=true;
                        }
                    }
                }
            }
        return isPalin;
    }
}
