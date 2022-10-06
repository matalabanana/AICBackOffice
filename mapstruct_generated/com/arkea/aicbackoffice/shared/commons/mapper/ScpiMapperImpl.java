package com.arkea.aicbackoffice.shared.commons.mapper;

import com.arkea.aicbackoffice.shared.service.bean.client.ScpiBean;

import com.arkea.aicservice.thrift.data.Scpi;

import javax.annotation.Generated;

@Generated(

    value = "org.mapstruct.ap.MappingProcessor",

    date = "2022-05-16T09:05:53+0200",

    comments = "version: 1.1.0.Final, compiler: javac, environment: Java 1.8.0_102 (Oracle Corporation)"

)

public class ScpiMapperImpl implements ScpiMapper {

    @Override

    public ScpiBean alimenter(Scpi req) {

        if ( req == null ) {

            return null;
        }

        ScpiBean scpiBean = new ScpiBean();

        scpiBean.setBicScpi( req.getBicScpi() );

        scpiBean.setCapMaxStatutaire( req.getCapMaxStatutaire() );

        scpiBean.setCodeEfs( req.getCodeEfs() );

        scpiBean.setCodeSCPI( req.getCodeSCPI() );

        scpiBean.setDateAgrementAMF( mapDate( req.getDateAgrementAMF() ) );

        scpiBean.setDateClotureCom( mapDate( req.getDateClotureCom() ) );

        scpiBean.setDateOuvertureCom( mapDate( req.getDateOuvertureCom() ) );

        scpiBean.setIbanScpi( req.getIbanScpi() );

        scpiBean.setMinPremiereSouscription( req.getMinPremiereSouscription() );

        scpiBean.setMinSouscriptionSuivante( req.getMinSouscriptionSuivante() );

        scpiBean.setMoisJouissance( req.getMoisJouissance() );

        scpiBean.setMontantLab( req.getMontantLab() );

        scpiBean.setNbPartAugmentK( (int) req.getNbPartAugmentK() );

        scpiBean.setNumAgrementAMF( req.getNumAgrementAMF() );

        scpiBean.setNumAss( req.getNumAss() );

        scpiBean.setPourcentageCommission( req.getPourcentageCommission() );

        scpiBean.setPrixUnitaire( req.getPrixUnitaire() );

        scpiBean.setTexteRCS( req.getTexteRCS() );

        scpiBean.setTypeCapital( req.getTypeCapital() );

        scpiBean.setNomSCPI( req.getNomSCPI() );

        return scpiBean;
    }

    @Override

    public Scpi alimenter(ScpiBean req) {

        if ( req == null ) {

            return null;
        }

        Scpi scpi = new Scpi();

        scpi.setCodeEfs( req.getCodeEfs() );

        scpi.setNomSCPI( req.getNomSCPI() );

        scpi.setTypeCapital( req.getTypeCapital() );

        scpi.setCapMaxStatutaire( req.getCapMaxStatutaire() );

        scpi.setNumAgrementAMF( req.getNumAgrementAMF() );

        scpi.setDateAgrementAMF( map( req.getDateAgrementAMF() ) );

        scpi.setNumAss( req.getNumAss() );

        scpi.setTexteRCS( req.getTexteRCS() );

        scpi.setMontantLab( req.getMontantLab() );

        scpi.setMoisJouissance( req.getMoisJouissance() );

        scpi.setPourcentageCommission( req.getPourcentageCommission() );

        scpi.setPrixUnitaire( req.getPrixUnitaire() );

        scpi.setMinPremiereSouscription( req.getMinPremiereSouscription() );

        scpi.setMinSouscriptionSuivante( req.getMinSouscriptionSuivante() );

        scpi.setNbPartAugmentK( req.getNbPartAugmentK() );

        scpi.setBicScpi( req.getBicScpi() );

        scpi.setIbanScpi( req.getIbanScpi() );

        scpi.setDateOuvertureCom( map( req.getDateOuvertureCom() ) );

        scpi.setDateClotureCom( map( req.getDateClotureCom() ) );

        scpi.setCodeSCPI( req.getCodeSCPI() );

        return scpi;
    }
}

