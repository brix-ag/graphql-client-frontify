package ch.brix.gql.client.frontify.builders;

public class RootMutation_addWorkflowTaskAssignees extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.AddWorkflowTaskAssignees> {
  public RootMutation_addWorkflowTaskAssignees() {
    super(new ch.brix.gql.client.Call<>("addWorkflowTaskAssignees", "AddWorkflowTaskAssignees"));
  }
  public RootMutation_addWorkflowTaskAssignees args(RootMutation_addWorkflowTaskAssignees_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_addWorkflowTaskAssignees onAddWorkflowTaskAssignees(On_AddWorkflowTaskAssignees typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
