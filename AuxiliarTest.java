

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * A classe de teste AuxiliarTest.
 *
 * @author  (seu nome)
 * @version (um número de versão ou data)
 */
public class AuxiliarTest
{
    /**
     * Construtor default para a classe de teste AuxiliarTest
     */
    public AuxiliarTest()
    {
    }

    /**
     * Define a .
     *
     * Chamado antes de cada método de caso de teste.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Chamado após cada método de teste de caso.
     */
    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void Teste1()
    {
        int[] x = {1,2,3,4,5,6,7,8,9,10};
        Auxiliar.init(50, 1, 10, x, 0);
    }
}

