package ch.brix.gql.client.frontify.builders;

public class RootMutation_removeWorkflowStatusAssignees extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.RemoveWorkflowStatusAssignees> {
  public RootMutation_removeWorkflowStatusAssignees() {
    super(new ch.brix.gql.client.Call<>("removeWorkflowStatusAssignees", "RemoveWorkflowStatusAssignees"));
  }
  public RootMutation_removeWorkflowStatusAssignees args(RootMutation_removeWorkflowStatusAssignees_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_removeWorkflowStatusAssignees onRemoveWorkflowStatusAssignees(On_RemoveWorkflowStatusAssignees typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
