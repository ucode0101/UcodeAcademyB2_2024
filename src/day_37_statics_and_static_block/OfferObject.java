package day_37_statics_and_static_block;

import java.util.ArrayList;
import java.util.Arrays;

public class OfferObject {
    public static void main(String[] args) {

        Offer jobOffer = new Offer();
        jobOffer.setInfo("New Jersy","Bloomberg", 180000.5, true);

        Offer jobOffer2 = new Offer();
        jobOffer2.setInfo("Chicago","Apple",189000.0, true);

        Offer jobOffer3 = new Offer();

        jobOffer3.setInfo("PA","Comcast",167500.0, true);

        System.out.println(jobOffer);
        System.out.println(jobOffer2);
        System.out.println(jobOffer3);

        System.out.println("====================================================");

        ArrayList<Offer> jobOffers = new ArrayList<>(Arrays.asList(jobOffer, jobOffer2,jobOffer3));

        Offer [] offers = {jobOffer, jobOffer2, jobOffer3};

        System.out.println(jobOffers);
        System.out.println(Arrays.toString(offers));



    }
}
