
class account {

		double balance;
		int agency;
		int number;
		String owner;
		
		public void deposit(double value){
			this.balance += value;
		} 
		
		public boolean retire(double value) {
			if (this.balance >= value) {
				this.balance -= value;
				return true;
			} 
				return false;
		}
		
		public boolean trasnfer(double value, account account){
			if (this.balance >= value) {
				this.retire(value);
				account.deposit(value);
				return true;
			} 
				return false;
		}

}
