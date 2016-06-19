/*
 * Copyright : luckybear
 * Create software make life better than  * 
 */
package com.po.service;

import com.po.resp.MsgResp;
import java.io.IOException;
import javax.ws.rs.ClientErrorException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import org.codehaus.jackson.map.ObjectMapper;

/**
 *
 * @author Lucky Bear
 */
public class RestBaseService {
    protected WebTarget webTarget;
    protected Client client;
    protected static final String BASE_URI_PO = "http://localhost:8084/PieceOffice_Server/Services";
    
    public RestBaseService(String servicePath) {
        client = javax.ws.rs.client.ClientBuilder.newClient();
        webTarget = client.target(BASE_URI_PO).path(servicePath);
    }
    
    public String getJsonFromService(String methodPath) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(methodPath);
        return resource.request(MediaType.APPLICATION_JSON).get(String.class);
    }
    
    public MsgResp convertJSONtoMsgResp(String json) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(json, MsgResp.class);
    }
    
    public void close() {
        client.close();
    }
}
