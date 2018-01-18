package com.liumapp.DNSQueen;

import com.liumapp.DNSQueen.queen.Queen;
import junit.framework.TestCase;
import org.junit.Ignore;
import org.junit.Test;

import java.io.IOException;

/**
 * Created by liumapp on 7/14/17.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 * ATTENTION!!!
 * run this while your DNSBrood is running !
 */
public class DNSQueenTest extends TestCase {

     @Test
     public void test() throws InterruptedException {
        if (false) {
            Queen queen = new Queen();
            try {
                queen.connect();
            } catch (IOException e) {
                e.printStackTrace();
            }

            for (int i = 0 ; i < 1000 ; i++) {
                queen.say("hello world");
                try {
                    System.out.println(queen.hear());
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Thread.sleep(1000);
                if (i > 5) {
                    queen.say("shutdown");
                }
            }
        }
     }


}
