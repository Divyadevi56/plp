package com.cg.agent.service;

import java.io.IOException;
import java.sql.SQLException;

import com.cg.agent.bean.InsuredBean;
import com.cg.agent.dao.AgentDaoImpl;
import com.cg.agent.dao.IAgentDao;

public class AgentServiceImpl implements IAgentService{

	@Override
	public int insertInsuredDetails(InsuredBean insuredBean) throws ClassNotFoundException, IOException, SQLException {
		IAgentDao agentDao=new AgentDaoImpl();
		int insure=0;
		insure=agentDao.insertInsuredDetails(insuredBean);
		return insure;
	}

	public void validateInsured(InsuredBean insuredBean) {
		// TODO Auto-generated method stub
		
	}
	
	

}
