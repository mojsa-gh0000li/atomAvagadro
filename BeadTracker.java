import java.util.ArrayList;

public class BeadTracker {
// NIMA SAEIDI / SANA GHORBANI / SANA GHOLINAVAZ / BITA RAZPOOR
 public static void main(String[] args){
     int P=Integer.parseInt(args[0]);
     double tue=Double.parseDouble(args[1]);
     double delta=Double.parseDouble(args[2]);
     Picture p1;
     Picture p2;



     for (int i = 3; i < args.length-1 ; i++) {
         p1=new Picture(args[i]);
         p2=new Picture(args[i+1]);
         BeadFinder find1=new BeadFinder(p1,tue);

          BeadFinder find2=new BeadFinder(p2,tue);

         ArrayList<Blob> blob1=find1.getBeads(P);
         ArrayList<Blob> blob2=find2.getBeads(P);
         double size=0;
         boolean ok=true;
         for (int j = 0; j < blob1.size(); j++) {

             for (int k = 0; k < blob2.size(); k++){


                 double distance= blob2.get(k).distinceTo(blob1.get(j));
                 if (distance <= delta  &&  ok){
                     size=distance;
                     ok=false;
                 } else if (distance <= delta && distance < size) {
                     size=distance;
                 }
             }
             if (size>0){
                 System.out.format("%.4f\n",size);
             }
         }






















     }





 }


}
