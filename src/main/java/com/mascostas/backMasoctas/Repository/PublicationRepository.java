/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mascostas.backMasoctas.Repository;
//lo de aca abajo lo importo yo
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.mascostas.backMasoctas.Model.PublicationModel ; // traigo mi model de tasks que cree

/**
 *
 * @author edgar
 */
@Repository //mapeamos como repositorio
//la interface  extiende  de JpaRepository(que maneja repositorio JPA)
//en los parametros "<>" deben ir: <clase a persistir , tipo de dato de su ID>
public interface PublicationRepository extends JpaRepository<PublicationModel, Long>{
    
}
