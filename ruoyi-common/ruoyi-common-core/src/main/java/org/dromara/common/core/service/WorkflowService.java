package org.dromara.common.core.service;

import org.dromara.common.core.domain.dto.CompleteTaskDTO;
import org.dromara.common.core.domain.dto.StartProcessDTO;

import java.util.List;
import java.util.Map;

/**
 * 通用 工作流服务
 *
 * @author may
 */
public interface WorkflowService {

    /**
     * 运行中的实例 删除程实例，删除历史记录，删除业务与流程关联信息
     *
     * @param businessIds 业务id
     * @return 结果
     */
    boolean deleteInstance(List<Long> businessIds);

    /**
     * 获取当前流程状态
     *
     * @param taskId 任务id
     * @return 状态
     */
    String getBusinessStatusByTaskId(Long taskId);

    /**
     * 获取当前流程状态
     *
     * @param businessId 业务id
     * @return 状态
     */
    String getBusinessStatus(String businessId);

    /**
     * 设置流程变量
     *
     * @param instanceId 流程实例id
     * @param variable   流程变量
     */
    void setVariable(Long instanceId, Map<String, Object> variable);

    /**
     * 按照业务id查询流程实例id
     *
     * @param businessId 业务id
     * @return 结果
     */
    Long getInstanceIdByBusinessId(String businessId);

    /**
     * 新增租户流程定义
     *
     * @param tenantId 租户id
     */
    void syncDef(String tenantId);

    /**
     * 启动流程
     *
     * @param startProcess 参数
     * @return 结果
     */
    Map<String, Object> startWorkFlow(StartProcessDTO startProcess);

    /**
     * 办理任务
     *
     * @param completeTask 参数
     * @return 结果
     */
    boolean completeTask(CompleteTaskDTO completeTask);
}
