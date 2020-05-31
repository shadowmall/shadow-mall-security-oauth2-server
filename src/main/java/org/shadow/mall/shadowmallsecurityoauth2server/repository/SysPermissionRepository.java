package org.shadow.mall.shadowmallsecurityoauth2server.repository;

import java.util.List;

import org.shadow.mall.shadowmallsecurityoauth2server.entity.SysPermission;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SysPermissionRepository extends CrudRepository<SysPermission, Integer>{

	public List<SysPermission> findByRoleNoIn(List<String> list);
}
