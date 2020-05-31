package org.shadow.mall.shadowmallsecurityoauth2server.repository;

import org.shadow.mall.shadowmallsecurityoauth2server.entity.SysUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SysUserRepository extends CrudRepository<SysUser, Integer>{

	SysUser findByUsername(String username);
}
