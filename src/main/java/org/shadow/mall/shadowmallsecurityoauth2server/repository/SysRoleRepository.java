package org.shadow.mall.shadowmallsecurityoauth2server.repository;

import org.shadow.mall.shadowmallsecurityoauth2server.entity.SysRole;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SysRoleRepository extends CrudRepository<SysRole,Integer>{

}
