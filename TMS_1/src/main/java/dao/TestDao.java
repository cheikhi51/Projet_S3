package dao;

import java.util.Date;
import java.util.List;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Demande;
import entities.Vehicule;

public class TestDao {

		public static void main(String[] args) throws ParseException {
			VehiculeDaoImpl dao=new VehiculeDaoImpl();
			DemandeDaoImpl dao2 = new DemandeDaoImpl();
			 // Format de la date que vous souhaitez
	        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

	        // Parsing de la date
	      //  Date maintenanceDate = dateFormat.parse("2023-01-01");			
			//Vehicule v1 = dao.save(new Vehicule("ABC123", "ModelX", "Red", 2022, "disponible", maintenanceDate, 4));
			//Vehicule v2 = dao.save(new Vehicule("ABC103", "ModelX", "Red", 2022, "disponible", maintenanceDate, 4));
			//System.out.println(a2.toString());
			//System.out.println(v1.toString());
			//System.out.println(v2.toString());
	        Date maintenanceDate = dateFormat.parse("01-01-2000");
	        Demande d1 =dao2.save(new Demande("pyoy", maintenanceDate, "i", "l", "hi", "kjkp", maintenanceDate, "en attente", "nn"));
	     System.out.println(d1.toString());
	        // List<Vehicule> arts=dao.vehiculesParMc("%%");
			 //if (arts.isEmpty()) {
		       //     System.out.println("Aucun article trouvé dans la base de données.");
			 //} else {
		       //     // Afficher tous les articles
		         //   System.out.println("Liste des articles :");
		           // for (Vehicule v : arts) {
		               // System.out.println("ID: " + a.getId() + ", Nom: " + a.getNom());
		            //	System.out.println(v.toString());
		            //}
		        //}
			
		}	
}
