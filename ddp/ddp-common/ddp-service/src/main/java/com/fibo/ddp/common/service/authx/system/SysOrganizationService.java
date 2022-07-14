package com.fibo.ddp.common.service.authx.system;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fibo.ddp.common.model.authx.system.SysOrganization;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface SysOrganizationService extends IService<SysOrganization> {
    /**
     * 查询所有公司
     *
     * @return
     */
    public List<SysOrganization> getAllSysOrganization();

    /**
     * 获取所有启用公司
     *
     * @return
     */
    public List<SysOrganization> getAllValidOrgan();

    /**
     * 查询单个公司
     *
     * @param id
     * @return
     */
    public SysOrganization findById(long id);

    /**
     * 创建公司
     *
     * @param SysOrganization
     * @return
     */
    public int createSysOrganization(SysOrganization SysOrganization);

    /**
     * 修改公司
     *
     * @param SysOrganization
     * @return
     */
    public int updateSysOrganization(SysOrganization SysOrganization);

    /**
     * 修改公司状态(停用/启用、删除)
     *
     * @param states
     * @return
     */
    public int updateStatus(@Param("status") int status, @Param("list") List<Integer> list);

    /**
     * 验证唯一性
     */
    public List<SysOrganization> validateOrganOnly(SysOrganization SysOrganization);
}
