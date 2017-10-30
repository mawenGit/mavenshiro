package cn.mldn.mavenshiro.ssm.service.front;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.mldn.mavenshiro.ssm.dao.IActionDAO;
import cn.mldn.mavenshiro.ssm.dao.IMemberDAO;
import cn.mldn.mavenshiro.ssm.dao.IRoleDAO;
import cn.mldn.mavenshiro.ssm.vo.Member;
@Service
public class MemberServiceFrontImpl implements IMemberServiceFront{
	@Resource
	private	IActionDAO actionDAO;
	@Resource
	private	IMemberDAO memberDAO;
	@Resource
	private	IRoleDAO roleDAO;
	@Override
	public Member get(String mid) {
		// TODO Auto-generated method stub
		return this.memberDAO.findById(mid);
	}

	@Override
	public Map<String, Set<String>> getRoleAndActionByMember(String mid) {
		Map<String,Set<String>> map=new HashMap<>();
		map.put("allRoles",this.roleDAO.findAllByMember(mid));
		map.put("allRoles",this.actionDAO.findAllByMember(mid));
		return map;
	}

	

}
