package com.liumapp.sign.core.utils;


import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * Created by liumapp on 2/27/18.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
public class FileUtil {

    public String getTmpFileName () {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmSS");
        Date date = new Date();
        Random random = new Random();

        String now = simpleDateFormat.format(date);
        Integer randerNum = (int) (random.nextDouble() * (99999 - 10000) + 10000);
        String rander = randerNum.toString();

        String result = now + randerNum;
        return result;
    }

    public void deleteFile (String filePath) {
        File file = new File(filePath);
        if (file.exists() && file.isFile()) {
            file.delete();
        }
    }

}
