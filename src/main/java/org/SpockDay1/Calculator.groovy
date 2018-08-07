package org.SpockDay1

import spock.lang.Specification

class Calculator extends Specification{
	
	def "Scenario: Calculator" (){
		
		 given : "Two integers with value 10 and 20"
		 def i=20
		 def j=10
		 
		 when: "Numbers are added"
		 def add=i+j
		 
		 and: "Numbers are substracted"
		 def sub
		 if(i>j) 
			 sub=i-j
			 else
				 sub=j-i
		 
		 and: "Numbers are multiplied"
		 def mul=i*j
		 
		 and: "Numbers are divided"
		 def div=i/j
		 
		 then:"The sum value is 30"
		 assert 30 == add
		 
		 then:"The sub value is 10"
		 assert 10==sub
		 
		 then:"The multiplication value is 200"
		 assert 200==mul
		 
		 then:"The division value is 2"
		 assert 2==div
	}

}
