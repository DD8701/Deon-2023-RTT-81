/*
 * Step 3: Create Controller
 * 
 * The Controller exists between the view and the model. 
 * It listens to events triggered by the view (or another external source) and 
 * executes the appropriate reaction to these events. 
 * In most cases, the reaction is to call a method on the model.
 * 
 * Since the view and the model are connected through a notification 
 * mechanism, the result of this action is then automatically reflected 
 * in the view.
 */

package com.davis.MVC;

public class StudentController {

	private Student model;
	private StudentView view;

	public StudentController(Student model, StudentView view) {
		this.model = model;
		this.view = view;
	}

	public void setStudentName(String name) {
		this.model.setName(name);
	}

	public String getStudentName() {
		return model.getName();
	}

	public void setStudentRollNo(String rollNo) {
		model.setRollnum(rollNo);
	}

	public String getStudentRollNo() {
		return model.getRollnum();
	}

	public void updateView() {
		view.printStudentDetails(model.getName(), model.getRollnum());
	}
}
