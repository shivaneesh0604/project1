public class register extends login{
    register(){
        
    }

    register(String mail,String password)
    {
        int i=0;
        credentials c = new credentials();
        c.mail.add(i, mail);
        c.password.add(i, password);
        i++;
        for(i=0;i<c.mail.size();i++)
        {
            System.out.println(c.mail(i));
            System.out.println(c.password);
        }
    }
}