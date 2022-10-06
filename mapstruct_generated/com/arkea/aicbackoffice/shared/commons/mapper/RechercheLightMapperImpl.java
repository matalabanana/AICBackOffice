package com.arkea.aicbackoffice.shared.commons.mapper;

import com.arkea.aicbackoffice.shared.service.bean.RechercheLightRequestBean;

import com.arkea.aicbackoffice.shared.service.bean.RechercheLightResponseBean;

import com.arkea.aicbackoffice.shared.service.bean.client.ContratBean;

import com.arkea.aicservice.thrift.data.RechercheLightRequest;

import com.arkea.aicservice.thrift.data.RechercheLightResponse;

import java.util.List;

import javax.annotation.Generated;

@Generated(

    value = "org.mapstruct.ap.MappingProcessor",

    date = "2022-05-16T09:05:53+0200",

    comments = "version: 1.1.0.Final, compiler: javac, environment: Java 1.8.0_102 (Oracle Corporation)"

)

public class RechercheLightMapperImpl implements RechercheLightMapper {

    @Override

    public RechercheLightRequest alimenter(RechercheLightRequestBean req) {

        if ( req == null ) {

            return null;
        }

        RechercheLightRequest rechercheLightRequest = new RechercheLightRequest();

        rechercheLightRequest.setNomClient( req.getNomClient() );

        rechercheLightRequest.setNomScpi( req.getNomScpi() );

        rechercheLightRequest.setEtat( req.getEtat() );

        rechercheLightRequest.setDistributeur( req.getDistributeur() );

        rechercheLightRequest.setDateDebut( req.getDateDebut() );

        rechercheLightRequest.setDateFin( req.getDateFin() );

        return rechercheLightRequest;
    }

    @Override

    public RechercheLightResponseBean alimenter(RechercheLightResponse res) {

        if ( res == null ) {

            return null;
        }

        RechercheLightResponseBean rechercheLightResponseBean = new RechercheLightResponseBean();

        rechercheLightResponseBean.setContext( map( res.getContext() ) );

        List<ContratBean> list = map( res.getContrats() );

        if ( list != null ) {

            rechercheLightResponseBean.setContrats( list );
        }

        return rechercheLightResponseBean;
    }
}

