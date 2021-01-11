package ua.butsai.homework25;

public class MyNumberFormatException {

    public boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
        } catch (NumberFormatException e){
            return false;
        }
        return true;
    }
}
