package test_project.fptrade.service;

import org.springframework.stereotype.Service;
import test_project.fptrade.methods.GetFullPartyByGLN.GetFullPartyByGLNReq;
import test_project.fptrade.methods.GetFullPartyByGLN.GetFullPartyByGLNResp;
import test_project.fptrade.methods.Login.LoginReq;
import test_project.fptrade.methods.Login.LoginResp;

@Service
public class EPassService implements EPassInterfaces {

    @Override
    public GetFullPartyByGLNResp GetFullPartyByGLN(GetFullPartyByGLNReq req) {
        return null;
    }

    @Override
    public LoginResp Login(LoginReq req) {
        return null;
    }
}
