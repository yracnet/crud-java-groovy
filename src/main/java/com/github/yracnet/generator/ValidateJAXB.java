/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.yracnet.generator;

import javax.xml.bind.ValidationEvent;
import javax.xml.bind.ValidationEventHandler;

/**
 *
 * @author yracnet
 */
public class ValidateJAXB implements ValidationEventHandler {

    @Override
    public boolean handleEvent(ValidationEvent event) {
        //     System.out.println("--->" + event);
        return true;
    }

}
