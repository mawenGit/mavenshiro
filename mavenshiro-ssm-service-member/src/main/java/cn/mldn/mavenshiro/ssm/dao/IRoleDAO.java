package cn.mldn.mavenshiro.ssm.dao;

import java.util.Set;

public interface IRoleDAO {
	public    Set<String> findAllByMember(String id) ;  
}
