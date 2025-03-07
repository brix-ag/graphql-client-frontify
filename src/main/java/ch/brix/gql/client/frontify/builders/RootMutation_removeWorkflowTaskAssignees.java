package ch.brix.gql.client.frontify.builders;

public class RootMutation_removeWorkflowTaskAssignees extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.RemoveWorkflowTaskAssignees> {
  public RootMutation_removeWorkflowTaskAssignees() {
    super(new ch.brix.gql.client.Call<>("removeWorkflowTaskAssignees", "RemoveWorkflowTaskAssignees"));
  }
  public RootMutation_removeWorkflowTaskAssignees args(RootMutation_removeWorkflowTaskAssignees_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_removeWorkflowTaskAssignees onRemoveWorkflowTaskAssignees(On_RemoveWorkflowTaskAssignees typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
