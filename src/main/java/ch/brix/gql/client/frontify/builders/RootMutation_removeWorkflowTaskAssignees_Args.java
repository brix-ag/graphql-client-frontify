package ch.brix.gql.client.frontify.builders;

public class RootMutation_removeWorkflowTaskAssignees_Args extends ch.brix.gql.client.ArgsBuilder {
  /**
   * **BETA** `RemoveWorkflowTaskAssignees` input argument.
   * Default value: null
   */
  public RootMutation_removeWorkflowTaskAssignees_Args input(ch.brix.gql.client.frontify.input_objects.RemoveWorkflowTaskAssigneesInput value) {
    _add_arg("input", value);
    return this;
  }
}
