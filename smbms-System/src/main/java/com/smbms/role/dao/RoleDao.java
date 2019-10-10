package com.smbms.role.dao;

import com.smbms.role.entity.SmbmsRoleDTO;

import java.util.List;

/**
 * @InterfaceName RoleDao
 * @description 访问角色表数据库操作规范
 * @Author NieQiQiang
 * @Date 2019/6/10 16:30
 * @Version 1.0
 */
public interface RoleDao {

    /**
     * 查询所有角色信息
     * @Author NieQiQiang
     * @Date 16:32 2019/6/10
     * @Param []
     * @return java.util.List<com.smbms.role.entity.SmbmsRoleDTO>
     **/
    List<SmbmsRoleDTO> selectRoleList();
}
