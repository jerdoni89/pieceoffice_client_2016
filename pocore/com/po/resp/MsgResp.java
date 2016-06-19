/*
 * Copyright : luckybear
 * Create software make life better than  * 
 */
package com.po.resp;

import java.util.Map;

/**
 *
 * @author Lucky Bear
 */
public class MsgResp {
    // code: int
    private int respCode;
    
    // message : String
    private String respDesc;
    
    // content : List, Object
    Map<String, Object> respContent;

    public int getRespCode() {
        return respCode;
    }

    public void setRespCode(int respCode) {
        this.respCode = respCode;
    }

    public String getRespDesc() {
        return respDesc;
    }

    public void setRespDesc(String respDesc) {
        this.respDesc = respDesc;
    }

    public Map<String, Object> getRespContent() {
        return respContent;
    }

    public void setRespContent(Map<String, Object> respContent) {
        this.respContent = respContent;
    }
    
}
