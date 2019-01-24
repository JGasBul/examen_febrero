import org.hibernate.Session;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola mundo");
		Session session = HibernateUtilities.getSessionFactory().openSession();
		session.beginTransaction();
		Festival f=new Festival("Castellon Mediaval","Castellon","10/12/2020");
		session.save(f);
		Festival f1=new Festival("Valencia Mediaval","Valencia","10/12/2020");
		session.save(f1);
		session.getTransaction().commit();

		//----------------------------------------------------------------------------------

		session.beginTransaction();
		Actuacion act=new Actuacion(50,"22:30");
		session.save(act);
		Actuacion act1=new Actuacion(12,"15:30");
		session.save(act1);
		session.getTransaction().commit();

		//----------------------------------------------------------------------------------
		session.beginTransaction();
		Grupo g=new Grupo("La vaina loca","Rock",5);
		session.save(g);
		Grupo g1=new Grupo("I play Pokemon Go","PoP",2);
		session.save(g1);
		session.getTransaction().commit();
		//----------------------------------------------------------------------------------
		session.beginTransaction();
		Festival fr=session.get(Festival.class, "Castellon Mediaval");
		System.out.println(fr.toString());

		Festival fr1=session.get(Festival.class, "Valencia Mediaval");
		System.out.println(fr1.toString());

		Grupo gr=session.get(Grupo.class,"La vaina loca");
		System.out.println(gr.toString());

		Grupo gr1=session.get(Grupo.class,"I play Pokemon Go");
		System.out.println(gr1.toString());

		Actuacion actr=session.get(Actuacion.class, 50);
		System.out.println(actr.toString());

		Actuacion actr1=session.get(Actuacion.class, 12);
		System.out.println(actr1.toString());

		session.getTransaction().commit();
		//----------------------------------------------------------------------------------
		session.close();
	}

}
