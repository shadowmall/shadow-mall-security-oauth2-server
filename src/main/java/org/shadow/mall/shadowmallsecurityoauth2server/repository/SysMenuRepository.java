package org.shadow.mall.shadowmallsecurityoauth2server.repository;

import org.shadow.mall.shadowmallsecurityoauth2server.entity.SysMenu;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SysMenuRepository extends CrudRepository<SysMenu, Integer>{

}
