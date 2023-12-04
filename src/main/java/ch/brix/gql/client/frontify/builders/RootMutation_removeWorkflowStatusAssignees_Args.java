package ch.brix.gql.client.frontify.builders;

public class RootMutation_removeWorkflowStatusAssignees_Args extends ch.brix.gql.client.ArgsBuilder {
  /**
   * **BETA** `RemoveWorkflowStatusAssignees` input argument.
   * Default value: null
   */
  public RootMutation_removeWorkflowStatusAssignees_Args input(ch.brix.gql.client.frontify.input_objects.RemoveWorkflowStatusAssigneesInput value) {
    _add_arg("input", value);
    return this;
  }
}
