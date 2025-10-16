package decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BebidaTest {

    @Test
    void deveRetornarPrecoBebidaBase() {
        Bebida bebida = new Espresso(5.00f);

        assertEquals(5.00f, bebida.getPreco());
    }

    @Test
    void deveRetornarPrecoBebidaComLatte() {
        Bebida bebida = new Latte(new Espresso(5.00f));

        assertEquals(6.50f, bebida.getPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoBebidaComChocolate() {
        Bebida bebida = new Chocolate(new Espresso(5.00f));

        assertEquals(6.00f, bebida.getPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoBebidaComChantilly() {
        Bebida bebida = new Chantilly(new Espresso(5.00f));

        assertEquals(5.75f, bebida.getPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoBebidaComCaramelo() {
        Bebida bebida = new Caramelo(new Espresso(5.00f));

        assertEquals(5.50f, bebida.getPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoBebidaComLatteMaisChocolate() {
        // Mocha
        Bebida bebida = new Latte(new Chocolate(new Espresso(5.00f)));

        assertEquals(7.80f, bebida.getPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoBebidaComLatteMaisChantilly() {
        // Latte com Chantilly
        Bebida bebida = new Latte(new Chantilly(new Espresso(5.00f)));

        assertEquals(7.475f, bebida.getPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoBebidaComChocolateMaisChantilly() {
        // Chocolate com Chantilly
        Bebida bebida = new Chocolate(new Chantilly(new Espresso(5.00f)));

        assertEquals(6.90f, bebida.getPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoBebidaComLatteMaisChocolateMaisChantilly() {
        // Mocha completo
        Bebida bebida = new Latte(new Chocolate(new Chantilly(new Espresso(5.00f))));

        assertEquals(8.97f, bebida.getPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoBebidaComTodosIngredientes() {
        // Bebida especial da casa
        Bebida bebida = new Latte(new Chocolate(new Chantilly(new Caramelo(new Espresso(5.00f)))));

        assertEquals(9.867f, bebida.getPreco(), 0.01f);
    }

    @Test
    void deveRetornarDescricaoBebidaBase() {
        Bebida bebida = new Espresso();

        assertEquals("Espresso", bebida.getDescricao());
    }

    @Test
    void deveRetornarDescricaoBebidaComLatte() {
        // Latte
        Bebida bebida = new Latte(new Espresso());

        assertEquals("Espresso + Latte", bebida.getDescricao());
    }

    @Test
    void deveRetornarDescricaoBebidaComChocolate() {
        Bebida bebida = new Chocolate(new Espresso());

        assertEquals("Espresso + Chocolate", bebida.getDescricao());
    }

    @Test
    void deveRetornarDescricaoBebidaComChantilly() {
        Bebida bebida = new Chantilly(new Espresso());

        assertEquals("Espresso + Chantilly", bebida.getDescricao());
    }

    @Test
    void deveRetornarDescricaoBebidaComCaramelo() {
        Bebida bebida = new Caramelo(new Espresso());

        assertEquals("Espresso + Caramelo", bebida.getDescricao());
    }

    @Test
    void deveRetornarDescricaoBebidaComLatteMaisChocolate() {
        // Mocha
        Bebida bebida = new Latte(new Chocolate(new Espresso()));

        assertEquals("Espresso + Chocolate + Latte", bebida.getDescricao());
    }

    @Test
    void deveRetornarDescricaoBebidaComLatteMaisChantilly() {
        // Latte com Chantilly
        Bebida bebida = new Latte(new Chantilly(new Espresso()));

        assertEquals("Espresso + Chantilly + Latte", bebida.getDescricao());
    }

    @Test
    void deveRetornarDescricaoBebidaComChocolateMaisChantilly() {
        Bebida bebida = new Chocolate(new Chantilly(new Espresso()));

        assertEquals("Espresso + Chantilly + Chocolate", bebida.getDescricao());
    }

    @Test
    void deveRetornarDescricaoBebidaComLatteMaisChocolateMaisChantilly() {
        // Mocha especial
        Bebida bebida = new Latte(new Chocolate(new Chantilly(new Espresso())));

        assertEquals("Espresso + Chantilly + Chocolate + Latte", bebida.getDescricao());
    }

    @Test
    void deveRetornarDescricaoBebidaComTodosIngredientes() {
        // Bebida especial completa
        Bebida bebida = new Latte(new Chocolate(new Chantilly(new Caramelo(new Espresso()))));

        assertEquals("Espresso + Caramelo + Chantilly + Chocolate + Latte", bebida.getDescricao());
    }

}
