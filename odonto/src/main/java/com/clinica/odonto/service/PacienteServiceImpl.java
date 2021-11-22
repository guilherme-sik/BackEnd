package com.clinica.odonto.service;

import com.clinica.odonto.domain.Dentista;
import com.clinica.odonto.domain.Endereco;
import com.clinica.odonto.domain.Paciente;
import com.clinica.odonto.util.UtilDate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PacienteServiceImpl implements IPacienteService{

    private Endereco end1 = new Endereco(
            "Rua da constituição",
            "045",
            "Iaçú",
            "BA");

    private Dentista dent1 = new Dentista(
            1,
            "Diego",
            "Silva",
            "584628"
    );

    private Paciente pac1 = new Paciente(
            1,
            "Guilherme",
            "Santos",
            "gui.iga@outmail.com",
            "65924385973",
            UtilDate.dateToTimesatamp(new Date()),
            end1,
            dent1
            );

    private Endereco end2 = new Endereco(
            "Rua da glória",
            "984",
            "Igatu",
            "bahia");

    private Dentista dent2 = new Dentista(
            2,
            "Milena",
            "Cruz",
            "261357"
    );

    private Paciente pac2 = new Paciente(
            2,
            "Vitor",
            "Bomfim",
            "vic.iga@outmail.com",
            "37465091823",
            UtilDate.dateToTimesatamp(new Date()),
            end2,
            dent2);

    @Override
    public List<Paciente> listPaciente(){
        ArrayList<Paciente> paciente = new ArrayList<>();
        paciente.add(pac1);
        paciente.add(pac2);

        return paciente;
    }

    @Override
    public  Paciente buscaPorEmail(String email) {
        if(email.equalsIgnoreCase(pac1.getEmail()))
            return pac1;
        else if (email.equalsIgnoreCase(pac2.getEmail()))
            return pac2;

        return null;
    }
}
