package net.serenitybdd.demos.todos.pages.todolist;

import net.serenitybdd.screenplay.targets.Target;

public class CompleteAll {
    public static final Target BUTTON = Target.the("Complete all items").locatedBy("#toggle-all");
}
