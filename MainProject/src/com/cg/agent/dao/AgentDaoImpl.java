package com.cg.agent.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.cg.agent.bean.InsuredBean;
import com.cg.agent.util.DBConnection;

public class AgentDaoImpl implements IAgentDao{

	@Override
	public int insertInsuredDetails(InsuredBean insuredBean) throws ClassNotFoundException, IOException, SQLException {
	Connection con=DBConnection.getConnection();
	PreparedStatement pst=null;
	ResultSet resultSet=null;
	int AgentId=0;
	InsuredBean bean=new InsuredBean();
	int queryResult=0;
	try {
	 pst=con.prepareStatement("insert into account values(?,?,?,?,?,?,?,?,0)");
	 pst.setInt(1,bean.getAccountNumber());
	 pst.setString(2,bean.getInsuredName());
	 pst.setString(3,bean.getInsuredStreet());
	 pst.setString(4,bean.getInsuredCity());
	 pst.setString(5,bean.getInsuredState());
	 pst.setInt(6,bean.getInsuredZip());
	 pst.setString(7,bean.getBusinessSegment());
	 pst.setString(8, bean.getUserName());
	// pst.setInt(9,bean.getAgentId());
	 pst.executeUpdate();
	return 1;
	}catch(SQLException sql)
	{
		System.out.println(sql);
	}
	
		return AgentId;
	

	}

}
