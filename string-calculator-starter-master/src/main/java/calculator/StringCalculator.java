package calculator;

class StringCalculator {

	public int add(String input) {
		
		String[] numbers = input.split(",");
		
    	if(input == null || input.isEmpty()) {
    		return 0;
    	} 
    	
	    else if(input.length() == 1) {
    		return Integer.parseInt(input);
    	}  
    	else {
    		
    		return Integer.parseInt(numbers[0])+Integer.parseInt(numbers[1]);
    	}

    }
    }
