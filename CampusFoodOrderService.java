

	public class CampusFoodOrderService {

	    private String universityName = "Istanbul Aydin University";
	    private double deliveryFee = 25.0;

	    public void placeOrder(String studentName,
	                           String foodName,
	                           String notificationType) {

	        System.out.println("Order created for: " + studentName);
	        System.out.println("Food: " + foodName);
	        System.out.println("Delivery fee: " + deliveryFee + " TL");

	        if (notificationType.equalsIgnoreCase("EMAIL")) {

	            System.out.println("Sending EMAIL notification...");
	            System.out.println("Dear " + studentName +
	                    ", your order for " + foodName +
	                    " has been received by " +
	                    universityName + ".");

	        }

	        else if (notificationType.equalsIgnoreCase("SMS")) {

	            System.out.println("Sending SMS notification...");
	            System.out.println("Hi " + studentName +
	                    ", your campus food order is confirmed.");

	        }

	        else if (notificationType.equalsIgnoreCase("PUSH")) {

	            System.out.println("Sending PUSH notification...");
	            System.out.println("New notification: Your " +
	                    foodName +
	                    " order is being prepared.");

	        }

	        else {

	            System.out.println("Unknown notification type.");

	        }
	    }

	    public static void main(String[] args) {

	        CampusFoodOrderService service =
	                new CampusFoodOrderService();

	        service.placeOrder(
	                "Ali",
	                "Chicken Sandwich",
	                "EMAIL"
	        );

	        service.placeOrder(
	                "Zeynep",
	                "Vegetarian Pizza",
	                "SMS"
	        );

	        service.placeOrder(
	                "Omar",
	                "Coffee",
	                "PUSH"
	        );
	    }
	}

	
	


