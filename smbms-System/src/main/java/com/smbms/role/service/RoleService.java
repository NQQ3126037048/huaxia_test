package com.smbms.role.service;

import com.smbms.role.entity.SmbmsRoleDTO;

import java.util.List;

/**
 * @InterfaceName RoleService
 * @description 角色业务规范
 * @Author NieQiQiang
 * @Date 2019/6/10 16:36
 * @Version 1.0
 */
public interface RoleService {

    /**
     * 获取所有角色信息
     * @Author NieQiQiang
     * @Date 16:37 2019/6/10
     * @Param []
     * @return java.util.List<com.smbms.role.entity.SmbmsRoleDTO>
     **/
    List<SmbmsRoleDTO> getRoleList();
}
