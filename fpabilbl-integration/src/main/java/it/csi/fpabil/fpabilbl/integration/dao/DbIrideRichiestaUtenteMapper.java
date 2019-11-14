package it.csi.fpabil.fpabilbl.integration.dao;

import it.csi.fpabil.fpabilbl.integration.dto.DbIrideRichiestaUtente;
import it.csi.fpabil.fpabilbl.integration.dto.DbIrideRichiestaUtenteExample;
import it.csi.fpabil.fpabilbl.integration.dto.DbIrideRichiestaUtenteKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DbIrideRichiestaUtenteMapper {
    long countByExample(DbIrideRichiestaUtenteExample example);

    int deleteByExample(DbIrideRichiestaUtenteExample example);

    int deleteByPrimaryKey(DbIrideRichiestaUtenteKey key);

    int insert(DbIrideRichiestaUtente record);

    int insertSelective(DbIrideRichiestaUtente record);

    List<DbIrideRichiestaUtente> selectByExample(DbIrideRichiestaUtenteExample example);

    DbIrideRichiestaUtente selectByPrimaryKey(DbIrideRichiestaUtenteKey key);

    int updateByExampleSelective(@Param("record") DbIrideRichiestaUtente record, @Param("example") DbIrideRichiestaUtenteExample example);

    int updateByExample(@Param("record") DbIrideRichiestaUtente record, @Param("example") DbIrideRichiestaUtenteExample example);

    int updateByPrimaryKeySelective(DbIrideRichiestaUtente record);

    int updateByPrimaryKey(DbIrideRichiestaUtente record);
}