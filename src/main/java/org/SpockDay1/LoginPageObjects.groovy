package org.SpockDay1

import geb.Page

class LoginPageObjects extends Page {

	static content={
		name(wait:true) {$("input","#userName")}
		
	}
}
