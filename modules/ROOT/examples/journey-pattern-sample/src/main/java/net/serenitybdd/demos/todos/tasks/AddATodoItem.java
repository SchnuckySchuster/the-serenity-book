package net.serenitybdd.demos.todos.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.demos.todos.pages.todolist.newitem.NewTodoForm;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.thucydides.core.annotations.Step;

import static org.openqa.selenium.Keys.RETURN;

public class AddATodoItem implements Task {

    private final String thingToDo;

    protected AddATodoItem(String thingToDo) { this.thingToDo = thingToDo; }

    // tag::performAs[]
    @Step("{0} adds a todo item called #thingToDo")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(thingToDo).into(NewTodoForm.NEW_TODO_FIELD),
                Hit.the(RETURN).keyIn(NewTodoForm.NEW_TODO_FIELD)
        );
    }
    // end::performAs[]

    public static AddATodoItem called(String thingToDo) {
        return Instrumented.instanceOf(AddATodoItem.class).withProperties(thingToDo);
    }
}
