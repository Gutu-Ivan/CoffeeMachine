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
        return "Choose the right option";
    }

    private String addMilk(String choice) {
        if (choice == "Yes") {
            return "Milk has added";
        }
        else if (choice == "No") {
            return "Without milk";
        }
        return "Choose the right option";
    }

    private void showInfo(String message){
        System.out.println(message);
    }

    private String done(String coffeeType){
        return coffeeType;
    }
    private String milk(String addedMilk){
        return addedMilk;
    }

    public void prepare(){
        String coffeeType = "";
        String addedMilk = "";
        this.showInfo("Please insert banknote");
        if(this.pay(5)){
            this.showInfo("Please chose option");
            coffeeType = this.choose(1);
            addedMilk = this.addMilk("Yes");
            this.showInfo("Do you want milk in your" + coffeeType + " ?");
            if (addedMilk == "Yes"){
                this.showInfo(
                        addedMilk + " to your " + coffeeType
                );
            }
            else{
                this.showInfo(addMilk("No"));
            }
            this.showInfo(
                    "You choose is: " + coffeeType
            );
            this.showInfo("Preparing...");
            this.showInfo(
                    "Preparing...Done: " + this.done(coffeeType)
            );
        } else {
            this.showInfo("Please insert correct banknote");
        }


    }
}
