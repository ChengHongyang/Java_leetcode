package jvm;

import java.util.Random;

/**
 * @description:
 * @version: 1.0
 * @author: hongyang.cheng@hand-china.com
 * @date: 2020/6/9
 */
public class Demo1 {
    public static void main(String args[]){
        String s="qweqweq";
        while (true){
            s+=s+ new Random().nextInt(88888)+new Random().nextInt(99999);
         }
    }
}
