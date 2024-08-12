package service;

import domain.TextsDomain;

public class TextsService {


    public int couterCapLetters(TextsDomain textsDomain){
        String sentence=textsDomain.getSentence();
        char[] letters=new char[sentence.length()];
        int qtt=0;
        for (int i=0; i<sentence.length(); i++){
            letters[i]=sentence.charAt(i);

            if (Character.isUpperCase(letters[i])){
                qtt++;
            }
        }
        return qtt;
    }
}
