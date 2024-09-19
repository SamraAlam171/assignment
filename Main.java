public class Main{
public static void main(String args[]){

//instantiation
Artist artist = new Artist("Thomos");
Artwork a1 = new Artwork("Starry night", 1999, artist);
Artwork a2 = new Artwork("Starry night", 1899);

artist.displayInfo();
a1.displayInfo();
a2.displayInfo();


//shallow & deep copy
Artwork shallowCopy = a1.shallowCopy();

Artwork deepCopy = a1.deepCopy();



}
}

//Samra Alam
//sp24-bse-137
