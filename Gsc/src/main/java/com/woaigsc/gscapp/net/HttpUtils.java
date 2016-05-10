package com.woaigsc.gscapp.net;

/**
 * Created by chuiyuan on 16-5-10.
 */
public class HttpUtils {
    /**
     * Get poem by id URL
     * @param id
     * @return
     */
    public static String selectPoemByIdUrl(int id){
        return URLConstant.SERVER_ADDRESS+"/poem/"+id ;
    }
}
