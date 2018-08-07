package org.SpockDay1

import spock.lang.Specification
import spock.lang.Unroll

class DataDrivenExample extends Specification {
	@Unroll('#x1 plus #y1 equals to #z1')
	def "Data_driven Testing"(){
		expect : "The value will be true"
		x1+y1==z1
		
		where: "data table is given below :"
		x1|y1|z1
		10|20|30
		20|30|50
	}

}
