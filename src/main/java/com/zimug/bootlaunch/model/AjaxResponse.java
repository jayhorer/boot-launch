package com.zimug.bootlaunch.model;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by Jay on 20/12/14 - 21:45
 */
@Data
public class AjaxResponse {
    private boolean isOk;
    private int code;
    private String message;
    private Object data;

    private AjaxResponse(){

    }

    public static AjaxResponse success(){
        AjaxResponse resultBean = new AjaxResponse();
        resultBean.setCode(200);
        resultBean.setMessage("success");
        resultBean.setOk(true);
        return resultBean;
    }
    public static AjaxResponse success(Object data){
        AjaxResponse resultBean = new AjaxResponse();
        resultBean.setCode(200);
        resultBean.setMessage("success");
        resultBean.setOk(true);
        resultBean.setData(data);
        return resultBean;
    }


}
