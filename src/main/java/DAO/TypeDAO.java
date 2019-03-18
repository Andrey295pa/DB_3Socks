package DAO;

import Entyty.TypeEntity;
import Util.HibernateUtil;
import org.hibernate.Session;

import java.util.Scanner;

public class TypeDAO implements InterfaceDAO {
    public void add() {
        Scanner scanner= new Scanner(System.in);
        TypeEntity someType=new TypeEntity();
        System.out.println("Enter name type socks");
       // String name=scanner.nextLine();
        someType.setName(scanner.nextLine());
        someType.setId((short) '2');
        Session session=null;
        try{
            session= HibernateUtil.getSessionFuctory().openSession();
            session.beginTransaction();
            session.save(someType);
            session.getTransaction().commit();
            System.out.println("Add okk!!!!");
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }finally {
            if(session!=null && session.isOpen())
            {
                session.close();
            }
        }


    }

    public void update() {

    }

    public void select() {

    }
}
