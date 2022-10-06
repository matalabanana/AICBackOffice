package com.arkea.aicbackoffice.shared.commons.mapper;

import com.arkea.aicbackoffice.shared.service.bean.client.HistoriqueContratBean;

import com.arkea.aicservice.thrift.data.HistoriqueContrat;

import javax.annotation.Generated;

@Generated(

    value = "org.mapstruct.ap.MappingProcessor",

    date = "2022-05-16T09:05:53+0200",

    comments = "version: 1.1.0.Final, compiler: javac, environment: Java 1.8.0_102 (Oracle Corporation)"

)

public class HistoriqueContratMapperImpl implements HistoriqueContratMapper {

    @Override

    public HistoriqueContratBean alimenter(HistoriqueContrat req) {

        if ( req == null ) {

            return null;
        }

        HistoriqueContratBean historiqueContratBean = new HistoriqueContratBean();

        historiqueContratBean.setTimeStamp( map( req.getDateHistorique() ) );

        historiqueContratBean.setCodeEtat( req.getEtat() );

        historiqueContratBean.setTexteCommentaire( req.getTexteCommentaire() );

        return historiqueContratBean;
    }

    @Override

    public HistoriqueContrat alimenter(HistoriqueContratBean req) {

        if ( req == null ) {

            return null;
        }

        HistoriqueContrat historiqueContrat = new HistoriqueContrat();

        historiqueContrat.setEtat( req.getCodeEtat() );

        historiqueContrat.setDateHistorique( map( req.getTimeStamp() ) );

        historiqueContrat.setTexteCommentaire( req.getTexteCommentaire() );

        return historiqueContrat;
    }
}

