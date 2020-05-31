package org.shadow.mall.shadowmallsecurityoauth2server.repository;

import java.util.List;

import org.shadow.mall.shadowmallsecurityoauth2server.entity.SysUserRole;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SysUserRoleRepository extends CrudRepository<SysUserRole, Integer>{

	public List<SysUserRole> findByUserNo(String userNo);
}
