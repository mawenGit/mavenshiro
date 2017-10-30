package cn.mldn.mavenshiro.ssm.dao;

import cn.mldn.mavenshiro.ssm.vo.Member;

public interface IMemberDAO {
	public Member findById(String id);
}
