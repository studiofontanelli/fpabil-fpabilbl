package it.csi.fpabil.fpabilbl.integration.dao;

import it.csi.fpabil.fpabilbl.integration.dto.TabDocIdentita;
import it.csi.fpabil.fpabilbl.integration.dto.TabDocIdentitaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TabDocIdentitaMapper {
    long countByExample(TabDocIdentitaExample example);

    int deleteByExample(TabDocIdentitaExample example);

    int deleteByPrimaryKey(String codTipoDocIdentita);

    int insert(TabDocIdentita record);

    int insertSelective(TabDocIdentita record);

    List<TabDocIdentita> selectByExample(TabDocIdentitaExample example);

    TabDocIdentita selectByPrimaryKey(String codTipoDocIdentita);

    int updateByExampleSelective(@Param("record") TabDocIdentita record, @Param("example") TabDocIdentitaExample example);

    int updateByExample(@Param("record") TabDocIdentita record, @Param("example") TabDocIdentitaExample example);

    int updateByPrimaryKeySelective(TabDocIdentita record);

    int updateByPrimaryKey(TabDocIdentita record);
}