package org.shadow.mall.shadowmallsecurityoauth2server.repository;

import java.util.List;

import org.shadow.mall.shadowmallsecurityoauth2server.entity.SysResource;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SysResourceRepository extends CrudRepository<SysResource, Integer>{

	public List<SysResource> findByResourceNoIn(List<String> list);
}
