package test_project.fptrade.service;

import test_project.fptrade.methods.GetFullPartyByGLN.GetFullPartyByGLNReq;
import test_project.fptrade.methods.GetFullPartyByGLN.GetFullPartyByGLNResp;
import test_project.fptrade.methods.Login.LoginReq;
import test_project.fptrade.methods.Login.LoginResp;

public interface EPassInterfaces {
    GetFullPartyByGLNResp GetFullPartyByGLN(GetFullPartyByGLNReq req);



    LoginResp Login(LoginReq req);
}
