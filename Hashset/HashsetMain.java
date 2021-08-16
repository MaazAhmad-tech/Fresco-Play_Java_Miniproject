public class HashsetMain {

    public static void main(String[] args){

        int n = 3;
        String squads = "Messi Saravia Tagliafico Pezzella Saravia Lamela Nehuen Gurpreet Rahul Golui Sunil Karanjit Anirudh Jeje Vishal Saravia Tagliafico Pezzella Saravia Lamela Nehuen Gurpreet Rahul Golui Sunil Karanjit Gurpreet Rahul Golui Sunil Karanjit Anirudh Jeje Vishal#Messi Jeje Sunil Karanjit Vishal Raynier Nikhil Casco Mercado Borges Amarjit Fernandes Manvir Dessai Udanta Messi Jeje Sunil Karanjit Vishal Raynier Nikhil Casco Mercado Borges Amarjit Fernandes#Sunil Karanjit Chhangte Dessai Udanta Anirudh Borges Amarjit Jeje Vishal Lamela Nehuen Marcos Leandro Celso Chhangte Dessai Udanta Anirudh Borges Amarjit Jeje Vishal Lamela Nehuen Marcos Leandro Celso";
        int s1 = 1, s2 = 2;

        System.out.println(Hashset.getOut(n, squads, s1, s2));
    }
}

/*

@Test
    public void testGetOut1() throws IOException {
        String output = hashset.getOut(4, "Ronaldo Eder Andre Bruma Goncalo Jota Daniel Patrício Ricardo Domingos Semedo Bernardo Pereira Bruno Pizzi Paciencia Jota Daniel Patrício Ronaldo Eder Andre Bruma Ricardo Domingos#Ronaldo Eder Andre Bruma Goncalo Joao Dyego Jose Nelson Pepe Mario Pereira Rafa Renato Ferro Bruma Goncalo Joao Dyego Jose Nelson Pepe Mario Pereira#Ronaldo Eder Andre Bruma Goncalo Jota Daniel Patrício Nelson Pepe Mario Pereira Rafa Renato Ferro Daniel Patrício Nelson Pepe Mario Pereira Rafa Renato#Ronaldo Eder Andre Bruma Goncalo Joao Dyego Jose Ricardo Domingos Semedo Bernardo Pereira Bruno Pizzi", 1, 4);
        String[] stringArray = output.split(", ");
        String actual = sortItOut(stringArray[0])+sortItOut(stringArray[1]);
        assertEquals(-1920977219, actual.hashCode());
    }

---------------------------------
*  @Test
    public void testGetOut4() throws IOException {
        String output = hashset.getOut(3, "Messi Saravia Tagliafico Pezzella Saravia Lamela Nehuen Gurpreet Rahul Golui Sunil Karanjit Anirudh Jeje Vishal Saravia Tagliafico Pezzella Saravia Lamela Nehuen Gurpreet Rahul Golui Sunil Karanjit Gurpreet Rahul Golui Sunil Karanjit Anirudh Jeje Vishal#Messi Jeje Sunil Karanjit Vishal Raynier Nikhil Casco Mercado Borges Amarjit Fernandes Manvir Dessai Udanta Messi Jeje Sunil Karanjit Vishal Raynier Nikhil Casco Mercado Borges Amarjit Fernandes#Sunil Karanjit Chhangte Dessai Udanta Anirudh Borges Amarjit Jeje Vishal Lamela Nehuen Marcos Leandro Celso Chhangte Dessai Udanta Anirudh Borges Amarjit Jeje Vishal Lamela Nehuen Marcos Leandro Celso", 1, 2);
        String[] stringArray = output.split(", ");
        String actual = sortItOut(stringArray[0])+sortItOut(stringArray[1]);
        assertEquals(-516258268, actual.hashCode());
    }*/