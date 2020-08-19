/*
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mydsl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.example.mydsl.stateMachine.StateMachine
import org.xtext.example.mydsl.stateMachine.State
import org.xtext.example.mydsl.stateMachine.Instruction
import org.xtext.example.mydsl.stateMachine.Trigger
import org.xtext.example.mydsl.stateMachine.Expression

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class StateMachineGenerator extends AbstractGenerator {
	
	
	override void doGenerate(Resource res, IFileSystemAccess2 fsa, IGeneratorContext context) {
		for (e : res.allContents.toIterable.filter(StateMachine)){
			fsa.generateFile(e.eResource.name+".py", e.compileStateMachine)
			}
	}
	
	def CharSequence compileStateMachine(StateMachine model)
		'''
			class �model.eResource.name�():
			
				def inputHandler(self):
					�generateInputHandler(model)�
																
				�FOR c : model.instructions�
					�c.generateInstructions�
				�ENDFOR�
					
				def run(self):
					print('Press A for all actions or: ', '\n')
					self.currentState = "�model.state.head?.name�"
					self.previousEvent = None
					self.previousState = None
					self.running = True
					
					while(self.running):
						�FOR state : model.state�
							�state.generateStates�
						�ENDFOR�
						�FOR eventReset : model.eventReset�
							if(self.previousEvent == '�eventReset.name�'):
								print('Resetting')
								currentState = '�model.state.head?.name�'
						�ENDFOR�

					

						
				
			if __name__ == '__main__':
				state = �model.eResource.name�()
				state.run()

		'''
	
	def generateInputHandler(StateMachine model) {
		'''
		n = input('Enter new action: ')
		n = str(n)
		if(n == 'A'):
			�generateEvents(model)�
		if(n == 'stop'):
			self.running = False
		
		return n
		'''
	}
	
	def generateEvents(StateMachine model)'''
		�FOR c : model.event�
			print('�c.name�')
		�ENDFOR�
	'''
		
	def generateStates(State state) 
	'''
		if(self.currentState == '�state.name�'):
				
			�FOR e : state.actions�
				self.�e.name.toFirstLower�()
			�ENDFOR�
			print('Current state is:  �state.name�.')
			self.previousEvent = self.inputHandler()
			self.previousState = self.currentState
			�FOR c : state.moves�
				if(self.previousEvent == '�c.event.extractEventName�'):
					self.currentState = '�c.state.name�'
					print('Previous state is: ',str(self.previousState))
			�ENDFOR�

	'''
	
	def String extractEventName(Trigger trig){
		if(!(trig instanceof Expression)){
			return trig.event.name
		} else {
			return (trig as Expression).stringify
		}
	}
	
	def String stringify(Expression exp){
		return '"dummy_expression"'
	}
	
	
	def generateInstructions(Instruction ins)
	'''
		def �ins.name.toFirstLower�(self):
			print('Running instruction �ins.name�')
	'''
	


	
	def getName(Resource resource){
		var name = resource.URI.lastSegment
		return name.substring(0, name.indexOf('.')).toFirstUpper
	}
	
	
}