class Logger {
    Map<String, Integer> map;

    /** Initialize your data structure here. */
    public Logger() {
          this.map = new HashMap<String, Integer>();
    }

    /** Returns true if the message should be printed in the given timestamp, otherwise returns false.
        If this method returns false, the message will not be printed.
        The timestamp is in seconds granularity. */
    public boolean shouldPrintMessage(int timestamp, String message) {
        boolean isPrinted = false;
         if(!this.map.containsKey(message)){
                this.map.put(message, timestamp);
                return true;
         }

        if(timestamp - this.map.get(message) >= 10){
                this.map.put(message, timestamp);
                return true;
        }else
            return false;
    }
}

/**
 * Your Logger object will be instantiated and called as such:
 * Logger obj = new Logger();
 * boolean param_1 = obj.shouldPrintMessage(timestamp,message);
 */
