/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wakamole.kioskerorestful.utils;

import org.apache.commons.codec.digest.DigestUtils;



/**
 *
 * @author Max
 */
public class UtilsFunctions {
    
    public static String toSha256(String data){
        
        return DigestUtils.sha256Hex(data);
    }
    
}
