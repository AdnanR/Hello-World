package Uti;

/**
 * Created by guoch on 7/04/2015.
 */
public class Add {
    String original;
    String addString;

    public Add(String str, String str2) {
        original = str;
        addString = str2;
    }

    public String Add() {
        return original + " " + addString;
    }

}
