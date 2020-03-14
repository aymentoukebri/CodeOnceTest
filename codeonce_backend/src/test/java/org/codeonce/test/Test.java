package org.codeonce.test;

import static org.junit.Assert.assertEquals;

import org.codeonce.services.CodeonceSerivce;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;




@SpringBootTest
@RunWith(SpringRunner.class)
public class Test {
 
    @Autowired
    private CodeonceSerivce codeonceServie;
    
    @org.junit.Test
    public void testCreate() throws Exception {
        assertEquals(codeonceServie.Occurences("ponctuation..."),3);
    }
}
