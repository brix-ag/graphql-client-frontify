package ch.brix.gql.client.frontify.builders;

public class RootMutation_addWorkflowStatusAssignees extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.AddWorkflowStatusAssignees> {
  public RootMutation_addWorkflowStatusAssignees() {
    super(new ch.brix.gql.client.Call<>("addWorkflowStatusAssignees", "AddWorkflowStatusAssignees"));
  }
  public RootMutation_addWorkflowStatusAssignees args(RootMutation_addWorkflowStatusAssignees_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_addWorkflowStatusAssignees onAddWorkflowStatusAssignees(On_AddWorkflowStatusAssignees typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
