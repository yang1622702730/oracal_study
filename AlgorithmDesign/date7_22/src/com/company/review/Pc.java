package com.company.review;

import org.junit.Test;

/**
 * @program: testcode
 * @description:
 * @author: FanYang
 * @create: 2021-07-21 18:47
 */
public class Pc {
    public void conveyData(Usb usb){
            usb.start();
            System.out.println("具体的传输细节");
            usb.end();
    }
    @Test
    public void testInterface(){
        conveyData(new Flash());
        conveyData(new Printer());
    }
}
