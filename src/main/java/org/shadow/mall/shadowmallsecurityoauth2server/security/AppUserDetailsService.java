package org.shadow.mall.shadowmallsecurityoauth2server.security;

import java.util.List;
import java.util.stream.Collectors;

import org.shadow.mall.shadowmallsecurityoauth2server.entity.SysPermission;
import org.shadow.mall.shadowmallsecurityoauth2server.entity.SysResource;
import org.shadow.mall.shadowmallsecurityoauth2server.entity.SysUser;
import org.shadow.mall.shadowmallsecurityoauth2server.entity.SysUserRole;
import org.shadow.mall.shadowmallsecurityoauth2server.repository.SysPermissionRepository;
import org.shadow.mall.shadowmallsecurityoauth2server.repository.SysResourceRepository;
import org.shadow.mall.shadowmallsecurityoauth2server.repository.SysUserRepository;
import org.shadow.mall.shadowmallsecurityoauth2server.repository.SysUserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class AppUserDetailsService implements UserDetailsService{

	@Autowired
	SysUserRepository sysUserRepository;
	@Autowired
	SysUserRoleRepository sysUserRoleRepository;
	@Autowired
	SysPermissionRepository sysPermissionRepository;
	@Autowired
	SysResourceRepository sysResourceRepository;
	
	@Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        SysUser user = sysUserRepository.findByUsername(s);//查询系统用户
        if (null == user)throw new UsernameNotFoundException("用户账户【"+s+"】查询失败");
        /*获取角色列表*/
        List<String> roleIds = sysUserRoleRepository.findByUserNo(user.getUserNo()).stream().map(SysUserRole::getRoleNo).collect(Collectors.toList());
		
        List<SysPermission> sysPermissions = sysPermissionRepository.findByRoleNoIn(roleIds);
        List<String> resourceIds = sysPermissions.stream().map(SysPermission::getResourceNo).collect(Collectors.toList());
        List<SysResource> sysReources = (List<SysResource>) sysResourceRepository.findByResourceNoIn(resourceIds);

        return new org.springframework.security.core.userdetails.User(user.getUsername(),user.getPassword(),sysReources.stream()
                .map(sysReource -> new CustomGrantedAuthority(sysReource))
                .collect(Collectors.toList()));
    }

    class CustomGrantedAuthority implements GrantedAuthority {
		private static final long serialVersionUID = 1L;
		private SysResource authority;
        public CustomGrantedAuthority(){}
        public CustomGrantedAuthority(SysResource authority){
            this.authority = authority;
        }
        @Override
        public String getAuthority() {
            return authority.getResourceModule();
        }
    }

}
