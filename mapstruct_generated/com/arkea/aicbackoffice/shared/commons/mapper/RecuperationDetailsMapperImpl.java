package com.arkea.aicbackoffice.shared.commons.mapper;

import com.arkea.aicbackoffice.shared.service.bean.RecuperationDetailRequestBean;

import com.arkea.aicbackoffice.shared.service.bean.RecuperationDetailResponseBean;

import com.arkea.aicservice.thrift.data.RecuperationDetailRequest;

import com.arkea.aicservice.thrift.data.RecuperationDetailResponse;

import javax.annotation.Generated;

@Generated(

    value = "org.mapstruct.ap.MappingProcessor",

    date = "2022-05-16T09:05:53+0200",

    comments = "version: 1.1.0.Final, compiler: javac, environment: Java 1.8.0_102 (Oracle Corporation)"

)

public class RecuperationDetailsMapperImpl implements RecuperationDetailsMapper {

    @Override

    public RecuperationDetailRequest alimenter(RecuperationDetailRequestBean req) {

        if ( req == null ) {

            return null;
        }

        RecuperationDetailRequest recuperationDetailRequest = new RecuperationDetailRequest();

        recuperationDetailRequest.setContrat( map( req.getContrat() ) );

        return recuperationDetailRequest;
    }

    @Override

    public RecuperationDetailResponseBean alimenter(RecuperationDetailResponse req) {

        if ( req == null ) {

            return null;
        }

        RecuperationDetailResponseBean recuperationDetailResponseBean = new RecuperationDetailResponseBean();

        recuperationDetailResponseBean.setContext( map( req.getContext() ) );

        recuperationDetailResponseBean.setDetails( map( req.getDetails() ) );

        return recuperationDetailResponseBean;
    }
}

