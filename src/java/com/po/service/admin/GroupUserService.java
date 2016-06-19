/*
 * Copyright : luckybear
 * Create software make life better than  * 
 */
package com.po.service.admin;

import com.po.resp.MsgResp;
import com.po.service.RestBaseService;
import java.io.IOException;
import javax.ws.rs.ClientErrorException;

/**
 * Jersey REST client generated for REST resource:RestGroupUsers
 * [GroupUsers]<br>
 * USAGE:
 * <pre>
        GroupUserService client = new GroupUserService();
        Object response = client.XXX(...);
        // do whatever with response
        client.close();
 </pre>
 *
 * @author Lucky Bear
 */
public class GroupUserService extends RestBaseService {
    
    // Param of supper() is path of server's service
    public GroupUserService() {
        super("GroupUsers");
    }
    
    // Param of getJsonFromService() is path of service method
    public MsgResp getListGroupUsers() throws ClientErrorException, IOException {
        String json = getJsonFromService("List");
        close();
        return convertJSONtoMsgResp(json);
    }
    
}
