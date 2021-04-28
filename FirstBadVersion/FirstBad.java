class FirstBad {
    public static void main(String args[]) {
        int n = 2126753390;
    	int rangeMin = 1;
        int rangeMax = n;
        int count = 0;
        while(rangeMax-rangeMin > 10) {
        	count++;
        	int range = rangeMax-rangeMin;
        	if(isBadVersion(rangeMax-((range/10)*count)) == false) {
        		rangeMin = rangeMax-((range/10)*count);
        		count = 0;
        	}
        	else {
        		rangeMax = rangeMax-((range/10)*count);
        	}
        }
        int returnValue = 0;
        for(returnValue = rangeMin; returnValue <= rangeMax; returnValue++) {
        	if(isBadVersion(returnValue)) {
        		break;
        	}
        }
        System.out.println(returnValue);
    }
    public static boolean isBadVersion(int number) {
    	if(number < 1702766619)
    		return false;
    	else
    		return true;
    }
}