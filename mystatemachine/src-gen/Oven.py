class Oven():

	def inputHandler(self):
		n = input('Enter new action: ')
		n = str(n)
		if(n == 'A'):
			print('off')
			print('on')
			print('cooling')
			print('heating')
		if(n == 'stop'):
			self.running = False
		
		return n
													
	def turn_on(self):
		print('Running instruction turn_on')
	def turn_off(self):
		print('Running instruction turn_off')
	def turn_up(self):
		print('Running instruction turn_up')
	def turn_down(self):
		print('Running instruction turn_down')
		
	def run(self):
		print('Press A for all actions or: ', '\n')
		self.currentState = "Off"
		self.previousEvent = None
		self.previousState = None
		self.running = True
		
		while(self.running):
			if(self.currentState == 'Off'):
					
				self.turn_on()
				print('Current state is:  Off.')
				self.previousEvent = self.inputHandler()
				self.previousState = self.currentState
				if(self.previousEvent == 'off'):
					self.currentState = 'On'
					print('Previous state is: ',str(self.previousState))
			
			if(self.currentState == 'On'):
					
				self.turn_on()
				print('Current state is:  On.')
				self.previousEvent = self.inputHandler()
				self.previousState = self.currentState
				if(self.previousEvent == 'off'):
					self.currentState = 'Off'
					print('Previous state is: ',str(self.previousState))
			
			if(self.currentState == 'Heating'):
					
				self.turn_up()
				print('Current state is:  Heating.')
				self.previousEvent = self.inputHandler()
				self.previousState = self.currentState
				if(self.previousEvent == 'cooling'):
					self.currentState = 'Cooling'
					print('Previous state is: ',str(self.previousState))
			
			if(self.currentState == 'Cooling'):
					
				self.turn_down()
				print('Current state is:  Cooling.')
				self.previousEvent = self.inputHandler()
				self.previousState = self.currentState
				if(self.previousEvent == 'heating'):
					self.currentState = 'Heating'
					print('Previous state is: ',str(self.previousState))
			
			if(self.currentState == 'Cooling'):
					
				self.turn_off()
				print('Current state is:  Cooling.')
				self.previousEvent = self.inputHandler()
				self.previousState = self.currentState
				if(self.previousEvent == 'off'):
					self.currentState = 'Off'
					print('Previous state is: ',str(self.previousState))
			
			if(self.currentState == 'Heating'):
					
				self.turn_off()
				print('Current state is:  Heating.')
				self.previousEvent = self.inputHandler()
				self.previousState = self.currentState
				if(self.previousEvent == 'off'):
					self.currentState = 'Off'
					print('Previous state is: ',str(self.previousState))
			
			if(self.currentState == 'On'):
					
				self.turn_up()
				print('Current state is:  On.')
				self.previousEvent = self.inputHandler()
				self.previousState = self.currentState
				if(self.previousEvent == 'heating'):
					self.currentState = 'Heating'
					print('Previous state is: ',str(self.previousState))
			
			if(self.currentState == 'On'):
					
				self.turn_down()
				print('Current state is:  On.')
				self.previousEvent = self.inputHandler()
				self.previousState = self.currentState
				if(self.previousEvent == 'cooling'):
					self.currentState = 'Cooling'
					print('Previous state is: ',str(self.previousState))
			
			if(self.previousEvent == 'off'):
				print('Resetting')
				currentState = 'Off'

		

			
	
if __name__ == '__main__':
	state = Oven()
	state.run()

