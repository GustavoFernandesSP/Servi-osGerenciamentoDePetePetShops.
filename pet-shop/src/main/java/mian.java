public class mian {
    public static void main(String[] args) {


        Pet pet1 = new Pet("Blue");

        petShop petshop1 = new petShop("Marquinhos Dos Rebocos", 0.0);
        petShop petshop2 = new petShop("paulistas Pet");


        System.out.println("""
                    Nome Pet: %S
                    Total Gasto: %.2f
                    Idas ao PetShop: %d
                """.formatted(pet1.getNome(), pet1.getTotalGasto(), pet1.getIdasPetShop()));



        petshop1.darBanho(pet1, 40.0);
        petshop2.darBanho(pet1);

        

        System.out.println("""
                    Nome Pet: %S
                    Total Gasto: %.2f
                    Idas ao PetShop: %d
                """.formatted(pet1.getNome(), pet1.getTotalGasto(), pet1.getIdasPetShop()));


    }
}
