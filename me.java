package com.xianzaishi.wms.common.dao.itf;

import java.util.List;
import java.util.Map;

import com.xianzaishi.wms.common.vo.BaseVO;
import com.xianzaishi.wms.common.vo.QueryVO;

public interface IBaseDao<T extends BaseVO, M extends QueryVO> {
	/**
	 * 添加对象.返回主键.
	 */
	public Object addDO(T baseDO);

	// 更新对象
	public Boolean updateDO(T baseDO);

	// 根据ID获取对象
	public T getDOByID(Long id);

	// 根据ID获取对象
	@Deprecated
	public T getDOByID(Long id, String className);

	// 查询对象
	public List<T> queryDO(M queryVO);

	public List<T> queryDO(String sqlId, Map<String, Object> conditions);

	// 查询对象
	@Deprecated
	public List<T> queryDO(M queryVO, String className);

	// 查询对象总数
	public Integer queryCount(M queryVO);

	// 查询对象总数
	@Deprecated
	public Integer queryCount(M queryVO, String className);

	// 自定义 sqlmap 中的查询条件ID
	@Deprecated
	public Integer queryCount(M queryVO, String className, String sqlId);

	// 物理删除对象
	@Deprecated
	public Boolean deleteDO(T baseDO);

	// 物理删除对象
	public Boolean deleteDO(Long id);

	// 逻辑删除对象
	@Deprecated
	public Boolean delDO(T baseDO);

	// 逻辑删除对象
	public Boolean delDO(Long id);

	/**
	 * 批量逻辑删除
	 */
	public Boolean delDOBatch(Long... id);

	/**
	 * 批量更新DR标记.由参数baseDO限制更新范围.
	 * 
	 * @param dr
	 *            - 要更新的DR字段值
	 * @param baseDO
	 *            - 限制数据更新范围. 如果为null,抛出BizException异常.
	 * @return 影响的数据行数.
	 * @exception IllegalArgumentException
	 *                当参数baseDO为null时.
	 */
	public int batchUpdateDr(short dr, T baseDO);

	public Boolean nihao batchAddDO(List<T> baseDOs);

	public Boolean batchModifyDO(List<T> baseDOs);

	public Boolean batchDeleteDO(List<T> baseDOs);

	public Boolean batchDeleteDOByID(List<Long> ids);

	public Boolean batchDeleteDOPhysics(List<T> baseDOs);

	public Boolean batchDeleteDOByIDPhysics(List<Long> ids);
}
