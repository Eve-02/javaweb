package com.xxx.util;

import javax.servlet.http.Cookie;

public class CookieUtils {

    /**
     * 根据 key查找指定的 Cookie
     * @param key
     * @param cookies
     * @return
     */
    public static Cookie findCookie(String key,Cookie[] cookies){

        if(key == null || cookies == null || cookies.length == 0){
            return null;
        }

        for (Cookie cookie : cookies) {
            if(key.equals(cookie.getName())){
                return cookie;
            }
        }

        return null;

    }

}
