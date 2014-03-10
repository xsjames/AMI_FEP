package cn.hexing.util;

import java.util.HashMap;
import java.util.Map;

/**
 * �кż��㹤��
 */
public class RowNumUtil {

    /**
     * ���㿪ʼ�ͽ����к�
     * @param pageNum ҳ��
     * @param pageSize ҳ��С��С�� 0 ��ʾ�������м�¼
     * @return ������ʼ�ͽ����кŵ� Map��"startRowNum" - ��ʼ��¼�ţ�����������"endRowNum" - ������¼�ţ�������
     */
    public static Map calcRowNum(int pageNum, int pageSize) {
        // ��ʼ��¼�ţ���������
        int startRowNum = (pageNum - 1) * pageSize;
        // ������¼�ţ�������
        int endRowNum = startRowNum + pageSize;
        if (pageSize < 0) {
            startRowNum = 0;
            endRowNum = Integer.MAX_VALUE;
        }
        
        Map params = new HashMap();
        params.put("startRowNum", new Integer(startRowNum));
        params.put("endRowNum", new Integer(endRowNum));
        
        return params;
    }
}