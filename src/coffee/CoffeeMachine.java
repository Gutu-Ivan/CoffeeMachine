package coffee;

public class CoffeeMachine {
    private Boolean pay(Integer banknoteNominal){
        if(banknoteNominal == 5 || banknoteNominal == 10){
            return true;
        }
        return false;
    }

    private String choose(Integer option){
        if(option == 1){
            return "Coffee";
        } else if(option == 2){
            return "Cappuccino";
        }
        return "Incorrect option";
    }

    private String addMilk(Integer choice) {
        if (choice == 1) {
            return "Add milk";
        }
        else if (choice == 2) {
            return "Do not add";
        }
        else{
            return "Incorrect option";
        }
    }

    private void showInfo(String message){
        System.out.println(message);
    }

    private String done(String coffeeType){
        return coffeeType;
    }

    public void prepare(){
        String coffeeType = "";
        String addedMilk = "";
        this.showInfo("Please insert banknote");
        if(this.pay(5)){
            this.showInfo("Please chose option");
            coffeeType = this.choose(1);
            addedMilk = this.addMilk(1);
            this.showInfo("Do you want milk in your" + coffeeType + "?");
            if (this.addMilk(1)){
                this.showInfo(
                        addedMilk + "You choose is: " + coffeeType
                );
            }
            else{
                this.showInfo(addMilk(2));
            }
            this.showInfo(
                    "You choose is: " + coffeeType
            );
            this.showInfo("Preparing...");
            this.showInfo(
                    "Done: " + this.done(coffeeType)
            );
        } else {
            this.showInfo("Please insert correct banknote");
        }
    }
}
