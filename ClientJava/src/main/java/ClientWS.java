import proxy.BanqueService;
import proxy.BanqueWS;
import proxy.Compte;

public class ClientWS {

    public static void main(String[] args) {

        BanqueService stub = new BanqueWS().getBanqueServicePort();

        System.out.println("Le montant final aprés conversion "+stub.convert(2800 ));

        Compte cp= stub.getCompte(5);
        //System.out.println("Code du compte"+ cp.getCode());
        //System.out.println("Solde du compte " +cp.getSolde());

    }
}
