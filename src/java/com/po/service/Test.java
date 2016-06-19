/*
 * Copyright : luckybear
 * Create software make life better than  * 
 */
package com.po.service;

import com.po.service.admin.GroupUserService;
import com.po.resp.MsgResp;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.ClientErrorException;

/**
 *
 * @author Lucky Bear
 */
public class Test {
    public static void main(String[] args) {
        GroupUserService service = new GroupUserService();
        try {
            MsgResp resp = service.getListGroupUsers();
            System.out.println("com.po.service.Test.main()" + resp.getRespContent());
        } catch (ClientErrorException | IOException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
