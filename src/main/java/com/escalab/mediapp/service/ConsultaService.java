package com.escalab.mediapp.service;

import com.escalab.mediapp.dto.ConsultaDTO;
import com.escalab.mediapp.dto.ConsultaListaExamenDTO;
import com.escalab.mediapp.entity.Consulta;
import java.util.List;

public interface ConsultaService extends ICRUD<Consulta> {
  List<ConsultaDTO> findAllConsultas();
  Consulta registrarTransaccional(ConsultaListaExamenDTO consultaDTO);
}
