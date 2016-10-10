package com.jaelyn.bean;

/**
 * Created by Jaelyn on 10/10/2016.
 */
public class NumToZH {
    private String numtochinese;
    String[] NUMCHINSES = {"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
    String[] ROUNDNUMBER = {"佰","仟","万","亿"};
    String[] YJF = {"元","角","分"};

    public String getNumtochinese() {
        return numtochinese;
    }

    public void setNumtochinese(String numtochinese) {
        String temp = "";
        for(int i=0;i<numtochinese.length();i++){
            temp += NUMCHINSES[Integer.parseInt(numtochinese.charAt(i)+"")];
        }
        this.numtochinese = temp;
    }
}
