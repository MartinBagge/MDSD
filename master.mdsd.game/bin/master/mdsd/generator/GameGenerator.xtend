/*
 * generated by Xtext 2.10.0
 */
package master.mdsd.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import master.mdsd.game.Character
import master.mdsd.game.Behaviour
import master.mdsd.game.Pathfinding

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class GameGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
//		fsa.generateFile('greetings.txt', 'People to greet: ' + 
//			resource.allContents
//				.filter(typeof(Greeting))
//				.map[name]
//				.join(', '))
		fsa.generateFile('game.py',addToFile(resource))
	}
	
	def addToFile(Resource resource) '''
		class master(object):
			def __init__(self, attrs[]):
				self.attrs = attrs
		
		class entity(master):
			def set_type(self,type):
				self.type = type
		
		«resource.allContents.filter(typeof(Pathfinding)).forEach[addPathfinding()]»
		'''
	
	def addPathfinding(Pathfinding pathfinding)'''
		class «pathfinding.name»(entity):
			«FOR ruleSet : pathfinding.ruleSets»
			def checkCondition():
				if «ruleSet.rule.ruleSetup.attributeRefLeft».«ruleSet.rule.ruleSetup.ruleType» «ruleSet.rule.ruleSetup.operator» «ruleSet.rule.ruleSetup.intAttleft»:
					self.«ruleSet.rule.toDoAction.charAtt» = «ruleSet.rule.toDoAction.charDec»«ruleSet.rule.toDoAction.lo»
			«ENDFOR»
	'''
	
	def addBehaviour(Behaviour behaviour)'''
		«»
		class «IF behaviour.behaviourTypeId=="Pathfinding"»«behaviour.pathfinding.name»«ELSEIF behaviour.behaviourTypeId=="Attack"»«behaviour.attack.name»«ELSEIF behaviour.behaviourTypeId=="Bullet"»«behaviour.bullet.name»«ENDIF»(entity):
			def 
	'''
	
	
	def addCharacter(Character character) '''
		class «character.name»(entity):
	'''
		
	
	// «IF ruleSet.rule.ruleSetup.attributeRefLeft != null»«»«ENDIF»
	
}


	