package com.nt.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Handler {
     public String  execute(HttpServletRequest req,HttpServletResponse res)throws Exception;
}
