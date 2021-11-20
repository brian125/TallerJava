package Ejercicio18;

public class Ejercicio18 {

    public static void main(String[] args) {

        Serie listaSeries[]=new Serie[5];
        VideoJuego listaVideojuegos[]=new VideoJuego[5];

        listaSeries[0]=new Serie();
        listaSeries[1]=new Serie("Arcane", "League of Legends");
        listaSeries[2]=new Serie("Suits", 9, "Drama legal", "Aaron Korsh");
        listaSeries[3]=new Serie("One Piece", 9 ,"Anime", "Eiichiro Oda");
        listaSeries[4]=new Serie("Two And A Half Man", 12, "Comedia", "Chuck Lorre");

        listaVideojuegos[0]=new VideoJuego();
        listaVideojuegos[1]=new VideoJuego("Final Fantasy VII", 200, "Rol", "Square Enix");
        listaVideojuegos[2]=new VideoJuego("God of war 4", 30);
        listaVideojuegos[3]=new VideoJuego("League of Legends", 1, "MOBA", "Riot Games");
        listaVideojuegos[4]=new VideoJuego("Call of Duty: Warzon", 187, "Shooter", "Activision");

        listaSeries[1].entregar();
        listaSeries[4].entregar();
        listaVideojuegos[0].entregar();
        listaVideojuegos[3].entregar();

        int entregados=0;
        for(int i=0;i<5;i++){
            if(listaSeries[i].isEntregado()){
                entregados+=1;
                listaSeries[i].devolver();
            }
            if(listaVideojuegos[i].isEntregado()){
                entregados+=1;
                listaVideojuegos[i].devolver();
            }
        }

        System.out.println("Hay "+entregados+" articulos entregados");

        Serie serieMayor=listaSeries[0];
        VideoJuego videojuegoMayor=listaVideojuegos[0];

        for(int i=1;i<listaSeries.length;i++){
            if(listaSeries[i].compareTo(serieMayor) == "Mayor"){
                serieMayor=listaSeries[i];
            }
            if(listaVideojuegos[i].compareTo(videojuegoMayor)== "Mayor"){
                videojuegoMayor=listaVideojuegos[i];
            }

        }

        //Mostramos toda la informacion del videojuego y serie mayor
        System.out.println(videojuegoMayor.toString());
        System.out.println(serieMayor.toString());

    }

}
