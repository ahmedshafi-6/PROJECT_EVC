import java.util.Scanner;

public class PROJECT_EVC {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Soo Geli Dial :");
        String Evcplus_1 = input.nextLine();
//        String Check = Evcplus_1.;

        if (Evcplus_1.equals("*770#")){
            System.out.print("-EVCplus-\n Fadlan Gili PIN-kaaga (Enter PIN): ");


//            QeybTa_Pinka :
            int Pin = input.nextInt();

            if (Pin == 4555){
                System.out.println("EVCPLUS");
                System.out.println("    1. Itus Haraaga");
                System.out.println("    2. Kaarka Hadalka");
                System.out.println("    3. Bixi Biil");
                System.out.println("    4. Uwareeji EVCPlus");
                System.out.println("    5. Warbixin Kooban");
                System.out.println("    6. Salaam Bank");
                System.out.println("    7. Mareynta");
                System.out.println("    8. Biilka Payment");
                System.out.println("    0. kabax");



//              Qiimaha Lacagta iyo Numberka

                double Haraage = 300;
                int Random_Kaarka = 613695270;

                int Evcplus = input.nextInt();


//          1. itus Haraaga

                if (Evcplus == 1){
                    System.out.println("Haraaga Xisaabtadu waa $"+Haraage);
                }
//            2. Kaarka Hadalka

                else if (Evcplus == 2){
                    System.out.println("Kaarka hadalka");
                    System.out.println("    1. ku shubo Airtime");
                    System.out.println("    2. ugu shubo Airtime");
                    System.out.println("    3. MIFI Packages");
                    System.out.println("    4. ku shubo internet");
                    System.out.println("    5. ugu shub qof kale (MMT)");



                    int Kushubo_airtime = input.nextInt();

//                              ku shub_AirTime ;

                    if (Kushubo_airtime == 1){

                        System.out.print("Fadlan Gili Lacagta : ");
                        int Amount_Kaarka = input.nextInt();
                        System.out.println("Ma hubtaa inaad $"+Amount_Kaarka+ " ugu shubtid undefined");
                        System.out.println("1. Haa");
                        System.out.println("2. Maye");

                        int Checking_Kaarkaga = input.nextInt();

                        if (Checking_Kaarkaga == 1){
                            System.out.println("waxaad ku Guuleystay in aad ku shubto $"+Amount_Kaarka+" Ku Hadal");
                        }
                        else {
                            System.out.println("Mahadsanid!.");
                        }
                    }


//                   2:  Ugu shubid Anfac plus

                    else if (Kushubo_airtime == 2){
                        System.out.println("Fadlan Geli Mobilka :");
                        int NumberKu_shubida = input.nextInt();
                        System.out.print("Fadlan Geli Lacagta : ");
                        int Amount = input.nextInt();
                        System.out.println("Ma hubtaa inaad $"+Amount + " u shubtid "+"252-"+NumberKu_shubida);
                        System.out.println("1. Haa");
                        System.out.println("2. Maye");
                        int Checking_Lacagta = input.nextInt();

//                         Hubinta LacagTa in aad Rabto in aad Dirto :

                        if (Checking_Lacagta == 1){
                            System.out.println("waad ku guuleystay in aad ugu shubto "+NumberKu_shubida +" ku hadal.");
                        }
                        else {
                            System.out.println("Mahadsanid!.");
                        }

                    }

//                     Ku shubo  Mifi :

                    else if (Kushubo_airtime == 3){
                        System.out.println("Evcplus \n 1: ku shubo data-da MIFI ");
                        int Mifi = input.nextInt();

//                        BilowGa_Ga MIFI Date

                        switch (Mifi){
                            case 1:
                                System.out.println("-Internet Bundle Recharge -");
                                System.out.println("1.isbuucle(Weakly) \n2.Malinle(Daily)\n3.Bille(MIFI)");

                                int date_Limited = input.nextInt();

                                switch (date_Limited){

                                    //                                        Qeybta kowaad Ee MIFi Date

                                    case 1:
                                        System.out.println("Fadlan Dooro bunle Ka");
                                        System.out.println("1.$5 = 10 GB");
                                        System.out.println("2.$10 = 25 GB");

                                        int date_Exchange = input.nextInt();

//                                        Qeybta ku shubid 5$ :

                                        if (date_Exchange == 1){
                                            System.out.print("Fadlan Geli MIFI user : " );
                                            int MIFI_user = input.nextInt();
                                            System.out.println("Ma hubtaa inaad $5 ugu shubtid "+MIFI_user);
                                            System.out.println("1.HAA\n2.MAYE");

                                            int Xaqiin = input.nextInt();
                                            if (Xaqiin == 1){
                                                System.out.println("waxa ugu shubtay 10GB "+MIFI_user);
//                                                System.out.println("haraagaagu waa $"+Haraage);
                                            }
                                            else {
                                                System.out.println("Macsalaamo");
                                            }
                                        }

//                                        Qeybta ku shubid 10$ :

                                        else if (date_Exchange == 2){
                                            System.out.print("Fadlan Geli MIFI user : " );
                                            int MIFI_user = input.nextInt();
                                            System.out.println("Ma hubtaa inaad $10 ugu shubtid "+MIFI_user);
                                            System.out.println("1.HAA\n2.MAYE");

                                            int Xaqiin = input.nextInt();
                                            if (Xaqiin == 1){
                                                System.out.println("waxa ugu shubtay 25GB "+MIFI_user);
//                                                System.out.println("haraagaagu waa $"+Haraage);
                                            }
                                            else {
                                                System.out.println("Macsalaamo");
                                            }
                                        }
                                        break;

                                    //                                        Qeybta lawaad Ee MIFi Date

                                    case 2:
                                        System.out.println("Fadlan Dooro bunle Ka");
                                        System.out.println("1.$1 = 2GB");
                                        System.out.println("2.$2 = 5GB");

                                        int date_Exchange_2 = input.nextInt();
                                        if (date_Exchange_2 == 1){
                                            System.out.print("Fadlan Geli MIFI user : " );
                                            int MIFI_user = input.nextInt();
                                            System.out.println("Ma hubtaa inaad $1 ugu shubtid "+MIFI_user);
                                            System.out.println("1.HAA\n2.MAYE");

                                            int Xaqiin = input.nextInt();
                                            if (Xaqiin == 1){
                                                System.out.println("waxa ugu shubtay 2GB "+MIFI_user);
//                                                System.out.println("haraagaagu waa $"+Haraage);
                                            }
                                            else {
                                                System.out.println("Macsalaamo");
                                            }
                                        }

//                                        Qeybta ku shubid 2$ :

                                        else if (date_Exchange_2 == 2){
                                            System.out.print("Fadlan Geli MIFI user : " );
                                            int MIFI_user = input.nextInt();
                                            System.out.println("Ma hubtaa inaad $2 ugu shubtid "+MIFI_user);
                                            System.out.println("1.HAA\n2.MAYE");

                                            int Xaqiin = input.nextInt();
                                            if (Xaqiin == 1){
                                                System.out.println("waxa ugu shubtay 5GB "+MIFI_user);
//                                                System.out.println("haraagaagu waa $"+Haraage);
                                            }
                                            else {
                                                System.out.println("Macsalaamo");
                                            }
                                        }
                                        break;

//                                        Qeybta sedexaad Ee MIFi Date

                                    case 3:
                                        System.out.println("Fadlan Dooro bunle Ka");
                                        System.out.println("1.$20 = 40 GB");
                                        System.out.println("2.$40 = 80 GB");
                                        System.out.println("3.$60 = 150 GB");
                                        System.out.println("4.$30 = Unlimited Month");

                                        int date_Exchange_3 = input.nextInt();

                                        //                                        Qeybta waa Qeybta kle 40Gb
                                        if (date_Exchange_3 == 1){
                                            System.out.print("Fadlan Geli MIFI user : " );
                                            int MIFI_user = input.nextInt();
                                            System.out.println("Ma hubtaa inaad $20 ugu shubtid "+MIFI_user);
                                            System.out.println("1.HAA\n2.MAYE");

                                            int Xaqiin = input.nextInt();
                                            if (Xaqiin == 1){
                                                System.out.println("waxa ugu shubtay 40GB "+MIFI_user);
//                                                System.out.println("haraagaagu waa $"+Haraage);
                                            }
                                            else {
                                                System.out.println("Macsalaamo");
                                            }
                                        }

//                                        Qeybta waa Qeybta kle 80Gb
                                        else if (date_Exchange_3 == 2){
                                            System.out.print("Fadlan Geli MIFI user : " );
                                            int MIFI_user = input.nextInt();
                                            System.out.println("Ma hubtaa inaad $40 ugu shubtid "+MIFI_user);
                                            System.out.println("1.HAA\n2.MAYE");

                                            int Xaqiin = input.nextInt();
                                            if (Xaqiin == 1){
                                                System.out.println("waxa ugu shubtay 80GB "+MIFI_user);
//                                                System.out.println("haraagaagu waa $"+Haraage);
                                            }
                                            else {
                                                System.out.println("Macsalaamo");
                                            }
                                        }
                                        else if (date_Exchange_3 == 3){
                                            System.out.print("Fadlan Geli MIFI user : " );
                                            int MIFI_user = input.nextInt();
                                            System.out.println("Ma hubtaa inaad $60 ugu shubtid "+MIFI_user);
                                            System.out.println("1.HAA\n2.MAYE");

                                            int Xaqiin = input.nextInt();
                                            if (Xaqiin == 1){
                                                System.out.println("waxa ugu shubtay 150GB "+MIFI_user);
//                                                System.out.println("haraagaagu waa $"+Haraage);
                                            }
                                            else {
                                                System.out.println("Macsalaamo");
                                            }
                                        }
                                        else if (date_Exchange_3 == 4){
                                            System.out.print("Fadlan Geli MIFI user : " );
                                            int MIFI_user = input.nextInt();
                                            System.out.println("Ma hubtaa inaad $30 ugu shubtid "+MIFI_user);
                                            System.out.println("1.HAA\n2.MAYE");

                                            int Xaqiin = input.nextInt();
                                            if (Xaqiin == 1){
                                                System.out.println("waxa ugu shubtay Unlimited Month "+MIFI_user);
//                                                System.out.println("haraagaagu waa $"+Haraage);
                                            }
                                            else {
                                                System.out.println("Macsalaamo");
                                            }
                                        }
                                        break;

                                }

                        }

                    }
                    else if (Kushubo_airtime == 4){
                        System.out.println("-- Fadlan Dooro numberka- ku shubeyso -- ");
                        System.out.println("1. isbuucle (Weekly)");
                        System.out.println("2. TIME BASED PACKAGES");
                        System.out.println("3. DATA");
                        System.out.println("4. Maalinle(Daily)");
                        System.out.println("5 .Bille (MIFI)");

                        int kushubashada = input.nextInt();
                        switch (kushubashada){
                            case 1:
                                System.out.print("Fadlan Geli Lacagta : ");
                                int Lacagta_ku_shubashada = input.nextInt();
                                System.out.println("Ma hubtaa in aad $"+Lacagta_ku_shubashada);
                                System.out.println("1. Haa \n2.Maye");

                                int Hubinta_ku_shubida = input.nextInt();
                                if (Hubinta_ku_shubida == 1 && Lacagta_ku_shubashada >=Haraage ){
                                    System.out.println("Haraagu kuma Filna No-Mobilka 252"+Random_Kaarka);

                                }
                                else if (Hubinta_ku_shubida == 2){
                                    System.out.println("Macsalaamo");
                                }
                                else {
                                    System.out.println("Waxa ku shubatay $"+Lacagta_ku_shubashada);
                                }

                                break;

//                                Time_Based QeybTisa
                            case 2:
                                System.out.println("Fadlan Geli LacagTa : ");
                                int Lacagta_ugu_shubida = input.nextInt();
                                System.out.println("Ma Hubtaa in aad $"+Lacagta_ugu_shubida);
                                System.out.println("1.Haa \n2.Maye");

//                                Checking :

                                int Hubinta_ugu_shubida = input.nextInt();
                                if (Hubinta_ugu_shubida == 1 && Lacagta_ugu_shubida >= Haraage){
                                    System.out.println("Haraagaagu xisaabtada kuma Filno No-Mobilka 252 "+Random_Kaarka);

                                }
                                else if (Hubinta_ugu_shubida == 2) {
                                    System.out.println("Macsalaamo");
                                }
                                else {
                                    System.out.println("Waxa Ugu shubatay $"+Lacagta_ugu_shubida);
                                }
                                break;
                        }
                    }
                }


//            3. Bixi Biil

                else if (Evcplus == 3) {
                    System.out.println("Bixi Biil");
                    System.out.println("1. Post Paid");
                    System.out.println("2. Ku iibso");

                    int Bixi_Biilka = input.nextInt();
                    if (Bixi_Biilka == 1) {
                        System.out.println("Post Paid");
                        System.out.println(" 1.Ogow Biilka.");
                        System.out.println(" 2.Bixi Biil.");
                        System.out.println(" 3.ka Bixi Biil.");

                        int Post_Paid = input.nextInt();

                        if (Post_Paid == 1){
                            System.out.println("error ocurred, please try again later");
                        }
                        else if (Post_Paid == 2){
                            System.out.print("Fadlin Geli Lacagta : ");
                            int Amount_Biilka = input.nextInt();

                            System.out.println("Ma Hubtaa in aad Bixinayso Biilka lacagta $"+Amount_Biilka +" :");
                            System.out.println(" 1.Haa");
                            System.out.println(" 2.Maye");

                            int Checking_Amount = input.nextInt();
                            if (Checking_Amount == 1){
                                System.out.println("Waxa aad Bixisay Biilka Lacagta $"+Amount_Biilka +".");
                            }
                            else {
                                System.out.println("Mahadsanid!.");
                            }
                        }

//                        Post_Paid ku shubo :

                        else if (Post_Paid == 3){
                            System.out.print("Fadlan Geli Mobilka :");
                            int NumberKu_shubida = input.nextInt();
                            System.out.print("Fadlan Geli Lacagta : ");
                            int Amount = input.nextInt();
                            System.out.println("Ma hubtaa inaad bixisid bill lacagtiisu tahay : $"+Amount+ " oo laga rabo " +
                                    "tel No "+NumberKu_shubida);
                            System.out.println("1. Haa");
                            System.out.println("2. Maye");
                            int Checking_Lacagta = input.nextInt();

//                         Hubinta LacagTa in aad Rabto in aad Dirto :

                            if (Checking_Lacagta == 1){
                                if (Haraage <= Amount){
                                    System.out.println("Haraaga Xisaabtaadu kuguma filna, mobile No: 252 "+Random_Kaarka);
                                }
                                else {
                                    double Result_Lacagaha = Haraage - Amount;
                                    System.out.println("Waxa aad bixisay biilka $"+Amount+" Mobilka No: 252"+NumberKu_shubida);
                                    System.out.println("Haraaga xisaabtaadu waa $"+Result_Lacagaha);
                                }

                            }
                            else {
                                System.out.println("Mahadsanid!.");
                            }
                        }
                    }


//                    2.Ku iibso

                    else if (Bixi_Biilka == 2){
                        System.out.print("Fadlan Geli aqoonsiga ganacsiga");
                    }
                }

//            4. U wareeji EVCplus

                else if (Evcplus == 4){
                    System.out.print("Fadlan Geli Mobile-ka :");
                    int Number = input.nextInt();
                    System.out.print("Fadlan Geli Lacagta : ");
                    int Amount = input.nextInt();
                    System.out.println("Ma hubtaa inaad $"+Amount + " u wareejisid "+"252 "+Number);
                    System.out.println("1. Haa");
                    System.out.println("2. Maye");
                    int Checking_Lacagta = input.nextInt();

//                Hubinta LacagTa in aad Rabto in aad Dirto :
                    if (Checking_Lacagta == 1){
                        if (Haraage <= Amount){
                            System.out.println("Haraaga Xisaabtaadu kuguma filna, mobile No: 252 "+Random_Kaarka);
                        }
                        else {
                            double Result_Lacagaha = Haraage - Amount;
                            System.out.println("Haraaga xisaabtaadu waa "+Result_Lacagaha);
                        }

                    }
                    else {
                        System.out.println("Mahadsanid!.");
                    }
                }

//                Warbixin Kooban

                else if (Evcplus == 5){
                    System.out.print("Warbixin Kooban");
                    System.out.println("    1. Last Action");
                    System.out.println("    2. Wareejintii u dambsay");
                    System.out.println("    3. iibsashadii u dambeysay");
                    System.out.println("    4. Last 3 Actions");
                    System.out.println("    5. Email Me My Activity");

                    int WarbixinTa = input.nextInt();

//                    seddex Last_Action:
                    String Last_1 = "[-Evcplus-] \nwaxaad $20 ka heshay 0615111382, Tar: 12/03/24 04:20:18 \nHaraagaagu waa $20.";
                    String Last_2 = "[-Evcplus-] \nwaxaad $1 ka heshay 0615111382, Tar: 12/03/24 04:20:18 \nHaraagaagu waa $11.";
                    String Last_3 = "[-Evcplus-] \nwaxaad $22 aad u wareejisay 0615111382, Tar: 12/03/24 04:20:18 \nHaraagaagu waa $0.";
                    String ugu_danbeysay = "[-Evcplus-] \nwaxaad $10 aad u wareejisay 0612888898, Tar: 12/03/24 04:20:18 \nHaraagaagu waa $2.";

                    if (WarbixinTa ==1){
                        System.out.println(Last_1);
                    }
                    else if (WarbixinTa == 2){
                        System.out.println(Last_2);
                    }
                    else if (WarbixinTa == 3){
                        System.out.println(ugu_danbeysay);
                    }
                    else if (WarbixinTa == 4){
                        System.out.println(Last_1+ "\n"+Last_2+ "\n"+Last_3);
                    }

                }
                else if (Evcplus == 6){
                    System.out.println("Salaam Bank");
                    System.out.println("1: Ka wareeji EVCPlus");


                    int Wareejinta_Evc = input.nextInt();
                    if (Wareejinta_Evc == 1){
                        System.out.println("Fadlan Dooro xisaabta Bangiga");
                        System.out.println("1: SALAAM SOMALI BANK");
                        System.out.println("2: Darasalaam Bank");
                        System.out.println("3: Bank Beeraha");
                        System.out.println("4: Salaam Sch");


                        int Bank_Money = 800;
                        int Salaam_Bank = input.nextInt();

                        if (Salaam_Bank == 1){
                            System.out.print("Fadlan soo Geli Account-ka : ");
                            int Account_user = input.nextInt();
                            System.out.print("Fadlan Geli Macluumaadka : ");
                            String Macluumaadka = input.next();
                            System.out.print("Fadlan Geli Lacagta :");
                            int Amount_salam = input.nextInt();
                            System.out.println("Ma hubtaa in aad udirayso Account-ka "+Account_user+" $ "+Amount_salam);
                            System.out.println("1: Haa");
                            System.out.println("2: Maye");

                            int Check = input.nextInt();
                            if (Check == 1 ){
                                if (Bank_Money <= Amount_salam) {
                                    System.out.println("Haraaga Xisaabtada Kuguma Filno 252 : " + Account_user);
                                }
                                else{
                                    double Result_salaam = Bank_Money - Amount_salam;
                                    System.out.println("waxa u wareejisay Accoun-ta $ "+Amount_salam);
                                    System.out.println("Haraaga Xisaabtada waa "+Result_salaam);
                                }
                            }

                            else if (Check == 2){
                                System.out.println("Mahadsanid !");
                            }
                        }

//                        Dhamaad Salaam_Somalia Bank


//                        BilowGa-Bank Beeraha

                        else if (Salaam_Bank == 2){
                            System.out.print("Fadlan soo Geli Account-ka : ");
                            int Account_user = input.nextInt();
                            System.out.print("Fadlan Geli Macluumaadka : ");
                            String Macluumaadka = input.next();
                            System.out.print("Fadlan Geli Lacagta :");
                            int Amount_salam = input.nextInt();
                            System.out.println("Ma hubtaa in aad udirayso Account-ka "+Account_user+" $ "+Amount_salam);
                            System.out.println("1: Haa");
                            System.out.println("2: Maye");

                            int Check = input.nextInt();
                            if (Check == 1 ){
                                if (Bank_Money <= Amount_salam) {
                                    System.out.println("Haraaga Xisaabtada Kuguma Filno 252 : " + Account_user);
                                }
                                else{
                                    double Result_salaam = Bank_Money - Amount_salam;
                                    System.out.println("waxa u wareejisay Accoun-ta $ "+Amount_salam);
                                    System.out.println("Haraaga Xisaabtada waa "+Result_salaam);
                                }
                            }

                            else if (Check == 2){
                                System.out.println("Mahadsanid !");
                            }
                        }

//

                        else if (Salaam_Bank == 3){
                            System.out.print("Fadlan soo Geli Account-ka : ");
                            int Account_user = input.nextInt();
                            System.out.print("Fadlan Geli Macluumaadka : ");
                            String Macluumaadka = input.next();
                            System.out.print("Fadlan Geli Lacagta :");
                            int Amount_salam = input.nextInt();
                            System.out.println("Ma hubtaa in aad udirayso Account-ka "+Account_user+" $ "+Amount_salam);
                            System.out.println("1: Haa");
                            System.out.println("2: Maye");

                            int Check = input.nextInt();
                            if (Check == 1 ){
                                if (Bank_Money <= Amount_salam) {
                                    System.out.println("Haraaga Xisaabtada Kuguma Filno 252 : " + Account_user);
                                }
                                else{
                                    double Result_salaam = Bank_Money - Amount_salam;
                                    System.out.println("waxa u wareejisay Accoun-ta $ "+Amount_salam);
                                    System.out.println("Haraaga Xisaabtada waa "+Result_salaam);
                                }
                            }

                            else if (Check == 2){
                                System.out.println("Mahadsanid !");
                            }
                        }

//                        Qeybta 4 aad :

                        else if (Salaam_Bank == 4){
                            System.out.print("Fadlan soo Geli Account-ka : ");
                            int Account_user = input.nextInt();
                            System.out.print("Fadlan Geli Macluumaadka : ");
                            String Macluumaadka = input.next();
                            System.out.print("Fadlan Geli Lacagta :");
                            int Amount_salam = input.nextInt();
                            System.out.println("Ma hubtaa in aad udirayso Account-ka "+Account_user+" $ "+Amount_salam);
                            System.out.println("1: Haa");
                            System.out.println("2: Maye");

                            int Check = input.nextInt();
                            if (Check == 1 ){
                                if (Bank_Money <= Amount_salam) {
                                    System.out.println("Haraaga Xisaabtada Kuguma Filno 252 : " + Account_user);
                                }
                                else{
                                    double Result_salaam = Bank_Money - Amount_salam;
                                    System.out.println("waxa u wareejisay Accoun-ta $ "+Amount_salam);
                                    System.out.println("Haraaga Xisaabtada waa "+Result_salaam);
                                }
                            }
                            else if (Check == 2){
                                System.out.println("Mahadsanid !");
                            }
                        }
                    }
                }

//                                                                   7. Qeybta MareyTa

                else if (Evcplus == 7){
                    System.out.println("Maareynta");
                    System.out.println("1. Bedel lambarka sirta ah");
                    System.out.println("2. Bedel luqadda");
                    System.out.println("3. Wargelin Mobilka Lumay");
                    System.out.println("4. Lacag Xirasho");
                    System.out.println("5. U celi Lacag qaldantay");
                    System.out.println("6. Enable Mobile Banking");
                }

                //             8.   QeybTa Bixi Biilka

                else if (Evcplus == 8){
                    int biilka = 10000;
                    System.out.println("EVCPlus");
                    System.out.println("1. itus Haraaga Bill ka");
                    System.out.println("2. Wada Bixi Bill-ka");
                    System.out.println("3. Qeyb Ka bixi bill-ka");

//                    int check = input.nextInt();
                }
                else {
                    System.out.println("Macsalaamo !");
                }
            }

//            Waxa kuso gashay Pin Qaldan :

            else {
                System.out.println("Pin-kaaga Qalad Fadlan iska Hubi :");
            }

        }

//        End If means : Waa ka baxday Evcplus

        else {
            System.out.println("Sorry, Operation failed due to the invalid message format.");
        }
        

    }
}