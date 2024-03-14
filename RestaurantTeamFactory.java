package example;

public interface RestaurantTeamFactory {
    Cook getCook();
    Administrator getAdministrator();
    Waiter getWaiter();
}
