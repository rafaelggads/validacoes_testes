/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.com.gilmarioarantes.validacpf.model.ValidaCPF;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Assert;

/**
 *
 * @author Aluno
 */
public class Teste {
    
    private ValidaCPF validacaoCpf;
    
    public Teste() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() 
    {
        validacaoCpf = new ValidaCPF();
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void testaCPFValido() 
     {
         try
         {
             Boolean resultado = validacaoCpf.isCPF("03404718160");
             Assert.assertTrue(resultado.equals(false));
         } catch (Exception e)
         {
             Assert.fail(e.getMessage());
         }
     }
     
     @Test
     public void testaDigitoInvalido() 
     {
         try
         {
             Boolean resultado = validacaoCpf.isCPF("03404718170");
             Assert.assertTrue(resultado.equals(false));
         } catch (Exception e)
         {
             Assert.fail(e.getMessage());
         }
     }
     
     @Test
     public void testaQuantidadeDeDigitosMaior() 
     {
         try
         {
             Boolean resultado = validacaoCpf.isCPF("03404718160787878");
             Assert.assertTrue(resultado.equals(false));
         } catch (Exception e)
         {
             Assert.fail(e.getMessage());
         }
     }
}
