package com.xianzaishi.wms.common.dao.itf;

import java.util.List;
import java.util.Map;

import com.xianzaishi.wms.common.vo.BaseVO;
import com.xianzaishi.wms.common.vo.QueryVO;

public interface IBaseDao<T extends BaseVO, M extends QueryVO> {
	/**
	 * ��Ӷ���.��������.
	 */
	public Object addDO(T baseDO);

	// ���¶���
	public Boolean updateDO(T baseDO);

	// ����ID��ȡ����
	public T getDOByID(Long id);

	// ����ID��ȡ����
	@Deprecated
	public T getDOByID(Long id, String className);

	// ��ѯ����
	public List<T> queryDO(M queryVO);

	public List<T> queryDO(String sqlId, Map<String, Object> conditions);

	// ��ѯ����
	@Deprecated
	public List<T> queryDO(M queryVO, String className);

	// ��ѯ��������
	public Integer queryCount(M queryVO);

	// ��ѯ��������
	@Deprecated
	public Integer queryCount(M queryVO, String className);

	// �Զ��� sqlmap �еĲ�ѯ����ID
	@Deprecated
	public Integer queryCount(M queryVO, String className, String sqlId);

	// ����ɾ������
	@Deprecated
	public Boolean deleteDO(T baseDO);

	// ����ɾ������
	public Boolean deleteDO(Long id);

	// �߼�ɾ������
	@Deprecated
	public Boolean delDO(T baseDO);

	// �߼�ɾ������
	public Boolean delDO(Long id);

	/**
	 * �����߼�ɾ��
	 */
	public Boolean delDOBatch(Long... id);

	/**
	 * ��������DR���.�ɲ���baseDO���Ƹ��·�Χ.
	 * 
	 * @param dr
	 *            - Ҫ���µ�DR�ֶ�ֵ
	 * @param baseDO
	 *            - �������ݸ��·�Χ. ���Ϊnull,�׳�BizException�쳣.
	 * @return Ӱ�����������.
	 * @exception IllegalArgumentException
	 *                ������baseDOΪnullʱ.
	 */
	public int batchUpdateDr(short dr, T baseDO);

	public Boolean nihao batchAddDO(List<T> baseDOs);

	public Boolean batchModifyDO(List<T> baseDOs);

	public Boolean batchDeleteDO(List<T> baseDOs);

	public Boolean batchDeleteDOByID(List<Long> ids);

	public Boolean batchDeleteDOPhysics(List<T> baseDOs);

	public Boolean batchDeleteDOByIDPhysics(List<Long> ids);
}
