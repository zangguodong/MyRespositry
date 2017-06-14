package com.company.Utils;

import java.util.regex.Pattern;

/**
 * Created by zangguodong on 2017/6/14.
 */
public class StringUtils {
    public String Double2String(double num){
        return String.valueOf(num);
    }
    public static int WordCount(String str){
        Pattern p=Pattern.compile("\\W{1,}");
        String [] strs=p.split(str);
        for(String s:strs){
            System.out.println(s);
        }
        return strs.length;
    }

}
