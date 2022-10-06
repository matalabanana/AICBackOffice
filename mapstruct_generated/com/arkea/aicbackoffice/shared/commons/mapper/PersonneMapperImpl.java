package com.arkea.aicbackoffice.shared.commons.mapper;

import com.arkea.aicbackoffice.shared.service.bean.client.PersonneBean;

import com.arkea.aicservice.thrift.data.Personne;

import javax.annotation.Generated;

@Generated(

    value = "org.mapstruct.ap.MappingProcessor",

    date = "2022-05-16T09:05:53+0200",

    comments = "version: 1.1.0.Final, compiler: javac, environment: Java 1.8.0_102 (Oracle Corporation)"

)

public class PersonneMapperImpl implements PersonneMapper {

    @Override

    public PersonneBean alimenter(Personne req) {

        if ( req == null ) {

            return null;
        }

        PersonneBean personneBean = new PersonneBean();

        personneBean.setAdresse( req.getAdresse() );

        personneBean.setAdresseResidFiscale( req.getAdresseResidFiscale() );

        personneBean.setCapaciteJuridique( req.getCapaciteJuridique() );

        personneBean.setDateNaissance( map( req.getDateNaissance() ) );

        personneBean.setLieuNaissance( req.getLieuNaissance() );

        personneBean.setCodeDepartementNaissance( req.getCodeDepartementNaissance() );

        personneBean.setNationalite( req.getNationalite() );

        personneBean.setNom( req.getNom() );

        personneBean.setNomPatronymique( req.getNomPatronymique() );

        personneBean.setNumeroClient( req.getNumeroClient() );

        personneBean.setNumeroClientDist( req.getNumeroClientDist() );

        personneBean.setPrenom( req.getPrenom() );

        personneBean.setProfession( req.getProfession() );

        personneBean.setRegimeMatrimonial( req.getRegimeMatrimonial() );

        personneBean.setSituationFamiliale( req.getSituationFamiliale() );

        return personneBean;
    }

    @Override

    public Personne alimenter(PersonneBean req) {

        if ( req == null ) {

            return null;
        }

        Personne personne = new Personne();

        personne.setNom( req.getNom() );

        personne.setPrenom( req.getPrenom() );

        personne.setNomPatronymique( req.getNomPatronymique() );

        personne.setAdresse( req.getAdresse() );

        personne.setAdresseResidFiscale( req.getAdresseResidFiscale() );

        personne.setDateNaissance( map( req.getDateNaissance() ) );

        personne.setLieuNaissance( req.getLieuNaissance() );

        personne.setCodeDepartementNaissance( req.getCodeDepartementNaissance() );

        personne.setNationalite( req.getNationalite() );

        personne.setCapaciteJuridique( req.getCapaciteJuridique() );

        personne.setSituationFamiliale( req.getSituationFamiliale() );

        personne.setRegimeMatrimonial( req.getRegimeMatrimonial() );

        personne.setNumeroClient( req.getNumeroClient() );

        personne.setNumeroClientDist( req.getNumeroClientDist() );

        personne.setProfession( req.getProfession() );

        return personne;
    }
}

