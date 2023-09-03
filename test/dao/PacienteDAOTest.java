/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package dao;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import modelo.Convenio;
import modelo.Paciente;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rosilane
 */
public class PacienteDAOTest {
    
   // private PacienteDAO pacienteDAO;
    
    public PacienteDAOTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
     PacienteDAO   pacienteDAO = new PacienteDAO();
     Paciente pac = new Paciente();
     
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of cadastrarPaciente method, of class PacienteDAO.
     */
    @Test
    public void testCadastrarPaciente() throws Exception {
        PacienteDAO pacienteDAO = new PacienteDAO();
         SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("cadastrarPaciente");
        Paciente pac = new Paciente();
        
        pac.setNome("fulano de tal");
        pac.setCpf("01671110277");
        pac.setRg("26013835");
        pac.setEndereco("rua tal");
        pac.setTelefone("92981336790");
        pac.setEmail("fulano@gmail.com");
        pac.setDataNascimento(sdf.parse("14/09/1993"));
        
         pac.setConvenio(1);
        pacienteDAO.cadastrarPaciente(pac);
       // fail("The test case is a prototype.");
    }

   
    
}
