package com.liumapp.digitalsign.engine.cert.util.alias;

import com.liumapp.digitalsign.engine.cert.util.CertUtil;
import org.bouncycastle.asn1.DERInteger;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigInteger;

/**
 * @author liumapp
 * @file AliasGeneratorTest.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 3/27/18
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {CertUtil.class})
public class AliasGeneratorTest {

    @Autowired
    private AliasGenerator aliasGenerator;

    @Ignore
    @Test
    public void generate () {
        String se = "720e92053fb45cc880c833f530dba1b72320cb56";
        String alias = aliasGenerator.getAlias(new BigInteger(se , 16));
        Assert.assertEquals("d0016314850841823fc6f02d90a89023740ad1d2" , alias);
    }

}
